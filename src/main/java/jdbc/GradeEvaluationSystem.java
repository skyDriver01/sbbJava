package jdbc;

import objektOriented.aufg1.aufg2.InputIn;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeEvaluationSystem {
    static ResultSet resultSet;
    static Connection connection;
    static Statement statement;
    static String query = "";

    public static void main(String[] args) {            //Für die nächsten Projekte nach dem 26.04.23: Kommentare im Code setzen da Ich nicht mehr genau wusste was dieser code machte erst nach etwa 20 minuten anschauen da ich in den Ferien war
        configDatabase();
        System.out.println("captureGrade");
        System.out.println("deleteGrade");
        System.out.println("alterGrade");
        System.out.println("giveOutModuleGrade");
        System.out.println("transcript");

        String choice = InputIn.nextLineOut("What would you like to do: ");
        switch (choice) {
            case "captureGrade" -> captureGrade();
            case "deleteGrade" -> {
                Float pk = InputIn.nextFloatOut("Give me a number");
                deleteGrade(pk);
            }
            case "alterGrade" -> {
                Float newGrade = InputIn.nextFloatOut("Give me your new grade");
                alterGrade(newGrade);
            }
            case "giveOutModuleGrade" -> giveOutModuleGrade();
            case "transcript" -> transcript();
            default -> {
                System.out.println("pls be careful of the spelling");
                main(new String[]{});
            }
        }
    }

    private static void configDatabase() {
        String url = "jdbc:mariadb://localhost:3306/java";
        String username = "root";
        String password = "Test";

        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
            // ExecuteQuery bei Select andere Befehl executeupdate bei create execute bei Insertinto
        } catch (SQLException | NullPointerException e) {
            System.out.println("just the first config its gonna be null");
            System.out.println(e);
        }
    }

    public static void captureGrade() {
        int gradeID = InputIn.nextIntOut("Type a number between 0 and 20 (0 being grade 1 and 20 being 6 goes up in increments of .25)");
        int school_subject = InputIn.nextIntOut("Now a number between 1 and 7");     //Prob could of done text like "choose one of these modules for entering in the grade: Mod1, Mod2 aso"
        InputIn.nextLine();                                                                 //then a switch case that takes the module1 and makes the school_subject = nmb from 1-7 based on the module

        try {
            Date datum = Date.valueOf(InputIn.nextLineOut("Write the Date of when you received the Grade(LIKE THIS: YYYY-MM-DD)"));
            query = "INSERT INTO java.school_subject_grade( gradeID, school_subjectID, Datum) VALUES( " +
                    gradeID +
                    "," +
                    school_subject +
                    "," +
                    datum +
                    ")";
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } catch (RuntimeException b) {
            System.out.println("Keep in mind to follow what it says to use");
            System.out.println(b);
            captureGrade();
        }

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Keep in mind to follow what it says to use");
            captureGrade();
        }
    }

    public static void deleteGrade(Float pk) {
        query = "DELETE FROM java.school_subject_grade WHERE ID = " + pk;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void alterGrade(Float grade) {
        query = "UPDATE java.school_subject_grade SET gradeID = " + grade + " WHERE GradeID = 0";

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void giveOutModuleGrade() {
        query = "SELECT s.SubjectID, Modulename, g.Grade, sg.Datum " +
                "FROM java.school_subject_grade sg " +
                "JOIN java.school_subject s ON sg.school_subjectID = s.SubjectID " +
                "JOIN java.grade g ON sg.gradeID = g.gradeID";

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            Map <String, List <String>> moduleGrades = new HashMap <>();

            while (resultSet.next()) {
                String moduleName = resultSet.getString("Modulename");
                String grade = resultSet.getString("Grade");
                String date = resultSet.getString("Datum");
                String data = date + ": " + grade;

                if(!moduleGrades.containsKey(moduleName)) {
                    moduleGrades.put(moduleName, new ArrayList <>());
                }
                moduleGrades.get(moduleName).add(data);
            }

            for (String moduleName : moduleGrades.keySet()) {
                System.out.println(moduleName);
                List <String> grades = moduleGrades.get(moduleName);
            }

            String chooseModule = InputIn.nextLineOut("Choose the module you want to get your grade from");
            moduleGrade(chooseModule, moduleGrades);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void transcript() {
        query = "SELECT s.SubjectID, Modulename, AVG(g.Grade) as AverageGrade " +
                "FROM java.school_subject_grade sg " +
                "JOIN java.school_subject s ON sg.school_subjectID = s.SubjectID " +
                "JOIN java.grade g ON sg.gradeID = g.gradeID " +
                "GROUP BY s.SubjectID";

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            Map <String, Float> moduleGrades = new HashMap <>();

            while (resultSet.next()) {
                String moduleName = resultSet.getString("Modulename");
                float grade = resultSet.getFloat("AverageGrade");
                moduleGrades.put(moduleName, grade);
            }

            for (String moduleName : moduleGrades.keySet()) {
                float grade = moduleGrades.get(moduleName);
                String data = moduleName + ": " + grade;
                System.out.println(data);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void moduleGrade(String moduleName, Map <String, List <String>> moduleGrades) {
        if(moduleGrades.containsKey(moduleName)) {
            List <String> grades = moduleGrades.get(moduleName);
            System.out.println("Grades for " + moduleName + ":");

            for (String grade : grades) {
                System.out.println("   " + grade);
            }
        } else {
            System.out.println("No grades found for " + moduleName);
        }
    }
}
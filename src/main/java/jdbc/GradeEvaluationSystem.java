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

    public static void main(String[] args) {
        configDatabase();
        System.out.println("captureGrade");
        System.out.println("deleteGrade");
        System.out.println("alterGrade");
        System.out.println("giveOutModuleGrade");
        System.out.println("transcript");
        String choice = InputIn.nextLineOut("What would you like to do: ");
        switch (choice) {
            case "captureGrade" -> captureGrade();
            case "deleteGrade" -> deleteGrade(1F);
            case "alterGrade" -> alterGrade(1F);
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
        int gradeID = InputIn.nexIntOut("Type a number between 0 and 20");
        int school_subject = InputIn.nexIntOut("Now a number between 1 and 7");
        InputIn.nextLine();
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
        query = "SELECT s.SubjectID, Modulename, g.Grade " +
                "FROM java.school_subject_grade sg " +
                "JOIN java.school_subject s ON sg.school_subjectID = s.SubjectID " +
                "JOIN java.grade g ON sg.gradeID = g.gradeID";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            Map <String, Integer> moduleGrades = new HashMap <>(); // use a map to store the grades for each module
            while (resultSet.next()) {
                String moduleName = resultSet.getString("Modulename");
                int grade = resultSet.getInt("grade");                  // Todo only make it so it gives out the module grade bc atm it gives out the last inputted date for that module
                moduleGrades.put(moduleName, grade); // add the grade to the map for this module
            }
            for (String moduleName : moduleGrades.keySet()) {
                int grade = moduleGrades.get(moduleName);
                String data = moduleName + ":" + grade;
                System.out.println(data); // output one line per module with the corresponding grade
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void transcript() {
        query = "SELECT modulename, AVG(grade) as finalgrade FROM java.grade g JOIN java.school_subject s ON g.GradeID = s.subjectid GROUP BY modulename";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            List <String> moduleGrades = new ArrayList <>(); // use a list to store the final grades for each module
            while (resultSet.next()) {
                String moduleName = resultSet.getString("modulename");
                double finalGrade = resultSet.getDouble("finalgrade");
                moduleGrades.add(moduleName + ":" + finalGrade); // add the final grade to the list for this module
            }
            for (String data : moduleGrades) {
                System.out.println(data); // output one line per module with the final grade
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
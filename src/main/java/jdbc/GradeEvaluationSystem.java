package jdbc;

import objektOriented.aufg1.aufg2.InputIn;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// CRUD = CREATE, READ, UPDATE, DELETE
public class GradeEvaluationSystem {
    static ResultSet resultSet;
    static Connection connection;
    static Statement statement;
    static String query = "";

    public static void main(
            String[] args) {            //Für die nächsten Projekte nach dem 26.04.23: Kommentare im Code setzen da Ich nicht mehr genau wusste was dieser code machte erst nach etwa 20 minuten anschauen da ich in den Ferien war
        configDatabase();
        System.out.println("createGrade");
        System.out.println("deleteGrade");
        System.out.println("updateGrade");
        System.out.println("readModuleGrade");
        System.out.println("readTranscript");

        String choice = InputIn.nextLineOut("What would you like to do: ");
        switch (choice) {
            case "createGrade" -> createGrade();
            case "deleteGrade" -> {
                Float pk = InputIn.nextFloatOut("Give me a number");
                deleteGrade(pk);
            }
            case "updateGrade" -> {
                Float newGrade = InputIn.nextFloatOut("Give me your new grade");
                updateGrade(newGrade);
            }
            case "readModuleGrade" -> readModuleGrade();
            case "readTranscript" -> readTranscript();
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

    public static void createGrade() {
        int gradeID = InputIn.nextIntOut("Type a number between 0 and 20 (0 being grade 1 and 20 being 6 goes up in increments of .25)");
        int school_subject = InputIn.nextIntOut("Now a number between 1 and 7");
        InputIn.nextLine();
        String datum = InputIn.nextLineOut("Write the Date of when you received the Grade (LIKE THIS: YYYY-MM-DD)");

        try {
            query = "INSERT INTO java.school_subject_grade(gradeID, school_subjectID, Datum) VALUES(" +
                    gradeID +
                    "," +
                    school_subject +
                    ",'" +
                    datum +
                    "')";

            statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Keep in mind to follow what it says to use");
            createGrade();
        }
    }

    public static void deleteGrade(Float pk) {
        query = "DELETE FROM java.school_subject_grade WHERE ID = " + pk;
        // Erinerung Jegliche Situation wo ID(Items oder werte) nicht da ist eine Meldung ausgeben das es sie nicht gibt
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void updateGrade(Float grade) {
        query = "UPDATE java.school_subject_grade SET gradeID = " + grade + " WHERE GradeID = 0";

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void readModuleGrade() {
        query = "SELECT s.SubjectID, Modulename, g.Grade, sg.Datum " +
                "FROM java.school_subject_grade sg " +
                "JOIN java.school_subject s ON sg.school_subjectID = s.SubjectID " +
                "JOIN java.grade g ON sg.gradeID = g.gradeID " +
                "ORDER BY Modulename";

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            Map <String, List <String>> moduleGrades = new HashMap <>();

            while (resultSet.next()) {
                String moduleName = resultSet.getString("Modulename");
                String grade = resultSet.getString("Grade");
                moduleGrades.putIfAbsent(moduleName, new ArrayList <>());
                /*
                 * putIfAbsent = auto adds key to specified value(Here it being the Modulenames
                 * if key == null or is not even there
                 */
                moduleGrades.get(moduleName).add(grade);
            }

            System.out.println("Select a module to view grades for:");

            for (String moduleName : moduleGrades.keySet()) {
                System.out.println(moduleName);
            }
            String selectedModule = InputIn.nextLine();
            moduleGrade(selectedModule, moduleGrades);

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void moduleGrade(String moduleName, Map <String, List <String>> moduleGrades) {
        if(moduleGrades.containsKey(moduleName)) {
            List <String> grades = moduleGrades.get(moduleName);
            double averageGrade = grades.stream().mapToDouble(Double::parseDouble).average().orElse(Double.NaN);

            System.out.println("Grades for " + moduleName + ":");
            for (String grade : grades) {
                System.out.println("   " + grade);
            }
            System.out.println("Average grade: " + averageGrade);
        } else {
            System.out.println("No grades found for " + moduleName);
        }
    }

    public static void readTranscript() {
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
}
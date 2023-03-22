package jdbc;

import objektOriented.aufg1.aufg2.InputIn;

import java.sql.*;

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
        }
        catch (RuntimeException b){
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
         query = "SELECT modulename, grade FROM java.school_subject, java.grade";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);  //do this
            while (resultSet.next()) {
                String data = resultSet.getString(1) + ":" + resultSet.getString(2);
                System.out.println(data);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void transcript() {
          query = "SELECT modulename, grade FROM java.grade g JOIN java.school_subject s ON modulename = modulename";
        try {
            statement = connection.createStatement();  // and do that
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String data = resultSet.getString(1) + ":" + resultSet.getString(2);
                System.out.println(data);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
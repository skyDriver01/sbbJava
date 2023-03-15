package jdbc;

import objektOriented.aufg1.aufg2.InputIn;

import java.sql.*;

public class GradeEvaluationSystem {
    static String query = "";

    public static void main(String[] args) {
        System.out.println("captureGrade");
        System.out.println("deleteGrade");
        System.out.println("alterGrade");
        System.out.println("giveOutModuleGrade");
        System.out.println("transcript");
        String choice = InputIn.nextLineOut("What would you like to do: ");
        switch (choice) {
            case "captureGrade" -> captureGrade();
            case "deleteGrade" -> deleteGrade();
            case "alterGrade" -> alterGrade(4.25F);
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
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);     // ExecuteQuery bei Select andere Befehl executeupdate bei create execute bei Insertinto
            System.out.println(resultSet.toString());
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void captureGrade() {
        query = "SELECT * FROM grade";
        configDatabase();
    }

    public static void deleteGrade() {
        query = "DELETE FROM grade WHERE gradeID = 4";
        configDatabase();
    }

    public static void alterGrade(Float grade) {
        query = "UPDATE grade SET grade = " + grade + " WHERE GradeID = 5";
        configDatabase();
    }

    public static void giveOutModuleGrade() {
        query = "SELECT modulename, Grade FROM school_subject, grade";
        configDatabase();
    }

    public static void transcript() {        // Zeugnis auf english
        query = "SELECT";
        configDatabase();
    }
}
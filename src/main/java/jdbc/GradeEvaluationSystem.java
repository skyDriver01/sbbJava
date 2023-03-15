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
            case "deleteGrade" -> captureGrade();
            case "alterGrade" -> captureGrade();
            case "giveOutModuleGrade" -> captureGrade();
            case "transcript" -> transcript();
            default -> {
                System.out.println("pls be careful of the spelling");
                main(new String[]{});
            }
        }
    }

    private static void configDatabase() {
        String url = "jdbc:mysql://localhost:3306/java";
        String username = "root";
        String password = "Test";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();     // ExecuteQuery bei Select andere Befehl executeupdate bei create execute bei Insertinto
            System.out.println(resultSet);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void captureGrade() {
        query = "SELECT * FROM grade";
        configDatabase();
    }

    public static void deleteGrade() {
        configDatabase();
    }

    public static void alterGrade() {
        configDatabase();
    }

    public static void giveOutModuleGrade() {
        configDatabase();
    }

    public static void transcript() {        // Zeugnis auf english
        configDatabase();
    }
}

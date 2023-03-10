package jdbc;

import java.sql.*;

public class GradeEvaluationSystem {
    static String query = "";
    public static void main(String[] args) {
        captureGrade();
        deleteGrade();
        alterGrade();
        giveOutModuleGrade();
        transcript();
    }

    private static void configDatabase() {
        String url = "jdbc:mysql://localhost:3306/java";
        String username = "root";
        String password = "Test";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void captureGrade(){
        configDatabase();
    }
    public static void deleteGrade(){
        configDatabase();
    }
    public static void alterGrade(){
        configDatabase();
    }
    public static void giveOutModuleGrade(){
        configDatabase();
    }
    public static void transcript(){        // Zeugnis auf english
        configDatabase();
    }
}

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
            case "deleteGrade" -> deleteGrade(1F);
            case "alterGrade" -> alterGrade(4.25F);
            case "giveOutModuleGrade" -> giveOutModuleGrade();
            case "transcript" -> transcript();
            default -> {
                System.out.println("pls be careful of the spelling");
                main(new String[]{});
            }
        }
    }

    private static void configDatabase(int index) {
        String url = "jdbc:mariadb://localhost:3306/java";
        String username = "root";
        String password = "Test";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);     // ExecuteQuery bei Select andere Befehl executeupdate bei create execute bei Insertinto
            while (resultSet.next()) {
                String data = resultSet.getString(1) + ":" + resultSet.getString(2);
                System.out.println(data);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void captureGrade() {
        int pk = InputIn.nexIntOut("Type a int bigger than 7");
        int gradeID = InputIn.nexIntOut("Type a number between 0 and 20");
        int school_subject = InputIn.nexIntOut("Now a number between 1 and 7");
        InputIn.nextLine();
        Date datum = new Date(2022-12-3);
        query = "INSERT INTO school_subject_grade(ID, gradeID, school_subjectID, Datum) VALUES( " +
                pk +
                "," +
                gradeID +
                "," +
                school_subject +
                "," +
                datum +
                ")";
        configDatabase(1);
    }

    public static void deleteGrade(Float pk) {
        query = "DELETE FROM school_subject_grade WHERE gradeID = " + pk;
        configDatabase(2);
    }

    public static void alterGrade(Float grade) {
        query = "UPDATE school_subject_grade SET grade = " + grade + " WHERE GradeID = 0";
        configDatabase(0);
    }

    public static void giveOutModuleGrade() {
        query = "SELECT modulename, Grade FROM school_subject, grade";
        configDatabase(1);
    }

    public static void transcript() {
        query = "SELECT modulename, grade FROM grade g JOIN school_subject s ON modulename = modulename";
        configDatabase(2);
    }
}
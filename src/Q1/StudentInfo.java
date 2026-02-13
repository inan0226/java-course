package Q1;

public class StudentInfo {
    public static void main() {
        String name = "김인안";
        int age = 26;
        double height = 168.5;
        char grade = '2';
        boolean isStudent = false;

        System.out.println("=== 학생 정보 ===");
        System.out.println("이름" + name);
        System.out.println("나이" + age + "세");
        System.out.println("키: " +  height + "cm");
        System.out.println("학년" + grade + "학년");
        System.out.println("재학중" + isStudent);
    }
}

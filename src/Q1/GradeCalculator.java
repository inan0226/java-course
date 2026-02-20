package Q1;
public class GradeCalculator {
    public static void main(String[] args) {
        // TODO: 5개 과목 점수 배열 생성
        int[] scores = {92, 81, 73, 65, 59}; // 예시 점수

        // TODO: 총합 계산 (for문 사용)
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            // 총합 계산 코드 작성
            total += scores[i];
        }

        // TODO: 평균 계산
        double average = total / (double) scores.length;

        // TODO: 학점 결정 (if=else문 사용)
        char grade = 'F';
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        }else if (average >= 70) {
            grade = 'C';
        }else if (average >= 60) {
            grade = 'D';
        }else{
            grade = 'F';
        }

        // TODO: 결과 출력
        System.out.println("=== 성적 계산기 ===");
        System.out.println("총점: " + total );
        System.out.println("평균: " + average);
        System.out.println("학점: " + grade);
    }
}

package P21AssociativeArraysExercise;

import java.util.*;

import static java.lang.System.in;

public class P06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Map<String, List<Double>> studentGrade = new LinkedHashMap<>();

        int countStudent = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countStudent; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if(!studentGrade.containsKey(name)){
                studentGrade.put(name, new ArrayList<>());
            }
            studentGrade.get(name).add(grade);
        }

        Map<String, Double> averageGradeStudents = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry: studentGrade.entrySet()) {
            String studentName = entry.getKey();
            List<Double> listGrade = entry.getValue();
            double averageGrade = getAverageGrade(listGrade);

           if(averageGrade >= 4.50){
               averageGradeStudents.put(studentName, averageGrade);
           }
        }
        averageGradeStudents.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }
    private static double getAverageGrade(List<Double> listGrades){
        double sumGrades = 0;
        for (double grade : listGrades) {
            sumGrades += grade;
        }
        return sumGrades / listGrades.size();
    }
}

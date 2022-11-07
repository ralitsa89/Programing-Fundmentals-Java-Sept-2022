package P17ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class P06Students2 {

    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String town;

        public Student(String firstName, String lastName, int age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getTown() {
            return this.town;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s %s is %d years old%n",
                    this.getFirstName(),
                    this.getLastName(),
                    this.getAge());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Student> studentList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split(" ");

            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String town = data[3];

            Student student = new Student(firstName, lastName, age, town);

            int existingIndex = findStudentsIndex(studentList, student.getFirstName(), student.getLastName());
            if (existingIndex != -1) {
                studentList.get(existingIndex).setAge(student.getAge());
                studentList.get(existingIndex).setTown(student.getTown());
            } else {
                studentList.add(student);
            }
            input = scanner.nextLine();
        }
        String searchTown = scanner.nextLine();
        for (Student s : studentList) {
            if (s.getTown().equals(searchTown)) {
                System.out.print(s);
            }
        }
    }
    static public int findStudentsIndex(List<Student> studentsList, String firstName, String lastName) {
        for (int i = 0; i < studentsList.size(); i++) {
            String firstNameList = studentsList.get(i).getFirstName();
            String lastNameList = studentsList.get(i).getLastName();

            if (firstNameList.equals(firstName) && lastNameList.equals(lastName)) {
                return i;
            }
        }
        return -1;
    }
}

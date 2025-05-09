import java.util.*;

public class StudentGrades {
    static Map<String, Integer> records = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n1. Add/Update Grade\n2. View Records\n3. Exit");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1: addOrUpdate(); break;
                case 2: view(); break;
                case 3: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid option");
            }
        } while (choice != 3);
    }

    static void addOrUpdate() {
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter grade: ");
        int grade = sc.nextInt();
        records.put(name, grade);
        System.out.println("Record saved.");
    }

    static void view() {
        if (records.isEmpty()) {
            System.out.println("No records found.");
        } else {
            System.out.println("Student Grades:");
            for (String name : records.keySet()) {
                System.out.println(name + ": " + records.get(name));
            }
        }
    }
}
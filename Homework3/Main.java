package homeWork1;

 import java.util.Scanner;

 public class Main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("ведите имя: ");
         String firstName = scanner.nextLine();
         System.out.println("ведите фамилию: ");
         String secondName = scanner.nextLine();
         System.out.println("ведите возраст ");
         int age = scanner.nextInt();
         System.out.println("ведите стутс: ");
         String status = scanner.nextLine();

         Children child = new Children(firstName, secondName, age, status);
         System.out.println(child);
         System.out.println(child.mother());
         System.out.println(child.father());
         System.out.println(child.grandFather());
         System.out.println(child.grandMother());
     }
 }
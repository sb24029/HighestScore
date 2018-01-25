import java.util.Scanner;
public class HighestScore
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of students: ");
      int numStudents = sc.nextInt();
      System.out.print("Enter the student's name: ");
      String Student1 = sc.next();
      System.out.print("Enter the student's score: ");
      int Score1 = sc.nextInt();
   
      for (int i = 0; i < numStudents - 1; i++) 
      {
         System.out.print("Enter the student's name: ");
         String Student = sc.next();
         System.out.print("Enter the student's score: ");
         int Score = sc.nextInt();
      
        if (Score > Score1) 
        {
            Student1 = Student;
            Score1 = Score;
        }
      }
      System.out.println(Student1 + "'s score is " + Score1);
   }}
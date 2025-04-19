import java.util.Scanner;
import java.util.ArrayList;

public class StudentGradeTracker{
       public static void main(String [] args){
              Scanner scanner = new Scanner(System.in);
              
              // input: Number of Students

              System.out.println("Enter the Number of Student: ");
              int numStudent=scanner.nextInt();
              
              // input: Arraylist to store Grade

              ArrayList<Integer> grades=new ArrayList<>();
              
              // Grades for each student

              for(int i=1;i<=numStudent;i++){
                  System.out.print("Enter Grade for Student " + i +": ");
                  int grade=scanner.nextInt();
                  grades.add(grade);
              }
         
              // Calculate Average,Highest and lowest grade
     
              int highest=grades.get(0);
              int lowest =grades.get(0);
              int sum = 0;

             for(int grade : grades){
                if(grade>highest) highest=grade;
                if(grade<lowest) lowest=grade;

                sum += grade;
             }

             double average= (double)sum / grades.size();

            System.out.println("\n... Grade Report ...");
            System.out.println("Average Grade: "+average);
            System.out.println("Highest Grade: "+highest);
            System.out.println("Lowest Grade: "+lowest);
      }
}
            
           
       
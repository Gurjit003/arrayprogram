/*
 * Gurjit Singh
 * Monday October 21st - 2019
 * This is the show what you know array program
 */

package arrayprogram;
import java.util.Scanner;

/**
 *
 * @author gusin5788
 */
public class Arrayprogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double total = 0;
        double total1 = 0;
        double total2 = 0;
        double total3 = 0;
        double total4 = 0;
        double totalMarks = 0;
        double average = 0;
        final String GOODBYE = "Goodbye!";
        
        System.out.println("Enter 5 marks:");        
        
        total = input.nextInt();
        total1 = input.nextInt();
        total2 = input.nextInt();
        total3 = input.nextInt();
        total4 = input.nextInt();
       
        for (int i = 0; i <= 4; i = i + 1) {
            double marks [] = {total, total1, total2, total3, total4};
            totalMarks = marks[0] + marks[2] + marks[2] + marks[3] + marks[4];
        }
            
        average = totalMarks / 5;
        
        average = average * 10;
        average = Math.round(average);
        average = average / 10;
        
        System.out.println("The average of the marks is " + average);
        System.out.println(GOODBYE);
        System.out.println("");
    }
    
}

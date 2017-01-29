
/**
 * 
 * 
 * @author Andrea Musso  
 * 
 */
import java.util.Scanner;
public class IntSequence
{
    public static void main (String arg[]){
        Scanner scan = new Scanner(System.in);
        int counter=0;
        long input;
        long largest=0;
        long smallest=0;
        long sum=0;
        double average;
        long range;
        do{ //main loop of the program to run at least 1
            System.out.println("Please enter a whole number. 0 to quit");
            boolean isInt = scan.hasNextLong();//call a Scanner method hasNextInt return true if a long has been entered            
            input=scan.nextLong();
                if(isInt){
                    if(counter==0&&input==0){
                        input=1;
                        System.out.println("You must enter at least one value");
                    }else if(counter==0){
                        largest=input;
                        smallest=input;
                        sum=input;
                        counter++;
                    }else if(input!=0){
                        if(input>largest){
                            largest=input;
                        }
                        if(input<smallest){
                            smallest=input;
                        }
                        sum+=input;
                        counter++;
                    }
                }else{
                    System.out.println("The value entered is not a whole number.");
                }
        }while(input!=0);
        range=largest-smallest;
        average=sum/counter;
        System.out.println("The number of values entered is: "+counter);
        System.out.println("The sum of the values is "+sum);
        System.out.println("The smallest value is "+smallest);
        System.out.println("The largest value is "+largest);
        System.out.println("The range of values is "+range);
        System.out.println("The average of the values is "+average);
    }
}

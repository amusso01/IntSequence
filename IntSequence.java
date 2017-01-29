
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
            if(isInt){
               input= scan.nextLong();
               if(counter==0&&input==0){
                   System.out.println("You must enter at least one number");
                }else{
                    if(counter==0){
                        largest=input;
                        smallest=input;
                    }else{
                        if(input>largest){
                            largest=input;
                        }
                        if(input<smallest){
                            smallest=input;
                        }
                    }
                    sum+= input;
                    counter++;
                    if(counter==1){System.out.println("number");}else{System.out.println("numbers");}
                }
               
            }else{
                System.out.println("The input is not a whole number");
                input=scan.nextLong();
                counter++;
            }
        }while(input!=0);
        range=largest-smallest;
        average=sum/counter;
        System.out.println("The number of values entered is: "+counter);
        System.out.println("So far you have entered "+sum);
        System.out.println("So far you have entered "+smallest);
        System.out.println("So far you have entered "+largest);
        System.out.println("So far you have entered "+range);
        System.out.println("So far you have entered "+average);
    }
}


/**
 * Print out powers of 2 from 0 since 40
 * 
 * @author Andrea Musso 
 * 
 */
public class Powers
{
   public static void main (String[] arg){
       long power=1;
       for(int i=0; i<=40;i++){
           System.out.println("2^"+i+"= "+power);
           power*=2;
        }
    }
}

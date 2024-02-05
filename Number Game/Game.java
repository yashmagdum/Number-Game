import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String []args ){
        Scanner sc = new Scanner(System.in);
        boolean playagain = true;
        while(playagain){
            game();
            System.out.println("Do You Want To Play Game : for Yes press  Y and For No press N");
            String decision =sc.next().toLowerCase().toUpperCase();

            if(!decision.equals("Y")) {
                playagain = false;
            }
        }
        System.out.println("Thanks for Playing.......");
    }
    private static void game(){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int exactnum =random.nextInt(100)+1;
        int attempt =0;
        int maxattempt = 10;
        boolean  guesscorrect=false;
        while(!guesscorrect&&attempt<maxattempt){
            System.out.println("Enter Your Guess Between 1-100");
            int guessnum=sc.nextInt();
            attempt++;
            if(guessnum == exactnum){
                guesscorrect = true;
                System.out.println("You are Win");
                break;
            }
            else if(guessnum > exactnum){
                System.out.println("OOPS! it's too High.....");
            }
            else{
                System.out.println("OOPS! it's too Low.....");
            }
        }
        if(guesscorrect){
            System.out.println("Congrates.... You Guessed Correct Number"+exactnum+"in Attempt"+attempt);
        }
        else{
            System.out.println("You Reachrd Limit the Correct Answer is" + exactnum);
        }
    }
}

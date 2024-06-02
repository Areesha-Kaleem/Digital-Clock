//Areesha Kaleem
//Roll no 2022-CE-15

package Digital_clock;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        W_DigitalTimer t1=new W_DigitalTimer();
        System.out.println("How many Seconds you want to run the timer");
        int b= sc.nextInt();
        t1.setvalue(0,0,0);
        t1.tick(b);
    }
}



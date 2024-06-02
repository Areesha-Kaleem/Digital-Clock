//Areesha Kaleem
//Roll no 2022-CE-15


package Digital_clock;
import java.util.Date;
public class W_DigitalTimer {
    W_Counter hr, min, sec;

    W_DigitalTimer ()
    {
        hr = new W_Counter(24);
        min = new W_Counter();
        sec = new W_Counter();
    }
    public void setvalue(int shour, int smint, int ssec)
    {
        hr.set(shour);
        min.set(smint);
        sec.set(ssec);
    }
    W_DigitalTimer(int hour, int mint, int secs)
    {
        hr = new W_Counter(24);
        hr.set(hour);
        min = new W_Counter();
        min.set(mint);
        sec = new W_Counter();
        sec.set(secs);
    }
    public void tick(int a) throws InterruptedException {
        int s = sec.getValue();
        int m = min.getValue();
        int h = hr.getValue();
        for (int i = 1; i <= a; i++) {
            s++;
            if(s == sec.getLimitValue()){
                sec.reset();
                s = sec.getValue();
                m++;
                min.set(m);
            }
            if(m == min.getLimitValue()){
                min.reset();
                m = min.getValue();
                h++;
                hr.set(h);
            }
            if(h == hr.getLimitValue()){
                hr.reset();
                h = hr.getValue();
            }
            System.out.printf("\rTime: %02d:%02d:%02d",h,m,s);
            try
            {Thread.sleep(500);}
            catch(InterruptedException e)
            {e.printStackTrace();}

            System.out.print("\r");
            try
            {Thread.sleep(500);}
            catch(InterruptedException e)
            {e.printStackTrace();}
        }
    }
}

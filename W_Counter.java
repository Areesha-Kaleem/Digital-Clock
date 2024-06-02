//Areesha Kaleem
//Roll no 2022-CE-15

package Digital_clock;
import java.text.DecimalFormat;

public class W_Counter {
    private int Limit; // Upper limit on the counter
    private int CValue; // Current value
    private int DEFAULT_LIMIT = 12;  // the default counter limit


    public W_Counter() {
        this.Limit = 60;
    }

    public W_Counter(int limit) {
        this.Limit = limit;
    }

    public void tick()
    {
        if(this.CValue == this.Limit){
            this.reset();
        }
    }

    public void set(int newValue)
    {
        this.CValue = newValue;
    }

    public void reset()
    {
        this.CValue = 0;
    }

    public int getValue()
    {
        return this.CValue;

    }
    public int getLimitValue()
    {
        return this.Limit;
    }


    public String toString()
    {
        DecimalFormat fmt = new DecimalFormat("00"); // Use at least 2 digits
        return fmt.format(CValue);
    }
}

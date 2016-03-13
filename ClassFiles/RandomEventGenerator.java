package javafxapplication2;
import java.util.Random;
public class RandomEventGenerator
{
    private int pest = 0;
    private int rain = 50;
    private int hot_day = 25;
    private int cold_day = 75;
    private int lastEventDay = -1;
    private DayTimer dt = new DayTimer();
    public void generateRandomEvent(Tomato t, Potato p, Basil b, Lettuce l, Strawberry s, Blueberry blue)
    {
        Random rand = new Random();
        int  n = rand.nextInt(201);
        int curDay = dt.getCurrentDay();
        if(lastEventDay == curDay)
        {
            return;
        }
        clearAll(t,p,b,l,s,blue);
        if(n == pest)
        {
            pestAttack();
        }
        else if(n == rain)
        {
            itPours(t,p,b,l,s,blue);
        }
        else if(n == hot_day)
        {
            itsGettingHot(t,p,b,l,s,blue);
        }
        else if(n == cold_day)
        {
            itsCoolMan(t,p,b,l,s,blue);
        }
    }
    public void clearAll(Tomato t, Potato p, Basil b, Lettuce l, Strawberry s, Blueberry blue)
    {
        double offset = 0;
        t.setTempOffset(offset);
        p.setTempOffset(offset);
        b.setTempOffset(offset);
        l.setTempOffset(offset);
        s.setTempOffset(offset);
        blue.setTempOffset(offset);
    }
    public void pestAttack()
    {
        MotionSensor m = new MotionSensor();
        Tomato.setTextArea("Pest Detected! Automated Pest Deterrant System Activated!"+"\n");
        Potato.setTextArea("Pest Detected! Automated Pest Deterrant System Activated!"+"\n");
        Basil.setTextArea("Pest Detected! Automated Pest Deterrant System Activated!"+"\n");
        Lettuce.setTextArea("Pest Detected! Automated Pest Deterrant System Activated!"+"\n");
        Strawberry.setTextArea("Pest Detected! Automated Pest Deterrant System Activated!"+"\n");
        Blueberry.setTextArea("Pest Detected! Automated Pest Deterrant System Activated!"+"\n");
        m.activateMotionSensor();
    }
    public void itPours(Tomato t, Potato p, Basil b, Lettuce l, Strawberry s, Blueberry blue)
    {
        Tomato.setTextArea("It is Raining!!"+"\n");
        Potato.setTextArea("It is Raining!!"+"\n");
        Basil.setTextArea("It is Raining!!"+"\n");
        Lettuce.setTextArea("It is Raining!!"+"\n");
        Strawberry.setTextArea("It is Raining!!"+"\n");
        Blueberry.setTextArea("It is Raining!!"+"\n");
        t.watered();
        p.watered();
        b.watered();
        l.watered();
        s.watered();
        blue.watered();
        lastEventDay = dt.getCurrentDay();
    }
    public void itsGettingHot(Tomato t, Potato p, Basil b, Lettuce l, Strawberry s, Blueberry blue)
    {
        Tomato.setTextArea("It is a very hot day today!"+"\n");
        Potato.setTextArea("It is a very hot day today!"+"\n");
        Basil.setTextArea("It is a very hot day today!"+"\n");
        Lettuce.setTextArea("It is a very hot day today!"+"\n");
        Strawberry.setTextArea("It is a very hot day today!"+"\n");
        Blueberry.setTextArea("It is a very hot day today!"+"\n");
        double offset = 5;
        t.setTempOffset(offset);
        p.setTempOffset(offset);
        b.setTempOffset(offset);
        l.setTempOffset(offset);
        s.setTempOffset(offset);
        blue.setTempOffset(10);
        lastEventDay = dt.getCurrentDay();
        
    }
    public void itsCoolMan(Tomato t, Potato p, Basil b, Lettuce l, Strawberry s, Blueberry blue)
    {
        Tomato.setTextArea("It is a cold day today!"+"\n");
        Potato.setTextArea("It is a cold day today!"+"\n");
        Basil.setTextArea("It is a cold day today!"+"\n");
        Lettuce.setTextArea("It is a cold day today!"+"\n");
        Strawberry.setTextArea("It is a cold day today!"+"\n");
        Blueberry.setTextArea("It is a cold day today!"+"\n");
        double offset = -5;
        t.setTempOffset(offset);
        p.setTempOffset(offset);
        b.setTempOffset(offset);
        l.setTempOffset(offset);
        s.setTempOffset(offset);
        blue.setTempOffset(offset);
        lastEventDay = dt.getCurrentDay();
    }

    
}

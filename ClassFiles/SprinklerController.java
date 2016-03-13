package javafxapplication2;
public class SprinklerController
{
    
    public void poll(Tomato t,Potato p,Basil b,Lettuce l,Strawberry s,Blueberry blue)
    {
        waterTomato(t);
        t.setWaterFreqProperty();
        waterPotato(p);
        p.setWaterFreqProperty();
        waterBasil(b);
        b.setWaterFreqProperty();
        waterLettuce(l);
        l.setWaterFreqProperty();
        waterStrawberry(s);
        s.setWaterFreqProperty();
        waterBlueberry(blue);
        blue.setWaterFreqProperty();
    }
    
    public void waterTomato(Tomato t)
    {
        MoistureSensor m = new MoistureSensor();
        double moisture = m.getTomatoMoisture(t);
        if(moisture <= t.minMoistureLevel)
        {
            t.watered();
            
            
        }
        else
        {
            if(t.needWater())
            {
                t.watered();
                
            }
        }
    }
    public void waterPotato(Potato p)
    {
        MoistureSensor m = new MoistureSensor();
        double moisture = m.getPotatoMoisture(p);
        if(moisture <= p.minMoistureLevel)
        {
            p.watered();
            
        }
        else
        {
            if(p.needWater())
            {
                p.watered();
                
            }
        }
    }
    public void waterBasil(Basil b)
    {
        MoistureSensor m = new MoistureSensor();
        double moisture = m.getBasilMoisture(b);
        if(moisture <= b.minMoistureLevel)
        {
            b.watered();
           
        }
        else
        {
            if(b.needWater())
            {
                b.watered();
                
            }
        }
    }
    public void waterLettuce(Lettuce l)
    {
        MoistureSensor m = new MoistureSensor();
        double moisture = m.getLettuceMoisture(l);
        if(moisture <= l.minMoistureLevel)
        {
            l.watered();
            
        }
        else
        {
            if(l.needWater())
            {
                l.watered();
                
            }
        }
    }
    public void waterStrawberry(Strawberry s)
    {
        MoistureSensor m = new MoistureSensor();
        double moisture = m.getStrawberryMoisture(s);
        if(moisture <= s.minMoistureLevel)
        {
            s.watered();
            
        }
        else
        {
            if(s.needWater())
            {
                s.watered();
                
            }
        }
    }
    public void waterBlueberry(Blueberry blue)
    {
        MoistureSensor m = new MoistureSensor();
        double moisture = m.getBlueberryMoisture(blue);
        if(moisture <= blue.minMoistureLevel)
        {
            blue.watered();
            
        }
        else
        {
            if(blue.needWater())
            {
                blue.watered();
                
            }
        }
    }
}

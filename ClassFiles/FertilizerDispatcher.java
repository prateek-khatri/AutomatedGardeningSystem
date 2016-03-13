package javafxapplication2;
public class FertilizerDispatcher
{
    private final double unit = 2; //lbs for each type of plant
    // As plant gorws the lbs increases by a factor of 0.2 times the age
    public void poll(Tomato t,Potato p,Basil b,Lettuce l,Strawberry s,Blueberry blue)
    {
        fertilizeTomato(t);
        t.setFertilizerFreqProperty();
        fertilizePotato(p);
        p.setFertilizerFreqProperty();
        fertilizeBasil(b);
        b.setFertilizerFreqProperty();
        fertilizeLettuce(l);
        l.setFertilizerFreqProperty();
        fertilizeStrawberry(s);
        s.setFertilizerFreqProperty();
        fertilizeBlueberry(blue);
        blue.setFertilizerFreqProperty();
    }
    
    public void fertilizeTomato(Tomato t)
    {
        t.setFertilizerAmountProperty();
        if(t.needFertilizer())
        {
            t.fertilized();
            double fertilizer = (t.ageOfPlant() * 0.2) + unit;
            String fert = String.format("%.2f",fertilizer);
            Tomato.setTextArea("Tomato Fertilized - Amount Used (lbs): "+fert+"\n");
        }

    }
    public void fertilizePotato(Potato p)
    {
        if(p.needFertilizer())
        {
            p.fertilized();
            double fertilizer = (p.ageOfPlant() * 0.2) + unit;
            String fert = String.format("%.2f",fertilizer);
            Potato.setTextArea("Potato Fertilized - Amount Used (lbs): "+fert+"\n");
        }
    }
    public void fertilizeBasil(Basil b)
    {
        if(b.needFertilizer())
        {
            b.fertilized();
            double fertilizer = (b.ageOfPlant() * 0.2) + unit;
            String fert = String.format("%.2f",fertilizer);
            Basil.setTextArea("Basil Fertilized - Amount Used (lbs): "+fert+"\n");
        }
    }
    public void fertilizeLettuce(Lettuce l)
    {
        if(l.needFertilizer())
        {
            l.fertilized();
            double fertilizer = (l.ageOfPlant() * 0.2) + unit;
            String fert = String.format("%.2f",fertilizer);
            Lettuce.setTextArea("Lettuce Fertilized - Amount Used (lbs): "+fert+"\n");
        }
    }
    public void fertilizeStrawberry(Strawberry s)
    {
        if(s.needFertilizer())
        {
            s.fertilized();
            double fertilizer = (s.ageOfPlant() * 0.2) + unit;
            System.out.println("Strawberry Fertilized - Amount Used (lbs): "+fertilizer);
        }
    }
    public void fertilizeBlueberry(Blueberry b)
    {
        if(b.needFertilizer())
        {
            b.fertilized();
            double fertilizer = (b.ageOfPlant() * 0.2) + unit;
            System.out.println("Blueberry Fertilized - Amount Used (lbs): "+fertilizer);
        }
    }
    
    
    
}

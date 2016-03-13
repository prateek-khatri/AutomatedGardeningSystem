package javafxapplication2;
public class PlantGrowthMonitor
{
    private double multiplier = 2;//change this 
    
    public void poll(Tomato t, Potato p, Basil b, Lettuce l, Strawberry s, Blueberry blue)
    {
        growTomato(t);
        growPotato(p);
        growBasil(b);
        growLettuce(l);
        growStrawberry(s);
        growBlueberry(blue);
    }
    public void growTomato(Tomato t)
    {
        double age = t.ageOfPlant();
        double offset = age*(12/100);
        double waterFreq  = t.getWaterFreq();
        double newWaterFreq = waterFreq-offset;
        t.setWaterFreq(newWaterFreq);
        double offsetFertilizer = age*(120/100);
        t.setFertilizerFreq(t.getFertilizerFreq() - offsetFertilizer);       
    }
    public void growPotato(Potato p)
    {
        double age = p.ageOfPlant();
        double offset = age*(12/100);
        double waterFreq  = p.getWaterFreq();
        double newWaterFreq = waterFreq-offset;
        p.setWaterFreq(newWaterFreq);
        double offsetFertilizer = age*(120/100);
        p.setFertilizerFreq(p.getFertilizerFreq() - offsetFertilizer);  
    }
    public void growLettuce(Lettuce l)
    {
        double age = l.ageOfPlant();
        double offset = age*(12/100);
        double waterFreq  = l.getWaterFreq();
        double newWaterFreq = waterFreq-offset;
        l.setWaterFreq(newWaterFreq);
        double offsetFertilizer = age*(120/100);
        l.setFertilizerFreq(l.getFertilizerFreq() - offsetFertilizer);  
    }
    public void growStrawberry(Strawberry s)
    {
        double age = s.ageOfPlant();
        double offset = age*(12/100);
        double waterFreq  = s.getWaterFreq();
        double newWaterFreq = waterFreq-offset;
        s.setWaterFreq(newWaterFreq);
        double offsetFertilizer = age*(120/100);
        s.setFertilizerFreq(s.getFertilizerFreq() - offsetFertilizer);  
    }
    public void growBlueberry(Blueberry b)
    {
        double age = b.ageOfPlant();
        double offset = age*(12/100);
        double waterFreq  = b.getWaterFreq();
        double newWaterFreq = waterFreq-offset;
        b.setWaterFreq(newWaterFreq);
        double offsetFertilizer = age*(120/100);
        b.setFertilizerFreq(b.getFertilizerFreq() - offsetFertilizer);  
    }
    public void growBasil(Basil b)
    {
        double age = b.ageOfPlant();
        double offset = age*(12/100);
        double waterFreq  = b.getWaterFreq();
        double newWaterFreq = waterFreq-offset;
        b.setWaterFreq(newWaterFreq);
        double offsetFertilizer = age*(120/100);
        b.setFertilizerFreq(b.getFertilizerFreq() - offsetFertilizer); 
    }
    
    
}

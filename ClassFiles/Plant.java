package javafxapplication2;
import java.util.Random;
public abstract class Plant
{
    public double waterFreq;
    public double fertilizerFreq;
    public double maxTemp;
    public double minTemp;
    public double growthRate;
    public double ageIndex;
    public double lastWaterTime;
    public double lastFertilizeTime;
    public double moistureLevel;
    public double minMoistureLevel;
    public double curTemp;
    public double tempEventOffset;
    public int tempEventDay;
    public double heaterCoolerOffset;
    public double randomOffset;
    protected abstract boolean needWater();
    protected abstract boolean needFertilizer();
    protected abstract double growthIndex();
    protected abstract double ageOfPlant();
    protected abstract void setWaterFreq(double w);
    protected abstract void setFertilizerFreq(double f);
    protected abstract void setMaxTemp(double mx);
    protected abstract void setMinTemp(double min);
    protected abstract void setGrowthRate(double grow);
    protected abstract void fertilized();
    protected abstract void watered();
    protected abstract double getMoistureLevel();
    protected abstract double getTemperatureLevel(int hour);

}

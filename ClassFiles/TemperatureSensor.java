package javafxapplication2;
public class TemperatureSensor
{
    public double getTomatoTemperature(Tomato t)
    {
        DayTimer dt = new DayTimer();
        int hour = dt.getHourOfTheDay();
        double result = t.getTemperatureLevel(hour);
        t.setTemperatureProperty();
        return result;
    }
    public double getPotatoTemperature(Potato t)
    {
        DayTimer dt = new DayTimer();
        int hour = dt.getHourOfTheDay();
        double result = t.getTemperatureLevel(hour);
        t.setTemperatureProperty();
        return result;
    }
    public double getBasilTemperature(Basil t)
    {
        DayTimer dt = new DayTimer();
        int hour = dt.getHourOfTheDay();
        double result = t.getTemperatureLevel(hour);
        t.setTemperatureProperty();
        return result;
    }
    public double getLettuceTemperature(Lettuce t)
    {
        DayTimer dt = new DayTimer();
        int hour = dt.getHourOfTheDay();
        double result = t.getTemperatureLevel(hour);
        t.setTemperatureProperty();
        return result;
    }
    public double getStrawberryTemperature(Strawberry t)
    {
        DayTimer dt = new DayTimer();
        int hour = dt.getHourOfTheDay();
        double result = t.getTemperatureLevel(hour);
        t.setTemperatureProperty();
        return result;
    }
    public double getBlueberryTemperature(Blueberry t)
    {
        DayTimer dt = new DayTimer();
        int hour = dt.getHourOfTheDay();
        double result = t.getTemperatureLevel(hour);
        t.setTemperatureProperty();
        return result;
    }
}

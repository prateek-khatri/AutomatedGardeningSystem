package javafxapplication2;
public class DayTimer
{
    
    public int getHourOfTheDay()
    {
        TimeKeeper t = new TimeKeeper();
        double curDay = t.getElapsedDays();
        double curHours = (curDay*24)%24;
        return (int)curHours;
    }
    public int getCurrentDay()
    {
        TimeKeeper t = new TimeKeeper();
        int curDay = (int)t.getElapsedDays();
        return curDay;
    }
   
}

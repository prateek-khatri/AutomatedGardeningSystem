
package javafxapplication2;

import java.io.*;
import java.util.*;
import javafx.application.Platform;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Write a description of class TimeKeeper here.
 * Keeps Timer and Provides Current Day/Night time 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimeKeeper
{
    // instance variables - replace the example below with your own
    static long startTime = System.currentTimeMillis();
    public static StringProperty jfxProp = new SimpleStringProperty("");
    public static StringProperty time = new SimpleStringProperty("");
    
    /**
     * Constructor for objects of class TimeKeeper
     */
    public TimeKeeper()
    {
        //System.out.println("Start Time: "+startTime);
        
    }
    public void setJFXTime()
    {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                int hr = getHourOfTheDay();
                int min = getMinuteOfTheHour();
                time.set(""+hr+":"+min);
            }
        });
        
    }
    public void setJFXDay(String days)
    {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                jfxProp.set(days);
            }
        });
    }
    public long getElapsedTime()
    {
        // put your code here
        return System.currentTimeMillis() - startTime;
    }
    
    public double getElapsedDays()
    {
        double hours = getElapsedHours();
        double days = hours/24;
        int dayNum = (int)days;
        setJFXDay(""+dayNum);
        return days;
    }
    public double getElapsedHours()
    {
        double milis = getElapsedTime();
        double seconds = milis/1000;
        double hours = seconds/60;
        return hours;
    }
    
    public double getElapsedMinutes()
    {
        double hours = getElapsedHours();
        setJFXTime();
        return hours*60;
    }
    public int getHourOfTheDay()
    {
        double curDay = getElapsedDays();
        double curHours = (curDay*24)%24;
        return (int)curHours;
    }
    public int getMinuteOfTheHour()
    {
        double min = getElapsedMinutes();
        double minute = (min%60);
        return (int)minute;
    }
        
}

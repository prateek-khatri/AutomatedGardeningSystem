/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.FileWriter;
import java.io.IOException;


public class Logger {
    public static boolean files = false;
    public void poll(Tomato t, Potato p, Basil b, Lettuce l, Strawberry s, Blueberry blue) throws IOException
    {
        logTomato(t);
        logPotato(p);
        logBasil(b);
        logLettuce(l);
        logStrawberry(s);
        logBlueberry(blue);
        files= true;
    }
    
    public void logTomato(Tomato t) throws IOException
    {
        
        
        String fileName = "Tomato_Log.csv";
        FileWriter fw = new FileWriter(fileName,true);
        if(files == false)
        {
            String header = "Day,Hours,Minutes,Temperature(F),Moisture(%),Plant Age(%),Watering Freq.(Hrs),Fertilizer Freq.(Hrs),Min Temp.(F),Max Temp.(F),Heater(ON/OFF),Cooler(ON/OFF)"+"\n"; 
            fw.write(header);
        }
        TimeKeeper tk= new TimeKeeper();
        DayTimer dk = new DayTimer();
        String line = String.format("%d,%02d,%02d,%.2f,%.2f,%.2f,%.0f,%.0f,%.2f,%.2f,",dk.getCurrentDay(),tk.getHourOfTheDay(),tk.getMinuteOfTheHour(),t.getCurTemp(),t.getMoistureLevel(),t.ageOfPlant(),t.getWaterFreq(),t.getFertilizerFreq(),t.getMinTemp(),t.getMaxTemp());
        String end;
        if(Tomato.heaterCoolerState == -1)
        {
            end = "OFF,OFF"+"\n";
        }
        else if(Tomato.heaterCoolerState == 1)
        {
            end = "ON,OFF"+"\n";
        }
        else
        {
            end = "OFF,ON"+"\n";
        }
        String result = line.concat(end);
        fw.write(result);
        fw.close();
        
    }
    public void logPotato(Potato t) throws IOException
    {
        String fileName = "Potato_Log.csv";
        FileWriter fw = new FileWriter(fileName,true);
        if(files == false)
        {
            String header = "Day,Hours,Minutes,Temperature(F),Moisture(%),Plant Age(%),Watering Freq.(Hrs),Fertilizer Freq.(Hrs),Min Temp.(F),Max Temp.(F),Heater(ON/OFF),Cooler(ON/OFF)"+"\n"; 
            fw.write(header);
        }
        TimeKeeper tk= new TimeKeeper();
        DayTimer dk = new DayTimer();
        String line = String.format("%d,%02d,%02d,%.2f,%.2f,%.2f,%.0f,%.0f,%.2f,%.2f,",dk.getCurrentDay(),tk.getHourOfTheDay(),tk.getMinuteOfTheHour(),t.getCurTemp(),t.getMoistureLevel(),t.ageOfPlant(),t.getWaterFreq(),t.getFertilizerFreq(),t.getMinTemp(),t.getMaxTemp());
        String end;
        if(Potato.heaterCoolerState == -1)
        {
            end = "OFF,OFF"+"\n";
        }
        else if(Potato.heaterCoolerState == 1)
        {
            end = "ON,OFF"+"\n";
        }
        else
        {
            end = "OFF,ON"+"\n";
        }
        String result = line.concat(end);
        fw.write(result);
        fw.close();
        
    }
    public void logBasil(Basil t) throws IOException
    {
        String fileName = "Basil_Log.csv";
        FileWriter fw = new FileWriter(fileName,true);
        if(files == false)
        {
            String header = "Day,Hours,Minutes,Temperature(F),Moisture(%),Plant Age(%),Watering Freq.(Hrs),Fertilizer Freq.(Hrs),Min Temp.(F),Max Temp.(F),Heater(ON/OFF),Cooler(ON/OFF)"+"\n"; 
            fw.write(header);
        }
        TimeKeeper tk= new TimeKeeper();
        DayTimer dk = new DayTimer();
        String line = String.format("%d,%02d,%02d,%.2f,%.2f,%.2f,%.0f,%.0f,%.2f,%.2f,",dk.getCurrentDay(),tk.getHourOfTheDay(),tk.getMinuteOfTheHour(),t.getCurTemp(),t.getMoistureLevel(),t.ageOfPlant(),t.getWaterFreq(),t.getFertilizerFreq(),t.getMinTemp(),t.getMaxTemp());
        String end;
        if(Basil.heaterCoolerState == -1)
        {
            end = "OFF,OFF"+"\n";
        }
        else if(Basil.heaterCoolerState == 1)
        {
            end = "ON,OFF"+"\n";
        }
        else
        {
            end = "OFF,ON"+"\n";
        }
        String result = line.concat(end);
        fw.write(result);
        fw.close();
        
    }
    public void logLettuce(Lettuce t) throws IOException
    {
        String fileName = "Lettuce_Log.csv";
        FileWriter fw = new FileWriter(fileName,true);
        if(files == false)
        {
            String header = "Day,Hours,Minutes,Temperature(F),Moisture(%),Plant Age(%),Watering Freq.(Hrs),Fertilizer Freq.(Hrs),Min Temp.(F),Max Temp.(F),Heater(ON/OFF),Cooler(ON/OFF)"+"\n"; 
            fw.write(header);
        }
        TimeKeeper tk= new TimeKeeper();
        DayTimer dk = new DayTimer();
        String line = String.format("%d,%02d,%02d,%.2f,%.2f,%.2f,%.0f,%.0f,%.2f,%.2f,",dk.getCurrentDay(),tk.getHourOfTheDay(),tk.getMinuteOfTheHour(),t.getCurTemp(),t.getMoistureLevel(),t.ageOfPlant(),t.getWaterFreq(),t.getFertilizerFreq(),t.getMinTemp(),t.getMaxTemp());
        String end;
        if(Lettuce.heaterCoolerState == -1)
        {
            end = "OFF,OFF"+"\n";
        }
        else if(Lettuce.heaterCoolerState == 1)
        {
            end = "ON,OFF"+"\n";
        }
        else
        {
            end = "OFF,ON"+"\n";
        }
        String result = line.concat(end);
        fw.write(result);
        fw.close();
    }
    public void logStrawberry(Strawberry t) throws IOException
    {
        String fileName = "Strawberry_Log.csv";
        FileWriter fw = new FileWriter(fileName,true);
        if(files == false)
        {
            String header = "Day,Hours,Minutes,Temperature(F),Moisture(%),Plant Age(%),Watering Freq.(Hrs),Fertilizer Freq.(Hrs),Min Temp.(F),Max Temp.(F),Heater(ON/OFF),Cooler(ON/OFF)"+"\n"; 
            fw.write(header);
        }
        TimeKeeper tk= new TimeKeeper();
        DayTimer dk = new DayTimer();
        String line = String.format("%d,%02d,%02d,%.2f,%.2f,%.2f,%.0f,%.0f,%.2f,%.2f,",dk.getCurrentDay(),tk.getHourOfTheDay(),tk.getMinuteOfTheHour(),t.getCurTemp(),t.getMoistureLevel(),t.ageOfPlant(),t.getWaterFreq(),t.getFertilizerFreq(),t.getMinTemp(),t.getMaxTemp());
        String end;
        if(Strawberry.heaterCoolerState == -1)
        {
            end = "OFF,OFF"+"\n";
        }
        else if(Strawberry.heaterCoolerState == 1)
        {
            end = "ON,OFF"+"\n";
        }
        else
        {
            end = "OFF,ON"+"\n";
        }
        String result = line.concat(end);
        fw.write(result);
        fw.close();
    }
    public void logBlueberry(Blueberry t) throws IOException
    {
        String fileName = "Blueberry_Log.csv";
        FileWriter fw = new FileWriter(fileName,true);
        if(files == false)
        {
            String header = "Day,Hours,Minutes,Temperature(F),Moisture(%),Plant Age(%),Watering Freq.(Hrs),Fertilizer Freq.(Hrs),Min Temp.(F),Max Temp.(F),Heater(ON/OFF),Cooler(ON/OFF)"+"\n"; 
            fw.write(header);
        }
        TimeKeeper tk= new TimeKeeper();
        DayTimer dk = new DayTimer();
        String line = String.format("%d,%02d,%02d,%.2f,%.2f,%.2f,%.0f,%.0f,%.2f,%.2f,",dk.getCurrentDay(),tk.getHourOfTheDay(),tk.getMinuteOfTheHour(),t.getCurTemp(),t.getMoistureLevel(),t.ageOfPlant(),t.getWaterFreq(),t.getFertilizerFreq(),t.getMinTemp(),t.getMaxTemp());
        String end;
        if(Blueberry.heaterCoolerState == -1)
        {
            end = "OFF,OFF"+"\n";
        }
        else if(Blueberry.heaterCoolerState == 1)
        {
            end = "ON,OFF"+"\n";
        }
        else
        {
            end = "OFF,ON"+"\n";
        }
        String result = line.concat(end);
        fw.write(result);
        fw.close();
    }
    
    
}

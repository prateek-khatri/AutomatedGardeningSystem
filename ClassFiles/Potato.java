package javafxapplication2;
import java.util.Random;
import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import static javafxapplication2.TimeKeeper.jfxProp;
public class Potato extends Plant
{
    public static StringProperty potatoPropertyMoisture = new SimpleStringProperty("");
    public static StringProperty potatoPropertyFertilizerAmount = new SimpleStringProperty("");
    public static StringProperty potatoPropertyTemperature = new SimpleStringProperty("");
    public static StringProperty potatoPropertyWaterFrequency = new SimpleStringProperty("");
    public static StringProperty potatoPropertyFertilizerFrequency = new SimpleStringProperty("");
    public static StringProperty potatoPropertyMaxTemp = new SimpleStringProperty("");
    public static StringProperty potatoPropertyMinTemp = new SimpleStringProperty("");
    public static StringProperty potatoTextArea = new SimpleStringProperty("");
    public static StringProperty potatoPropertyHeaterStatus = new SimpleStringProperty("");
    public static StringProperty potatoPropertyCoolerStatus = new SimpleStringProperty("");
    public static StringProperty potatoPropertyPlantAge = new SimpleStringProperty("");
    public double lastTempUpdate = 0;
    public static int heaterCoolerState = -1;
    Potato()
    {
        waterFreq = 36; //hours
        fertilizerFreq = 360; //days
        maxTemp = 70; //F degrees
        minTemp = 55; //F degrees
        growthRate = 0.85; //0.85 % per day
        lastWaterTime = 0;
        lastFertilizeTime = 0;
        ageIndex = 0;
        moistureLevel = 100;
        minMoistureLevel = 30;
        curTemp = 65;
        tempEventOffset = 0;
        tempEventDay=-1;
        heaterCoolerOffset = 0;
        randomOffset = 0;
        setMinTempProperty();
        setMaxTempProperty();
        setTextArea("Intializing Plant System..."+"\n");
        setHeaterStatusOff();
        setCoolerStatusOff();
        setPlantAge();
    }
    public static void setTextArea(String add)
    {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                String result = potatoTextArea.get();
                TimeKeeper t = new TimeKeeper();
                String timeStamp = String.format("[%d:%d] ",t.getHourOfTheDay(),t.getMinuteOfTheHour());
                timeStamp = timeStamp.concat(add);
                String temp = timeStamp.concat(result);
                potatoTextArea.set(temp);
            }
        });
    }
    public void setPlantAge()
    {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                potatoPropertyPlantAge.set(String.format("%.1f", ageIndex));
            }
        });
    }
    public void setHeaterStatusOff()
    {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                potatoPropertyHeaterStatus.set("OFF");
                
            }
        });
    }
    public void setCoolerStatusOff()
    {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                potatoPropertyCoolerStatus.set("OFF");
            }
        });
    }
    public void setHeaterStatusOn()
    {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                potatoPropertyHeaterStatus.set("ON");
                
            }
        });
    }
    public void setCoolerStatusOn()
    {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                potatoPropertyCoolerStatus.set("ON");
            }
        });
    }
    public void setMoistureProperty()
    {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                String abc = String.format("%.1f",moistureLevel);
                potatoPropertyMoisture.set(abc);
            }
        });
    }
    public void setFertilizerAmountProperty()
    {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                double fertilizer = (ageOfPlant() * 0.2) + 2;
                String amount = String.format("%.1f",fertilizer);
                potatoPropertyFertilizerAmount.set(amount);
            }
        });
        
    }
    public void setTemperatureProperty()
    {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                String amount = String.format("%.1f",curTemp);
                potatoPropertyTemperature.set(amount);
            }
        });
        
    }
    public void setWaterFreqProperty()
    {
       Platform.runLater(new Runnable() {
            @Override
            public void run() {
                
                String res = String.format("%.1f",waterFreq);
                potatoPropertyWaterFrequency.set(res);

            }
        }); 
    }
    public void setFertilizerFreqProperty()
    {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                
                String res = String.format("%.1f",fertilizerFreq);
                potatoPropertyFertilizerFrequency.set(res);

            }
        }); 
    }
    public void setMinTempProperty()
    {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                
                String res = String.format("%.1f",minTemp);
                potatoPropertyMinTemp.set(res);

            }
        }); 
    }
    public void setMaxTempProperty()
    {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                
                String res = String.format("%.1f",maxTemp);
                potatoPropertyMaxTemp.set(res);

            }
        }); 
    }
    
    protected double getFertilizerFreq()
    {
        return fertilizerFreq;
    }
        
    protected double getWaterFreq()
    {
        setWaterFreqProperty();
        return waterFreq;
    }
    protected void setWaterFreq(double w)
    {
        if(w<6) w = 6;
        waterFreq = w;
    }
    protected void decrementFertilizerFreq()
    {
        fertilizerFreq--;
        if(fertilizerFreq < 168)
        {
            fertilizerFreq = 168;
        }
    }
    protected void incrementFertilizerFreq()
    {
        fertilizerFreq++;
        if(fertilizerFreq > 400)
        {
            fertilizerFreq = 400;
        }
    }
    protected void setFertilizerFreq(double f)
    {

    }
     protected void setMaxTemp(double mx)
    {
        maxTemp = mx;
        setMinTempProperty();
        setMaxTempProperty();
    }
    protected void setMinTemp(double min)
    {
        minTemp = min;
        setMinTempProperty();
        setMaxTempProperty();
    }
    protected void setGrowthRate(double grow)
    {
        growthRate = grow;
    }
    
   protected boolean needWater()
    {
        TimeKeeper t = new TimeKeeper();
        if((t.getElapsedHours() - lastWaterTime) > waterFreq)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    protected boolean needFertilizer()
    {
        setFertilizerAmountProperty();
        TimeKeeper t = new TimeKeeper();
        if((t.getElapsedHours() - lastFertilizeTime) > fertilizerFreq)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    protected double growthIndex()
    {
        return growthRate;
    }
    protected double ageOfPlant()
    {
        TimeKeeper t = new TimeKeeper();
        double age = t.getElapsedDays() * growthIndex() * 5;
        if(age > 100) age = 100;
        ageIndex = age;
        setPlantAge();
        return age;
    }
    protected void watered()
    {
        TimeKeeper t = new TimeKeeper();
        lastWaterTime = t.getElapsedHours();
        moistureLevel = 100;
        Potato.setTextArea("Potato Plant was Watered!"+"\n");
    }
     protected void fertilized()
    {
        TimeKeeper t = new TimeKeeper();
        lastFertilizeTime = t.getElapsedHours();
        Potato.setTextArea("Potato Plant was Fertilized!"+"\n");
    }
    protected double getMoistureLevel()
    {
        TimeKeeper t = new TimeKeeper();
        double currentTime = t.getElapsedHours();
         moistureLevel = 100 - currentTime + lastWaterTime;
         setMoistureProperty();
        return moistureLevel;
    }
    protected double getTemperatureLevel(int hour)
    {
        DayTimer d = new DayTimer();
        TimeKeeper t = new TimeKeeper();
        if(tempEventDay != d.getCurrentDay())
        {
            tempEventDay = -1;
            tempEventOffset = 0;
        }
        if(Math.abs(t.getMinuteOfTheHour()- lastTempUpdate) < 10)
        {
            return curTemp;
        }
        Random r = new Random();
        int random = r.nextInt(2) - 1;
        randomOffset = random;
        lastTempUpdate = t.getMinuteOfTheHour();
        double totalOffset = tempEventOffset + heaterCoolerOffset + randomOffset;
        
        if((hour >= 0) && (hour < 4))
        {
            curTemp = curTemp - 1 + totalOffset;
            return curTemp;
        }
        else if((hour >=4) && (hour < 7))
        {
            curTemp = curTemp -3 + totalOffset;
            return curTemp;
        }
        else if((hour >=7) && (hour < 10))
        {
            curTemp  = curTemp + totalOffset;
            return curTemp;
        }
        else if((hour >= 10) && (hour < 12))
        {
            curTemp = curTemp + 1 + totalOffset;
            return curTemp;
        }
        else if((hour >=12) && (hour < 17))
        {
            curTemp = curTemp + 2 + totalOffset;
            return curTemp;
        }
        else if((hour >=17) && (hour < 20))
        {
            curTemp  = curTemp + totalOffset;
            return curTemp;
        }
        else if((hour >= 20) && (hour < 24))
        {
           curTemp = curTemp - 1 + totalOffset;
            return curTemp;
        }
        else
        {
            curTemp = curTemp - 1 + totalOffset;
            return curTemp;
        }
    }
    protected void setTempOffset(double t)
    {
        DayTimer d = new DayTimer();
        int curDay = d.getCurrentDay();
        tempEventDay = curDay;
        tempEventOffset = t;
    }
   protected void setHeaterCoolerOffset(boolean heater)
    {
        if(heater == true)
        {
            if((heaterCoolerState == -1) || (heaterCoolerState == 0))
            {
                Potato.setTextArea("Heater Turned On!"+"\n");
            }
            heaterCoolerState = 1;
            setHeaterStatusOn();
            setCoolerStatusOff();
            heaterCoolerOffset = heaterCoolerOffset + 0.2;
            if(tempEventOffset == -10)
            {
                heaterCoolerOffset = heaterCoolerOffset + 0.3;
            }
        }
        else
        {
            if((heaterCoolerState == -1) || (heaterCoolerState == 1))
            {
                Potato.setTextArea("Cooler Turned On!"+"\n");
            }
            heaterCoolerState = 0;
            setCoolerStatusOn();
            setHeaterStatusOff();
            heaterCoolerOffset = heaterCoolerOffset - 0.2;
            if(tempEventOffset == 10)
            {
                heaterCoolerOffset = heaterCoolerOffset - 0.3;
            }
        }
    }
    protected double getMinTemp()
    {
        return minTemp;
    }
    protected double getMaxTemp()
    {
        return maxTemp;
    }
    protected void clearHeaterCoolerOffset()
    {
        setHeaterStatusOff();
        setCoolerStatusOff();
        if(heaterCoolerState != -1)
        {
            Potato.setTextArea("Heating or Cooling Deactivated!"+"\n");
        }
        heaterCoolerOffset = 0;
        heaterCoolerState = -1;
    }
    protected double getCurTemp()
    {
        return curTemp;
    }

}

package javafxapplication2;
public class Thermostat
{
    public void poll(Tomato t,Potato p,Basil b,Lettuce l,Strawberry s,Blueberry blue)
    {
        tomatoCheck(t);
        potatoCheck(p);
        basilCheck(b);
        lettuceCheck(l);
        strawberryCheck(s);
        blueberryCheck(blue);
        
    }
    
    public void tomatoCheck(Tomato t)
    {
        TemperatureSensor ts = new TemperatureSensor();
        double temperature = ts.getTomatoTemperature(t);
        double minTemp  = t.getMinTemp();
        double maxTemp = t.getMaxTemp();
        Heater h = new Heater();
        Cooler c = new Cooler();
        if(temperature > maxTemp)
        {
            
            c.activate(t);
            
        }
        else if(temperature < minTemp)
        {
            
            h.activate(t);
        }
        else
        {
            t.setHeaterStatusOff();
            t.setCoolerStatusOff();
            c.deactivate(t);
            h.deactivate(t);
        }
    }
    public void potatoCheck(Potato t)
    {
        TemperatureSensor ts = new TemperatureSensor();
        double temperature = ts.getPotatoTemperature(t);
        double minTemp  = t.getMinTemp();
        double maxTemp = t.getMaxTemp();
        Heater h = new Heater();
        Cooler c = new Cooler();
        if(temperature > maxTemp)
        {
            c.activate(t);
            
        }
        else if(temperature < minTemp)
        {
            h.activate(t);
        }
        else
        {
            t.setHeaterStatusOff();
            t.setCoolerStatusOff();
            c.deactivate(t);
            h.deactivate(t);
        }
    }
    public void basilCheck(Basil t)
    {
        TemperatureSensor ts = new TemperatureSensor();
        double temperature = ts.getBasilTemperature(t);
        double minTemp  = t.getMinTemp();
        double maxTemp = t.getMaxTemp();
        Heater h = new Heater();
        Cooler c = new Cooler();
        if(temperature > maxTemp)
        {
            c.activate(t);
            
        }
        else if(temperature < minTemp)
        {
            h.activate(t);
        }
        else
        {
            t.setHeaterStatusOff();
            t.setCoolerStatusOff();
            c.deactivate(t);
            h.deactivate(t);
        }
    }
    public void lettuceCheck(Lettuce t)
    {
        TemperatureSensor ts = new TemperatureSensor();
        double temperature = ts.getLettuceTemperature(t);
        double minTemp  = t.getMinTemp();
        double maxTemp = t.getMaxTemp();
        Heater h = new Heater();
        Cooler c = new Cooler();
        if(temperature > maxTemp)
        {
            c.activate(t);
            
        }
        else if(temperature < minTemp)
        {
            h.activate(t);
        }
        else
        {
            t.setHeaterStatusOff();
            t.setCoolerStatusOff();
            c.deactivate(t);
            h.deactivate(t);
        }
    }
    public void strawberryCheck(Strawberry t)
    {
        TemperatureSensor ts = new TemperatureSensor();
        double temperature = ts.getStrawberryTemperature(t);
        double minTemp  = t.getMinTemp();
        double maxTemp = t.getMaxTemp();
        Heater h = new Heater();
        Cooler c = new Cooler();
        if(temperature > maxTemp)
        {
            c.activate(t);
            
        }
        else if(temperature < minTemp)
        {
            h.activate(t);
        }
        else
        {
            t.setHeaterStatusOff();
            t.setCoolerStatusOff();
            c.deactivate(t);
            h.deactivate(t);
        }
    }
    public void blueberryCheck(Blueberry t)
    {
        TemperatureSensor ts = new TemperatureSensor();
        double temperature = ts.getBlueberryTemperature(t);
        double minTemp  = t.getMinTemp();
        double maxTemp = t.getMaxTemp();
        Heater h = new Heater();
        Cooler c = new Cooler();
        if(temperature > maxTemp)
        {
           
            c.activate(t);
            
        }
        else if(temperature < minTemp)
        {
            h.activate(t);
        }
        else
        {
            t.setHeaterStatusOff();
            t.setCoolerStatusOff();
            c.deactivate(t);
            h.deactivate(t);
        }
    }

}

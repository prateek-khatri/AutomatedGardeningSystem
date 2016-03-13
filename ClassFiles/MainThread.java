/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
/**
 *
 * @author Prateek
 */
public class MainThread {
    
    ScheduledExecutorService ses;
       TimeKeeper time = new TimeKeeper();
       static Tomato t = new Tomato();
       static Potato p = new Potato();
       static Basil b = new Basil();
       static Lettuce l = new Lettuce();
       static Strawberry s = new Strawberry();
       static Blueberry blue = new Blueberry();
       SprinklerController sc = new SprinklerController();
       PlantGrowthMonitor pgm = new PlantGrowthMonitor();
       FertilizerDispatcher fd = new FertilizerDispatcher();
       RandomEventGenerator reg = new RandomEventGenerator();
       Thermostat tst = new Thermostat();
       Logger log = new Logger();
       
    MainThread()
    {
        startGarden();
    }
    public void startGarden()
    {
        
        this.ses=Executors.newSingleThreadScheduledExecutor();
        ses.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                
       
            
            //System.out.format("Days: %.2f, Hours: %.2f, Minutes: %.2f\n",time.getElapsedDays(),time.getElapsedHours(),time.getElapsedMinutes());            
            sc.poll(t,p,b,l,s,blue);
            fd.poll(t,p,b,l,s,blue);
            pgm.poll(t,p,b,l,s,blue);
            reg.generateRandomEvent(t,p,b,l,s,blue);
            tst.poll(t,p,b,l,s,blue);
                try {
                    log.poll(t,p,b,l,s,blue);
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(MainThread.class.getName()).log(Level.SEVERE, null, ex);
                }

        
        }
        },0,1,TimeUnit.SECONDS);
       
    }
}

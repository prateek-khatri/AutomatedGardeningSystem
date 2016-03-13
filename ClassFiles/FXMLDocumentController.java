/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author Prateek
 */
public class FXMLDocumentController implements Initializable {
    

    @FXML
    private Label tomatoTime;
    @FXML
    private Label tomatoDay;
    @FXML
    private Label tomatoMoisture;
    @FXML
    private Label tomatoFertilizerAmount;
    @FXML
    private Label tomatoTemperature;
    @FXML
    private Label tomatoWaterFrequency;
    @FXML
    private Label tomatoFertilizerFrequency;
    @FXML
    private Label tomatoMaxTemp;
    @FXML
    private Label tomatoMinTemp;
    @FXML
    public Label tomatoHeaterStatus;
    @FXML
    public Label tomatoCoolerStatus;
    @FXML
    private TextArea tomatoTextArea;
    @FXML
    private Label tomatoPlantAge;
    
    @FXML
    private Label potatoTime;
    @FXML
    private Label potatoDay;
    @FXML
    private Label potatoMoisture;
    @FXML
    private Label potatoFertilizerAmount;
    @FXML
    private Label potatoTemperature;
    @FXML
    private Label potatoWaterFrequency;
    @FXML
    private Label potatoFertilizerFrequency;
    @FXML
    private Label potatoMaxTemp;
    @FXML
    private Label potatoMinTemp;
    @FXML
    public Label potatoHeaterStatus;
    @FXML
    public Label potatoCoolerStatus;
    @FXML
    private TextArea potatoTextArea;
    @FXML
    private Label potatoPlantAge;
    
    
    @FXML
    private Label basilTime;
    @FXML
    private Label basilDay;
    @FXML
    private Label basilMoisture;
    @FXML
    private Label basilFertilizerAmount;
    @FXML
    private Label basilTemperature;
    @FXML
    private Label basilWaterFrequency;
    @FXML
    private Label basilFertilizerFrequency;
    @FXML
    private Label basilMaxTemp;
    @FXML
    private Label basilMinTemp;
    @FXML
    public Label basilHeaterStatus;
    @FXML
    public Label basilCoolerStatus;
    @FXML
    private TextArea basilTextArea;
    @FXML
    private Label basilPlantAge;
    
    
    @FXML
    private Label lettuceTime;
    @FXML
    private Label lettuceDay;
    @FXML
    private Label lettuceMoisture;
    @FXML
    private Label lettuceFertilizerAmount;
    @FXML
    private Label lettuceTemperature;
    @FXML
    private Label lettuceWaterFrequency;
    @FXML
    private Label lettuceFertilizerFrequency;
    @FXML
    private Label lettuceMaxTemp;
    @FXML
    private Label lettuceMinTemp;
    @FXML
    public Label lettuceHeaterStatus;
    @FXML
    public Label lettuceCoolerStatus;
    @FXML
    private TextArea lettuceTextArea;
    @FXML
    private Label lettucePlantAge;
    
    
    @FXML
    private Label strawberryTime;
    @FXML
    private Label strawberryDay;
    @FXML
    private Label strawberryMoisture;
    @FXML
    private Label strawberryFertilizerAmount;
    @FXML
    private Label strawberryTemperature;
    @FXML
    private Label strawberryWaterFrequency;
    @FXML
    private Label strawberryFertilizerFrequency;
    @FXML
    private Label strawberryMaxTemp;
    @FXML
    private Label strawberryMinTemp;
    @FXML
    public Label strawberryHeaterStatus;
    @FXML
    public Label strawberryCoolerStatus;
    @FXML
    private TextArea strawberryTextArea;
    @FXML
    private Label strawberryPlantAge;
    
    @FXML
    private Label blueberryTime;
    @FXML
    private Label blueberryDay;
    @FXML
    private Label blueberryMoisture;
    @FXML
    private Label blueberryFertilizerAmount;
    @FXML
    private Label blueberryTemperature;
    @FXML
    private Label blueberryWaterFrequency;
    @FXML
    private Label blueberryFertilizerFrequency;
    @FXML
    private Label blueberryMaxTemp;
    @FXML
    private Label blueberryMinTemp;
    @FXML
    public Label blueberryHeaterStatus;
    @FXML
    public Label blueberryCoolerStatus;
    @FXML
    private TextArea blueberryTextArea;
    @FXML
    private Label blueberryPlantAge;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {       
        tomatoDay.textProperty().bind(TimeKeeper.jfxProp);
        tomatoMoisture.textProperty().bind(Tomato.tomatoPropertyMoisture);
        tomatoTime.textProperty().bind(TimeKeeper.time);
        tomatoFertilizerAmount.textProperty().bind(Tomato.tomatoPropertyFertilizerAmount);
        tomatoTemperature.textProperty().bind(Tomato.tomatoPropertyTemperature);
        tomatoWaterFrequency.textProperty().bind(Tomato.tomatoPropertyWaterFrequency);
        tomatoFertilizerFrequency.textProperty().bind(Tomato.tomatoPropertyFertilizerFrequency);
        tomatoMaxTemp.textProperty().bind(Tomato.tomatoPropertyMaxTemp);
        tomatoMinTemp.textProperty().bind(Tomato.tomatoPropertyMinTemp);
        tomatoTextArea.textProperty().bind(Tomato.tomatoTextArea);
        tomatoHeaterStatus.textProperty().bind(Tomato.tomatoPropertyHeaterStatus);
        tomatoCoolerStatus.textProperty().bind(Tomato.tomatoPropertyCoolerStatus);
        tomatoPlantAge.textProperty().bind(Tomato.tomatoPropertyPlantAge);
        
        potatoDay.textProperty().bind(TimeKeeper.jfxProp);
        potatoTime.textProperty().bind(TimeKeeper.time);
        potatoMoisture.textProperty().bind(Potato.potatoPropertyMoisture);
        potatoFertilizerAmount.textProperty().bind(Potato.potatoPropertyFertilizerAmount);
        potatoTemperature.textProperty().bind(Potato.potatoPropertyTemperature);
        potatoWaterFrequency.textProperty().bind(Potato.potatoPropertyWaterFrequency);
        potatoFertilizerFrequency.textProperty().bind(Potato.potatoPropertyFertilizerFrequency);
        potatoMaxTemp.textProperty().bind(Potato.potatoPropertyMaxTemp);
        potatoMinTemp.textProperty().bind(Potato.potatoPropertyMinTemp);
        potatoTextArea.textProperty().bind(Potato.potatoTextArea);
        potatoHeaterStatus.textProperty().bind(Potato.potatoPropertyHeaterStatus);
        potatoCoolerStatus.textProperty().bind(Potato.potatoPropertyCoolerStatus);
        potatoPlantAge.textProperty().bind(Potato.potatoPropertyPlantAge);
        
        basilDay.textProperty().bind(TimeKeeper.jfxProp);
        basilTime.textProperty().bind(TimeKeeper.time);
        basilMoisture.textProperty().bind(Basil.basilPropertyMoisture);
        basilFertilizerAmount.textProperty().bind(Basil.basilPropertyFertilizerAmount);
        basilTemperature.textProperty().bind(Basil.basilPropertyTemperature);
        basilWaterFrequency.textProperty().bind(Basil.basilPropertyWaterFrequency);
        basilFertilizerFrequency.textProperty().bind(Basil.basilPropertyFertilizerFrequency);
        basilMaxTemp.textProperty().bind(Basil.basilPropertyMaxTemp);
        basilMinTemp.textProperty().bind(Basil.basilPropertyMinTemp);
        basilTextArea.textProperty().bind(Basil.basilTextArea);
        basilHeaterStatus.textProperty().bind(Basil.basilPropertyHeaterStatus);
        basilCoolerStatus.textProperty().bind(Basil.basilPropertyCoolerStatus);
        basilPlantAge.textProperty().bind(Basil.basilPropertyPlantAge);
        
        lettuceDay.textProperty().bind(TimeKeeper.jfxProp);
        lettuceTime.textProperty().bind(TimeKeeper.time);
        lettuceMoisture.textProperty().bind(Lettuce.lettucePropertyMoisture);
        lettuceFertilizerAmount.textProperty().bind(Lettuce.lettucePropertyFertilizerAmount);
        lettuceTemperature.textProperty().bind(Lettuce.lettucePropertyTemperature);
        lettuceWaterFrequency.textProperty().bind(Lettuce.lettucePropertyWaterFrequency);
        lettuceFertilizerFrequency.textProperty().bind(Lettuce.lettucePropertyFertilizerFrequency);
        lettuceMaxTemp.textProperty().bind(Lettuce.lettucePropertyMaxTemp);
        lettuceMinTemp.textProperty().bind(Lettuce.lettucePropertyMinTemp);
        lettuceTextArea.textProperty().bind(Lettuce.lettuceTextArea);
        lettuceHeaterStatus.textProperty().bind(Lettuce.lettucePropertyHeaterStatus);
        lettuceCoolerStatus.textProperty().bind(Lettuce.lettucePropertyCoolerStatus);
        lettucePlantAge.textProperty().bind(Lettuce.lettucePropertyPlantAge);
        
        strawberryDay.textProperty().bind(TimeKeeper.jfxProp);
        strawberryTime.textProperty().bind(TimeKeeper.time);
        strawberryMoisture.textProperty().bind(Strawberry.strawberryPropertyMoisture);
        strawberryFertilizerAmount.textProperty().bind(Strawberry.strawberryPropertyFertilizerAmount);
        strawberryTemperature.textProperty().bind(Strawberry.strawberryPropertyTemperature);
        strawberryWaterFrequency.textProperty().bind(Strawberry.strawberryPropertyWaterFrequency);
        strawberryFertilizerFrequency.textProperty().bind(Strawberry.strawberryPropertyFertilizerFrequency);
        strawberryMaxTemp.textProperty().bind(Strawberry.strawberryPropertyMaxTemp);
        strawberryMinTemp.textProperty().bind(Strawberry.strawberryPropertyMinTemp);
        strawberryTextArea.textProperty().bind(Strawberry.strawberryTextArea);
        strawberryHeaterStatus.textProperty().bind(Strawberry.strawberryPropertyHeaterStatus);
        strawberryCoolerStatus.textProperty().bind(Strawberry.strawberryPropertyCoolerStatus);
        strawberryPlantAge.textProperty().bind(Strawberry.strawberryPropertyPlantAge);
        
        blueberryDay.textProperty().bind(TimeKeeper.jfxProp);
        blueberryTime.textProperty().bind(TimeKeeper.time);
        blueberryMoisture.textProperty().bind(Blueberry.blueberryPropertyMoisture);
        blueberryFertilizerAmount.textProperty().bind(Blueberry.blueberryPropertyFertilizerAmount);
        blueberryTemperature.textProperty().bind(Blueberry.blueberryPropertyTemperature);
        blueberryWaterFrequency.textProperty().bind(Blueberry.blueberryPropertyWaterFrequency);
        blueberryFertilizerFrequency.textProperty().bind(Blueberry.blueberryPropertyFertilizerFrequency);
        blueberryMaxTemp.textProperty().bind(Blueberry.blueberryPropertyMaxTemp);
        blueberryMinTemp.textProperty().bind(Blueberry.blueberryPropertyMinTemp);
        blueberryTextArea.textProperty().bind(Blueberry.blueberryTextArea);
        blueberryHeaterStatus.textProperty().bind(Blueberry.blueberryPropertyHeaterStatus);
        blueberryCoolerStatus.textProperty().bind(Blueberry.blueberryPropertyCoolerStatus);
        blueberryPlantAge.textProperty().bind(Blueberry.blueberryPropertyPlantAge);
        
        
    }    
    
    public void tomatoIncMaxFertFreq()
    {
        MainThread.t.incrementFertilizerFreq();
    }
    public void tomatoDecMaxFertFreq()
    {
        MainThread.t.decrementFertilizerFreq();
    }
    public void tomatoDecWaterFreq()
    {
        double waterFreq = MainThread.t.waterFreq - 1;
        MainThread.t.setWaterFreq(waterFreq);
    }
    public void tomatoIncWaterFreq()
    {
        double waterFreq = MainThread.t.waterFreq +1;
        if(waterFreq > 168)
        {
            waterFreq = 168;
        }
        MainThread.t.setWaterFreq(waterFreq);
    }
    public void tomatoIncMaxTemp()
    {
        double temp = MainThread.t.maxTemp +1;
        if(temp  > 75)
        {
            temp = 75;
        }
        MainThread.t.setMaxTemp(temp);
    }
    public void tomatoDecMaxTemp()
    {
        double temp = MainThread.t.maxTemp -1;
        if(temp  < 56)
        {
            temp = 56;
        }
        if(temp < MainThread.t.minTemp)
        {
            temp = MainThread.t.minTemp + 1;
        }
        MainThread.t.setMaxTemp(temp);
    }
    
    public void tomatoIncMinTemp()
    {
        double temp = MainThread.t.minTemp +1;
        if(temp  > 64)
        {
            temp = 64;
        }
        if(temp > MainThread.t.maxTemp)
        {
            temp = MainThread.t.maxTemp - 1;
        }
        MainThread.t.setMinTemp(temp);
    }
    public void tomatoDecMinTemp()
    {
        double temp = MainThread.t.minTemp -1;
        if(temp  < 45)
        {
            temp = 45;
        }
        MainThread.t.setMinTemp(temp);
    }
    
    public void tomatoGiveWater()
    {
        MainThread.t.watered();
    }
    public void tomatoGiveFertilizer()
    {
        MainThread.t.fertilized();
    }
    public void tomatoHeaterOn()
    {
        Tomato.setTextArea("The Gardneer Tried to Burn the Tomatoes but Failed!"+"\n");
        MainThread.t.setHeaterCoolerOffset(true);       
    }
    public void tomatoCoolerOn()
    {
        Tomato.setTextArea("The Gardneer Tried to Freeze the Tomatoes but Failed!"+"\n");
        MainThread.t.setHeaterCoolerOffset(false);
        
    }
    
    
    
    ///////////////////////////////////////////////////////////////////////////////
    public void potatoIncMaxFertFreq()
    {
        MainThread.p.incrementFertilizerFreq();
    }
    public void potatoDecMaxFertFreq()
    {
        MainThread.p.decrementFertilizerFreq();
    }
    public void potatoDecWaterFreq()
    {
        double waterFreq = MainThread.p.waterFreq - 1;
        MainThread.p.setWaterFreq(waterFreq);
    }
    public void potatoIncWaterFreq()
    {
        double waterFreq = MainThread.p.waterFreq +1;
        if(waterFreq > 168)
        {
            waterFreq = 168;
        }
        MainThread.p.setWaterFreq(waterFreq);
    }
    public void potatoIncMaxTemp()
    {
        double temp = MainThread.p.maxTemp +1;
        if(temp  > 80)
        {
            temp = 80;
        }
        MainThread.p.setMaxTemp(temp);
    }
    public void potatoDecMaxTemp()
    {
        double temp = MainThread.p.maxTemp -1;
        if(temp  < 56)
        {
            temp = 56;
        }
        if(temp < MainThread.p.minTemp)
        {
            temp = MainThread.p.minTemp + 1;
        }
        MainThread.p.setMaxTemp(temp);
    }
    
    public void potatoIncMinTemp()
    {
        double temp = MainThread.p.minTemp +1;
        if(temp  > 69)
        {
            temp = 69;
        }
        if(temp > MainThread.p.maxTemp)
        {
            temp = MainThread.p.maxTemp - 1;
        }
        MainThread.p.setMinTemp(temp);
    }
    public void potatoDecMinTemp()
    {
        double temp = MainThread.p.minTemp -1;
        if(temp  < 45)
        {
            temp = 45;
        }
        MainThread.p.setMinTemp(temp);
    }
    
    public void potatoGiveWater()
    {
        MainThread.p.watered();
    }
    public void potatoGiveFertilizer()
    {
        MainThread.p.fertilized();
    }
    public void potatoHeaterOn()
    {
        Potato.setTextArea("The Gardneer Tried to Burn the Potatoes but Failed!"+"\n");
        MainThread.p.setHeaterCoolerOffset(true);       
    }
    public void potatoCoolerOn()
    {
        Potato.setTextArea("The Gardneer Tried to Freeze the Potatoes but Failed!"+"\n");
        MainThread.p.setHeaterCoolerOffset(false);
        
    }
    
    
    
    ///////////////////////////////////////////////////////////
    
    public void basilIncMaxFertFreq()
    {
        MainThread.b.incrementFertilizerFreq();
    }
    public void basilDecMaxFertFreq()
    {
        MainThread.b.decrementFertilizerFreq();
    }
    public void basilDecWaterFreq()
    {
        double waterFreq = MainThread.b.waterFreq - 1;
        MainThread.b.setWaterFreq(waterFreq);
    }
    public void basilIncWaterFreq()
    {
        double waterFreq = MainThread.b.waterFreq +1;
        if(waterFreq > 168)
        {
            waterFreq = 168;
        }
        MainThread.b.setWaterFreq(waterFreq);
    }
    public void basilIncMaxTemp()
    {
        double temp = MainThread.b.maxTemp +1;
        if(temp  > 90)
        {
            temp = 90;
        }
        MainThread.b.setMaxTemp(temp);
    }
    public void basilDecMaxTemp()
    {
        double temp = MainThread.b.maxTemp -1;
        if(temp  < 54)
        {
            temp = 54;
        }
        if(temp < MainThread.b.minTemp)
        {
            temp = MainThread.b.minTemp + 1;
        }
        MainThread.b.setMaxTemp(temp);
    }
    
    public void basilIncMinTemp()
    {
        double temp = MainThread.b.minTemp +1;
        if(temp  > 79)
        {
            temp = 79;
        }
        if(temp > MainThread.b.maxTemp)
        {
            temp = MainThread.b.maxTemp - 1;
        }
        MainThread.b.setMinTemp(temp);
    }
    public void basilDecMinTemp()
    {
        double temp = MainThread.b.minTemp -1;
        if(temp  < 45)
        {
            temp = 45;
        }
        MainThread.b.setMinTemp(temp);
    }
    
    public void basilGiveWater()
    {
        MainThread.b.watered();
    }
    public void basilGiveFertilizer()
    {
        MainThread.b.fertilized();
    }
    public void basilHeaterOn()
    {
        Basil.setTextArea("The Gardneer Tried to Burn the Basil but Failed!"+"\n");
        MainThread.b.setHeaterCoolerOffset(true);       
    }
    public void basilCoolerOn()
    {
        Basil.setTextArea("The Gardneer Tried to Freeze the Basil but Failed!"+"\n");
        MainThread.b.setHeaterCoolerOffset(false);
        
    }
    
    
    ///////////////////////////////////////////////////
    public void lettuceIncMaxFertFreq()
    {
        MainThread.l.incrementFertilizerFreq();
    }
    public void lettuceDecMaxFertFreq()
    {
        MainThread.l.decrementFertilizerFreq();
    }
    public void lettuceDecWaterFreq()
    {
        double waterFreq = MainThread.l.waterFreq - 1;
        MainThread.l.setWaterFreq(waterFreq);
    }
    public void lettuceIncWaterFreq()
    {
        double waterFreq = MainThread.l.waterFreq +1;
        if(waterFreq > 168)
        {
            waterFreq = 168;
        }
        MainThread.l.setWaterFreq(waterFreq);
    }
    public void lettuceIncMaxTemp()
    {
        double temp = MainThread.l.maxTemp +1;
        if(temp  > 65)
        {
            temp = 65;
        }
        MainThread.l.setMaxTemp(temp);
    }
    public void lettuceDecMaxTemp()
    {
        double temp = MainThread.l.maxTemp -1;
        if(temp  < 46)
        {
            temp = 46;
        }
        if(temp < MainThread.l.minTemp)
        {
            temp = MainThread.l.minTemp + 1;
        }
        MainThread.l.setMaxTemp(temp);
    }
    
    public void lettuceIncMinTemp()
    {
        double temp = MainThread.l.minTemp +1;
        if(temp  > 54)
        {
            temp = 54;
        }
        if(temp > MainThread.l.maxTemp)
        {
            temp = MainThread.l.maxTemp - 1;
        }
        MainThread.l.setMinTemp(temp);
    }
    public void lettuceDecMinTemp()
    {
        double temp = MainThread.l.minTemp -1;
        if(temp  < 35)
        {
            temp = 35;
        }
        MainThread.l.setMinTemp(temp);
    }
    
    public void lettuceGiveWater()
    {
        MainThread.l.watered();
    }
    public void lettuceGiveFertilizer()
    {
        MainThread.l.fertilized();
    }
    public void lettuceHeaterOn()
    {
        Lettuce.setTextArea("The Gardneer Tried to Burn the Lettuce but Failed!"+"\n");
        MainThread.l.setHeaterCoolerOffset(true);       
    }
    public void lettuceCoolerOn()
    {
        Lettuce.setTextArea("The Gardneer Tried to Freeze the Lettuce but Failed!"+"\n");
        MainThread.l.setHeaterCoolerOffset(false);
        
    }
    
    
    
     ///////////////////////////////////////////////////
    public void strawberryIncMaxFertFreq()
    {
        MainThread.s.incrementFertilizerFreq();
    }
    public void strawberryDecMaxFertFreq()
    {
        MainThread.s.decrementFertilizerFreq();
    }
    public void strawberryDecWaterFreq()
    {
        double waterFreq = MainThread.s.waterFreq - 1;
        MainThread.s.setWaterFreq(waterFreq);
    }
    public void strawberryIncWaterFreq()
    {
        double waterFreq = MainThread.s.waterFreq +1;
        if(waterFreq > 168)
        {
            waterFreq = 168;
        }
        MainThread.s.setWaterFreq(waterFreq);
    }
    public void strawberryIncMaxTemp()
    {
        double temp = MainThread.s.maxTemp +1;
        if(temp  > 65)
        {
            temp = 65;
        }
        MainThread.s.setMaxTemp(temp);
    }
    public void strawberryDecMaxTemp()
    {
        double temp = MainThread.s.maxTemp -1;
        if(temp  < 46)
        {
            temp = 46;
        }
        if(temp < MainThread.s.minTemp)
        {
            temp = MainThread.s.minTemp + 1;
        }
        MainThread.s.setMaxTemp(temp);
    }
    
    public void strawberryIncMinTemp()
    {
        double temp = MainThread.s.minTemp +1;
        if(temp  > 54)
        {
            temp = 54;
        }
        if(temp > MainThread.s.maxTemp)
        {
            temp = MainThread.s.maxTemp - 1;
        }
        MainThread.s.setMinTemp(temp);
    }
    public void strawberryDecMinTemp()
    {
        double temp = MainThread.s.minTemp -1;
        if(temp  < 35)
        {
            temp = 35;
        }
        MainThread.s.setMinTemp(temp);
    }
    
    public void strawberryGiveWater()
    {
        MainThread.s.watered();
    }
    public void strawberryGiveFertilizer()
    {
        MainThread.s.fertilized();
    }
    public void strawberryHeaterOn()
    {
        Strawberry.setTextArea("The Gardneer Tried to Burn the Strawberries but Failed!"+"\n");
        MainThread.s.setHeaterCoolerOffset(true);       
    }
    public void strawberryCoolerOn()
    {
        Strawberry.setTextArea("The Gardneer Tried to Freeze the Strawberries but Failed!"+"\n");
        MainThread.s.setHeaterCoolerOffset(false);
        
    }
    
    
    
    ///////////////////////////////////////////////////
    public void blueberryIncMaxFertFreq()
    {
        MainThread.blue.incrementFertilizerFreq();
    }
    public void blueberryDecMaxFertFreq()
    {
        MainThread.blue.decrementFertilizerFreq();
    }
    public void blueberryDecWaterFreq()
    {
        double waterFreq = MainThread.blue.waterFreq - 1;
        MainThread.blue.setWaterFreq(waterFreq);
    }
    public void blueberryIncWaterFreq()
    {
        double waterFreq = MainThread.blue.waterFreq +1;
        if(waterFreq > 168)
        {
            waterFreq = 168;
        }
        MainThread.blue.setWaterFreq(waterFreq);
    }
    public void blueberryIncMaxTemp()
    {
        double temp = MainThread.blue.maxTemp +1;
        if(temp  > 65)
        {
            temp = 65;
        }
        MainThread.blue.setMaxTemp(temp);
    }
    public void blueberryDecMaxTemp()
    {
        double temp = MainThread.blue.maxTemp -1;
        if(temp  < 46)
        {
            temp = 46;
        }
        if(temp < MainThread.blue.minTemp)
        {
            temp = MainThread.blue.minTemp + 1;
        }
        MainThread.blue.setMaxTemp(temp);
    }
    
    public void blueberryIncMinTemp()
    {
        double temp = MainThread.blue.minTemp +1;
        if(temp  > 54)
        {
            temp = 54;
        }
        if(temp > MainThread.blue.maxTemp)
        {
            temp = MainThread.blue.maxTemp - 1;
        }
        MainThread.blue.setMinTemp(temp);
    }
    public void blueberryDecMinTemp()
    {
        double temp = MainThread.blue.minTemp -1;
        if(temp  < 35)
        {
            temp = 35;
        }
        MainThread.blue.setMinTemp(temp);
    }
    
    public void blueberryGiveWater()
    {
        MainThread.blue.watered();
    }
    public void blueberryGiveFertilizer()
    {
        MainThread.blue.fertilized();
    }
    public void blueberryHeaterOn()
    {
        Blueberry.setTextArea("The Gardneer Tried to Burn the Blueberries but Failed!"+"\n");
        MainThread.blue.setHeaterCoolerOffset(true);       
    }
    public void blueberryCoolerOn()
    {
        Blueberry.setTextArea("The Gardneer Tried to Freeze the Blueberries but Failed!"+"\n");
        MainThread.blue.setHeaterCoolerOffset(false);
        
    }
    
}

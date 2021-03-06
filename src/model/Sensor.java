package model;

import controller.Main;

/**
 * This will implement all the methods that will be shared by all the child classes
 * keeps the code dry
 * @author Vlad T
 * @version  1
 */
public abstract class Sensor {
    private String myName ;
    public Sensor(String theName){
        myName = theName;
    }
    public void trigger(){
        System.out.println(this.myName + " has been triggered!");
        try {
            Main.sensors.trigger(myName);
        }catch(NullPointerException e) {
            //This happens when the Sensor Panel hasn't been initialized yet
        }
    }
}

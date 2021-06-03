package model.sensors;

import javax.crypto.spec.PSource;
import javax.sound.midi.Soundbank;

/**
 * this is an extension of the camera with a few extra methods to function as a doorbell
 * @author vlad
 * @version 1
 */
public class DoorbellCamera extends Camera  {
    /**
     * temp place holder for testing a doorbell being rang
     */
    public void ringDoorbell(){

    }

    /**
     * Simulates the doorbell ringing for fun
     * Cool method B)
     */
    public void dingDong(){
        System.out.println("Ding! Dong! Ding! Dong!");
    }
}

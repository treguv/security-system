package model;

/**
 * This class simulates contacting emergency services
 * @author vlad
 * @version 1
 */
public class EmergencyServices {
    /**
     * basic constructor for emergency services
     */
    public EmergencyServices() {

    }

    /**
     * Simulates contacting the police. Rest is handled by them
     * @return true if contact was successful
     */
    public boolean contactPolice(){
        System.out.println("WeewooWeeWoo");
        return true;
    }

    /**
     * Simulates contacting the fire department. Rest is handled by them
     * @return true if contact was successful
     */
    public boolean contactFireDepartment(){
        System.out.println("WeewooWeeWoo but like fire");
        return true;
    }

}

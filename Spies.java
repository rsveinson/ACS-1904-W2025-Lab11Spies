import java.util.Scanner;
/** 
 * ACS-1904 Lab 11 Spies
 * your name here 
*/

public class Spies{
    public static void main(String[] args) {
        
        Spy bond = new Spy();
        Spy smiley = new Spy();
        Spy philby = new Spy();
        Spy mclean = new Spy();
        Spy karla = new Spy();
        
        bond.setCodeName("007");
        bond.setAssignment(smiley);
        
        smiley.setCodeName("George");
        smiley.setAssignment(philby);
        
        philby.setCodeName("Kim");
        philby.setAssignment(mclean);
        
        mclean.setCodeName("Scooter");
        mclean.setAssignment(karla);
        
        karla.setCodeName("Karla");
        karla.setAssignment(null);
        
        // this will prints the list
        // of spies and their assignments
        System.out.println(bond);


        System.out.println("end of program");
    }
}

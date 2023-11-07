/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import java.util.Collection;



/**
 *
 * @author sbc-student
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Custodian custodian1 = new Custodian(1, "Example Custodian", 11111);
        //Variable to call monitoring method in custodian class
        Collection<Item> monitoring = custodian1.monitorItems();
        
        System.out.println(custodian1);
        System.out.println(monitoring);
    }
    
}

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
public class Custodian {
    private int custodianID;
    private String custodianName;
    private CustodianCard custodianCard;

    

    public Custodian(int custodianID, String custodianName, long CCardNumber) {
        this.custodianID = custodianID;
        this.custodianName = custodianName;
        //new keyword signifies composition relationship as the Custodian Card would only be constructed if a Custodian is made
        this.custodianCard = new CustodianCard(CCardNumber);
    }
    //single responsibility (1 method) (view items in catalogue)
    public static Collection<Item> monitorItems(){
        return Catalogue.itemMap.values();
    }
    
    @Override
    public String toString() {
        return "Custodian{" + "custodianID=" + custodianID + ", custodianName=" + custodianName + ", custodianCard=" + custodianCard + '}';
    }
    
}

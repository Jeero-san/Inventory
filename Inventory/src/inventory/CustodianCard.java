/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

/**
 *
 * @author sbc-student
 */
public class CustodianCard {
    private long CCardNumber;
    //only exist if custodian is made
    public CustodianCard(long CCardNumber) {
        this.CCardNumber = CCardNumber;
    }

    @Override
    public String toString() {
        return "CustodianCard{" + "CCardNumber=" + CCardNumber + '}';
    }
    
}

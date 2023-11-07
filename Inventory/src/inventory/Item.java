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
public class Item {
    private final int itemID;
    private String itemName;

    public Item(int itemID, String itemName) {
        this.itemID = itemID;
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "Item{" + "itemID=" + itemID + ", itemName=" + itemName + '}';
    }
}

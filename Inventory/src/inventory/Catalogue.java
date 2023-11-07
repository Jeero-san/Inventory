/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sbc-student
 */
public class Catalogue {
    //aggregation relationship as the catalogue uses the Item object to store Item related information
    public static Map<String, Item> itemMap = new HashMap<>();
    //static outside the body of code
    static {
        itemMap.put("Monitor", new Item(1, "Monitor"));
        itemMap.put("Mouse", new Item(2, "Mouse"));
        itemMap.put("Keyboard", new Item(3, "Keyboard"));
    }
   
}

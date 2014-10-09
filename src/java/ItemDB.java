/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yael
 */
public class ItemDB {
    
    private static CatalogueClass[] items = 
    { new CatalogueClass
            ("001", "This Book", 39.99)
            };
    public static CatalogueClass getItem(String itemID){
        CatalogueClass item;
        if(itemID == null){
            return(null);
        }
        
    
    
}

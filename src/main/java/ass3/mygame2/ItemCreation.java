package ass3.mygame2;

import java.util.ArrayList;


/**
 * Write a description of class ItemCreation here.
 *
 * @author (Jaskaran Pal Kaur and Pawandeep Kaur)
 * @version (24 May 2021)
 */
public class ItemCreation
{
    
    private ArrayList<Item> allItemsInGame;
    
    public ItemCreation()
    {       
        allItemsInGame = new ArrayList();
        createItems();
    }
    
    public void createItems(){
        
        Item item1, item2, excaliburSword, key, frontGateKey;
        
        
        excaliburSword = new Item("excaliburSword", "The legendary Excalibur", 100);
        key = new Item("key", "It has a shape of a heart", 100);
        frontGateKey = new Item("frontGateKey", "To open the front gate door", 100);
        item1 = new Item("item1", "This item is for testing", 100);
        item2 = new Item("item2", "THis is also new test for git", 100);
       // bedroomkey = new Item("bedroomkey", "This will open the bedroom gate",100);
        
        allItemsInGame.add(excaliburSword);
        allItemsInGame.add(key);
        allItemsInGame.add(frontGateKey);
        allItemsInGame.add(item1);
        allItemsInGame.add(item2);
      //  allItemsInGame.add(bedroomkey);
        
    }
   
    public Item getItem(String stringItem){
        Item itemToReturn = null;
        for(Item item: allItemsInGame){
            if(item.getName().contains(stringItem)){
                itemToReturn = item;
            }
        }
        return itemToReturn;
    }
  
    
}

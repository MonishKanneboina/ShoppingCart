import java.util.*;

public class Catalog 
{
   private String name;
   private ArrayList <Item> itemsList;
   
   public Catalog(String name)
      {
         this.name = name;
         itemsList = new ArrayList();
      }

   public void add(Item item)
      {
         itemsList.add(item);
      }
      
   public int size()
      {
        return itemsList.size();
      }
      
   public Item get(int index)
      {
         return itemsList.get(index);
      }
      
    public String getName()
      {
        return name;  
      }
}

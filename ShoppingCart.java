import java.util.*;

public class ShoppingCart
{
   private ArrayList <ItemOrder> itemOrderList;
   
   public ShoppingCart()
   {
      itemOrderList = new ArrayList<>();
   }
   
   public void add(ItemOrder newOrder)
   {
      if(itemOrderList.contains(newOrder) == true)
      {
         for (int i = 0; i < itemOrderList.size(); i++)
            {
               if(itemOrderList.get(i).equals(newOrder) == true)
               {
                  itemOrderList.set(i, newOrder);
               }
            }
      }
     else
     {
      itemOrderList.add(newOrder);
     }
   }
   
   public double getTotal()
   {
      double total = 0;
      for(int i = 0; i < itemOrderList.size(); i++)
         {
            total = total + (itemOrderList.get(i).getPrice());
         }
         return total;
   }
}
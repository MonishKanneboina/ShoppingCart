public class Item 
{
   private String name;
   private double price;
   private int bulkQty;
   private double bulkPrice;
   
   public Item(String name, double price)
      {
         this.name = name; 
         this.price = price;
      }
      
   public Item(String name, double price, int bulkQty, double bulkPrice)
      {
         if(bulkQty < 0 || bulkPrice < 0 || price < 0)
         {
              throw new IllegalArgumentException("error");
         }
         
         this.name = name; 
         this.price = price;
         this.bulkQty = bulkQty;
         this.bulkPrice = bulkPrice;
         
      }
      
    public double priceFor(int quantity)
    {
       if(quantity < 0)
         {
              throw new IllegalArgumentException("error");
         }
        
        //double check
        
        return quantity * price;

    }
    
    @Override
    public boolean equals(Object obj)
    {
      if(((Item) obj).name == this.name)
      {
         return true;
      }
      return false;
    }
    
    @Override
    public String toString()
    {
      if(0 < this.bulkQty)
      {
         return this.name + ", $" + this.price + " (" + this.bulkQty + " for " + this.bulkPrice + ")";
      }
      
      return this.name + ", $" + this.price;
    }
}
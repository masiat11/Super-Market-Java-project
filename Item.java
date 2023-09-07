public class Item extends FoodItems
{
	private String itemName;
	
	private int price;
	
    public Item(String itemName, int price)
	{
		this.itemName=itemName;
		
		this.price=price;
	}
	public void setItemName(String itemName)
	{
		this.itemName=itemName;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	public String getItemName()
	{
		return itemName;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public void ShowDetails()
	{
		System.out.println("");
		System.out.println("\n\t\t\tItem Name: "+itemName);
		
		System.out.println("\t\t\tPrice: "+price);

	}
}
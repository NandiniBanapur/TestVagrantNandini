import java.util.ArrayList;
import java.util.List;

public class ItemList {

	private List<Item> Items;
	double sum=0;
	//constructors
	public ItemList() {
		Items=new ArrayList<Item>() ;
	}
	
	public ItemList(ArrayList<Item> list) {
		Items=list ;
	}
	//end of constructors
	
	//getters and setters
	public List<Item> getItemList() {
       return this.Items;
    }
	//end of getters and setters
	
	
	//public methods
	public void AddItem(Item newItem) {
		Items.add(newItem);
	}
	
	public void RemoveItem(Item item) {
		Items.remove(item);
	}
	
	
	public double TotalMonthlyExpenditureOnSubscriptions()
	{
		
		
		for(int i=0;i<Items.size();i++)
		{
			if(Items.get(i).getfrequency()==Frequency.Daily)
			{
				sum+=(30*Items.get(i).getprice());
			}
			else if(Items.get(i).getfrequency()==Frequency.Weekly)
			{
				sum+=(4*Items.get(i).getprice());
			}
			else if(Items.get(i).getfrequency()==Frequency.BiWeekly)
			{
				sum+=(2*Items.get(i).getprice());
			}
			else if(Items.get(i).getfrequency()==Frequency.Monthly)
			{
				sum+=Items.get(i).getprice();
			}
		}
		
		return sum;
	}
	
	//end of public methods
}
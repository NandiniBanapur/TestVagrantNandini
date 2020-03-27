

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class dumpclass 
{
	public static void main(String[] args) 
	{
		ItemList items=new ItemList();
		
		Item i=new Item();
		i.setcategory("TOI");
		i.setfrequency(Frequency.Daily);
		i.setprice(0.75);
		
		Item i2=new Item();
		i2.setcategory("MILK");
		i2.setfrequency(Frequency.Monthly);
		i2.setprice(30);
		
		
		items.AddItem(i);
		items.AddItem(i2);
		System.out.println(items.TotalMonthlyExpenditureOnSubscriptions()); 
	}
}


public class MobilePhone 
{
	private static String Manufacturer;
	private static String Model;
	private static double Price;
	private static String Carrier;
	static String pNumr;
	static String Message;
	
	public MobilePhone(String Ma, String Mo, double Pr, String Ca)
	{
		MobilePhone.Manufacturer = Ma;
		MobilePhone.Model = Mo;
		MobilePhone.Price = Pr;
		MobilePhone.Carrier= Ca;
	}
	
	public static String getManufacturer()
	{
		return Manufacturer;
	}
	
	public static void setManufacturer(String Manufacturer)
	{
		MobilePhone.Manufacturer = Manufacturer;
	}
	
	
	public static String getModel()
	{
		return Model;
	}
	
	public static void setModel(String Model)
	{
		MobilePhone.Model = Model;
	}
	

	public static double getPrice()
	{
		return Price;
	}
	
	public static void setPrice(double Price)
	{
		MobilePhone.Price = Price;
	}
	
	
	public static String getCarrier()
	{
		return Carrier;
	}
	
	public static void setCarrier(String Carrier)
	{
		MobilePhone.Carrier = Carrier;
	}
	
	
	public static String call()
	{
		return "I am calling " + pNumr;
	}
	
	public static String text()
	{
		return Message;
	}
	
	public String toString()
	{
		return "Phone Manufacturer: " + Manufacturer
				+ " \nPhone Model: " + Model
				+ " \nPhone Price: " + Price
				+ " \nPhone Carrier: " + Carrier;
	}
}

import java.util.Scanner;

public class mppDriver 
{
	public static void main(String[] args)
	{
		boolean query;
		Scanner scan = new Scanner(System.in);
		
		do
		{
			System.out.println("Who made your phone?");
			MobilePhone.setManufacturer(scan.nextLine());
			System.out.println("");
		
			System.out.println("What model is your phone?");
			MobilePhone.setModel(scan.nextLine());
			System.out.println("");
		
			System.out.println("How much did it cost?");
			MobilePhone.setPrice(scan.nextDouble());
			scan.nextLine();
			System.out.println("");
		
			System.out.println("Which Carrier are you using?");
			MobilePhone.setCarrier(scan.nextLine());
			System.out.println("");
		
			System.out.println("What is your phone Number?");
			MobilePhone.pNumr = scan.nextLine();
			System.out.println("");
		
			System.out.println("What message will you text?");
			MobilePhone.Message = scan.nextLine();
			System.out.println("");
		
			MobilePhone newMP = new MobilePhone(MobilePhone.getManufacturer(), MobilePhone.getModel(), MobilePhone.getPrice(), MobilePhone.getCarrier());
		
			System.out.println(MobilePhone.call());
			System.out.println(MobilePhone.text());
			System.out.println(newMP.toString());
			
			System.out.println("Create a new phone? (true/false)");
			query = scan.nextBoolean();
			
		}	while(query = true);
		
		scan.close();
	}
}

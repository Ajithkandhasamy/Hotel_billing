import java.util.*;

public class HotelBilling {

	public static void main(String[] args) {
		
		int idliCast=7;
		int doseCast=30;
		int chickenRice=100;
		int eagFrideRice=80;
		int Biryani=120;
		
		int amt,bill=0,con;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Ak FRIENDS ZONE");
	do {	
		System.out.println("1.Idli = "+idliCast+"rs");
		System.out.println("2.Dosa = "+doseCast+"rs");
		System.out.println("3.Chicken Fried Rice = "+chickenRice+"rs");
		System.out.println("4.Eag Fried Rice = "+eagFrideRice+"rs");
		System.out.println("5.Biryani = "+Biryani+"rs");
		System.out.println("enter your food num");

		
		int in=scan.nextInt();
		
		switch(in) {
		case 1:
			System.out.println("Quantity");
			int qt=scan.nextInt();
			amt=qt*idliCast;
			bill=bill+amt;
			break;
		case 2:
			System.out.println("Quantity");
			qt=scan.nextInt();
			amt=qt*doseCast;
			bill=bill+amt;
			break;
		case 3:
			System.out.println("Quantity");
			qt=scan.nextInt();
			amt=qt*chickenRice;
			bill=bill+amt;
			break;
		case 4:
			System.out.println("Quantity");
			qt=scan.nextInt();
			amt=qt*eagFrideRice;
			bill=bill+amt;
			break;
			
		case 5:
			System.out.println("Quantity");
			qt=scan.nextInt();
			amt=qt*Biryani;
			bill=bill+amt;
			break;
		default:
			System.err.println("we dont have this food please select valid food ");
		    break;
		}
		System.out.println("if you want con... press 1 otherwise 0 or else");
		con=scan.nextInt();
		
	 }while(con==1);
	System.out.println();
	System.out.println("total bill "+bill+"rs");
	
			
		}
	}




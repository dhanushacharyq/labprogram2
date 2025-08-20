package prog2;

public class Cars {
	private String brand;
	private String model;
	private double price;
	private double mileage;
	private String ownername;
	
	private static int totalcars;
	private static String showroomName="Alpha Cars";
	
	public Cars(String b,String m,double p,double mil) {
		brand=b;
		model=m;
		price=p;
		mileage=mil;
		ownername = "Dhanush";
        totalcars++;
	}
	public Cars(String b,String m,double p,double mil,String owner) {
		brand=b;
		model=m;
		price=p;
		mileage=mil;
		this.ownername = owner;
        totalcars++;
	}
	public String getownername() {
		return ownername;
	}
	public void setownername(String owner) {
		ownername=owner;
	}
	 public void displayDetails() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Model: " + model);
	        System.out.println("Price: " + price);
	        System.out.println("Mileage: " + mileage);
	        System.out.println("Owner: " + ownername);
	    }

public void updatePrice(double newPrice) {
    price = newPrice;
}

public static void showtotalcars() {
    System.out.println("Total Cars: " + totalcars);
}

public static void showshowroomName() {
    System.out.println("Showroom: " + showroomName);
}
}


		

		
	


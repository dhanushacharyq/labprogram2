package prog2;

public class Showroom {
	public static void main(String[] args) {

			    Cars c1 = new Cars("porsche", "911 GT", 50000000, 18.5);
			    Cars c2 = new Cars("dodge", "challenger", 2500000, 16.0,"heisenberg");
			    Cars c3 = new Cars("tata", "nano", 12000, 20.0);

			    c1.displayDetails();
			    c2.displayDetails();
			    c3.displayDetails();

			    c1.setownername("Alice");
			    c1.updatePrice(54000000);

			    System.out.println("After Updates:");
			    c1.displayDetails();

			    Cars.showshowroomName();
			    Cars.showtotalcars();
			}
			}



import java.util.Scanner;

public class ProfitOrLoss {
	private static Scanner sc;
	public static void main(String[] args) {

		

		        Scanner sc = new Scanner(System.in);

		        double cost_price, selling_price;

		        System.out.print("Enter Cost Price: ");
		        cost_price = sc.nextDouble();

		        System.out.print("Enter Selling Price: ");
		        selling_price = sc.nextDouble();

		       
		        if (cost_price < 0 || selling_price < 0) {
		            System.out.println("Enter valid amount. Price cannot be negative.");
		        }
		        else if (selling_price > cost_price) {
		            double profit = selling_price - cost_price;
		            System.out.println("Profit = " + profit);
		        }
		        else if (cost_price > selling_price) {
		            double loss = cost_price - selling_price;
		            System.out.println("Loss = " + loss);
		        }
		        else {
		            System.out.println("No Profit, No Loss");
		        }

		        sc.close();
		    }
		}
import java.util.Scanner;
public class CostEstimator {

	public static void main(String[] args) {
	Scanner roomInfo = new Scanner(System.in);
	
	double roomL;
	double roomW;
	double roomH;
	double doorW;
	double doorH;
	double windowW;
	double windowH;
	int paintType;
	double paintArea;
	int numberCans;
	int restCans;
	double price = 0;
	double taxPrice;
	double finalPrice;
	
	System.out.println("Enter the length of the room in feet: ");
	roomL = roomInfo.nextDouble();
	System.out.println("Enter the width of the room in feet: ");
	roomW = roomInfo.nextDouble();
	System.out.println("Enter the height of the room in feet: ");
	roomH = roomInfo.nextDouble();
	System.out.println("Enter the width of the door in feet: ");
	doorW = roomInfo.nextDouble();
	System.out.println("Enter the height of the door in feet: ");
	doorH = roomInfo.nextDouble();
	System.out.println("Enter the width of the window in feet: ");
	windowW = roomInfo.nextDouble();
	System.out.println("Enter the height of the window in feet: ");
	windowH = roomInfo.nextDouble();	
	System.out.println("Enter 1 for standard paint and 2 for deluxe paint: ");
	paintType = roomInfo.nextInt();
	
	paintArea = (roomL * 2 + roomW * 2 ) * roomH - (doorW * doorH + windowW * windowH);
	numberCans = (int) paintArea / 250;
	restCans = (int) paintArea % 250;
	if (restCans > 0) {
		numberCans ++;
	};
	
	if (paintType == 1){
		price = numberCans * 14.99;
	};
	if (paintType == 2){
		price = numberCans * 29.99;
	};
	
	taxPrice = price * .0925;
	finalPrice = price + taxPrice;
	
	System.out.println("The total area to be painted is " + paintArea + " ft squared");
	System.out.println(numberCans + " cans of paint are required");
	System.out.println("The cost before tax is $" + price);
	System.out.println("The cost of tax is $" + (double)Math.round(taxPrice * 100d) / 100d );
	System.out.println("The total cost is $" + (double)Math.round(finalPrice * 100d) / 100d );
	
	roomInfo.close();
	}

}

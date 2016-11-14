package topic04.chapter05;

public class E39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double commission = 0;
		double sales = 0;
			for(sales = 0; commission <= 30000; sales++){
				if (0 > sales && 5000 <= sales)
					commission = .08 * sales;
				else if (5000 > sales && 10000 <= sales)
					commission = (.08 * 5000) + (.10 * (sales - 5000));
				else 
					commission = (.08 * 5000) + (.10 * 5000) + (.12 * (sales - 10000));
			}
		System.out.println("The minimum sales required: " + sales);
	}

}

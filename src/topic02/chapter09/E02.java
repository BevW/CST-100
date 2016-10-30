package topic02.chapter09;

class Stock {
	

	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	Stock(String symbol, String name, double previousClosingPrice, double currentPrice){
		
		this.symbol = symbol;
		this.name = name;
		this.previousClosingPrice = previousClosingPrice;
		this.currentPrice = currentPrice;
		
	}
	
	public double getChangepercent(){
		return ((currentPrice - previousClosingPrice) / currentPrice) * 100;
	}
}

				/*UML Class Diagram
				 * symbol:String
				 * name:String
				 * previousClosingPrice:double
				 * currentPrice:double
				 * 
				 * Stock()
				 * Stock(symbol,name: String)
				 * getChangePercent(): double
				 */

public class E02 {
	public static void main(String [] args){
		Stock stock = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
		System.out.println("Percentage change in pirce " + stock.getChangepercent());
		
	}
	
}

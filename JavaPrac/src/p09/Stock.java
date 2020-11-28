package p09;

public class Stock {

	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	public Stock()
	{
		
	}
	
	public Stock(String symbol, String name)
	{
		this.symbol = symbol;
		this.name = name;
	}
	

	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	double getChangePercent()
	{
		//return % changed from previousclosingprice to currentprice
		return (currentPrice-previousClosingPrice) / previousClosingPrice;
	}
	
	
}

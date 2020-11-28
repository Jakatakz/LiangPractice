package p09;

public class StockDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stock s1 = new Stock("ORCL", "Oracle Corporation");
		s1.setCurrentPrice(34.35);
		s1.setPreviousClosingPrice(34.5);
		System.out.println(s1.getChangePercent());
	}

}

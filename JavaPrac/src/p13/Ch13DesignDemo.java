package p13;

interface Edible
{
	public String howToEat();
}

class Duck implements Edible
{

	@Override
	public String howToEat() {
		// TODO Auto-generated method stub
		return "roast it";
	}
	
}

public class Ch13DesignDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

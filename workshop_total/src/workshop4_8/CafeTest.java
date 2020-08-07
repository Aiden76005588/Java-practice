package workshop4_8;

public class CafeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cafe cafe = new Cafe();
		cafe.setCoffeList(new Coffee("아메리카노",1000));
		cafe.setCoffeList(new Coffee("아메리카노",1000));
		cafe.setCoffeList(new Coffee("아메리카노",1000));
		cafe.setCoffeList(new Coffee("아메리카노",1000));
		cafe.setCoffeList(new Coffee("아메리카노",1000));
		cafe.setCoffeList(new Coffee("아메리카노",1000));
		cafe.setCoffeList(new Coffee("아메리카노",1000));
		cafe.setCoffeList(new Coffee("아메리카노",1000));
		cafe.setCoffeList(new Coffee("아메리카노",1000));
		cafe.setCoffeList(new Coffee("아메리카노",1000));
		Coffee[] arr = cafe.getCoffeeList();
		for(Coffee coffee : arr) {
						System.out.println(coffee);
		}
		System.out.println(cafe.totalPrice());
	}

}


public class TestOuter {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.innerCreate();

		
		//2. Outer밖에서 Inner 생성==>반드시 Outer부터생성한다.
		Outer outer2 = new Outer();
		outer2.n=10;
		Outer.Inner inner = outer2.new Inner();
		inner.info();
	}

}

public class HW4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Currency c1 = new Currency(2, 23);
		Currency c2 = new Currency(1, 79);
		Currency c3 = new Currency(1, 79);
		CartPoint p1 = new CartPoint(3, 6);
		CartPoint p2 = new CartPoint(2, 4);
		CartPoint p3 = new CartPoint(2, 4);
		System.out.println("Comparing the three Currency objects:");
		System.out.println("c1.lessThan(c2): " + c1.lessThan(c2));
		System.out.println("c1.lessThanEqualTo(c2): " + c1.lessThanEqualTo(c2));
		System.out.println("c1.equalTo(c2): " + c1.equalTo(c2));
		System.out.println("c1.notEqual(c2): " + c1.notEqual(c2));
		System.out.println("c1.greaterThan(c2): " + c1.greaterThan(c2));
		System.out.println("c1.greaterThanEqualTo(c2): " + c1.greaterThanEqualTo(c2));
		System.out.println("c1.lessThan(c3): " + c1.lessThan(c3));
		System.out.println("c1.lessThanEqualTo(c3): " + c1.lessThanEqualTo(c3));
		System.out.println("c1.equalTo(c3): " + c1.equalTo(c3));
		System.out.println("c1.notEqual(c3): " + c1.notEqual(c3));
		System.out.println("c1.greaterThan(c3): " + c1.greaterThan(c3));
		System.out.println("c1.greaterThanEqualTo(c3): " + c1.greaterThanEqualTo(c3));
		System.out.println("c2.lessThan(c3): " + c2.lessThan(c3));
		System.out.println("c2.lessThanEqualTo(c3): " + c2.lessThanEqualTo(c3));
		System.out.println("c2.equalTo(c3): " + c2.equalTo(c3));
		System.out.println("c2.notEqual(c3): " + c2.notEqual(c3));
		System.out.println("c2.greaterThan(c3): " + c2.greaterThan(c3));
		System.out.println("c2.greaterThanEqualTo(c3): " + c2.greaterThanEqualTo(c3));
		System.out.println("Comparing the three CartPoint objects:");
		System.out.println("p1.lessThan(p2): " + p1.lessThan(p2));
		System.out.println("p1.lessThanEqualTo(p2): " + p1.lessThanEqualTo(p2));
		System.out.println("p1.equalTo(p2): " + p1.equalTo(p2));
		System.out.println("p1.notEqual(p2): " + p1.notEqual(p2));
		System.out.println("p1.greaterThan(p2): " + p1.greaterThan(p2));
		System.out.println("p1.greaterThanEqualTo(p2): " + p1.greaterThanEqualTo(p2));
		System.out.println("p1.lessThan(p3): " + p1.lessThan(p3));
		System.out.println("p1.lessThanEqualTo(p3): " + p1.lessThanEqualTo(p3));
		System.out.println("p1.equalTo(p3): " + p1.equalTo(p3));
		System.out.println("p1.notEqual(p3): " + p1.notEqual(p3));
		System.out.println("p1.greaterThan(p3): " + p1.greaterThan(p3));
		System.out.println("p1.greaterThanEqualTo(p3): " + p1.greaterThanEqualTo(p3));
		System.out.println("p2.lessThan(p3): " + p2.lessThan(p3));
		System.out.println("p2.lessThanEqualTo(p3): " + p2.lessThanEqualTo(p3));
		System.out.println("p2.equalTo(p3): " + p2.equalTo(p3));
		System.out.println("p2.notEqual(p3): " + p2.notEqual(p3));
		System.out.println("p2.greaterThan(p3): " + p2.greaterThan(p3));
		System.out.println("p2.greaterThanEqualTo(p3): " + p2.greaterThanEqualTo(p3));
	}

}

package test0118;

public class TestRent {

	public static void main(String[] args) {
		Bus bus = new Bus("����", "��A8888", 22);
		Car car = new Car("����", "��A1234", "i502");
		int rent = bus.carRent(5);
		System.out.println(rent);
		int rent2 = car.carRent(3);
		System.out.println(rent2);
	}

}

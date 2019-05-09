package test0118;

public class Car extends Vehical {
	private String type;

	public Car(String brand, String id, String type) {
		super(brand, id);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int carRent(int days) {
		if (type.equals("i502")) {
			return 1000 * days;
		} else if (type.equals("GL8")) {
			return 500 * days;
		} else {
			return 200 * days;
		}
	}
}

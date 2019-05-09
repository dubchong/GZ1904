package test0118;

public class Bus extends Vehical{
	private int seat;

	public Bus(String brand,String id,int seat) {
		super(brand,id);
		this.seat = seat;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}
	@Override
	public int carRent(int days) {
		if (seat>=16) {
			return 800*days;
		} else{
			return 400*days;
		}
	}
	
}

package test0118;

/**
 * 
 * 1. ����������� ÿ�ֳ�(Vehicle )����Ʒ��(���,����)������(��������) -- ��ʿ(Bus) ��λ�� >= 16 800Ԫ/�� �� ����
 * 400Ԫ/�� -- С��(Car) �������� i520 1000/�� GL8 500/�� ���� 200/�� ʹ�ü̳кͷ�װ��ʵ�����ϵ��⳵����
 * ����Ҫ���������
 * 
 * @author dubai
 *
 */

public class Vehical {

	private String brand;
	private String id;

	public Vehical() {
		// TODO Auto-generated constructor stub
	}

	public Vehical(String brand, String id) {
		this.brand = brand;
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// �������ķ���
	public int carRent(int days) {
		return 0;
	}

}

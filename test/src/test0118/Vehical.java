package test0118;

/**
 * 
 * 1. 汽车出租程序 每种车(Vehicle )都有品牌(别克,宝马)，车牌(基本属性) -- 巴士(Bus) 座位数 >= 16 800元/天 ， 否则
 * 400元/天 -- 小车(Car) 车的类型 i520 1000/天 GL8 500/天 其它 200/天 使用继承和封装来实现以上的租车程序
 * 最终要计算是租金
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

	// 计算租金的方法
	public int carRent(int days) {
		return 0;
	}

}

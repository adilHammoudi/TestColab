
public class Simon {
	private int i;
	private String a;
	private double b;
	/**
	 * @param i
	 * @param a
	 * @param b
	 */
	public Simon(int i, String a, double b) {
		super();
		this.i = i;
		this.a = a;
		this.b = b;
	}
	
	
	
	@Override
	public String toString() {
		return "Simon [i=" + i + ", a=" + a + ", b=" + b + "]";
	}



	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	
}

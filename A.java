public class classA {

	private int A1;
	private float A2;
	private String A3;
	private String Aprinc4;

	String Aramo4;

	public void setAramo4(String aramo4) {
		Aramo4 = aramo4;
	}
	public String getAramo4(){
		return Aramo4;
	}

	public void setAprinc4(String aprinc4) {
		Aprinc4 = aprinc4;
	}
	public String getAprinc4(){
		return Aprinc4;
	}

	public void setA3(String a3) {
		A3 = a3;
	}
	public String getA3(){
		return A3;
	}

	public int getA1() {
		return A1;
	}
	public void setA1(int a1) {
		A1 = a1;
	}
	public float getA2() {
		return A2;
	}
	public void setA2(float a2) {
		A2 = a2;
	}
	public float soma(){
		return A2+A1;	
	}
}
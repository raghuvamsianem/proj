
public class Dem {
	@Deprecated
	void m() {
@SuppressWarnings("unused")
int a;
}
	public static void main(String[] args) {
	Dem d=new Dem();
	d.m();
	}
}

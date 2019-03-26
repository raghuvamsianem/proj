class A{
	void m(){
		System.out.println("hi");
	}
}
class De extends A{
	@Override
	void m(){
		System.out.println("hello");
	}
	public static void main(String[] args) {
		De b=new De();
		b.m();
	}
}
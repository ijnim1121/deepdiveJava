package javaEx03;

public class Child extends Parent{
	
	private int c;
	
	public void setChild() {
		c=20;
	}
	
	public void showChild() {
		showParent();
		System.out.println("자식 클래스 : " + c);	
		}

}

package org.seli.intro;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo d = new MethodDemo();
		d.getData();
		d.getData();
		String name = d.getData();
		System.out.println(name);
		MethodDemo2 d1 = new MethodDemo2();
		d1.getUserData();
		getData2();// with static
	}

//	public void getData() {
//		System.out.println("HELLO_WORLD");
//	}
	public String getData() {
		System.out.println("HELLO_WORLD");
		return "HEllO";
	}

	public static String getData2() {
		System.out.println("HELLO_Pateriya");
		return "HEllO";
	}

}

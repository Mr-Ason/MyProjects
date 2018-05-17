package com.anhen.homework;

public class Test {

	public static void main(String[] args) {
		PetShop ps = new PetShop(5);
		ps.add(new Cat("白猫","白色的","喵", 1));
		ps.add(new Cat("黑猫","黑色的","喵", 1));
		ps.add(new Cat("黄猫","黄色的","喵", 1));
		ps.add(new Cat("白黑猫","白黑色的","喵", 1));
		ps.add(new Dog("金毛狗","金色的","汪", 1));
		ps.add(new Dog("黑狗","黑色的","汪", 1));
		showInfo(ps.search("黑"));

	}
public static void showInfo(Pet p[]){
	for(int i = 0;i<p.length;i++){
		if(p[i]!=null){
			System.out.println("名字:"+p[i].getName()+";颜色:"+p[i].getColor()+";年龄:"+p[i].getAge());
		}
	}
}

}

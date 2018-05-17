package com.anhen.mytest;
/*继承的应用
 *       定义一个整形数组，要求包含构造方法，增加数据及输出数据成员方法，
 * 并利用数组实现动态内存分配。在此基础上定义出一下子类；
 *   1）排序类：实现排序；2）反转类：实现数据方向存放
 *   由此看出数组大小是由程序外部决定的。
 * */
public class JichengYingyong {

	public static void main(String[] args) {
		//测试反转类
		ReverseArray ra = new ReverseArray(5);
		System.out.print(ra.add(4)+"\t");
		System.out.print(ra.add(45)+"\t");
		System.out.print(ra.add(44)+"\t");
		System.out.print(ra.add(41)+"\t");
		System.out.print(ra.add(24)+"\t");
		System.out.print(ra.add(246)+"\n");
		print(ra.getArray());
	}

	private static void print(int[] i) {
		// 循环输出数组中的内容
		for(int x =0;x<i.length;x++){
			System.out.print(i[x]+"、");
		}
		
	}
	
}
class Array{
	private int temp[];                //定义一个整形数组，次数组大小由外部决定
	private int foot;                  //定义数组添加的下标
	public Array(int len){           //数组的大小由外部决定
		if(len>0){                           //判断传入的大小长度是否大于0
			this.temp = new int[len];  //根据传入的大小开辟空间
		}else{
			this.temp = new int[1];    //最小维持一个空间
		}
	}
	public boolean add(int i){                  
		if(this.foot < this.temp.length){   //判断数组是否已满
			this.temp[foot] = i;                    //没有存满则继续添加
			foot++;                                      //修改下标
			return true;                              //添加成功
		}else{                                             //数组已存满，不能添加
			return false;                            //添加失败
		}		
	}
	public int[] getArray(){                  //得到全部的数组
		return this.temp;                 
	};
}

//定义子类--反转类
class ReverseArray extends Array{      //定义反转类
	public ReverseArray(int len) {  // 调用父类中的构造方法
		super(len);
	}
	public int[] getArray(){              //覆写得到数组的方法，反转返回
		int t[] = new int[super.getArray().length];
		int count = t.length - 1;  //数组的下标，倒序开始
		for(int x = 0;x<t.length; x++){
			t[count] = super.getArray()[x];
			count--;
		}
		return t;
	}
}
//定义子类--排序类
class SortArray extends Array{

	public SortArray(int len) { //调用父类中的构造方法
		super(len);
	}
	
	public int[] getArray(){
		java.util.Arrays.sort(super.getArray());  //排序操作
		return super.getArray();
	}
	
}










package com.anhen.mytest;
/*�̳е�Ӧ��
 *       ����һ���������飬Ҫ��������췽�����������ݼ�������ݳ�Ա������
 * ����������ʵ�ֶ�̬�ڴ���䡣�ڴ˻����϶����һ�����ࣻ
 *   1�������ࣺʵ������2����ת�ࣺʵ�����ݷ�����
 *   �ɴ˿��������С���ɳ����ⲿ�����ġ�
 * */
public class JichengYingyong {

	public static void main(String[] args) {
		//���Է�ת��
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
		// ѭ����������е�����
		for(int x =0;x<i.length;x++){
			System.out.print(i[x]+"��");
		}
		
	}
	
}
class Array{
	private int temp[];                //����һ���������飬�������С���ⲿ����
	private int foot;                  //����������ӵ��±�
	public Array(int len){           //����Ĵ�С���ⲿ����
		if(len>0){                           //�жϴ���Ĵ�С�����Ƿ����0
			this.temp = new int[len];  //���ݴ���Ĵ�С���ٿռ�
		}else{
			this.temp = new int[1];    //��Сά��һ���ռ�
		}
	}
	public boolean add(int i){                  
		if(this.foot < this.temp.length){   //�ж������Ƿ�����
			this.temp[foot] = i;                    //û�д�����������
			foot++;                                      //�޸��±�
			return true;                              //��ӳɹ�
		}else{                                             //�����Ѵ������������
			return false;                            //���ʧ��
		}		
	}
	public int[] getArray(){                  //�õ�ȫ��������
		return this.temp;                 
	};
}

//��������--��ת��
class ReverseArray extends Array{      //���巴ת��
	public ReverseArray(int len) {  // ���ø����еĹ��췽��
		super(len);
	}
	public int[] getArray(){              //��д�õ�����ķ�������ת����
		int t[] = new int[super.getArray().length];
		int count = t.length - 1;  //������±꣬����ʼ
		for(int x = 0;x<t.length; x++){
			t[count] = super.getArray()[x];
			count--;
		}
		return t;
	}
}
//��������--������
class SortArray extends Array{

	public SortArray(int len) { //���ø����еĹ��췽��
		super(len);
	}
	
	public int[] getArray(){
		java.util.Arrays.sort(super.getArray());  //�������
		return super.getArray();
	}
	
}










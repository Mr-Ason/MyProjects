package com.anhen.day8;
/*��װ������ʵ�ֵ�ϸ�ڣ�ʵ�ֹ���
 * ��װ��ʹ�ã�
 *    1�� ��ķ�װ  ��  ���� ����
 *     2���ӿڵķ�װ  ҵ�����̵ķ�װ
 * ��ķ�װ��
 *       ����Ȩ�޵����η���
 *       		public           ��ǰ��  ��ǰ��   ����  ������
 *       		protect         ��ǰ��  ��ǰ��    ����
 *       		default          ��ǰ��  ��ǰ��
 *       		private          ��ǰ��
 *        * */
public class Test1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Test{
	//����
	public String name;
	private int age;
	private char sex;
	
	//��ֵ����
	public void setAge(int age){
		
	 if(age<0||age>130){
		 System.out.println("������������");
		 return;
	 }
		this.age= age;
	}
	public void setSex(char sex){
		this.sex=sex;
	}
	//ȡֵ����
	public int getAge(){
		if(this.sex == 'Ů'){
			System.out.println("���䱣�ܣ�");
			return 9999;
			//return ' '; ���Է��ؿ��ַ�
		}else{
		    return this.age;
		}
	}
	public char getSex(){
		
		return this.sex;
	}
}

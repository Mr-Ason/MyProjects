package com.anhen.homework;

public class PetShop {
	private Pet[] pets;  //����������
	private int foot;     //�洢��λ��
	
	public PetShop(int len){  //���췽�����ٳ�������Ĵ�С
		if(len>0){
			this.pets = new Pet[len];  //Ϊ�������鿪�ٿռ�
		}else{
			this.pets = new Pet[1];  //���ٿ���һ���ռ�
		}
	}
	public boolean add(Pet pet){    //���ӳ���
		if(this.foot<this.pets.length){ //�жϳ����̵���ĳ����Ƿ�����
			this.pets[this.foot] = pet;  //���ӳ���
			this.foot++;     //�޸ı���λ��
			return true;    //���ӳɹ�
		}else{
			return false;   //����ʧ��
		}
	}
	public Pet[] search(String keyWord){  //�ؼ��ֲ���
		Pet p[] = null; //��Ϊ����֮��Ľ��  ��С���ǹ̶���
		int count  = 0; //��¼���ٸ������������
		//ȷ�Ͽ��ٵĿռ��С ���ж��ٸ�������ϲ�ѯ����
		for(int i = 0 ; i<pets.length;i++){
			if(this.pets[i] !=null){
				if(this.pets[i].getName().indexOf(keyWord)!=-1|| this.pets[i].getColor().indexOf(keyWord)!=-1){
					count++;  //ͳ�Ʒ��������ĸ���
				}
			}
		}
		p = new Pet[count];
		int f = 0; //�������ӵı�־
		for(int i = 0; i<this.pets.length;i++){
			if(this.pets[i]!=null){
				if(this.pets[i].getName().indexOf(keyWord)!=-1|| this.pets[i].getColor().indexOf(keyWord)!=-1){
					p[f] = this.pets[i];//�����ϲ�ѯ�����ĳ�����Ϣ����
					f++;
				}
			}
		}
		return p;
		
	}

}

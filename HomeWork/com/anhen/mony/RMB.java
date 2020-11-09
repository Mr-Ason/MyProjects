/**   
 * projectName: MyJava   
 * fileName: dsf.java   
 * packageName: com.anhen.mony   
 * date: 2018��3��26������5:26:12   
 * copyright(c) 2017-2020 xxx��˾  
 */
package com.anhen.mony;

/**
 * @title: dsf.java
 * @package com.anhen.mony
 * @description: TODO
 * @author: LiuJiDong
 * @date: 2018��3��26�� ����5:26:12
 * @version: V1.0
 */
public class RMB {
	public static void main(String[] args) {
		String rmb = RMB.toRMB(10001.21);
		System.out.println(rmb);
	}

	public static String toRMB(double money) {
		char[] s1 = { '��', 'Ҽ', '��', '��', '��', '��', '½', '��', '��', '��' };
		char[] s4 = { '��', '��', 'Ԫ', 'ʰ', '��', 'Ǫ', '��', 'ʰ', '��', 'Ǫ', '��', 'ʰ', '��', 'Ǫ', '��' };
		// ��������Ϊ����ת�����ֵ�׼��
		String str = String.valueOf(Math.round(money * 100 + 0.00001));
		// ���ǰѲ���moneyС�������2λ��Ȼ��ȡ���������ա��֡�Ϊ��λȡ������תΪ�ַ�����
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			int n = str.charAt(str.length() - 1 - i) - '0';
			result = s1[n] + "" + s4[i] + result;
		}
		// ��һ���ǰ���ת���������ַ�����λȡ���֣��ٰ���������ֵ佫����λ����ɺ���
		// �硰2011���ͷ���ɡ���Ǫ���ҼʰҼԪ������98700432.10�����ǡ���Ǫ�ư���ʰ������Ǫ������ʰ��ԪҼ����֡�����ע�����������Ҵ�д���֣�ò���д��������������ϸ���
		// ���ϵķ�����Կ�����������ƽʱ���϶��в���������¾����ڽ���ЩӦ�þ����ĵط��ֶ��޳����¡����������������õ��Ľ��Ӧ���ǡ���Ǫ��ҼʰҼԪ����������Ǫ�ư���ʰ����������ʰ��ԪҼ������
		result = result.replaceAll("��Ǫ", "��");
		result = result.replaceAll("���", "��");
		result = result.replaceAll("��ʰ", "��");
		result = result.replaceAll("����", "��");
		result = result.replaceAll("����", "��");
		result = result.replaceAll("��Ԫ", "Ԫ");
		result = result.replaceAll("���", "��");
		result = result.replaceAll("���", "��");

		result = result.replaceAll("����", "��");
		result = result.replaceAll("����", "��");
		result = result.replaceAll("����", "��");
		result = result.replaceAll("����", "��");
		result = result.replaceAll("����", "��");
		result = result.replaceAll("��Ԫ", "Ԫ");
		result = result.replaceAll("����", "��");

		result = result.replaceAll("��$", "");
		result = result.replaceAll("Ԫ$", "Ԫ��");
		result = result.replaceAll("��$", "����");

		return result;
	}

}

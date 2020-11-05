/**   
 * projectName: MyJava   
 * fileName: Yuyin.java   
 * packageName: com.anhen.mytest   
 * date: 2018��8��26������11:39:52   
 * copyright(c) 2017-2020 xxx��˾  
 */ 
package com.anhen.mytest;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

/**     
 * @title: Yuyin.java   
 * @package com.anhen.mytest   
 * @description: TODO  
 * @author: LiuJiDong  
 * @date: 2018��8��26�� ����11:39:52   
 * @version: V1.0     
*/
public class Yuyin {

	/**  
	 *@title: main   
	 *@description: TODO  
	 *@author: LiuJiDong  
	 *@date: 2018��8��26�� ����11:39:53  
	 *@param args  
	 *@throws:   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActiveXComponent sap = new ActiveXComponent("Sapi.SpVoice");  
        try {  
            // ���� 0-100  
            sap.setProperty("Volume", new Variant(100));  
            // �����ʶ��ٶ� -10 �� +10  
            sap.setProperty("Rate", new Variant(-2));  
            // ��ȡִ�ж���  
            Dispatch sapo = sap.getObject();  
            // ִ���ʶ�  
            Dispatch.call(sapo, "Speak", new Variant("��ã��ܸ��˼����㡣"));  
            // �ر�ִ�ж���  
            sapo.safeRelease();  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            // �ر�Ӧ�ó�������  
            sap.safeRelease();  
        }  


	}

}

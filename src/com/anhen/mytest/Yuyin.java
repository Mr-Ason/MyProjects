/**   
 * projectName: MyJava   
 * fileName: Yuyin.java   
 * packageName: com.anhen.mytest   
 * date: 2018年8月26日下午11:39:52   
 * copyright(c) 2017-2020 xxx公司  
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
 * @date: 2018年8月26日 下午11:39:52   
 * @version: V1.0     
*/
public class Yuyin {

	/**  
	 *@title: main   
	 *@description: TODO  
	 *@author: LiuJiDong  
	 *@date: 2018年8月26日 下午11:39:53  
	 *@param args  
	 *@throws:   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActiveXComponent sap = new ActiveXComponent("Sapi.SpVoice");  
        try {  
            // 音量 0-100  
            sap.setProperty("Volume", new Variant(100));  
            // 语音朗读速度 -10 到 +10  
            sap.setProperty("Rate", new Variant(-2));  
            // 获取执行对象  
            Dispatch sapo = sap.getObject();  
            // 执行朗读  
            Dispatch.call(sapo, "Speak", new Variant("你好，很高兴见到你。"));  
            // 关闭执行对象  
            sapo.safeRelease();  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            // 关闭应用程序连接  
            sap.safeRelease();  
        }  


	}

}

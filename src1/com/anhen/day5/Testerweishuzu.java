package com.anhen.day5;

public class Testerweishuzu {
	public static void main(String[] args){
		text2();
	}
	public static void text1(){
		int [][] arrays = new int [5][3];//5行3列
		//int[] a = {1,2,3};
		//arrays[0] = new int[]{1,2,3};
		arrays[0][0] = 1;
		arrays[0][1] = 2;
		arrays[0][2] = 3;
		arrays[1][0] = 4;
		arrays[1][1] = 5;
		arrays[1][2] = 6;
		arrays[2][0] = 7;
		arrays[2][1] = 8;
		arrays[2][2] = 9;
		//遍历
		//二维数组的长度
		System.out.println(arrays.length);
		for(int i =0;i<arrays.length;i++){
			for(int j =0;j<arrays[i].length;j++){
				System.out.print(arrays[i][j]+"\t");
			}
			System.out.println("");
		}
	}
	

		public static void text2(){
			int[][] arrays = new int[5][3];//{{},{},{},{},{}}
//			int[] a = {1,2,3};
//			arrays[0] =new int[]{1,2,3};
			arrays[0][0] = 1;
			arrays[0][1] = 2;
			arrays[0][2] = 3;
			arrays[1][0] = 4;
			arrays[1][1] = 5;
			arrays[1][2] = 6;
			arrays[2][0] = 7;
			arrays[2][1] = 8;
			arrays[2][2] = 9;
			//遍历
			//二维数组的长度
			System.out.println(arrays.length);//5
			for(int i = 0;i <arrays.length;i++){//行
				for(int j = 0; j < arrays[i].length;j++){//列
					System.out.print(arrays[i][j]+"\t");
				}
				System.out.println("");
			}
		}

	}



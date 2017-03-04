package com.demo;

public class Test0 {
	public static void main(String[] args) {
		int i,k,j;
		//行数
		int row = 5;
		//标记
		int flag = 1;
		//控制行数
		for( i = 1; i<= row; i++){
			//countKong用来存储每一行打印空格的数量
			int countKong = flag * (row - (2*i-1)); 
			//控制输出空格" "
			for( k =1; k<= countKong; k++){
				System.out.print(" ");
			}
			//控制输出星*
			for( j = 1; j<= row -countKong; j++){
				System.out.print("*");
			}
			if (row - (2*i-1) == 0){
				flag = -1;
			}
			System.out.println();
		}
	}

}

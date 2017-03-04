package com.demo;
/**
 * 
 * 打印出char类型中包含的所有的字符
 * char类型的范围0~65535
 * 使用for循环
 *
 */
public class Test6 {
	public static void main(String[] args) {
		for(int i=0;i<=65535;i++){
			if(i%50==0){
				//每隔50个字符换一行
				System.out.println();
			}
			System.out.print((char)i);
		}
	}

}

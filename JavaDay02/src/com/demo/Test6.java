package com.demo;
/**
 * 
 * ��ӡ��char�����а��������е��ַ�
 * char���͵ķ�Χ0~65535
 * ʹ��forѭ��
 *
 */
public class Test6 {
	public static void main(String[] args) {
		for(int i=0;i<=65535;i++){
			if(i%50==0){
				//ÿ��50���ַ���һ��
				System.out.println();
			}
			System.out.print((char)i);
		}
	}

}

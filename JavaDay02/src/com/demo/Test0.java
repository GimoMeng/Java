package com.demo;

public class Test0 {
	public static void main(String[] args) {
		int i,k,j;
		//����
		int row = 5;
		//���
		int flag = 1;
		//��������
		for( i = 1; i<= row; i++){
			//countKong�����洢ÿһ�д�ӡ�ո������
			int countKong = flag * (row - (2*i-1)); 
			//��������ո�" "
			for( k =1; k<= countKong; k++){
				System.out.print(" ");
			}
			//���������*
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

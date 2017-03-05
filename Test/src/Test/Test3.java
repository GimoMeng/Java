package Test;

public class Test3 {
	
	public static void main(String[] args){
		int n;
		System.out.println("在1~1000可被5与7整除的为");
		for(n=1;n<=1000;n++){
			if(n%3==0&&n%5==0)
			{
				System.out.println("1~1000之间能够同时被5与7整除的数为:"+n);
				
			}
		}
	}

}

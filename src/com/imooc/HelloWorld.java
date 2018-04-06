package com.imooc;
import java.util.Arrays;
//import com.imooc.second.*;

public class HelloWorld {
	public void print() {
		System.out.println("Han Jiao Jiao");
	}
	
	public void print(String str) {
		System.out.println(str);
	}
	
	public class Inner {
		public void show() {
			System.out.println("Welcome to imooc");
		}
	}
	
	public static void main_function(String[] args) {
		int[] scores = {78, 93, 97, 84, 63};
		Arrays.sort(scores);
		System.out.println("排序后的数组：\n");
		
		for (int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		
		System.out.println("foreach after: \n");
		
		for (int i : scores) {
			System.out.println(i);
		}
		
		
		System.out.println("test function: \n");
		HelloWorld test = new HelloWorld();
		test.print();
		
		test.print("Zhanglin");
		
		
		TelPhone tel = new TelPhone();
		tel.call();
		tel.sendMessage();
		
		Inner inner = test.new Inner();   //实例化一个内部类
		inner.show();
	}

}

package com.imooc;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dog dog = new Dog();
//		Animal animal = new Animal(null);
//		dog.age = 10;
//		dog.name = "zhanglin";
//		dog.subName = "hanjiaojiao";
//		dog.eat();
//		dog.run();
//		System.out.println(dog.toString());
//		System.out.println(dog.equals(animal));
//		Animal ani = new Dog();
//		if (ani instanceof Dog) {
//			System.out.println("Yes");
//		}else {
//			System.out.println("No");
//		}
//		
//		
////		Animal animal = new Animal();
////		animal.age = 100;
////		animal.name = "hanjiaojiao";
////		animal.eat();
////		
////		Animal ani = new Dog();
////		ani.eat();
////		ani.run();
		
		Phone tell = new CellPhone();
		tell.call();
		tell.message();
		
		Phone tel2 = new SmartPhone();
		tel2.call();
		tel2.message();
		
		CellPhone cel = new CellPhone();
		cel.call();
		cel.message();
		cel.playGame();
		
		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.message();
		sp.playGame();
		
		Psp ps = new Psp();
		ps.playGame();
		
		
		IPlayGame ip1 = new CellPhone();
		ip1.playGame();
		ip1 = new SmartPhone();
		ip1.playGame();
		ip1 = new Psp();
		ip1.playGame();
		
		IPlayGame ip2 = new IPlayGame() {

			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("实用接口匿名类的方式实现接口");
				
			}
		};
		
		ip2.playGame();
		
		new IPlayGame() {

			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("实用接口匿名类的方式实现接口1");

			}
		}.playGame();

	}
}

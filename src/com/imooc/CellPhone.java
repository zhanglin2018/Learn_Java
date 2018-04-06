package com.imooc;

public class CellPhone extends Phone implements IPlayGame{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("通过键盘来打电话");

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("通过键盘来接受信息");

	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("CellPhone playgame");

	}

}

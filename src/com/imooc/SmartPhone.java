package com.imooc;

public class SmartPhone extends Phone implements IPlayGame {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("通过语音来打电话");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("通过语音来发送信息");

	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("智能手机玩游戏");

	}

}

package com.capgemini.day3;

public class Television {

	private static boolean state;
	private static int currentChannel;
	private static int currentVolume;
	private static int newValue;
	public Television(boolean state, int currentchannel, int currentvolume,int newValue) {
		this.state=state;
		this.currentChannel=currentchannel;
		this.currentVolume=currentvolume;
		this.newValue=newValue;
	}

	public static boolean state() {
		state=true;
		return state;
	}
	
	public static boolean isState() {
		return state;
	}
	public static void setState(boolean state) {
		Television.state = state;
	}
	public static int getCurrentChannel() {
		return currentChannel;
	}
	public static void setCurrentChannel(int currentChannel) {
		Television.currentChannel = currentChannel;
	}
	public static int getNewValue() {
		return newValue;
	}
	public static void setNewValue(int newValue) {
		Television.newValue = newValue;
	}
	public static int increaseVolume() {
		setCurrentVolume(getCurrentVolume()+1);
		return getCurrentVolume();
		
	}
	public static int decreaseVolume() {
		
		setCurrentVolume(getCurrentVolume()-1);
		return getCurrentVolume();
	}
	public static int changeChannel() {
		if(state==true)
		{
		currentChannel=newValue;
		}
		return newValue;
		
		
		
	}
	public static int getCurrentVolume() {
		return currentVolume;
	}
	public static void setCurrentVolume(int currentVolume) {
		Television.currentVolume = currentVolume;
	}
	public void displayEmployeeDetails()
	{
		System.out.println("State :"+state+"currentvolume"+newValue+"CurrenntChannel"+currentChannel);
	}


}



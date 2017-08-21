package com.my.device;

public class TestMain {
	
	public static void main(String[] args) {
		
		TestMain mainObject = new TestMain();
		Device d = mainObject.getDevice(1234, "temp");
		
	}
	
	public Device getDevice(int id, String name)
	{
		Device d = new Device();
		d.setId(id);
		d.setName(name);
		return d;
	}

}

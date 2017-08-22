package com.my.device;

public class DemoMain {
	
	public static void main(String[] args) {
		
		DemoMain mainObject = new DemoMain();
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

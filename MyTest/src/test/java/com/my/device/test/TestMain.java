package com.my.device.test;

import junit.framework.Assert;

import org.junit.Test;

import com.my.device.Device;

public class TestMain {
	
	@Test
	public void testGetDevice()
	{
		com.my.device.TestMain td = new com.my.device.TestMain();
		Device d = td.getDevice(1, "a");
		Assert.assertEquals(1, d.getId());
		
	}
	

}

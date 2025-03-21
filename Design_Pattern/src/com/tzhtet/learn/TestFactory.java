package com.tzhtet.learn;

public class TestFactory {
	
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc", "2 GB", "5000 GB", "2.4 GHz");
		Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		System.out.println("Factory PC config::"+pc);
		System.out.println("Factory Server config::"+server);
	}

}

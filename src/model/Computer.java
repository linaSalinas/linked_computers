package model;

public class Computer {

	private int hd;
	private int ram;
	private String ip;
	
	public Computer(int hd, int ram, String ip){
		this.hd = hd;
		this.ram = ram;
		this.ip = ip;
	}

	public int getHd() {
		return hd;
	}

	public int getRam() {
		return ram;
	}

	public String getIp() {
		return ip;
	}

}

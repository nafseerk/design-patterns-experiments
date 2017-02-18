package java.creational.factory;

public class Laptop extends Computer {

  private String ram;
  private String hdd;
  private String cpu;
  private String batteryBackUp;

  public Laptop(String ram, String hdd, String cpu, String batteryBackUp) {
    this.ram = ram;
    this.hdd = hdd;
    this.cpu = cpu;
    this.batteryBackUp = batteryBackUp;
  }

  @Override
  public String getRAM() {
    return this.ram;
  }

  @Override
  public String getHDD() {
    return this.hdd;
  }

  @Override
  public String getCPU() {
    return this.cpu;
  }

  public String getBatteryBackUp() {
    return this.batteryBackUp;
  }

  @Override
	public String toString(){
		return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU() +", BATTERYBACKUP="+this.getBatteryBackUp();
	}

}

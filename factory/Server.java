package factory;

public class Server extends Computer {

  private String ram;
  private String hdd;
  private String cpu;
  private String dataCenter;

  public Server(String ram, String hdd, String cpu, String dataCenter) {
    this.ram = ram;
    this.hdd = hdd;
    this.cpu = cpu;
    this.dataCenter = dataCenter;
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

  public String getDataCenter() {
    return this.dataCenter;
  }

  @Override
	public String toString(){
		return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU() +", DATACENTER="+this.getDataCenter();
	}

}

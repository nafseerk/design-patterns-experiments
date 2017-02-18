package factory;

public class ComputerFactory {

  public static Computer getComputer(String type, String ram, String hdd, String cpu) {
    if(type.equals("PC")) return new PC(ram, hdd, cpu);
    else if(type.equals("Server")) {
      String dataCenter = "Arctic Data Center"; // the only dataCenter we have. the clients doesn't know we have only one
      return new Server(ram, hdd, cpu, dataCenter);
    }
    else if(type.equals("Laptop")) {
      String maxBatteryBackUp = "8 hours"; //the only model we have.
      return new Laptop(ram, hdd, cpu, maxBatteryBackUp);
    }
    return null;
  }
}

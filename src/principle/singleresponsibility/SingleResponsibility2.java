package principle.singleresponsibility;

public class SingleResponsibility2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    RoadVehicle roadVehicle = new RoadVehicle();
    roadVehicle.run("摩托車");
    roadVehicle.run("汽車");

    AirVehicle airVehicle = new AirVehicle();
    airVehicle.run("飛機");
  }

}


// 方案2的分析
// 1. 遵守單一職責原則
// 2. 但是這樣做的改動很大，要將類分解，同時要修改客戶端
// 3. 改進: 直接修改 Vehicle 類，改動的代碼會比較少 => 方案3


class RoadVehicle {
  public void run(String vehicle) {
    System.out.println(vehicle + " 在公路上運行......");
  }
}


class AirVehicle {
  public void run(String vehicle) {
    System.out.println(vehicle + " 在空中運行......");
  }
}


class WaterVehicle {
  public void run(String vehicle) {
    System.out.println(vehicle + " 在水中運行......");
  }
}

package principle.singleresponsibility;

public class SingleResponsibility1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Vehicle vehicle = new Vehicle();
    vehicle.run("摩托車");
    vehicle.run("汽車");
    vehicle.run("飛機");
  }

}


// 交通工具類
// 方式1
// 1. 在方式 1 的 run 方法中，違反了單一職責原則
// 2. 解決的方式非常簡單，根據交通工具運行方式不同，分解成不同類即可
class Vehicle {
  public void run(String vehicle) {
    System.out.println(vehicle + " 在公路上運行......");
  }
}

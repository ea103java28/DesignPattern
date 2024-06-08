package singleton.type2;

public class SingletonTest02 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Singleton instance = Singleton.getInstance();
    Singleton instance2 = Singleton.getInstance();
    System.out.println(instance == instance2);
    System.out.println("instance.hashCode()= " + instance.hashCode());
    System.out.println("instance2.hashCode()= " + instance2.hashCode());

  }

}


// 餓漢式(靜態代碼塊)
//
class Singleton {


  // 1. 建構子私有化，外部不能 new
  private Singleton() {

  }

  // 2.類加載的時候創建實例
  private static Singleton instance;

  static { // 在靜態代碼塊中，創建單例實例
    instance = new Singleton();
  }

  // 3. 提供一個公有的靜態方法，返回實例
  public static Singleton getInstance() {
    return instance;
  }

}



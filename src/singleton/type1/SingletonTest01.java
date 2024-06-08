package singleton.type1;

public class SingletonTest01 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Singleton instance = Singleton.getInstance();
    Singleton instance2 = Singleton.getInstance();
    System.out.println(instance == instance2);
    System.out.println("instance.hashCode()= " + instance.hashCode());
    System.out.println("instance2.hashCode()= " + instance2.hashCode());

  }

}


// 餓漢式(靜態變數)
//
class Singleton {


    // 1. 建構子私有化，外部不能 new
    private Singleton() {

    }

    // 2.類加載的時候創建實例
    private final static Singleton instance = new Singleton();

    // 3. 提供一個公有的靜態方法，返回實例
    public static Singleton getInstance() {
      return instance;
    }

  }




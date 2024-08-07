package principle.liskov.improve;

public class Liskov {

  public static void main(String[] args) {

    A a = new A();
    System.out.println("11-3=" + a.func1(11, 3));
    System.out.println("1-8=" + a.func1(1, 8));

    System.out.println("----------------------------------------");

    B b = new B();
    // 因為B類不再繼承A類，因此調用者，不會再認為func1是求 減法
    // 調用完成的功能就會很明確
    System.out.println("11+3=" + b.func1(11, 3));
    System.out.println("1+8=" + b.func1(1, 8));
    System.out.println("11+3+9=" + b.func2(11, 3));



    // 使用 組合 仍然可以使用到A類相關方法
    System.out.println("11-3=" + b.func3(11, 3)); 



  }

}


// 創建一個更加基礎的Base類
class Base {
  // 把更加基礎的方法和成員寫到 Base類
}


// A類
class A extends Base {
  // 返回兩個數的差
  public int func1(int num1, int num2) {
    return num1 - num2;
  }
}


// B類繼承A類
// 增加了一個新功能:完成兩個數相加，然後和9求和
class B extends Base {

  // 如果B需要使用A類方法，使用組合關係
  private A a = new A();

  
  public int func1(int a, int b) {
    return a + b;
  }


  public int func2(int a, int b) {
    return func1(a, b) + 9;
  }

  // 我們仍然想使用A方法
  public int func3(int a, int b) {
    return this.a.func1(a, b);
  }



}

package principle.liskov;

public class Liskov {

  public static void main(String[] args) {

    A a = new A();
    System.out.println("11-3=" + a.func1(11, 3));
    System.out.println("1-8=" + a.func1(1, 8));

    System.out.println("----------------------------------------");

    B b = new B();
    System.out.println("11-3=" + b.func1(11, 3));// 這裡本意是求出 11 - 3 結果變成 11 + 3
    System.out.println("1-8=" + b.func1(1, 8));
    System.out.println("11+3+9=" + b.func2(11, 3));
  }

}


// A類
class A {
  // 返回兩個數的差
  public int func1(int num1, int num2) {
    return num1 - num2;
  }
}


// B類繼承A類
// 增加了一個新功能:完成兩個數相加，然後和9求和
class B extends A {

  // 這裡，重寫了A類的方法，不小心寫錯了，原本是 減法 寫錯成 加法
  @Override
  public int func1(int a, int b) {
    return a + b;
  }


  public int func2(int a, int b) {
    return func1(a, b) + 9;
  }



}

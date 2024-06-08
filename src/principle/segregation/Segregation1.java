package principle.segregation;



public class Segregation1 {

}


// 介面1
interface Interface1 {
  void operation1();

  void operation2();

  void operation3();

  void operation4();

  void operation5();
}


class B implements Interface1 {

  @Override
  public void operation1() {
    System.out.println("B 實現了 operation1");

  }

  @Override
  public void operation2() {
    System.out.println("B 實現了 operation2");

  }

  @Override
  public void operation3() {
    System.out.println("B 實現了 operation3");

  }

  @Override
  public void operation4() {
    System.out.println("B 實現了 operation4");

  }

  @Override
  public void operation5() {
    System.out.println("B 實現了 operation5");

  }

}



class D implements Interface1 {

  @Override
  public void operation1() {
    System.out.println("D 實現了 operation1");

  }

  @Override
  public void operation2() {
    System.out.println("D 實現了 operation2");

  }

  @Override
  public void operation3() {
    System.out.println("D 實現了 operation3");

  }

  @Override
  public void operation4() {
    System.out.println("D 實現了 operation4");

  }

  @Override
  public void operation5() {
    System.out.println("D 實現了 operation5");

  }

}



class A { // A類通過接口Interface1 依賴(使用) B類，但是只會用到1,2,3方法
  public void depend1(Interface1 i) {
    i.operation1();
  }

  public void depend2(Interface1 i) {
    i.operation2();
  }

  public void depend3(Interface1 i) {
    i.operation3();
  }

}



class C { // C類通過接口Interface1 依賴(使用) D類，但是只會用到1,4,5方法
  public void depend1(Interface1 i) {
    i.operation1();
  }

  public void depend4(Interface1 i) {
    i.operation4();
  }

  public void depend5(Interface1 i) {
    i.operation5();
  }

}



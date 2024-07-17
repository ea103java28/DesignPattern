package principle.inversion;

public class DependencyInversion {

  public static void main(String[] args) {

    // 客戶端不需要做任何改變，運行起來仍然跟前面一樣
    Person person = new Person();
    person.receive(new Email());

     person.receive(new WeiXin());
  }

}


/*
這種設計的好處是
我們是跟我們的介面發生依賴
只要你介面沒有發生變化
你下面的子類或實作的類別沒有影響
*/

// 定義介面
interface IReceiver {
   public String getInfo();
}

class Email implements IReceiver {
  public String getInfo() {
    return "電子郵件訊息: hello world";
  }
}

// 增加微信
class WeiXin implements IReceiver {
   public String getInfo() {
    return "微信訊息: hello ok";
}


// 方式2
class Person {
  // 這裡我們是對介面的依賴
  public void receive(IReceiver receiver) {
    System.out.println(receiver.getInfo());

  }
}

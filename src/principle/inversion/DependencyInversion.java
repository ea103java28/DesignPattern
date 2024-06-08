package principle.inversion;

public class DependencyInversion {

  public static void main(String[] args) {
    Person person = new Person();
    person.receive(new Email());

  }

}


class Email {
  public String getInfo() {
    return "電子郵件訊息: hello world";
  }
}


// 完成 Person接收消息的功能
// 方式 1 完成
// 1. 簡單，比較容易想到
// 2. 如果我們獲取的對象是 微信、短信等等，則新增類，同時Person也要增加相應的接收方法
// 3. 解決思路: 引入一個抽象介面 IReceiver，表示接收者， 這樣Person 類與介面 IReceiver 發生依賴
//    因為Email, 微信 等等屬於接收的範圍，他們各自實現 IReceiver 介面就ok，這樣我們就符合依賴倒轉原則
class Person {
  public void receive(Email email) {
    System.out.println(email.getInfo());

  }
}

package principle.inversion.improve;

public class DependecyPass {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Sony sony = new Sony();


    // 通過 setter方法進行依賴傳遞
    OpenAndClose openAndClose = new OpenAndClose();
    openAndClose.setTv(sony);
    openAndClose.open();



  }

}


class Sony implements ITV {

  @Override
  public void play() {
    System.out.println("Sony 電視機，打開");

  }

}


// 方式3: 通過 setter方法傳遞


interface IOpenAndClose {
  public void open(); // 抽象方法

  public void setTv(ITV tv);
}


interface ITV { // ITV接口
  public void play();
}


class OpenAndClose implements IOpenAndClose {
  private ITV tv; // 屬性

  @Override
  public void open() {
    this.tv.play();

  }

  @Override
  public void setTv(ITV tv) {
    this.tv = tv;

  }


}

package singleton.type7;

public class SingletonTest07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("使用靜態內部類完成單例模式");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2);
		System.out.println("instance.hashCode()= " + instance.hashCode());
		System.out.println("instance2.hashCode()= " + instance2.hashCode());

	}

}

// 靜態內部類完成，推薦使用
// 1. Singleton 在加載的時候並不會導致靜態內部類 SingletonInstance 進行加載，從而保證懶加載
// 2. 當我們調用 getInstance()方法的時候，會去取靜態內部類 SingletonInstance 的靜態屬性 INSTANCE ，這時候
// 會導致 SingletonInstance 靜態內部類加載， 而靜態屬性只會在第一次加載類的時候初始化，所以在這裡，JVM幫助我們保證了線程的安全性
class Singleton {
	private static volatile Singleton instance;

	// 建構子私有化，外部不能 new
	private Singleton() {
	}

	// 寫一個靜態內部類，該類中有一個靜態屬性 Singleton
	private static class SingletonInstance {
		private static final Singleton INSTANCE = new Singleton();
	}

	// 提供一個靜態公有方法，直接返回 SingletonInstance.INSTANCE
	public static Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}

}

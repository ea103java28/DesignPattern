package singleton.type6;

public class SingletonTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("雙重檢查");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2);
		System.out.println("instance.hashCode()= " + instance.hashCode());
		System.out.println("instance2.hashCode()= " + instance2.hashCode());

	}

}

// 雙重檢查( thread safe ，同步方法)

class Singleton {
	private static volatile Singleton instance;

	// 建構子私有化，外部不能 new
	private Singleton() {
	}

	// 提供一個靜態的公有方法，加入雙重檢查代碼，解決線程安全問題，同時解決懶加載問題
	// 同時保證了效率，推薦使用
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

}

package singleton.type4;

public class SingletonTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("懶漢式2， 線程安全~");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2);
		System.out.println("instance.hashCode()= " + instance.hashCode());
		System.out.println("instance2.hashCode()= " + instance2.hashCode());

	}

}

// 懶漢式( thread safe，同步方法 )

class Singleton {
	private static Singleton instance;

	// 建構子私有化，外部不能 new
	private Singleton() {

	}

	// 提供一個靜態的公有方法，加入同步處理的代碼，解決線程安全問題
	// 懶漢式
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}

package singleton.type3;

public class SingletonTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("懶漢式1，線程不安全~");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2);
		System.out.println("instance.hashCode()= " + instance.hashCode());
		System.out.println("instance2.hashCode()= " + instance2.hashCode());

	}

}

// 懶漢式( none thread safe)

class Singleton {
	private static Singleton instance;

	// 建構子私有化，外部不能 new
	private Singleton() {

	}

	// 提供一個靜態的公有方法，當使用到該方法時，才去創建instance
	// 懶漢式
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}

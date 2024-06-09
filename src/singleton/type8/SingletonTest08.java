package singleton.type8;

public class SingletonTest08 {

	public static void main(String[] args) {
		Singleton instance = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;
		System.out.println(instance == instance2);

		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());

		instance.sayOk();
	}

}

// 使用枚舉，可以實現單例，推薦使用
enum Singleton {
	INSTANCE; // 屬性

	public void sayOk() {
		System.out.println("ok~");
	}
}

package tutorial;

public class J_11_Classes_Objects_Methods {
	private String name;
	private int id;

	public J_11_Classes_Objects_Methods(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void info() {
		System.out.println("Name: " + name + " - ID: " + id);
	}

	public static void main(String[] args) {
		J_11_Classes_Objects_Methods obj1 = new J_11_Classes_Objects_Methods("Dong", 1310);
		obj1.info();

		J_11_Classes_Objects_Methods obj2 = new J_11_Classes_Objects_Methods("YuDo", 1013);
		obj2.info();
	}

}


public class Leaf implements Shape {
	String name;
	
	public Leaf(String name) {
		super();
		this.name = name;
	}

	public void showShapeType() {
		System.out.println(name);
	}

}

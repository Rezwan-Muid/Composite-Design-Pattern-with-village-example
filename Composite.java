import java.util.*;  
public class Composite implements Shape {
	String name;
	List<Shape> shapes= new ArrayList<>();
	
	public Composite(String name) {
		super();
		this.name = name;
	}
	public void addShape(Shape shape)
	{
		shapes.add(shape);
	}
	public void showShapeType() {
		System.out.println(name+" consists of: \n");
		for(Shape a : shapes)
		{
			a.showShapeType();
		}
		System.out.println("\n");
	}

}

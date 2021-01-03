
public class Composite_Main {
	public static void main(String[] args)
	{
		Shape square = new Leaf("square");
		Shape rectangle = new Leaf("rectangle");
		Shape triangle = new Leaf("triangle");
		Shape line = new Leaf("line");
		Shape circle = new Leaf("circle");
		Shape bubble = new Leaf("bubble");
		
		Composite house = new Composite("house");
		Composite tree = new Composite("tree");
		Composite water_source = new Composite("water_source");
		
		Composite village = new Composite("village");
		
		house.addShape(square);
		house.addShape(rectangle);
		house.addShape(triangle);
		
		tree.addShape(line);
		tree.addShape(rectangle);
		tree.addShape(circle);
		
		water_source.addShape(circle);
		water_source.addShape(bubble);
		
		village.addShape(house);
		village.addShape(tree);
		village.addShape(water_source);
		
		//shows the whole hierarchical struture. Because village contains house, tree and water_souce
		village.showShapeType();
		
		//shows only a particular composite shape which can  be house or tree or water_source
		//house.showShapeType();
		//tree.showShapeType();
		water_source.showShapeType();
		
		//shows the leaf components or shapes
		//rectangle.showShapeType();
		//circle.showShapeType();
		//line.showShapeType();
		//triangle.showShapeType();
		//bubble.showShapeType();
		square.showShapeType();
		
	}

}

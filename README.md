# Composite-Design-Pattern-with-village-example
Composite Design Pattern:
Composite pattern is a partitioning design pattern and describes a group of objects that is treated the same way as a single instance of the same type of object. The intent of a composite is to “compose” objects into tree structures to represent part-whole hierarchies.
In my example of composite design pattern, there are two levels of hierarchy. Firstly village is global composite object. And village consists of: House, Tree and Water_source .
At the second level of hierarchy, Each of House, Tree and Water_source are composed of leaf objects.
•	House is composed of square, rectangle and triangle.
•	Tree is a composite of line, rectangle and circle.
•	Water_source is a composite object of circle and buble.
At the lowest level of hierarchy or at the leaf level all the shapes or components are independent to any other object.
The main advantage of composite design pattern is that-
1.	Village is a composite object of house, tree and water_source. Village acts independently of the leaf nodes.
2.	House, tree and water_source are composite objects as well. They are also independent of village and leaf nodes as well
3.	And at the leaf level rectangle, square, line, etc are independent of the composite objects

So in a nutshell, here all the shapes may be composite or leaf, they can work independently.

Code:
1.	Firstly we have an interface named shape and a method named showShapeType().
2.	Secondly we have two classes leaf and composite. Both of them implements the shape interface. Both leaf and composite have their name. For example: leaf can have name rectangle, line, etc and composite may have name house, tree, village, etc. And both of the leaf and composite classes override the method showShapeType() of their parent class.
3.	In the composite class we have a list named “shapes” of type shape because composite object can have two or more leaf or composite shapes. In this class we also have a method of adding shapes to the list named addShape(). As composite shape will have two or more leaf(rectangle, triangle, etc) or composite(house, village, tree, etc) shapes one enhanced for loop is introduced to print the component of composite shape.
4.	Finally in the main class we just create of all leaf and composite shapes and make our hierarchy according to the given tree below-

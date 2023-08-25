# FlyWight

Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance. This type of design pattern comes under structural pattern as this pattern provides ways to decrease object count thus improving the object structure of application.

Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new object when no matching object is found. We will demonstrate this pattern by drawing 20 circles of different locations but we will create only 5 objects. Only 5 colors are available so color property is used to check already existing Circle objects.

Implementation
We are going to create a Shape interface and concrete class Circle implementing the Shape interface. A factory class ShapeFactory is defined as a next step.

ShapeFactory has a HashMap of Circle having key as color of the Circle object. Whenever a request comes to create a circle of particular color to ShapeFactory, it checks the circle object in its HashMap, if object of Circle found, that object is returned otherwise a new object is created, stored in hashmap for future use, and returned to client.
## Link
https://www.tutorialspoint.com/design_pattern/flyweight_pattern.htm
## image
![UML](flyweight_pattern_uml_diagram.jpg)
## output

	Creating circle of color : Red
	Circle: Draw() [Color : Red, x : 75, y :53, radius :100
	Creating circle of color : Blue
	Circle: Draw() [Color : Blue, x : 39, y :16, radius :100
	Creating circle of color : Green
	Circle: Draw() [Color : Green, x : 33, y :96, radius :100
	Circle: Draw() [Color : Green, x : 3, y :16, radius :100
	Circle: Draw() [Color : Red, x : 39, y :66, radius :100
	Circle: Draw() [Color : Blue, x : 26, y :96, radius :100
	Creating circle of color : Black
	Circle: Draw() [Color : Black, x : 6, y :37, radius :100
	Creating circle of color : White
	Circle: Draw() [Color : White, x : 68, y :21, radius :100
	Circle: Draw() [Color : Black, x : 79, y :16, radius :100
	Circle: Draw() [Color : Green, x : 81, y :68, radius :100
	Circle: Draw() [Color : Red, x : 84, y :75, radius :100
	Circle: Draw() [Color : Blue, x : 60, y :6, radius :100
	Circle: Draw() [Color : White, x : 75, y :10, radius :100
	Circle: Draw() [Color : Blue, x : 60, y :13, radius :100
	Circle: Draw() [Color : Blue, x : 65, y :96, radius :100
	Circle: Draw() [Color : Green, x : 97, y :75, radius :100
	Circle: Draw() [Color : Blue, x : 1, y :41, radius :100
	Circle: Draw() [Color : Blue, x : 41, y :29, radius :100
	Circle: Draw() [Color : White, x : 48, y :6, radius :100
	Circle: Draw() [Color : Blue, x : 40, y :93, radius :100

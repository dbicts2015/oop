package pointinheritance;

public class Main02 {

	public static void main(String[] args) {
		Point point = new Point(1,2);
		Circle circle = new Circle(3,4,5);
		Cylinder cylinder = new Cylinder(6,7,8,9);
		
		point.x = 10;  // ok; want x is protected in Point, dwz
		// zichtbaar in alle subklassen + in alle klassen in 
		// hetzelfde package
		
		point.setPoint(5,10);  // ok; want point is gedeclareerd 
		// als een Point en in klasse Point is een publieke methode
		// setPoint
		
		cylinder.setPoint(10, 20);  // ok; want cylinder is een 
		// instantie van Cylinder en erft de methodes van Circle en
		// Point
		
		 // double v = point.volume();  // compileerfout;
		 // want point is gedeclareerd als een Point en in 
		 // klasse Point is geen methode volume
		
		String tmp = point.toString();  
		System.out.println(tmp);
		System.out.println(point);
		
		Point point2;
		
		point2 = circle;  // ok;
		// een object van een subklasse mag gebruikt worden ipv
		// een object van een basisklasse
		point2.setPoint(100,200);
		//double d2 = point2.area();  // compileerfout;
		// want point2 is gedeclareerd als een Point, 
		// dus mogen we enkel methodes uit klasse Point gebruiken
		
		 System.out.println(point2.toString()); // versie uit Circle;
		 // want het runtimetype bepaalt welke versie uitgevoerd wordt
		 
		 circle = new Cylinder();
		 // cylinder = new Point();  // compileerfout
		 
		 circle = new Cylinder(10, 1, 0, 0);
		 double opp = circle.area();  // ok; want
		 // circle is gedeclareerd als Circle en klasse
		 // Circle heeft een methode area
		 // versie uit Cylinder wordt uitgevoerd
	}

}



class Point{
	double x,y;
	//Note: 构造方法名称和类名保持一致
	public Point(double _x,double _y) {
		x = _x;
		y = _y;
	}
	
	public double getDistance(Point p) {									//getDistance测量距离
		return Math.sqrt((x - p.x)*(x - p.x)+(y - p.y)*(y - p.y));		//Math.sqrt开房求两个点之间的距离
	}
}


public class TestConstructor {
	public static void main(String[] args) {
		
		Point p = new Point(3.0, 4.0);
		Point origin = new Point(0.0, 0.0);
		
		System.out.println(p.getDistance(origin));
		
	}
}

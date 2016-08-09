package linkedList;

public class Circle implements Comparable<Circle> {
	
	private int radius;
	Circle(int radius){
		this.radius  = radius;
	}

	

	@Override
	public int compareTo(Circle r) {
		if(this.radius>r.radius)return 1;
		if(this.radius==r.radius)return 0;
		return -1;
		
	}
	
	@Override
	public String toString() {
		return "This Circle is of radius: " + this.radius;
	}

}

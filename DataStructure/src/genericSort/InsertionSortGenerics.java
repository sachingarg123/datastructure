package genericSort;

import java.util.Arrays;

public class InsertionSortGenerics<T> {

	public void sort(Comparable<T>[] objects){
		Comparable<T> currentObject;
		for (int i=0;i<objects.length;i++){
			currentObject = objects[i];
			int j = i-1;
			while(j>=0 && objects[j].compareTo((T)currentObject)>0){
				objects[j+1]=objects[j];
				j--;
				
			}
			objects[j+1] = currentObject;
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circle[] circles = { new Circle(12), new Circle(5), new Circle(10),
				new Circle(11), new Circle(2) };
		InsertionSortGenerics<Circle> sortCircle = new InsertionSortGenerics<Circle>();
		sortCircle.sort(circles);
		System.out.println(Arrays.toString(circles));
		
		//For Employee Class
		
		Employee[] employees  = {new Employee(789014567L,"Sachin","Garg","sachingarg.hcl@gmail.com"),
				new Employee(789014890L,"Sachin","Garg","sachingarg.hcl@gmail.com"),
				new Employee(789014901L,"Sachin","Garg","sachingarg.hcl@gmail.com"),
				new Employee(789014967L,"Sachin","Garg","sachingarg.hcl@gmail.com"),
				new Employee(789014999L,"Sachin","Garg","sachingarg.hcl@gmail.com")};
		
		InsertionSortGenerics<Employee> sortEmployee = new InsertionSortGenerics<Employee>();
		sortEmployee.sort(employees);
		System.out.println(Arrays.toString(employees));
		
		
		

	}

}

package maven.project.two;

import maven.project.one.one.HelloMaven;

public class MySUM {

	public static void main(String[] args) {
		HelloMaven testSum = new HelloMaven();
		System.out.println("The sum is "+testSum.sum(2, 3));
		testSum.printMethod();
	}
}

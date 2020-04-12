
public class MyExecutableClass {
	
	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("Need to pass one parameter");
		}
		else {
			System.out.println("Hi, This is an executable jar: "+args[0]);
		}
	}

}

package CreationalDesignPatterns.SingletonPattern;

public class SingletonDemo {
	
	public static void main(String[] args) {

	      SingletonClass object = SingletonClass.getInstance();

	      object.showMessage();
	   }

}

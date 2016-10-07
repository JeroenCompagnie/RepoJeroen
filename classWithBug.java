public class ClassWithBug{

	private String string1;

	public ClassWithBug(String string) {
		string1 = string;
	}

	private String getString1() {
		return string1;
	}
	
	public static void main(String [ ] args){
		ClassWithBug obj = new ClassWithBug("Test");
		System.out.println("This is the string " + obj.getString1());
	}

	
	
}
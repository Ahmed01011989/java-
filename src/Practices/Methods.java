package Practices;

public class Methods {
    static String d="My info";
    int b=4;
	public static void main(String[] args) {
		System.out.println(d);
		PrintMyname ();
	   
		String Get= GetMyName() ;
		System.out.println(Get);
		
		Methods pMyage =new Methods();
		pMyage.printMyAge();
		
		System.out.println(pMyage.GetMyAge());
	}
	
	
	public static void PrintMyname () {
		System.out.println("Ahmed Alnassiry");
		Methods refvar=new Methods();
		System.out.println(refvar.b);
		//System.out.println(d);
	}
	
	public void printMyAge() {
		int a=31;
		System.out.println(a);
		//System.out.println(d);
		
	}
	public static String GetMyName() {
		
		return "Jon Smith";
		
				}
	public int GetMyAge() {
		//System.out.println(a);
		return 35;
	}
	

}

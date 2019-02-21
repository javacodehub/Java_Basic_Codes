 import java.util.Scanner;
class MethodReturnType{
	
	public static void main(String args[]){
		
		manue();
	}
	
	public static int addition(int v1, int v2){
		
		return v1+v2;
	}
    public static String gratervalue(int v1, int v2){
		
		if(v1>v2){
			return "grater value 1";
		}
		else{
			return "grater value 2";
		}
		
	}  
    public static int subtraction(int v1, int v2){
		 return v1-v2;
		}
	public static int multiplication(int v1, int v2){
		 return v1*v2;
        }	
	public static void manue(){
		Scanner input=new Scanner(System. in);
		System.out.println("-------------------------------");
		System.out.println("Enter value1:");
		int v1=input.nextInt();
		System.out.println("Enter value2:");
		int v2=input.nextInt();
		System.out.println("-------------------------------");
		System.out.println("1) Addition.......:");
		System.out.println("2) Gratervalue......:");
		System.out.println("3) Subtraction.....:");
		System.out.println("4) multiplication.....:");
		System.out.println("-------------------------------");
		int choise;
		choise=input.nextInt();
		System.out.println("-------------------------------");
		switch(choise){
			case 1:
			    System.out.println("Additon: "+addition(v1,v2));
			    break;
		    case 2:
			    System.out.println("Gratervalue: "+gratervalue(v1,v2));
			    break;
		    case 3:
			    System.out.println("Subtraction: "+subtraction(v1,v2));
			    break;
			case 4:
			    System.out.println("Multiplication:"+multiplication(v1,v2));
			    break;
			default:
		        System.out.println("not show rueslt try again:");
		        break;
		}
		
	}
	

}
class Variables_Ex	//pascal
{
	static int phoneCode=91;//camelCase   method area
	int marks=237292;//global variable -->4 bytes,heap area
		//starting point of java application
	public static void main(String args[])
	{
		//local variables
		byte age=32;
		long contact=9494943499l;
		float salary=23.432429234916292f;
		double salary1=23.432429234916292;  //stack
		char gender='M';
		boolean result=true;
		
				System.out.println(age+" "+contact+" "+salary+" "+salary1+" "+gender+" "+result);
				
				
		Variables_Ex objName=new Variables_Ex();//memory		
						
		System.out.println(objName.marks);
		System.out.println(Variables_Ex.phoneCode);
		
	}
	
}

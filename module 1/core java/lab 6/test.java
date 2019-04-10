 class Substr1 { 
    public static void main(String args[]) 
    { 
  
        // Initializing String 
        String Str = new String("Welcome to geeksforgeeks"); 
  
        // using substring() to extract substring 
        // returns geeksforgeeks 
        //System.out.print("The extracted substring is : "); 
        System.out.println(); 
		char[] arr=Str.toCharArray();
		System.out.println(Str.length());
		System.out.println((int)arr[1]); 
		
    } 
}
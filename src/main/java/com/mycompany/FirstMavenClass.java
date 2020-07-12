package main.java.com.mycompany;

public class FirstMavenClass {
	public static void main(String[]args){
		int[]arr1 ={1,2,3,4,5,6};
		int []newarr=new int[6];
		int r=arr1.length;		
		
		for(int i =0;i<arr1.length;i++,r--){
			newarr[r-1] = arr1[i];
			
		}
        for (int k = 0; k < arr1.length; k++) { 
            System.out.println(newarr[k]); 
        }		
	}
}


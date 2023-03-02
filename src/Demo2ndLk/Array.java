package Demo2ndLk;

import java.util.Arrays;

public class Array {
	///To store the multiple value single variable.
	///we can't add or delete any new value in array. Only we can replece the value.
	///array size is always fixedstring()
	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50};
		
		System.out.println(a.length);//To find the length or array. output=5.
		System.out.println(a[3]);//To print the value at specific index. output=40.
		
		/// 1st way to print array
		System.out.println(Arrays.toString(a));	//output=[10, 20, 30, 40, 50]

	}

}

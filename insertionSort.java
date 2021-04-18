import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	
	public static void insertionSort(int[] a){
		//increasing
		for(int j=1; j<a.length; j++){
			int cur = a[j];
			int i = j-1;
			while(i>=0 && a[i] > cur){
				a[i+1] = a[i];
				i-=1;
			}
			a[i+1] = cur; 
		}
		// decreasing
		/*
		for(int j=a.length-2; j>=0; j--){
			int cur = a[j];
			int i = j+1;
			while(i<a.length && a[i] > cur){
				a[i-1] = a[i];
				i+=1;
			}
			a[i-1] = cur; 
		}
		*/
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] a = {5, 2, 4, 3, 1, 6};
		insertionSort(a);
		for(int x : a){
			System.out.print(x + " ");
		}
	}
}
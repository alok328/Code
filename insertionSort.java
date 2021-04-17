import java.util.*;
import java.io.*;

class InsertionSort {
	
	public static void insertionSort(int[] a) {
		for(int j=1; j<a.length; j++){
			int cur = a[j];
			int i = j-1;
			while(i>=0 && a[i] > cur){
				a[i+1] = a[i];
				i-=1;
			}
			a[i+1] = cur; 
		}
	}
	
	public static void main (String[] args){
		int[] a = {5, 2, 4, 3, 1, 6};
		insertionSort(a);
		for(int x : a){
			System.out.print(x + " ");
		}
	}
}

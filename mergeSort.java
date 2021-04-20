import java.util.*;
import java.lang.*;
import java.io.*;

class MergeSort
{
	
	public static void merge(int[] a, int start, int mid, int end){
		int len = end-start+1;
		int[] sorted = new int[len];
		int i=start, j=mid+1, k=0;
		while(i<=mid && j<=end){
			if(a[i] <= a[j]){
				sorted[k++] = a[i++];
			}else if(a[i] > a[j]){
				sorted[k++] = a[j++];
			}
		}
		while(i<=mid){
			sorted[k++] = a[i++];
		}
		while(j<=end){
			sorted[k++] = a[j++];
		}
		int idx=0;
		for(int d=start; d<=end; d++){
			a[d] = sorted[idx++];
		}
	}
	
	public static void mergeSort(int[] a, int start, int end){
		if(end-start < 1){
			return;
		}
		int mid = start + (end-start)/2;
		mergeSort(a, start, mid);
		mergeSort(a, mid + 1, end);
		merge(a, start, mid, end);
	}
	
	public static void main (String[] args)
	{
		int[] a = {4, 3, 5, 6, 2, 1};
		mergeSort(a, 0, a.length-1);
		for(int x : a){
			System.out.print (x + " ");
		}
	}
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

//find the second highest number in given array {1,2,3,3,4,4,5,5}

public class ArrayS {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,3,4,4,5,5}; //
		
		int flarge=a[1];
		int slarge=0;
	
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>flarge&&a[i]!=flarge) {
				slarge=flarge;
				flarge=a[i];
			}
		}
		System.out.println(slarge);
		
		//=====Using collection============================================
		
		Integer b[] = {1,2,3,3,4,4,5,5};
		List asList = Arrays.asList(b);
		TreeSet<Integer> treeSet = new TreeSet<Integer>(asList);
		System.out.println("hashSet: "+treeSet);
		Object[] array_b = treeSet.toArray();
		System.out.println(array_b.length-1);
		
		//=============== c[] = {5,2,3,8} ================================== 
		int c[] = {5,2,3,8};
		Arrays.sort(c);
		ArrayList al = new ArrayList<>();
		
		for(int i:c) {
			System.out.print(i+" ");
		}
	}
}

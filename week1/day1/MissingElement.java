package week1.day1;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3,4,7,6,8};
		Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            
            if(array[i]+1 != array[i+1]) {
                System.out.println(array[i]+1);
                break;

	}
        }
}
}

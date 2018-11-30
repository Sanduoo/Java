package cn.sanduo;

/**
 * ц╟ещеепР
 */
import java.util.Arrays;

import javax.naming.ldap.SortControl;

public class BubbleSort {
	public static void main(String[] args) {
		int[ ] values = {3,1,6,5,8,4,9,5,4};
		sort(values);
		System.out.println(Arrays.toString(values));
	}
	
	public static void sort(int[ ] values) {
		int temp;
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values.length-1-i; j++) {
				if (values[j]>values[j+1]) {
					temp = values[j];
					values[j] = values[j+1];
					values[j+1] = temp;
				}
			}
		}
	}
}

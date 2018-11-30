
/**
 * ≤‚ ‘µ›πÈ
 * @author Administrator
 *
 */

public class TestRecursion01 {
	public static void main(String[] args) {
		
		a();
		b();
	}
	
	static int count = 0;
	static void a() {
		
		System.out.println("a");
		if (count<10) {				//µ›πÈÕ∑
			count++;
			a();
		}else {							//µ›πÈÃÂ
			return;
		}
	}
	
	static void b() {
		System.out.println("b");
	}
	
}

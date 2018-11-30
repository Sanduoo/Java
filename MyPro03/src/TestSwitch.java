

/**
 * 测试Switch语句
 * @author Administrator
 *多值判断时推荐使用switch
 */

public class TestSwitch {
	public static void main(String[] args) {
		
		int month = (int)(1+12*Math.random());
		System.out.println(month);
		
		switch (month) {
		case 1:
			System.out.println("一月份，过新年！");
			break;
		case 2:
			System.out.println("二月份，开春了！");
			break;
		default:
			System.out.println("都挺好的！");
			break;
		}
		
		
		System.out.println("##########################");
		char c = 'a';														//a=97
		int rand = (int)(1+26*Math.random());			//随机生成【1,26)
		char c1 =(char)(c+rand);									//a+1=b;a+2=c;以此类推
		System.out.println(c1+";");
		
		switch (c1) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("元音");
			break;
		case 'y':
		case 'w':
			System.out.println("半元音");
			break;
		default:
			System.out.println("辅音");
			break;
		}
		
	}
}

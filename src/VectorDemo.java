import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Integer> vector= new Vector<>();
		for(int i=1;i<=10;i++)
		{
			vector.add(i);
		}
		System.out.println("*********Vector Example**********" +"\n"+ vector);
        
		Enumeration<Integer> enumeration= vector.elements();
		System.out.println("*******Enumeration Example*******");
		while(enumeration.hasMoreElements())
		{
			int num= enumeration.nextElement();
			System.out.println(num);
		}
	}
	

}

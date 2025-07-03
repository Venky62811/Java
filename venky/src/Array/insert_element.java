package Array;

public class insert_element {

	public static void main(String[] args) {
		int [] data= {10,20,12,11,29,89,88,90};
		data[0]=45;
		System.out.println(data[0]);

		for(int i=0;i<data.length;i++)
		{
						System.out.println("Elements in the Array :" + data[i] );
		}

	}

}

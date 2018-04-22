import java.util.ArrayList;

class Loopes
{
	public static void main(String[] args)
	{
		String array[] = {"bgautier","maray","aatapia"};
		for(String x:array)
		{
			System.out.println(x);
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		System.out.println(arr.toString());
	}
}
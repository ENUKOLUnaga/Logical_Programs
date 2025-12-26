package array;

public class EvenOdd {
	public static void evenodd(int[] arr)
	{
		int e_sum=0,o_sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				e_sum=e_sum+1;
			}
			else
			{
				o_sum=o_sum+1;
			}
		}
		System.out.println("Even count is :"+e_sum);
		System.out.println("odd count is :"+o_sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		evenodd(arr);

	}

}

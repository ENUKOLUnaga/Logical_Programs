package array;
public class EvenOdd {
	public static void evenodd(int[] arr)
	{
		int even_sum=0,odd_sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even_sum=even_sum+1;
			}
			else
			{
				odd_sum=odd_sum+1;
			}
		}
		System.out.println("Even count is :"+even_sum);
		System.out.println("odd count is :"+odd_sum);
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		evenodd(arr);
	}
}

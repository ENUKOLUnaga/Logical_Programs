package array;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[] arr = {1, 2, 3, 4, 5};
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of Array is: "+sum);

	}

}

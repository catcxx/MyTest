package suanfa;
/**
 * 寻找数组中的最大值与最小值
 * @author Administrator
 *
 */
public class ArrayMaxMin {
	
	static int[] maxmin=new int[2];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {7,3,19,40,4,7,1}; 
		
		arrayMaxMin(array);
		System.out.println(maxmin[0]+" "+maxmin[1]);
	}
	
	/**
	 * 寻找数组中的最大值与最小值
	 * @param arr
	 * @return
	 */
	public static int[] arrayMaxMin(int arr[]){
		
		maxmin[0]=arr[0];
		maxmin[1]=arr[0];
		for(int i=1;i<arr.length-1;i=i+2){
			
			if(i+1>arr.length){
			if(arr[i]>maxmin[0]){
				maxmin[0]=arr[i];
			}
			if(arr[i]<maxmin[1]){
				maxmin[1]=arr[i];
			}
			}
			
			if(arr[i]>arr[i+1]){
				if(arr[i]>maxmin[0]){
					maxmin[0]=arr[i];
				}
				if(arr[i+1]<maxmin[1]){
					maxmin[1]=arr[i+1];
				}	
			}
			
			if(arr[i]<arr[i+1]){
				if(arr[i+1]>maxmin[0]){
					maxmin[0]=arr[i+1];
				}
				if(arr[i]<maxmin[1]){
					maxmin[1]=arr[i];
				}	
			}
			
		}
//		System.out.println(maxmin[0]+" "+maxmin[1]);
		return arr;
		
	}

}

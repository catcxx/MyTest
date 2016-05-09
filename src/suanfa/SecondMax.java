package suanfa;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {7,3,19,40,4,7,1}; 
		secondMax(array);
	}
	
	/**
	 * secondMax
	 * @param array
	 * @return
	 */
	public static int secondMax(int[] array){
		int max=array[0];
		int sec=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++){
			if(array[i]>max){
				sec=max;
				max=array[i];
			}
			else{
				if(array[i]>sec){
					sec=array[i];
				}
			}
		}
		System.out.println(sec);
		return sec;
		
	}

}

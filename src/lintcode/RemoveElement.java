package lintcode;
/**
 * ����һ�������һ��ֵ����ԭ��ɾ����ֵ��ͬ�����֣�����������ĳ��ȡ�

Ԫ�ص�˳����Ըı䣬���Ҷ��µ����鲻����Ӱ�졣
 */
import java.util.Arrays;

public class RemoveElement {
	public static void main(String args[]) {
		int[] nums = {0,4,4,0,4,4,4,0,2};
		RemoveElement re = new RemoveElement();
		
		System.out.print( re.removeElement(nums, 4));
		
	}
	

	public int removeElement(int[] A,int elem) {
        if(A == null || A.length == 0) {
            return 0;
        }
        int k = 0;
        //ʹ����Ԫ�ر����ǣ���elem��ͬ��Ԫ��ɾ��
        for(int i = 0 ; i < A.length ; i++) {
            if(A[i] != elem) {
                A[k++] = A[i];
            }
        }
        //��A�����λ������Ϊ-1
        for(int i = k ; i < A.length ; i++) {
            A[i] = -1;
        }
        return k;
    }
	
	
	
//	 public int removeElement(int[] A, int elem) {
//		 int count = 0;
//		 for(int i=0;i<A.length;i++){
//			 if(A[i]!=elem){
//				 count++;
//			 }
//		 }
//		 int[] AA = new int[count];
//		 for(int j=0,k=0;j<A.length&&k<count;j++){
//			 if(A[j]!=elem){
//				 AA[k]=A[j]; 
//				 System.out.print(AA[k]);
//			 }
//		 }
//		 System.out.println();
//		return count;
//	    }
	 
}

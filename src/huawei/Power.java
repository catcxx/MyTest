package huawei;

public class Power {
	public static void main(String[] args) {
		Power cc = new Power();
		
		System.out.println(cc.Power(2.0, 2));

	}
	
	public double Power(double base, int exponent) {
		double res =1.0D;
		if(exponent>=0){
		for(int i=0;i<exponent;i++){
			res = res * base;
		}
		}else{
			for(int j =0;j>exponent;j--){
				res =  res * base ;
			}
			res = 1.0 /res;
			
		}
		return res;
        
	  }
	
}

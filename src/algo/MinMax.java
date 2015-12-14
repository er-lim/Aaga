package algo;

public class MinMax {

	private int min;
	private int max;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t = {1,2,3};
		
		System.out.println();
		
	}
	
	public void naive(int[] tab) {
		min = max = tab[0];
		for(int i = 1; i<tab.length;i++){
			if(tab[i]<min){
				min = tab[i];
			}
			if(tab[i]>max){
				max = tab[i];
			}
		}
	}
	
	public void opti(int[] tab){
		min = max = tab[tab.length - 1];
		for(int i=0;i<tab.length - 1;i +=2){
			if(tab[i] < tab[i+1]){
				if(tab[i]<min) min = tab[i];
				if(tab[i+1]>max) max = tab[i+1];
			}
			else {
				if(tab[i+1]<min) min = tab[i+1];
				if(tab[i]>max) max = tab[i];
			}
		}
	}

}

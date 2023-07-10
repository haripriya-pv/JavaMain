class MultyDArray{
	public static void main(String args[]){
		int [][]b = new int[2][2]; //instantiate array ,2 row and 2 column  
		b[0][0]=30; //initializing 2D array  
		b[0][1]=40;
		b[1][0]=50;
		b[1][1]=60;
		for(int l=0;l<2;l++){
			for(int m=0;m<2;m++){
				System.out.print(b[l][m]+" ");
			}
			System.out.println();
		}
		int a[][] = {{10,20,30},{30,40,50},{40,50,60}}; //declaring and initializing 2D array  
		//printing 2D array 
		//nested for loop
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
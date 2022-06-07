import pkg.*;
import java.util.Scanner;
import java.util.Random;

public int printArrayList(){
	for(int i = 0;i<arr.size();i++){
		System.out.println(arr.get(i));
	}
	return;
}


public int addValuesArrayList(){
	Random rand = new Random();
	int rand_num = rand.nextInt(99)+1;
	System.out.println(rand_num);
	int n = rand_num;
	while(true){
		printArrayList() + n;
	}
}




class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many values do you want in your arraylist?");
		int n = sc.nextInt();
		list = printArrayList() + addValuesArrayList();
		System.out.println(list);


		
	}
}

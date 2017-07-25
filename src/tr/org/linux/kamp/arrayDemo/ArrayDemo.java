package tr.org.linux.kamp.arrayDemo;

import java.util.Random;

public class ArrayDemo {
	// static değişkenler tanımladık. her metod ve class ta çalışsın diye.
	private static Random rand = new Random();
	private static int bound = 10; // array sınırlarını belirledik.
	private static int[] array = new int[bound];

	public static void main(String[] args) {

		generateArray();
		printArray();
		sortArray();
		printArray();
		int item=15;
		searchItem(item);
		if (lastIndexOf(item)!=-1) {
			System.out.println(item+"elemanı indiste yok.");
		}
			else {
				System.out.println(item+"indisinin son yeri"+lastIndexOf(item));
			}
		}
	

	public static void generateArray() {		//değer döndürmediği için void
		
		int item;
		for(int i=0;i<array.length;i++) {
			
			item=rand.nextInt(10);
			array[i]=item;
		}
		}

	public static void printArray() {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			
		}
		System.out.println("\n");
	}

	public static void sortArray() {	//bubble tekniğiyle sıralıyoruz.
			int temp;		//büyükle küçüğü değişirken yedekte tutmak için değişken
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {	//birinciden başlıyoruz çünkü karşilaştirirken 
														//aynı elemandan başlanmaz.
					if (array[j-1] < array[j]) {	//eğer bir önceki eleman şimdikinden küçükse
						temp=array[j-1];			//bir önceki yani büyük olan elemanı yedeğe al.
						array[j-1]=array[j];		//şimdiki elemana küçük olana bir öncekini attık.
						array[j]=temp;				//bir önceki elemanı şimdiki elemana attık.
				
					}
					
					
			}
		}
	}
	public static boolean searchItem(int item) {
		
		for (int i = 0; i < array.length; i++) {		//0. elemandan son elemana döndürecek.
			if (array[i]==item) {					//eğer i. eleman parametre(item)ye eşitse
				System.out.println(item+"eleman dizi içinde bulundu.");
				return true;			//true değer döndür.
			}
			
		}
		System.out.println(item+"eleman dizi içinde bulunamadı.");	//bu çıktıları main de if ile yapabiliriz.
		return false;			//bulunamazsa false değer döndür.
	}
	
	public static int lastIndexOf(int item) {		//diziyi son elemandan tarayarak isteiğimiz
													//değişkenin son görüldüğü yeri bulmaya çalışıyor.
		
		for (int i = (array.length-1); i >=0; i--) {	//arrayi tersten tarıyoruz.
			if (array[i]==item) {
				return i;
			}
		}
		return -1;			//-1 döndürmesi demek dizinin -1. elemanı yani olmayan elemanı yani boş.
	}
}


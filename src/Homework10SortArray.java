public class Homework10SortArray {
	public static void main(String[] args) {
		System.out.println("This program uses arrays and if statements to sort numbers.\n");
		
		//Call the sortArray method
		sortArray();
		}
	public static void sortArray() {

		//Generate random numbers and sort
		int numbers = 10;
		int[] arrayNumber = new int[numbers];
		arrayNumber = createRandomArray(numbers);
		System.out.print("Our random unsorted array is: \n");
		for (int i = 0; i < numbers; i++ ){
			System.out.print(arrayNumber[i] + " ");
		}
		System.out.println(".");
		
		//Sort the numbers
		arrayNumber = sortTheArray(arrayNumber, numbers);
		System.out.print("\nOur sorted array is:\n");
		for (int i = 0; i < numbers; i++ ){
			System.out.print(arrayNumber[i] + " ");
		}
		System.out.println(".");
		
	}
	public static int[] createRandomArray(int listSize) {
		int[] arrayNumber = new int[listSize];
		// populate the array
		arrayNumber = populateArray(arrayNumber, listSize);
		
		// Test the array to see if there are duplicates.
		
		return arrayNumber;
	}
	public static int[] populateArray(int[] arrayNumber, int numbers) {
		
		int range = numbers * 1000;
		for (int i = 0; i < numbers; i++ ){
			arrayNumber[i] = (int)(Math.random()*range);
		}
		return arrayNumber;
	}
	
	public static int[] sortTheArray(int[] arrayNumber, int numbers) {
		
		int holderOne;
		int holderTwo;
		for (int counter = 1; counter <= numbers; counter++ ){
			
			for (int i = 0; i < numbers-1; i++ ){
				
				holderOne = arrayNumber[i];
				holderTwo = arrayNumber[i+1];
				
				if(holderTwo < holderOne){
					arrayNumber[i] = holderTwo;
					arrayNumber[i+1] = holderOne;
				}
				
			}
		}
		return arrayNumber;
	}
}
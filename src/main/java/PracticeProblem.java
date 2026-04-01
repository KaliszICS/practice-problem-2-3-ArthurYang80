public class PracticeProblem {

	public static void main(String args[]) {
	
	}

	public static void bubbleSortString(String[] strings) {
    boolean swapped = false;
    
    for (int j = 0; j < strings.length - 1; j++) {
        swapped = false;
        for (int i = 0; i < strings.length - 1 - j; i++) {
            if (strings[i].compareToIgnoreCase(strings[i + 1]) > 0) {
                String temp = strings[i];
                strings[i] = strings[i + 1];
                strings[i + 1] = temp;
                swapped = true;
            }
        }
      
        if (!swapped) {
            j = strings.length; 
        }
    }
}

	public static void q1() {
		//Write question 1 code here
	}

	public static void q2() {
		//Write question 2 code here
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

}

// 14) Write a program in java to sorts a string in dictionary format or alphebetical order.

public class sortString {
   static void bubbleSort(String arr[], int n) {
    String temp;
    // Bubble sort algorithm
      for (int i = 0; i < n - 1; i++){
         for (int j = 0; j < n - i - 1; j++){
            if (arr[j].compareTo(arr[j + 1]) > 0) {
               // swap arr[j] and arr[j+1]
               temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp;
            }
        }
    }
}

    public static void main(String[] args) {
        String str = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String[] words = str.split(" ");
        int n = words.length;
        bubbleSort(words, n);
        System.out.print("Sorted string: ");
        // for (int i = 0; i < n; i++) {
        //     System.out.print(words[i] + " ");
        // }
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
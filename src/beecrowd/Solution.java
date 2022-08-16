//import java.util.*;
//import java.io.*;
//import java.math.*;
//
//class Solution {
////
////    public static String[] filterWords(String[] words, String letters) {
////        // Write your code here
////        // To debug: System.err.println("Debug messages...");
////        for (int i = 0; i < words.length; i++) {
//////            if (Arrays.stream(words).peek)
////        }
////    }
//
//    /* Ignore and do not change the code below */
//    // #region main
//    public static void main(String args[]) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        if (in.hasNextLine()) {
//            in.nextLine();
//        }
//        String[] words = new String[n];
//        for (int i = 0; i < n; i++) {
//            words[i] = in.nextLine();
//        }
//        String letters = in.nextLine();
//        PrintStream outStream = System.out;
//        System.setOut(System.err);
//        String[] remaining = filterWords(words, letters);
//        System.setOut(outStream);
//        for (int i = 0; i < remaining.length; i++) {
//            System.out.println(remaining[i]);
//        }
//    }
//    // #endregion
//}
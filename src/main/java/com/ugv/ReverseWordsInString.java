package com.ugv;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.split(" ");
        StringBuilder reverseWords = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--){
            reverseWords.append(words[i]);
            if (i != 0){
                reverseWords.append(" ");
            }
        }

        System.out.println(reverseWords);


        String str1 = "Hello World";
        char[] chars = str1.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

        System.out.println(chars);

        String string = "Hello, World !.";
        String[] tokens = string.split("(?<=\\W)|(?=\\W)");
        StringBuilder reverseWordss = new StringBuilder();

        for (int i = tokens.length - 1; i >=0; i --){
            reverseWordss.append(tokens[i]);
        }

        System.out.println(reverseWordss);
    }
}

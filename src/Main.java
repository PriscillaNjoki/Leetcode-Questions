
/*You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
 If a string is longer than the other,append the additional letters onto the end of the merged string*/
        public class Main {
            public static String mergeAlternately(String word1, String word2) {
                StringBuilder merged=new StringBuilder();
                int i=0, j=0;
                while (i<word1.length() && j<word2.length()){
                    merged.append(word1.charAt(i++));
                    merged.append(word2.charAt(j++));
                }
                // handle the case where one of the input strings is longer than the other.
                while (i<word1.length()){
                    merged.append(word1.charAt(i++));
                }
                while (j<word2.length()){
                    merged.append(word2.charAt(j++));
                }
                //the method returns the merged string by converting the StringBuilder to a String using the toString() method
                return merged.toString();
    }
}
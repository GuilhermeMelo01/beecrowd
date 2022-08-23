package leetcode;

public class MaximunNumberOfWordsd {
    public int mostWordsFound(String[] sentences) {
        int count = 0, maior =0;

        for (int i = 0; i < sentences.length; i++) {
            String[] s = sentences[i].split(" ");
            if (s.length > maior){
                count = s.length;
            }
        }
        return count;
    }
}

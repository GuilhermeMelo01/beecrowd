package leetcode;

import java.util.Arrays;

public class TinyURL {

    // Encodes a URL to a shortened URL.
    //https://leetcode.com/problems/design-tinyurl
    public String encode(String longUrl) {
        String[] encode = longUrl.split("");
        String concat = "";

        for (int i = 0; i < encode.length; i++) {
            if (encode[i].equals("/")) {
                encode[i] = ",";
            }
            concat = concat.concat(encode[i]);
        }
        return concat;
    }

    // Decodes a shortened URL to its original URL.
    //http://tinyurl.com/4e9iAk
    public String decode(String shortUrl) {
        String[] decode = shortUrl.split("");
        String concat = "";
        for (int i=0; i < decode.length; i++){
            if(decode[i].equals(",")){
                decode[i] = "/";
            }
            concat = concat.concat(decode[i]);
        }
        return concat;
    }


    public static void main(String[] args) {
        TinyURL url = new TinyURL();
        String encode = url.encode("https://leetcode.com/problems/design-tinyurl");
        System.out.println("https://leetcode.com/problems/design-tinyurl");
        System.out.println(encode);
        String decode = url.decode(encode);
        System.out.println(decode);
    }
}

package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TinyURLMap {
    Map<String,String> map = new HashMap();

    public String encode(String longUrl) {
        String code = String.valueOf(longUrl.hashCode());

        map.put(code,longUrl);
        return code;
    }

    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }

    public static void main(String[] args) {
        TinyURLMap url = new TinyURLMap();
        String encode = url.encode("https://leetcode.com/problems/design-tinyurl");
        System.out.println("https://leetcode.com/problems/design-tinyurl");
        System.out.println(encode);
        String decode = url.decode(encode);
        System.out.println(decode);
    }
}

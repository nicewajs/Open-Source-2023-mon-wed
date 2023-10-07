package com.kirkwood.contribution2;

import java.util.Map;

public class Map1 {

    public static Map<String, String> mapAB4_MitchellStirmel(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String a = map.get("a");
            String b = map.get("b");
            if      (a.length() > b.length()) map.put("c", a);
            else if (b.length() > a.length()) map.put("c", b);
            else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }
  
    public static Map<String, String> mapAB4_tyler(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            if (map.get("a").length() > map.get("b").length()){
                map.put("c", map.get("a"));
            } else if (map.get("b").length() > map.get("a").length()){
                map.put("c", map.get("b"));
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }
}

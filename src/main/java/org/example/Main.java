package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator; // Iteratorのimportを忘れずに

public class Main {
    public static void main(String[] args) {
        Map<String, String> shopMap = new HashMap<>(); // Mapの宣言
        shopMap.put("ラーメン", "こだわりの生麺がうりです！");
        shopMap.put("うどん", "麺のコシはどこにも負けません！");
        shopMap.put("バーガー", "がっつりいきたい方はぜひうちへ。");
        shopMap.put("ドーナッツ", "若い方に人気です。");

        for (Iterator<String> itr = shopMap.keySet().iterator(); itr.hasNext(); ) {
            String key = itr.next();
            System.out.println(key + "店:" + shopMap.get(key));
        }
        try {
            System.out.println(shopMap.get("デザート").length());
        } catch (NullPointerException e) {
            System.out.println("一覧にない店舗があります。");
            System.out.println("店舗情報を追加してください。");
        } finally {
            System.out.println("終了。");
        }
    }
}
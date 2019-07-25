package kpitutorial;

import java.util.Map;

public class Primitives {
    public static void main(String[] args) {
        byte b1 = 8;
        byte b2 = 122;
        byte sumB = (byte) (b1 - b2);
        int sumB1 = (b1 + b2);
        System.out.println("sumb=" + sumB);
        System.out.println("sumb1=" + sumB1);
        double dub1 = 3.33;

        System.out.println(dub1);
        Map<String, String> envMap = System.getenv();
//       envMap.keySet().stream().forEach(s -> System.out.println("key=" + s));
//       envMap.values().stream().forEach(s -> System.out.println("val="+s));
        envMap.forEach((s, s2) -> System.out.println("key=" + s + "---value=" + s2));
        StringBuilder sBuild = new StringBuilder("abc");
        sBuild.append(123);
        System.out.println("builder=" + sBuild.toString());
        String s = "Dog";
        System.out.println("Dog=" + s.hashCode());
        s = "DOG";
        System.out.println("DOG=" + s.hashCode());
        s = "Dog";
        System.out.println("DOG=" + s.hashCode());
        String countMe = "ahjhauusaaikoAAkaalp";
        int startCount = countMe.length();
        int endLength = countMe.toLowerCase().replaceAll("a", "").length();
        System.out.println("number of A = " + (startCount - endLength));
        boolean a = true;
        Boolean b = false;
        try {
            System.out.println(Integer.parseInt("43.0"));
        } catch (Exception e) {
            System.out.println("msdddddg=" + e.getStackTrace().toString());
        }
        long aCount = countMe.toLowerCase().chars().filter(value -> value == new Character('a').hashCode()).count();
        System.out.println(new Character('b').hashCode());
        System.out.println("aCount=" + aCount);


    }
}

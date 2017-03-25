import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo {
    public static void simpleDemo() {
        String s1 = "moons";
        String s2 = "XxmoonsxX";
        String regexString = "m[aeiou]{2}ns";
        System.out.println(s1.matches(regexString));
        System.out.println(s2.matches(regexString));
    }

    public static void matcherDemo() {
        String seq = "GPCGGWCAASCGGPYACGGWAGYHAGWHWAH";
        String regexString = "C.{2,4}C.{3}[LIVMFYWCX].{8}H.{3,5}H";
        Pattern pat = Pattern.compile(regexString);

        Matcher mat = pat.matcher(seq);
        while (mat.find()) {
            System.out.println("Match: " + mat.group(0));
        }
    }

    public static void groupDemo() {
        String seq = "jim,cs61b-abe,30117827,xi,cs61b-bqd,15039872";
        String regexString = "(cs61b-[a-z]{3}),([0-9]+)";
        Pattern pat = Pattern.compile(regexString);
        Matcher mat = pat.matcher(seq);
        while (mat.find()) {
            System.out.println("entire match: " + mat.group(0));
            System.out.println("login: " + mat.group(1) + ", sid: "
                    + mat.group(2));
        }
    }

    public static void main(String[] args) {
        //simpleDemo();
        //matcherDemo();
        //groupDemo();
    }
}

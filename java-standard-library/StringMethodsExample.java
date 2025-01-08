public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String str2 = "hello, world!";
        char[] charArray = {'J', 'a', 'v', 'a'};

        // charAt()
        System.out.println("charAt(1): " + str.charAt(1)); // e

        // codePointAt()
        System.out.println("codePointAt(1): " + str.codePointAt(1)); // 101 (Unicode of 'e')

        // codePointBefore()
        System.out.println("codePointBefore(1): " + str.codePointBefore(1)); // 72 (Unicode of 'H')

        // codePointCount()
        System.out.println("codePointCount(0, 5): " + str.codePointCount(0, 5)); // 5

        // compareTo()
        System.out.println("compareTo(): " + str.compareTo(str2)); // Positive value (lexicographically greater)

        // compareToIgnoreCase()
        System.out.println("compareToIgnoreCase(): " + str.compareToIgnoreCase(str2)); // 0 (equal ignoring case)

        // concat()
        System.out.println("concat(): " + str.concat(" Let's code!")); // Hello, World! Let's code!

        // contains()
        System.out.println("contains(): " + str.contains("World")); // true

        // contentEquals()
        System.out.println("contentEquals(): " + str.contentEquals(new StringBuffer("Hello, World!"))); // true

        // copyValueOf()
        System.out.println("copyValueOf(): " + String.copyValueOf(charArray)); // Java

        // endsWith()
        System.out.println("endsWith(): " + str.endsWith("!")); // true

        // equals()
        System.out.println("equals(): " + str.equals(str2)); // false

        // equalsIgnoreCase()
        System.out.println("equalsIgnoreCase(): " + str.equalsIgnoreCase(str2)); // true

        // format()
        System.out.println("format(): " + String.format("My name is %s, age is %d", "John", 30)); // My name is John, age is 30

        // getBytes()
        System.out.println("getBytes(): " + Arrays.toString(str.getBytes())); // [72, 101, 108, ...]

        // getChars()
        char[] chars = new char[5];
        str.getChars(0, 5, chars, 0);
        System.out.println("getChars(): " + Arrays.toString(chars)); // [H, e, l, l, o]

        // hashCode()
        System.out.println("hashCode(): " + str.hashCode());

        // indexOf()
        System.out.println("indexOf(): " + str.indexOf("World")); // 7

        // intern()
        System.out.println("intern(): " + str.intern()); // Hello, World!

        // isEmpty()
        System.out.println("isEmpty(): " + str.isEmpty()); // false

        // join()
        System.out.println("join(): " + String.join("-", "Java", "is", "fun")); // Java-is-fun

        // lastIndexOf()
        System.out.println("lastIndexOf(): " + str.lastIndexOf('o')); // 8

        // length()
        System.out.println("length(): " + str.length()); // 13

        // matches()
        System.out.println("matches(): " + str.matches("Hello,.*")); // true

        // offsetByCodePoints()
        System.out.println("offsetByCodePoints(): " + str.offsetByCodePoints(0, 5)); // 5

        // regionMatches()
        System.out.println("regionMatches(): " + str.regionMatches(7, "World", 0, 5)); // true

        // replace()
        System.out.println("replace(): " + str.replace("World", "Java")); // Hello, Java!

        // replaceAll()
        System.out.println("replaceAll(): " + str.replaceAll("o", "O")); // HellO, WOrld!

        // replaceFirst()
        System.out.println("replaceFirst(): " + str.replaceFirst("o", "O")); // HellO, World!

        // split()
        System.out.println("split(): " + Arrays.toString(str.split(", "))); // [Hello, World!]

        // startsWith()
        System.out.println("startsWith(): " + str.startsWith("Hello")); // true

        // subSequence()
        System.out.println("subSequence(): " + str.subSequence(0, 5)); // Hello

        // substring()
        System.out.println("substring(): " + str.substring(7)); // World!

        // toCharArray()
        System.out.println("toCharArray(): " + Arrays.toString(str.toCharArray())); // [H, e, l, ...]

        // toLowerCase()
        System.out.println("toLowerCase(): " + str.toLowerCase()); // hello, world!

        // toString()
        System.out.println("toString(): " + str.toString()); // Hello, World!

        // toUpperCase()
        System.out.println("toUpperCase(): " + str.toUpperCase()); // HELLO, WORLD!

        // trim()
        System.out.println("trim(): " + "   Java  ".trim()); // Java

        // valueOf()
        System.out.println("valueOf(): " + String.valueOf(42)); // 42
    }
}

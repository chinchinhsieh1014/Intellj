package Basic.DataType.ReferenceDataTypes;

public class StringExample {
    public static void main(String[] args) {
        // Immutable
        // Initialise
        String greeting = "Hello";
        String name = new String("Joshua");

        // length()
        int len = greeting.length();
        // charAt(int index)
        char o = greeting.charAt(4);
        // substring(int beginIndex, int endIndex)
        String str = "Hello, World!";
        String hello = str.substring(0,5);
        // equal() equalsIgnoreCase(String anotherString)
        // check the content
        String str1 = "Java";
        String str2 = "java";
        boolean isEqual = str1.equals(str2);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        // ==
        // check references point
        String str3 = new String("Java");
        boolean equal = str1==str3;
        // toUpperCase()
        String upper = str.toUpperCase();
        // toLowerCase()
        String lower = str.toLowerCase();
        // contains(str)
        boolean contains = str.contains("Hello");
        // indexOf(String str) lastIndexOf(String str)
        int index1 = str.indexOf("o");
        int index2 = str.lastIndexOf("o");
        // replace(char oldChar, char newChar) replaceAll(String regex, String replacement)
        String replaced = greeting.replace("H", "h");
        String regexReplaced = greeting.replaceAll("l", "o");
        // trim() Removes leading and trailing whitespace from the string.
        String white = "  hello, world!   ";
        String trimmed = white.trim();
        // split
        String list = "Java,Python,C++";
        String[] languages = list.split(",");

        // Concatenation
        String s1 = "Hello, ";
        String s2 = "world";
        String s = s1+s2;
        // String s = s1.concat(s2);

        // formatting
        int age = 0;
        String formatted = String.format("Name: %s, Age: %d", name, age);
    }
}

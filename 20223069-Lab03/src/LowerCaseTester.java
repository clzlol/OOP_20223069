class LowerCaseTester {
    public static void main(String args[]) {

        // greeting
        String greeting = "Hello, World!";
        int n = greeting.length();

        // river
        String river = "Mississippi";
        String bigRiver = river.toUpperCase();

        // test
        String testString = "This is a Test";
        String smallTestString = testString.toLowerCase();
        System.out.println(smallTestString);
        String bigTestString = smallTestString.toUpperCase();
        System.out.println(bigTestString);

    }
}

public class MyClass {
    public static void main(String args[]) {
        String example1 = "This is the first line!\nThis is the second Line!\n";
        String example2 = "A world of dew,\nAnd within every dewdrop\nA world of struggle.\n";
        String example3 = "A dozen, a gross, and a score\nPlus three times the square root of four\nDivided by seven\nPlus five times eleven\nIs nine squared and not a bit more.\n";

        textSurrounder(example1,"*");
        textSurrounder(example2,"+");
        textSurrounder(example3,"=");

    }
    public static void textSurrounder(String str,String s)
    {
        String removeString = str;
        for (int i = 1; i <= str.indexOf("\n") + 2; i++) {
            System.out.print(s);
        }
        System.out.println();
        while (removeString.indexOf("\n") != removeString.length() - 1) {
            System.out.print(s);
            System.out.print(removeString.substring(0, removeString.indexOf("\n")));
            System.out.print(s);
            System.out.println();
            removeString = removeString.substring(removeString.indexOf("\n") + 1);
            if (removeString.indexOf("\n") == removeString.length() - 1) {
                System.out.print(s);
                System.out.print(removeString.substring(0, removeString.indexOf("\n")));
                System.out.print(s);
                System.out.println();
                for (int j = 1; j <= removeString.indexOf("\n") + 2; j++) {
                    System.out.print(s);
                }
            }

        }
        System.out.println();
    }
}

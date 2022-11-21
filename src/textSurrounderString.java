public class textSurrounderString {
    public static void main(String args[]) {
        String example1 = "This is the first line!\nThis is the second Line!\n";
        String example2 = "A world of dew,\nAnd within every dewdrop\nA world of struggle.\n";
        String example3 = "A dozen, a gross, and a score\nPlus three times the square root of four\nDivided by seven\nPlus five times eleven\nIs nine squared and not a bit more.\n";

        //testSurrounder returns a string.
        String t1 = textSurrounder(example1,"*");
        //Now we surround the surrounded text!
        System.out.println(textSurrounder(t1,"-"));

        //Or you could pass textSurrounder as an argument to textSurrounder!
        System.out.println(textSurrounder(textSurrounder(example2,"+"),"o"));

        //Same as above.
        System.out.println(textSurrounder(textSurrounder(example3,"="),"#"));

    }
    public static String textSurrounder(String str,String s)
    {
        String text = "";
        String removeString = str;
        for (int i = 1; i <= str.indexOf("\n") + 2; i++) {
            text += (s);
        }
        text += ("\n");
        while (removeString.indexOf("\n") != removeString.length() - 1) {
            text += (s);
            text += (removeString.substring(0, removeString.indexOf("\n")));
            text += (s);
            text += ("\n");
            removeString = removeString.substring(removeString.indexOf("\n") + 1);
            if (removeString.indexOf("\n") == removeString.length() - 1) {
                text += (s);
                text += (removeString.substring(0, removeString.indexOf("\n")));
                text += (s);
                text += ("\n");
                for (int j = 1; j <= removeString.indexOf("\n") + 2; j++) {
                    text += (s);
                }
            }

        }
        text += ("\n");
        return text;
    }
}


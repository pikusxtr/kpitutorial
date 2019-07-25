package except.ex1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

public class ExDesign01 {
    public static void main(String[] args)
            throws IOException {
        String fileName = "myTextFile.txt";
//        if (args.length == 0) {
//            System.out.println("Must give filename as first arg.");
//            return;
//        }
        FileInputStream in = null;
        try {
            in = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Can't find file: " + fileName);
            System.out.println("message=" + e.getMessage());
            return;
        }
        // Read file into a StringBuffer
        StringBuffer buf = new StringBuffer();
        try {
            int ch;
            while ((ch = in.read()) != -1) {
                buf.append((char) ch);
            }
            buf.append((char) ch);

        } finally {
            in.close();
        }
        // Separate StringBuffer into tokens and
        // push each token into a Stack
        StringTokenizer tok = new StringTokenizer(buf.toString());
        Stack stack = new Stack();
        while (tok.hasMoreTokens()) {
            stack.push(tok.nextToken());
        }
        // Print out tokens in reverse order.
        while (!stack.empty()) {
            System.out.println((String) stack.pop());
        }
    }
}

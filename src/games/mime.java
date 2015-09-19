package games;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Created by nathanielpayne on 9/17/2015.
 */
public class mime {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Map<String, String> types = new HashMap<String, String>();
        // Note that a Map is an object that maps keys to values.
        // A map cannot contain duplicate keys: Each key can map to at most one value.
        // Note that the basic operations of Map (put, get, containsKey, containsValue, size, and isEmpty) behave exactly like their counterparts in Hashtable.

        int N = in.nextInt(); // Number of elements which make up the association table
        in.nextLine();
        int Q = in.nextInt(); // Number Q of file names to be analyzed
        in.nextLine();

        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.

            types.put(EXT.toLowerCase(), MT); // Make sure that the extension here is lower case
            in.nextLine();
        }

        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line should be input
            if(!FNAME.contains(".") || FNAME.split("\\.").length < 2 || FNAME.charAt(FNAME.length()-1) == '.') {
                System.out.println("UNKNOWN"); // Unknown
            } else {
                String[] parsed = FNAME.split("\\.");
                if(!types.containsKey(parsed[parsed.length-1].toLowerCase())) {
                    System.out.println("UNKNOWN"); // Unknown
                } else {
                    System.out.println(types.get(parsed[parsed.length-1].toLowerCase()));
                }
            }
        }
    }
}

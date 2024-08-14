//package Recursion;
//
//public class Permutations {
//    public static void main(String[] args) {
//       permutations("", "abc");
//    }
//    static void permutations(String p, String np) {
//        if(np.isEmpty()) {
//            System.out.println(p);
//            return;
//        }
//
//        char ch = np.charAt(0);
//        for(int i = 0;i <= p.length();i++) {
//            String f = p.substring(0, i);
//            String s = p.substring(i, p.length());
//            permutations(f + ch + s,np.substring(1));
//        }
//    }
//}


package Recursion;



import sun.reflect.generics.tree.Tree;

import java.util.*;

// For an array
//public class Permutations {
//    private static void recursivePermute(int[] arr, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ds, boolean[] picked, int n) {
//        if(ds.size() == n) {
//            ans.add(new ArrayList<>(ds));
//            return;
//        }
//        for(int i = 0;i < n;i++) {
//            if(!picked[i]) {
//                picked[i] = true;
//                ds.add(arr[i]);
//                recursivePermute(arr, ans, ds, picked, n);
//                ds.remove(ds.size()-1);
//                picked[i] = false;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {1,2,3};
//        int n = arr.length;
//        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//        ArrayList<Integer> ds = new ArrayList<>();
//        boolean[] picked = new boolean[n];
////        Permutations obj = new Permutations();
//        recursivePermute(arr, ans, ds, picked, n);
//        System.out.println(ans);
//    }
//}


//// For a string
//
//public class Permutations {
//    private static void recursivePermute(String str, ArrayList<String> ans, StringBuilder ds, boolean[] picked, int n) {
//        if(ds.length() == n) {
//            ans.add(ds.toString());
//            return;
//        }
//        for(int i = 0;i < n;i++) {
//            if(!picked[i]) {
//                picked[i] = true;
//                ds.append(str.charAt(i));
//                recursivePermute(str, ans, ds, picked, n);
//                ds.deleteCharAt(ds.length()-1);
//                picked[i] = false;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        HashSet<String> hash = new HashSet<>();
//        String str = "ABB";
//        int n = str.length();
//        ArrayList<String> ans = new ArrayList<>();
//        StringBuilder ds = new StringBuilder();
//        boolean[] picked = new boolean[n];
//        recursivePermute(str, ans, ds, picked, n);
//        System.out.println(ans);
//        for(String a : ans) {
//            hash.add(a);
//        }
//        System.out.println(hash);
//    }
//}


// Unique strings with lexicographical order

class Permutations {
    private static void recursivePermute(char[] chars, Set<String> hash, StringBuilder ds, boolean[] picked) {
        if(ds.length() == chars.length) {
            hash.add(ds.toString());
            return;
        }

        for(int i = 0;i < chars.length;i++) {
            if(!picked[i]) {
                picked[i] = true;
                ds.append(chars[i]);
                recursivePermute(chars, hash, ds, picked);
                ds.deleteCharAt(ds.length()-1);
                picked[i] = false;
            }
        }
    }

    public static List<String> uniquePermutations(String str) {
        char[] chars = str.toCharArray();
        int n = chars.length;
        Arrays.sort(chars);
        Set<String> result = new TreeSet<>();
        boolean[] picked = new boolean[n];
        recursivePermute(chars, result, new StringBuilder(), picked);
        return new ArrayList<>(result);
    }
    public static void main(String[] args) {
        String str = "ABB";
        int n = str.length();
        List<String> ans = uniquePermutations(str);
        for(String s : ans)
            System.out.println(s);


    }
}
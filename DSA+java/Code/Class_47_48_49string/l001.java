import java.util.*;

public class l001 {
    public static Scanner input = new Scanner(System.in);

    // my method /
    public static boolean balanceString(String str) {
        int n = str.length();
        char[] ch = str.toCharArray();
        int si = 0, ei = n - 1, leftcount = 0, rightcount = 0;
        if (n % 2 != 0) {
            int mid = (si + ei) / 2;
            while (si <= mid) {
                leftcount += (int) (ch[si++] - '0');
            }
            while (mid <= ei) {
                rightcount += (int) (ch[mid++] - '0');
            }
        } else {
            int mid = (si + ei) / 2;
            while (si <= mid) {
                leftcount += (int) (ch[si++] - '0');
            }
            while (mid <= ei) {
                rightcount += (int) (ch[mid++] - '0');

            }
        }
        // System.out.println(leftcount);
        // System.out.println(rightcount);
        if (leftcount == rightcount) {
            return true;
        } else {
            return false;
        }

    }

    // sir method
    // String contains only and only numbers from 0 to 9
    public static boolean isBalanced(String str) {
        int n = str.length();
        int mid = (0 + n - 1) / 2;
        int i = n % 2 == 0 ? mid : mid - 1;
        int j = mid + 1;

        int sum1 = 0, sum2 = 0;
        while (i >= 0) {
            char ch1 = str.charAt(i--);
            char ch2 = str.charAt(j++);

            // convert char into digit
            int d1 = ch1 - '0';
            int d2 = ch2 - '0';

            // add up as a digit
            sum1 += d1;
            sum2 += d2;
        }

        if (n % 2 != 0) {
            sum1 += str.charAt(mid) - '0';
            sum2 += str.charAt(mid) - '0';
        }

        return sum1 == sum2;
    }

    // sir code
    // string contains any charchter that exist in physical universe
    public static boolean isPlaindrom_sir(String str) {
        int n = str.length(), i = 0, j = n - 1;
        while (i < j) {
            char ch1 = str.charAt(i++);
            char ch2 = str.charAt(j--);

            if (ch1 != ch2)
                return false;

        }

        return true;
    }

    public static boolean isPalindrom(String str) {
        char[] arr = str.toCharArray();
        int n = str.length();
        int mid = (0 + n - 1) / 2;
        int p1 = n % 2 == 0 ? mid : mid - 1;
        int p2 = mid + 1;
        while (p1 >= 0) {
            if (arr[p1--] != arr[p2++]) {
                return false;
            }
        }
        return true;
    }

    // formula : result=digit*power+res
    public static int parseStringintoInteger(String str) {
        int power = 1, res = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            int digit = ch - '0';
            res = digit * power + res;
            power *= 10;

        }

        return res;

    }

    public static String makeString(char ch, int freq) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < freq; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }

    // T: O(n)
    public static String strSort_02(String str) {
        int[] farr = new int[129];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            farr[ch]++;
        }

        for (int i = 0; i < farr.length; i++) {
            if (farr[i] > 0) {
                sb.append(makeString((char) i, farr[i]));
            }
        }
        return sb.toString();
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String s1 = strSort_02(str1);
        String s2 = strSort_02(str2);
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }

        }
        return true;

    }

    public static boolean isEqual(String str1, String str2) {
        if (str1.length() != str1.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            if (ch1 != ch2) {
                return false;
            }
        }
        return true;
    }

    // rat : rraatt
    public static boolean isPanagram(String str1, String str2) {
        String s1 = strSort_02(str1);
        String s2 = strSort_02(str2);
        char[] arr1 = s2.toCharArray();
        char[] arr2 = s1.toCharArray();
        int p1 = 0, p2 = 0, p3 = arr2.length - 1;
        while (p1 < arr1.length && p2 < arr2.length) {
            if (p2 == p3 && arr1[p1] != arr2[p2]) {
                return false;
            } else if (arr1[p1] == arr2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        return true;

    }

    // - count the maximum and minimum distance(absolute difference of
    // indices) between two vowels in a string.

    // small alphabets are only present in string

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void absoluteDiff(String str) {
        int maximum = -1;
        int minimum = 100000000;
        int idx1 = -1, pidx = -1000000, count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                if (idx1 == -1) {
                    idx1 = i;
                }
                maximum = Math.max(maximum, i - idx1);
                minimum = Math.min(minimum, i - pidx);
                pidx = i;
                count++;

            }

        }
        if (count > 1) {
            System.out.println("maximum diff: " + maximum);
            System.out.println("minimum diff: " + minimum);
        } else {
            System.out.println("no ans exist");
        }
    }

    // str will a sorted String, ex: "aaabbbccdddeeghijjj" -> "abcdeghij"
    // work for any String
    public static String removeAllDuplicates(String str) {
        int[] freq = new int[128];
        for (int i = 0; i < str.length(); i++)
            freq[str.charAt(i)]++;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                sb.append((char) i);
            }
        }

        return sb.toString();

    }

    // only for sorted String
    public static String removeAllDuplicates_01(String str) {
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        sb.append(str.charAt(0));
        int i = 1;
        // int equalStream = 0;
        while (i < n) {
            int count = 1;
            while (i < n && sb.charAt(sb.length() - 1) == str.charAt(i)) {
                i++;
                count++;
            }

            if (i < n) {
                sb.append(str.charAt(i));
                i++;
            }

            if (count > 1) {
                // equalStream++;
            }
        }

        return sb.toString();

    }

    // str will a sorted String, ex: "aaabbbccdddeeghijjj" -> "ghi"
    // work for any String
    public static String removeAllDuplicates_02(String str) {
        int[] freq = new int[128];
        for (int i = 0; i < str.length(); i++)
            freq[str.charAt(i)]++;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 128; i++) {
            if (freq[i] == 1) {
                sb.append((char) i);
            }
        }

        return sb.toString();
    }

    public static String compress(String str) {
        int[] freq = new int[128];
        for (int i = 0; i < str.length(); i++)
            freq[str.charAt(i)]++;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                sb.append((char) i);
                if (freq[i] > 1) {
                    sb.append((int)freq[i]);
                }
            }
        }

        return sb.toString();

    }

    // only for sorted String
    public static String compres_02(String str) {
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        sb.append(str.charAt(0));
        int i = 1;
        while (i < n) {
            int count = 1;
            while (i < n && sb.charAt(sb.length() - 1) == str.charAt(i)) {
                i++;
                count++;
            }
            if (count > 1) {
                sb.append(count);
            }

            if (i < n) {
                sb.append(str.charAt(i));
                i++;

            }

        }

        return sb.toString();

    }

    public static int firstNonRepeatingCharacter(String str) {
        int[] freq = new int[128];
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (freq[ch] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static boolean isvowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static boolean iscontainVowel(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (isvowel(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static int countSubstrWithoutVowel(String str) {
        int len = str.length(), count = 0;
        for (int beginIndex = 0; beginIndex < len; beginIndex++) {
            for (int endIndex = beginIndex; endIndex < len; endIndex++) {
                String s = str.substring(beginIndex, endIndex + 1);
                if (iscontainVowel(s) == false) {
                    count++;
                }

            }
        }
        return count;

    }

    public static void main(String[] args) {
        String str1 = input.nextLine();
        // String str2 = input.nextLine();
        // balanceString(str);
        // System.out.println(isPalindrom(str));
        // System.out.println(isAnagram(str1, str2));
        // System.out.println(parseStringintoInteger(str1)+3);
        // System.out.println(isPanagram(str1, str2));
        // absoluteDiff(str1);
        // System.out.println(removeAllDuplicates(str1));
        // System.out.println(removeAllDuplicates_02(str1));
        System.out.println(compress(str1));
        // System.out.println(compres_02(str1));
        // System.out.println(removeAllDuplicates_01(str1));
        // System.out.println(firstNonRepeatingCharacter(str1));
        // System.out.println(countSubstrWithoutVowel(str1));
        

    }
}
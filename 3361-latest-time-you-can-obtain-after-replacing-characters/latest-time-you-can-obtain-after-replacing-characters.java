class Solution {
    public String findLatestTime(String time) {
        if (time.equals("??:??")) {
            return "11:59";
        }
        if (!time.contains("?")) {
            return time;
        }

        String arr[] = time.split(":");

        // String hr = "", min = "";
        char h1 = arr[0].charAt(0), h2 = arr[0].charAt(1), m1 = arr[1].charAt(0), m2 = arr[1].charAt(1);

        System.out.println(h1 + " " + h2 + " " + m1 + " " + m2);
        if (h1 == '?') {
            if (h2 >= '2' && h2 <= '9')
                h1 = '0';
            else
                h1 = '1';
        }

        if (h2 == '?') {
            if (h1 == '1')
                h2 = '1';
            else
                h2 = '9';
        }

        if (m1 == '?')
            m1 = '5';

        if (m2 == '?')
            m2 = '9';

        return ""+h1+h2+":"+m1+m2;

    }
}
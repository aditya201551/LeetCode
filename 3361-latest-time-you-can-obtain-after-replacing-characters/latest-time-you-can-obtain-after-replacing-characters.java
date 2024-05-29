class Solution {
    public String findLatestTime(String time) {
        if (time.equals("??:??")) {
            return "11:59";
        }
        if (!time.contains("?")) {
            return time;
        }

        String arr[] = time.split(":");

        String hr = arr[0], min = arr[1];
        if (hr.charAt(0) == '?') {
            if (hr.charAt(1) >= '2' && hr.charAt(1) <= '9')
                hr = "0" + hr.charAt(1);
            else
                hr = "1" + hr.charAt(1);
        }
        if (hr.charAt(1) == '?') {
            if (hr.charAt(0) == '0')
                hr = "09";
            else
                hr = "11";
        }

        if (min.charAt(0) == '?')
            min = "5" + min.charAt(1);
        if (min.charAt(1) == '?')
            min = min.charAt(0) + "9";

        return hr + ":" + min;

    }
}
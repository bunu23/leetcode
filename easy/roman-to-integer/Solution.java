class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        char[] chars = s.toCharArray();
        int cur = 0;

        switch (chars[0]) {
            case 'I':
                cur = 1;
                break;
            case 'V':
                cur = 5;
                break;
            case 'X':
                cur = 10;
                break;
            case 'L':
                cur = 50;
                break;
            case 'C':
                cur = 100;
                break;
            case 'D':
                cur = 500;
                break;
            case 'M':
                cur = 1000;
                break;
        }

        for (int i = 1; i < chars.length; i++) {
            int next = 0;
            switch (chars[i]) {
                case 'I':
                    next = 1;
                    break;
                case 'V':
                    next = 5;
                    break;
                case 'X':
                    next = 10;
                    break;
                case 'L':
                    next = 50;
                    break;
                case 'C':
                    next = 100;
                    break;
                case 'D':
                    next = 500;
                    break;
                case 'M':
                    next = 1000;
                    break;
            }

            if (cur < next) {
                sum = sum - cur;
            } else {
                sum = sum + cur;
            }

            cur = next;
        }

        sum += cur;
        return sum;
    }
}
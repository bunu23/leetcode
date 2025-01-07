class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int cur = 0;

        // step 1 converting first character directly
        switch (s.charAt(0)) {
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

        for (int i = 1; i < s.length(); i++) {
            int next = 0;
            switch (s.charAt(i)) {
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

            // comparing current and the next
            if (cur < next) {
                sum -= cur;
            } else {
                sum += cur;
            }
            cur = next;
        }
        sum += cur;
        return sum;

    }
}
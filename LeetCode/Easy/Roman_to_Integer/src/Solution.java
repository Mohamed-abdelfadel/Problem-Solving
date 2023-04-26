class Solution {
    public static int romanToInt(String s) {
//        int sum = 0 ;
//        char I = 'I';
//        char V = 'V';
//        char X = 'X';
//        char L = 'L';
//        char C = 'C';
//        char D = 'D';
//        char M = 'M';
//        int n = s.length();
//        char[] RHS = s.toCharArray();
//        for (int i = s.length()-1 ; i >= 0 ; i--){
//            if (RHS[i] == I){
//                sum+=1;
//            }
//            if (RHS[i] == V){
//                sum+=5;
//            }
//            if (RHS[i] == X){
//                sum+=10;
//            }
//            if (RHS[i] == L){
//                sum+=50;
//            }
//            if (RHS[i] == C){
//                sum+=100;
//            }
//            if (RHS[i] == D){
//                sum+=500;
//            }
//            if (RHS[i] == M){
//                sum+=1000;
//            }
//
//        }
//    return sum ;
        int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }
}
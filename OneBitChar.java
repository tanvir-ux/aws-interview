class OneBitChar {
    static boolean isOneBitCharacter(int[] bits) {
        int ones = 0;
        int n = bits.length;
        if(n < 1) return false;                
        for(int i = n - 2; i >= 0 && bits[i] != 0; i--) {
            ones++;
        }
        if(ones % 2 > 0) return false;
        return true;
    }
    public static void main(String[] args) {
        int[] numbers1 = {1,0,0};//true
        int[] numbers2 = {1,1,1,0};//false
        int[] numbers3 = {1,0,1,0,1,0};//false
        int[] numbers4 = {1,0,1,0,1,1,0};//true        
        int[] numbers5 = {};//false

        System.out.println(isOneBitCharacter(numbers1));
        System.out.println(isOneBitCharacter(numbers2));
        System.out.println(isOneBitCharacter(numbers3));
        System.out.println(isOneBitCharacter(numbers4));        
        System.out.println(isOneBitCharacter(numbers5));
    }
}
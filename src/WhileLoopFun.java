public class WhileLoopFun {
    public WhileLoopFun() { }

    public void printDigits(int number) {
        while (number != 0) {
            int temp = number % 10;
            System.out.println(temp);
            number /= 10;
        }
    }


    public int countLetter(String word, String letter) {
        int count = 0;
        while (word.indexOf(letter) != -1){
            count ++;
            int index = word.indexOf(letter);
            word = word.substring(index + 1);
            }
        return count;
    }


    public int maxDoubles(int number, int threshold) {
        int count = 0;
        while (number*2 <= threshold){
            count ++;
            number *= 2;
        }
        return count;
    }


    public boolean isPrime(int number) {
        int count = 0;
        int divisor = 1;
        if (number == 1){
            return false;
        }
        while (divisor < 9999999){
            if (number % divisor == 0){
                count ++;
            }
            divisor ++;
        }
        return count == 2;

    }
}


public class Nicomachus {

	public static void main(String[] args) {
		int number = 28; // Change this to the desired number

        String classification = classifyNumber(number);

        System.out.println(number + " is a " + classification + " number.");
    }

    public static String classifyNumber(int number) {
        int aliquotSum = calculateAliquotSum(number);

        if (aliquotSum == number) {
            return "perfect";
        } else if (aliquotSum > number) {
            return "abundant";
        } else {
            return "deficient";
        }
    }

    public static int calculateAliquotSum(int number) {
        int sum = 1; // Start with 1 because every number is divisible by 1

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;

                // If the divisors are distinct, add the other divisor
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }

        return sum;
	}

}

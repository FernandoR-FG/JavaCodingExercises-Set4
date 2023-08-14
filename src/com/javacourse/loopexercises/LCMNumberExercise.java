package com.javacourse.loopexercises;
class BiNumber {

    private int number1;
    private int number2;

    /**
     * Constructor that initializes the two numbers.
     * @param number1: The first number.
     * @param number2: The second number.
     */
    public BiNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    /**
     * Getter for the first number.
     * @return the first number.
     */
    public int getNumber1() {
        return number1;
    }

    /**
     * Getter for the second number.
     * @return the second number.
     */
    public int getNumber2() {
        return number2;
    }

    /**
     * Calculates and returns the least common multiple (LCM) of the two numbers.
     * If either number is negative, returns -1 as the LCM for negative numbers is undefined.
     * If either number is zero, returns 0 as the LCM of 0 and any other number is 0.
     * @return LCM of the two numbers, or -1 if either number is negative, or 0 if either number is zero.
     */
    public int calculateLCM() {
        // TODO: Write your code here
        int max = 0;
        int min = 0;
        int lcm = 0;
        if(this.number1 < 0 || this.number2 < 0){
            return -1;
        }else if(this.number1 == 0 || this.number2 == 0){
            return 0;
        }else{
                max = Math.max(this.number1, this.number2);
                min = Math.min(this.number1, this.number2);
                lcm = max;
                while(true){
                if(lcm % min == 0){
                    return lcm;
                }
                lcm += max;
            }
        }
    }
    
    public int calculateGCD() {
    	int a = number1;
        int b = number2;

        if (a == 0 || b == 0) {
            return 0;
        } else if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        }else if(a < 0 || b < 0) {
        	return 1;
        }

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
public class LCMNumberExercise {

	public static void main(String[] args) {
		// Crear instancias de BiNumber con diferentes números
        BiNumber number1 = new BiNumber(6, 8);
        BiNumber number2 = new BiNumber(15, 20);
        BiNumber number3 = new BiNumber(12, 18);
        BiNumber number4 = new BiNumber(28, 35);

        // Pruebas para el método calculateLCM
        int lcm1 = number1.calculateLCM();
        System.out.println("LCM de " + number1.getNumber1() + " y " + number1.getNumber2() + " es: " + lcm1);

        int lcm2 = number2.calculateLCM();
        System.out.println("LCM de " + number2.getNumber1() + " y " + number2.getNumber2() + " es: " + lcm2);

        // Pruebas para el método calculateGCD
        int gcd1 = number3.calculateGCD();
        System.out.println("GCD de " + number3.getNumber1() + " y " + number3.getNumber2() + " es: " + gcd1);

        int gcd2 = number4.calculateGCD();
        System.out.println("GCD de " + number4.getNumber1() + " y " + number4.getNumber2() + " es: " + gcd2);
    
	}

}

package com.javacourse.loopexercises;
class FactorialCalculator {

    public int calculateFactorial(int number) {
        // Write your code here
        //4! 4 * 3 * 2 * 1
        if(number < 0){return -1;}
        int factorial = 1;
        for(int i = number; i>0;i--){
            factorial *= number;
            number--;
            
        }
        return factorial;
    }
    
    public int getLastDigit(int number) {
        if(number<0){            return -1;        }
        else{            return number % 10;        }
    }
    
    public int getNumberOfDigits(int number) {
        // Write your code here
        int cont=0;
        if(number < 0){return -1;}
        else if(number == 0) {return 1;}
        else{
            while(number != 0){
                number /= 10;
                cont++;
            }
        }
        return cont;
        
    }
    
    public int getSumOfDigits(int number) {
        int temp = 0; int cont = 0;
            if (number < 0) {
                return -1;
            } else if (number == 0) {
                return 0;
            } else if (number == 1) {
                return 1;
            } else {
                while (number != 0) {
                    temp = number % 10;  
                    cont += temp;        
                    number /= 10;        
                }
            }
            return cont;
        }
    
    public int reverseNumber(int number) {
        // TODO: Write your code here
        int revertido = 0;
        if(number == 0){
            return 0;
        }else if(number < 0){
            return -1;
        }
        else{
            while(number != 0){
                int ultimoDigito = number%10;
                revertido = revertido *10 + ultimoDigito;
                number = number/10;
            }
        }
        return revertido;
    }
    
}
public class LoopDoWhileExercises {

	public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();
     // Pruebas para el método calculateFactorial
        int numero1 = 5;
        int resultado1 = calculator.calculateFactorial(numero1);
        System.out.println("El factorial de " + numero1 + " es: " + resultado1);

        int numero2 = 10;
        int resultado2 = calculator.calculateFactorial(numero2);
        System.out.println("El factorial de " + numero2 + " es: " + resultado2);

        // Pruebas para el método getLastDigit
        int numero3 = 12345;
        int ultimoDigito1 = calculator.getLastDigit(numero3);
        System.out.println("El último dígito de " + numero3 + " es: " + ultimoDigito1);

        int numero4 = 9876;
        int ultimoDigito2 = calculator.getLastDigit(numero4);
        System.out.println("El último dígito de " + numero4 + " es: " + ultimoDigito2);

        // Pruebas para el método getNumberOfDigits
        int numero5 = 12345;
        int cantidadDigitos1 = calculator.getNumberOfDigits(numero5);
        System.out.println("La cantidad de dígitos en " + numero5 + " es: " + cantidadDigitos1);

        int numero6 = 9876;
        int cantidadDigitos2 = calculator.getNumberOfDigits(numero6);
        System.out.println("La cantidad de dígitos en " + numero6 + " es: " + cantidadDigitos2);

        // Pruebas para el método getSumOfDigits
        int numero7 = 12345;
        int sumaDigitos1 = calculator.getSumOfDigits(numero7);
        System.out.println("La suma de dígitos en " + numero7 + " es: " + sumaDigitos1);

        int numero8 = 9876;
        int sumaDigitos2 = calculator.getSumOfDigits(numero8);
        System.out.println("La suma de dígitos en " + numero8 + " es: " + sumaDigitos2);

        // Pruebas para el método reverseNumber
        int numero9 = 12345;
        int numeroRevertido1 = calculator.reverseNumber(numero9);
        System.out.println("El número revertido de " + numero9 + " es: " + numeroRevertido1);

        int numero10 = 9876;
        int numeroRevertido2 = calculator.reverseNumber(numero10);
        System.out.println("El número revertido de " + numero10 + " es: " + numeroRevertido2);
    
   
	}

}

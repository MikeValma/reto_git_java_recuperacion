//CALCULADORA
public class Calculadora {
    public static void main (String[] args){
        // Código para realizar una suma de prueba
        int num1 = 10;
        int num2 = 5;
        int resultado = sumar(num1, num2);
        
	//MODIFICADO
        System.out.println("OPERACIÓN FINALIZADA - El resultado es: " + resultado);
    }

    // Función que devuelve la suma de dos números enteros
    public static int sumar(int a, int b) {
        return a + b;
    }
}

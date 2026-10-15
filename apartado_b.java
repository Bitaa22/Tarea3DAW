public class apartado_b {
    /**
     * Calcula el factorial de un numero entero positivo.
     * El factorial de un numero n se obtiene multiplicando
     * todos los numeros enteros desde 1 hasta n.
     * @param facto numero entero positivo del que se calculará el factorial
     * @return el factorial del numero recibido como parametro
    */
    public static int factorial(int facto) {
        int resultado = 1;
        for(int i = 1; i <= facto; i++) {
            resultado *= i;
        }
        return resultado;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}

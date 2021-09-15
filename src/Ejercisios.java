public class Ejercisios {
    public static int factorial(int n){
        int factorial;

        if (n == 1){
            //caso base
            factorial = n;

        }else {
            factorial = n * factorial(n-1);
        }
        return factorial;
    }
    /*

    Maximo comun divisor (mcd), algoritmo
    a = 412
    b = 184

     */
    public static int mcd(int a,int b){
        int mcd;
        if (a == b){
            mcd = b;
        }else {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
            mcd=mcd(a , b );
        }
        return mcd;
    }
    /*
    Suma de los elementos de un vector con recursividad
    Vector{2,4,6}
    Suma = 2 + {4,6}
    Suma = 4 + {6}
    Suma = 6 (Caso base)
     */
    public static int sumaVector(int[] vector,int indice){
        int suma ;
        if (indice == vector.length -1){
        suma = vector[indice];
        }else {
        suma = vector[indice]+sumaVector(vector ,indice +1);
        }
        return suma;
    }
}

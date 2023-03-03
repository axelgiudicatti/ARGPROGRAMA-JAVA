public class ej1 {
    static void A(int x, int y) {
        System.out.println ("los numeros del rango son:");
        while (x<=y) {
            System.out.println (x);
            x++;}
        }   

    static void B(int x, int y) {
        System.out.println ("los numeros pares del rango son:");
        while (x<=y) {
                if (x%2==0){
            System.out.println (x);}
            x++;
            }
        }
        static void C(int x, int y, String z) {
            if (z=="par") { 
                System.out.println ("los numeros pares del rango son:");
                B (x, y);
            }
            else if (z=="impar") {
                System.out.println ("los numeros impares del rango son:");
                while (x<=y) {
                    if (x%2!=0){
                System.out.println (x);}
                x++;
                }
            }
            else { System.out.println ("argumento de paridad incorrecto");}
        }
        static void D(int x, int y) {
            System.out.println ("los numeros pares del rango en orden decreciente son:");
            while (x<=y) {
                    if (y%2==0){
                System.out.println (y);}
                --y;
                }
        }
        public static void main(String[] runner) {
            A(5, 14);
            B(5,14);
            C(5,14,"impar");
            D(5,14);
        }}
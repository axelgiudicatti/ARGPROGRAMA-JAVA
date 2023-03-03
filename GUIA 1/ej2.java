public class ej2 {
    static void segmentosaltos(int ingresos, int autos2018, int ninm, String embarc) {
        if (ingresos >=489083 || autos2018 >= 3 || ninm >= 3 || embarc == "si") {
            System.out.println ("corresponde al segmento de ingresos altos");}
            else {System.out.println("No pertenece al segmento de ingesos altos");}
        }
public static void main(String[] runner) {
    segmentosaltos(2000000, 2, 2, "no");

}
}
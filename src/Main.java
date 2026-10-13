
import java.util.Scanner;
class Cine{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] asientos = {
                "Libre", "Libre", "Libre", "Libre", "Libre"
        };
        int butaca = 0;
        int palomitas = 0;
        int gaseosas = 0;
        int opcion;
        do {
            System.out.println("===== CINE  =====");
            System.out.println("1. Mostrar asientos libres");
            System.out.println("2. Mostrar asientos ocupados");
            System.out.println("3. Comprar una butaca");
            System.out.println("4. Comprar palomitas");
            System.out.println("5. Comprar gaseosas");
            System.out.println("6. Mostrar boleto");
            System.out.println("7. Salir");
            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("ASIENTOS LIBRES");
                    for (int i=0;i<5;i++) {
                        if (asientos[i].equals("Libre")) {
                            System.out.println("Butaca " + (i + 1));
                        }
                    }
                    break;
                case 2:
                    System.out.println("\nASIENTOS OCUPADOS");
                    boolean ocupado = false;

                    for (int i = 0; i < 5; i++) {
                        if (asientos[i].equals("Ocupado")) {
                            System.out.println("Butaca " + (i + 1));
                            ocupado = true;
                        }
                    }
                    if (!ocupado) {
                        System.out.println("No hay asientos ocupados.");
                    }
                    break;
                case 3:
                    System.out.print("Elige una butaca del 1 al 5: ");
                    int numero = teclado.nextInt();

                    if (numero < 1 || numero > 5) {
                        System.out.println("Numero incorrecto.");
                    } else if (asientos[numero - 1].equals("Ocupado")) {
                        System.out.println("La butaca ya esta ocupada.");
                    } else {
                        asientos[numero - 1] = "Ocupado";
                        butaca = numero;
                        System.out.println("Butaca comprada.");
                        System.out.println("Precio: S/ 12");
                    }
                    break;
                case 4:
                    System.out.print("Cantidad de palomitas: ");
                    int cantidadP = teclado.nextInt();
                    if (cantidadP >= 0) {
                        palomitas += cantidadP;
                        System.out.println("Precio por porcion: S/ 8");
                    } else {
                        System.out.println("Cantidad incorrecta.");
                    }
                    break;
                case 5:
                    System.out.print("Cantidad de gaseosas: ");
                    int cantidadG = teclado.nextInt();
                    if (cantidadG >= 0) {
                        gaseosas += cantidadG;
                        System.out.println("Precio por gaseosa: S/ 5");
                    } else {
                        System.out.println("Cantidad incorrecta.");
                    }
                    break;
                case 6:
                    if (butaca == 0) {
                        System.out.println("Primero compra una butaca.");
                    } else {
                        int total = 12 + (palomitas * 8)
                                + (gaseosas * 5);
                        System.out.println("===== BOLETO DE CINE =====");
                        System.out.println("Cine: KENDAY");
                        System.out.println("Butaca: " + butaca);
                        System.out.println("Palomitas: " + palomitas);
                        System.out.println("Gaseosas: " + gaseosas);
                        System.out.println("Total: S/ " + total);
                        System.out.println("Gracias por su compra.");
                    }
                    break;

                case 7:
                    System.out.println("Gracias por visitar CINE KENDAY.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);

        teclado.close();
    }
}

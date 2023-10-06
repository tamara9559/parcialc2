public class main {
    public static void main(String[] args) {
                peluqueria corte = peluqueria.CORTE;
                peluqueria uñas = peluqueria.UÑAS;
                peluqueria tinte = peluqueria.TINTE;

                System.out.println("\n Descripción del servicio de corte:");
                corte.mostrarDescripcionServicio();
                System.out.println("\nDescripción del servicio de uñas:");
                uñas.mostrarDescripcionServicio();
                System.out.println("\nDescripción del servicio de tinte:");
                tinte.mostrarDescripcionServicio();
    }
}

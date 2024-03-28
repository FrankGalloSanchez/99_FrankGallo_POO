package S03_R1;

public class S3_R5_Switch {

    public static void main(String[] args) {

        int a = 12;
        switch (a) {
            case 1:
                System.out.println("Opcion 1");
                break;
            case 2:
                System.out.println("Opcion 2");
                break;
            default:
                System.out.println("No se encontraron las Opciones");
                break;
        }

        String b = "pantalon";

        switch (b) {
            case "polo":
                System.out.println("estas comprando un polo");
                break;
            case "short":
                System.out.println("estas comprando un short");
                break;
            case "chompa":
                System.out.println("estas comprando una chompa");
                break;
            default:
                System.out.println("no encontre las prenda");
                break;
        }
    }
}

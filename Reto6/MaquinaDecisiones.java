package Reto6;

public class MaquinaDecisiones {


    public static void decisiones(String decision) {
        switch (decision.toUpperCase()) {
            case "SALUDAR":
                System.out.println("¡Saludos, viajero del tiempo y del código!");
                break;
            case "DESPEDIR":
                System.out.println("Que los bits te acompañen, hasta la próxima misión.");
                break;
            case "CANTAR":
                System.out.println("01010101");
                break;
            case "DANZAR":
                System.out.println("Girando en modo fiesta.");
                break;
            case "BROMEAR":
                System.out.println("¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio...");
                break;
            case "GRITAR":
                System.out.println("¡¡¡ALERTA DE STACK OVERFLOW!!!");
                break;
            case "SUSURRAR":
                System.out.println("Shhh... los bugs están dormidos.");
                break;
            case "ANALIZAR":
                System.out.println("Analizando datos... resultado: ¡Eres increíble programando!");
                break;
            default:
                System.out.println("Decisión no reconocida.");
                break;
        }
    }

    public static void main(String[] args) {
        decisiones("SALUDAR");
    }

    
}

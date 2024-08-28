package mundo;

public class PruebaManualAlcancia {
    public static void main(String[] args) {
        // Crear instancia de Alcancia
        Alcancia alcancia = new Alcancia();

        // Agregar monedas y verificar cantidades
        alcancia.agregarMoneda50();
        alcancia.agregarMoneda100();
        alcancia.agregarMoneda200();
        alcancia.agregarMoneda500();
        alcancia.agregarMoneda1000();

        // Verificar las cantidades de monedas
        System.out.println("Monedas de 50: " + alcancia.darNumeroMonedas50());
        System.out.println("Monedas de 100: " + alcancia.darNumeroMonedas100());
        System.out.println("Monedas de 200: " + alcancia.darNumeroMonedas200());
        System.out.println("Monedas de 500: " + alcancia.darNumeroMonedas500());
        System.out.println("Monedas de 1000: " + alcancia.darNumeroMonedas1000());

        // Verificar el total de dinero
        System.out.println("Total en la alcancía: " + alcancia.calcularTotalDinero());

        // Romper la alcancía y verificar el estado
        alcancia.romperAlcancia();
        System.out.println("Estado de la alcancía: " + alcancia.darEstado());
    }
}
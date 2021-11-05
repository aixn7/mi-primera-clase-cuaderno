public class Cuaderno {
    //Color de las tapas del cuaderno
    private String colorTapas;
    //Numero de hojas del cuaderno
    private int numeroHojas;
    //Indica si el cuaderno esta abierto
    private boolean abierto;
    
    /** Crea el cuaderno con el color y numero de hojas dado.
     * El cuaderno comienza siempre cerrado.
     */
    public Cuaderno (String color, int hojas) {
        colorTapas = color;
        numeroHojas = hojas;
        abierto = false;
    }
    
    //Devuelve el color de las tapas
    public String getColorTapas() {
        return colorTapas;
    }
    
    //Devuelve el numero de hojas
    public int getnumeroHojas() {
        return numeroHojas;
    }
    
    //Devuelve si esta abierto
    public boolean getSiAbierto() {
        return abierto;
    }
    
    //Establece el nuevo color de las tapas
    public void setColorTapas(String color) {
        colorTapas = color;
    }
    
    //Arranca un numero de hojas
    public void arrancarHojas(int hojasArrancadas) {
        numeroHojas = numeroHojas - hojasArrancadas;
    }
    
    //Alterna entre abierto y cerrado segun este el cuaderno
    public void usarCuaderno() {
        abierto = !abierto;
    }
    
    //Imprime en pantalla el estado del cuaderno
    public void imprimeDetalles() {
        System.out.println ("Color de las tapas: " + colorTapas + 
        " | Número de hojas: " + numeroHojas + " | Abierto: " + abierto);
    }
    
    //Devuelve el estado del cuaderno
    public String verEstado() {
        return "Color de las tapas: " + colorTapas + 
        " | Número de hojas" + numeroHojas + " | Abierto: " + abierto;
    }
}
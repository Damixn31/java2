public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = "trigo tres tristes tigres tragan trigotrigo en un trigaltrigo";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;


        int cantidad = 0;
        char letra = 'g';
        buscar:
        for(int i = 0; i <= maxFrase;) { // el <= para que nos incluya el ultima frase
            int k = i;
            for(int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i = i +maxPalabra; // no cambia el funcionamiento, sino que recorre menos veces y es una forma mas optimizada del for
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra '"+palabra+"' en la frase");
    }
}

import java.lang.StringBuilder;

/**
 * La clase Solution contiene el método toCamelCase
 *
 * @author JorgeAgrasoReyes
 *
 * @version 17/03/2025
 */
class Solution{

    /**
     * Este método recibe una String(ej: the-stealth-warrior, ej2: The_Stealth_Warrior) y devuelve una String
     * de forma camelCase(ej: tHeStealthWarrior, ej2: TheStealthWarrior).
     *
     * @param s Recibe un parámtro de tipo String.
     *
     * @return Devuelve un parámetro de tipo String.
     */

    static String toCamelCase(String s){
        StringBuilder resultado = new StringBuilder(s);
        for (int i = 0; i < resultado.length(); i++){
            if (resultado.charAt(i) == '-' || resultado.charAt(i) == '_'){
                resultado.setCharAt(i + 1, Character.toUpperCase(resultado.charAt(i + 1)));
                resultado.deleteCharAt(i);

            }

        }

        return resultado.toString();
    }
}
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<String, String> dictionary;
        static {
// Lugar para adicionar mais palavras
            dictionary = new HashMap<>();
                dictionary.put("hello", "olá");
                    dictionary.put("how are you", "como você está");
                        dictionary.put ("friend", "amigo");
    }
    public static String translate(String text) {
        StringBuilder translatedText = new StringBuilder();
            String[] words = text.toLowerCase().split(" ");

        for (String word : words) {
            if (dictionary.containsKey(word)) {
                translatedText.append(dictionary.get(word)).append(" ");
// Caso não tenha, ela irá permancer a mesma
            } else {
                translatedText.append(word).append(" ");
            }
        }
        return translatedText.toString().trim();
    }
    public static void main(String[] args) {
        String textoToTranslate = "Friend";
            String translatedText = translate(textoToTranslate);

        System.out.println("Texto original: " + textoToTranslate);
        System.out.println("Texto traduzido: " + translatedText);
    }
}

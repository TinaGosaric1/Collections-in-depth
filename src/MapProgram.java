import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "A compiled high level, object-oriented, platform independent language.");
        languages.put("Python", "An interpreted, object-oriented, high-level programming language with dynamic semantics.");
        languages.put("Algol", "An algorithmic language.");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness.");

        System.out.println(languages.get("Java"));
        languages.put("Java","this course is about java");
        System.out.println(languages.get("Java")); //the first value is overriden, because we entered the same key

        if(languages.replace("Lisp", "Therein lies madness.", "A functional programming language with imperative features.")){
            System.out.println("Lisp was replaced");
        }
            else {
                System.out.println("Lisp was not replaced");
            }

        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
    }
}

import java.util.LinkedList;
import java.util.List;

public class Phone {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
   static List<String> letterCombinations(String digits) {
        // Output LL that will store.... well our output
        LinkedList<String> output = new LinkedList<>();
        
        // if the String given is empty then just return an empty LL
        if(digits.length() == 0) return output;
        
        // this String array contains all the possilbe characters
        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        // Recursive Function that will magically give us all the solutions
        magicFunction(output, digits, "", 0, mapping);
        return output;
    }
    
    // Magic function that gives us the values
     static void magicFunction(List<String> output, String digits, String current, int index, String[] mapping){
         // base case, if the index reaches the end of the String digits, then add the current String to the output LL
         if(index == digits.length()){
             output.add(current);
             return;
         }
         // This string will keep the numeric values of the string numbers
         String letters = mapping[digits.charAt(index) - '0'];
         for(int i = 0; i < letters.length(); i++){
             // everything will remain same, we just increment index and add the current letter to the string
             magicFunction(output, digits, current + letters.charAt(i), index + 1, mapping);
         }
     }
}

package concepts;

public class CharacterClassApis {
    public static void main(String[] args) {
        String string = "testString23423##23";

        Character ch = Character.valueOf('c');



        for(char c : string.toCharArray()){
            Character.isLetterOrDigit(c);
        }
    }
}

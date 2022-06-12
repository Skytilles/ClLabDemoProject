public class ClLab implements ClLabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public String setString(String string) {
        myString = string;
        return string;
    }

    @Override
    public String detectCapitalUse() {

        for(int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);
            Character.isUpperCase(ch);
        }
        return myString;
    }

}


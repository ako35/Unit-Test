package day3;

public class C02_FirstTwoLastCharsSame {

    public boolean ilkIkiVeSonIkiKarakterAyniMi(String str){
        if (str.length()<=2){
            return true;
        }
        if (str.substring(0,2).equals(str.substring(str.length()-2))){
            return true;
        }
        return false;
    }

    public boolean checkIfFirstTwoLastTwoAreSame(String str){
        if (str.length()<=1){
            return false;
        }
        if (str.length()==2) {
            return true;
        }
        String firstTwoChars=str.substring(0,2);
        String lastTwoChars=str.substring(str.length()-2);
        return firstTwoChars.equals(lastTwoChars);
    }

}

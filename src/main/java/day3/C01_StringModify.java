package day3;

public class C01_StringModify {

    String str="ABA";
    public String ilkIkiHarfindeAvarsaSil(String str){

        String str2=str.substring(0,2);
        if (str2.contains("A")){
            str= str2.replace("A","")+str.substring(2);
        }
        return str;
    }

    public String deleteIfItIsInFirstTwoPosition(String str){
        if (str.length()<=2){
            return str.replace("A","");
        }
        String firstTwoChars=str.substring(0,2);
        String afterFirstTwoChars=str.substring(2);
        return firstTwoChars.replaceAll("A","")+afterFirstTwoChars;
    }

}

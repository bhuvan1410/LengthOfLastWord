public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        s=s.trim();
        int lastSpaceIndex = s.lastIndexOf(' ');
        int stringLength = s.length();
        int lastWordLength= stringLength - lastSpaceIndex-1;

        return lastWordLength;


    }

    public static void main(String[] args){
        String firstInput = "Hello World";
        String secondInput = "   fly me   to   the moon  ";
        String thirdInput="luffy is still joyboy";

        System.out.println("The length of the last word in "+firstInput+" is "+lengthOfLastWord(firstInput));
        System.out.println("The length of the last word in "+secondInput+" is "+lengthOfLastWord(secondInput));
        System.out.println("The length of the last word in "+thirdInput+" is "+lengthOfLastWord(thirdInput));
    }


}

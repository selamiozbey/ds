package AVariousDataStructure;

public class EncryptionHackerRank {

    static String encryption(String s) {

        String bs = s;//s.replaceAll(" ", "");

        int row = (int) Math.round(Math.sqrt(bs.length()));
        int col = row;
        if ((row *row) < bs.length()) {
            col++;
        }

        String encS = "";
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                encS = encS + bs.substring((i*col)+j,(i*col)+j+1);
                if((i*col)+j+col >= bs.length()) break;
            }
            encS = encS + " ".toString();
        }

        return encS;
    }


    public static void main(String[] args) {
        String s = new String("chillout");
        if(s.length() > 81 || s.length() < 1)
            return;
        if(!s.matches("[a-z]+"))
            return;
/*        if(Pattern.matches("[a-zA-Z]+", myString))
        {
            System.out.println("Yep!");
        }*/
        encryption(s);
    }
}

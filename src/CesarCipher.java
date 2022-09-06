public class CesarCipher {

    private char[] abecedario  = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    , 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}; //52 letters from 0 to 51 pos
    private char cipherText[];
    private char [] plainText;
    private char deCipherText[];
    private int position = 0;

    CesarCipher(){

    }

    // Saving the CipherText in the array
    public void saveText(String word){
        plainText = new char[word.length()];

        for (int i = 0; i < word.length(); i++){
            plainText[i] = word.charAt(i);
        }
    }


    // To get the position of any letter in the variable abecedario
    int getPosAbc(char letter){
        for (int i = 0; i <= 51; i++){
            if (abecedario[i] == letter){
                return i;
            }
        }

        return 1000;
    }

    public void encryptingText(int amount){
        cipherText = new char[plainText.length];
        position = amount;
        int posABC = 0;
        int aux;


        for (int i = 0; i < plainText.length; i++){
            posABC = getPosAbc(plainText[i]);

            if (posABC != 1000){
                if ((posABC + position) <= 51){
                    cipherText[i] = abecedario[posABC+position];
                }else {
                    aux = posABC + position;
                    while (aux > 5){
                        aux -= 50;
                    }
                    cipherText[i] = abecedario[aux];
                }
            }else {
                cipherText[i] = plainText[i];
            }

        }
    }

    public String displayCipher(){
        String cipherTextS = "";
        for (int i = 0; i < cipherText.length; i++){
            cipherTextS += cipherText[i];
        }

        return cipherTextS;
    }
}



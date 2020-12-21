import java.math.BigInteger;

import static java.lang.Math.pow;

public class User {


    private int n, e;
    private int d;

    // генерация юзерами себе ключей по протоколу RSA
    public User(){
        KeyGeneration keyGen = new KeyGeneration();
        n = keyGen.getN();
        e = keyGen.getE();
        d = keyGen.getD();
        System.out.println("n = " + n + "; e = " + e + "; d = " + d);
    }

    public int getN() {
        return n;
    }

    public int getE() {
        return e;
    }

    // организация шифрования сообщений от дного пользователя к другому
    public int encryptMessageFor(User user2, int message){
        BigInteger encryptedMessage = new BigInteger(String.valueOf(message));
        BigInteger E = new BigInteger(String.valueOf(user2.getE()));
        BigInteger N = new BigInteger(String.valueOf(user2.getN()));
        encryptedMessage = encryptedMessage.modPow(E, N);
        return encryptedMessage.intValue();
    }
    // организация расшифровки сообщения при получении от пользователя
    public int decryptMessage (int encryptedMessage){
        BigInteger decryptedMessage = new BigInteger(String.valueOf(encryptedMessage));
        BigInteger D = new BigInteger(String.valueOf(d));
        BigInteger N = new BigInteger(String.valueOf(n));
        decryptedMessage = decryptedMessage.modPow(D, N);
        return decryptedMessage.intValue();
    }

}

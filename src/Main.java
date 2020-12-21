public class Main {

    public static void main(String[] args) {

  // создаем двух пользователей

        System.out.println("Tanya");
        User Tanya = new User();
        System.out.println("Jim");
        User Jim = new User();

        // в первом случае

        int messageSent = Jim.encryptMessageFor(Tanya, 7);  // джим зашифровал сообщение тане
        System.out.println("зашифрованое сообшение: " + messageSent);
        int decryptedMessage = Tanya.decryptMessage(messageSent); // таня разшифровала сообщение
        System.out.println("разшифрованное сообщение: " + decryptedMessage);

        messageSent = Tanya.encryptMessageFor(Jim, 160); // в точности да наооборот
        System.out.println("зашифрованое сообшение: " + messageSent);
        decryptedMessage = Jim.decryptMessage(messageSent);
        System.out.println("разшифрованное сообщение: " + decryptedMessage);
    }

}

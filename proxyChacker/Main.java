import java.io.*;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        String [] mass = new String[10];
        int ii = 0;
        boolean goodIP = false; // ввели признак "хорошего" IP
        try {
            FileInputStream fis = new FileInputStream("C:/java/ip.txt");
            int i;
            String resultIp = "";
            while ((i = fis.read()) != -1) {
                if (i == 13) continue; // Символ возврата каретки
                else if (i == 10) { // Символ переноса строки
                    String[] resultArray = resultIp.split(":");
                    String ip = resultArray[0];
                    int port = Integer.parseInt(resultArray[1]);
                    checkProxy(ip, port); // здесь мы имеем строку "ip:port" !
                    if (goodIP=true) mass[ii] = ip;
                        else System.out.println("Добавили в массив :"+mass[ii]+" под номером "+ii);
                        ii = ii + 1;

                    System.out.println(resultIp);
                    resultIp = "";
                } else if (i == 9) {
                    resultIp += ":";
                } else {
                    resultIp += (char) i;
                }
            }
//            saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static boolean checkProxy(String ip, int port) {     // перевели метод в тип boolean, чтобы вернул goodIP (true или false)
    public static void checkProxy(String ip, int port) {      // это старый метод типа void
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
            URL url = new URL("https://vozhzhaev.ru/test.php");
            URLConnection connection = url.openConnection(proxy);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            connection.getInputStream()));

            System.out.println("ip: " + ip + ":" + port + " рабочий");
            saveFile(ip);
//            return true;

            in.close();

        } catch (Exception e) {
            System.out.println("ip: " + ip + ":" + port + " НЕ РАБОТАЕТ");
//            return false;

        }
    }

    public static void saveFile(String ip) throws IOException {
        String str=ip;
        FileOutputStream fos = new FileOutputStream("C:/java/good_ip.txt");
        byte[] buffer = str.getBytes(StandardCharsets.UTF_8);
        fos.write(buffer);
        System.out.println("Записали good_ip.txt");
    }
}

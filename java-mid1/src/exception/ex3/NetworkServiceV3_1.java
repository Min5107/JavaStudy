package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

import java.net.ConnectException;

public class NetworkServiceV3_1 {
    public void sendMessage(String data){
        String address = "127.0.0.1";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        }catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소 : " + e.getAddress() + " , 메세지 : " + e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("[전송 오류] 주소 : " + e.getSendData() + " , 메세지 : " + e.getMessage());
        }  finally{
            client.disconnect();
        }


    }
}

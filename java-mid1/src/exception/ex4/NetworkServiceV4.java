package exception.ex4;

public class NetworkServiceV4 {
    public void sendMessage(String data){
        String address = "127.0.0.1";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        }finally{
            client.disconnect();
        }


    }
}

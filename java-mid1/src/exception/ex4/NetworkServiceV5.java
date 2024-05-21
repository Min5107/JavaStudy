package exception.ex4;

public class NetworkServiceV5 {
    public void sendMessage(String data){
        String address = "127.0.0.1";

        try(NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data);
            client.connect();
            client.send(data);
        } catch (Exception e) {
            System.out.println();
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }


    }
}
package exception.ex1;


public class NetworkServiceV1_3 {
    public void sendMessage(String data) {
        String address = "127.0.0.1";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        String connectResult = client.connect();
        //결과가 성공이 아니다 -> 오류다
        if (isSuccess(connectResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
        } else{
            String sendResult = client.send(data);
            if (isSuccess(sendResult)){
                System.out.println("[전송 오류 발생] 오류 코드 : " + sendResult);
            }
        }

        client.disconnect();

    }

    private static boolean isSuccess(String connectResult) {
        return !connectResult.equals("success");
    }
}

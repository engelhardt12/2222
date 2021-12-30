package server;

import java.io.DataOutputStream;

public class StringMessageHandler  implements  Runnable{


    private DataTnputStream is;
    private DataOutputStream os;


    public  StringMessageHandler (Socket socket)  throws IOExeption {
        is = new DataInputStreame(socket.getInputStream());
        os = new DataOutputStream(socket.getOutStream());

    }


    @Override
    public void run(){
        try{

        }

while (true){
    String message = is. readUTF();
    System.out.println("received: +message")
    os.writeUTF(message);
    os.flush();

}
    }catch (Exception e){
        e.printStackTrace();
    }
}

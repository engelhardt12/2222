package client;

import javafx.application.Platform;
import javafx.fxml.Initializable;

import java.awt.event.ActionEvent ;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ClientControler implements Initializable  {
    public ListView<String> listView;
    public TextField textField;

    private DataInputStream is;
    ptivate DataInputStream os;
    public void sendMessage(ActionEvent actionEvent) {
        String message = textField.getText();
        os.writeUTF(message);
        os.flush();
        textField.clear();
    }

    private void read() {
        while (true) {
            String message= is.readUTF();
            Platform.runLater() -> {
                listView.getItems().add(message);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Override
    public void initialize(URL location, ResourceBundle recources)
    try {

Socket socket = new Socket( proxy: "localHost" port:8189);
is = new DataInputStream(socket.getInputStream());
os = new DataOutputStream(socket.getInputStream());
Thread readThread = new Thread (This::read);
readThread.setDaemon(true);
readThread.start();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

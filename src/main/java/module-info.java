module com.chatroom.serverclientguifx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.chatroom.serverclientguifx to javafx.fxml;
    exports com.chatroom.serverclientguifx;
}
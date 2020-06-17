
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class clientApp {
    static String userLogin;
    static String userMessage;
    static JSONObject singlePost = new JSONObject();

    public static void main(String[] args) throws Exception {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Type your nickname");
    clientApp.userLogin = userInput.nextLine();


    while (1==1){
        System.out.println("Write your message:");
        clientApp.userMessage = userInput.nextLine();
        writeJsonSimpleDemo();
    }

}

    public static void writeJsonSimpleDemo() throws Exception {
        JSONArray post = new JSONArray();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        post.add(formatter.format(date));
        post.add(userLogin);
        post.add("says: "+userMessage);

        clientApp.singlePost.put("", post);


        Files.write(Paths.get("board.json"), singlePost.toJSONString().getBytes());
}


}

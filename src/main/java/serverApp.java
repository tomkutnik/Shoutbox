import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Scanner;

public class serverApp{
    static String fullJson;
    public static void main(String[] args) throws Exception {
        while (1==1) {
            JSONObject jsonObject = (JSONObject) readFromJson();
            fullJson = fullJson +"\n" + jsonObject;
            System.out.println(fullJson);
            Scanner userInput = new Scanner(System.in);
            System.out.println("Here should be observer, just press enter ;)");
            clientApp.userMessage = userInput.nextLine();
        }
    }

    public static Object readFromJson() throws Exception {
        FileReader reader = new FileReader("board.json");
        JSONParser jsonParser = new JSONParser();
        return jsonParser.parse(reader);
    }
}


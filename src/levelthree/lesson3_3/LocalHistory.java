package levelthree.lesson3_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class LocalHistory {

    private static final String PATH_FILE = String.format("D:\\IdeaProjects\\GeekBrainsJava\\src\\levelthree\\lesson3_3\\History.txt", File.separator, File.separator);
    private static final File FILE = new File(PATH_FILE);
    private static final int COUNT_ROWS = 104;

    private File chatHistory;

    private LocalHistory() {
    }

    public static void saveHistory(String chat) {
        try {
            FILE.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter writer = new FileWriter(FILE, false)) {
            writer.write(filterChat(chat));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String downloadHistory() {
        if (!FILE.exists()) return "";

        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE))) {
            String str = reader.readLine();
            while (str != null) {
                stringBuilder.append(str).append("\n");
                str = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    private static String filterChat(String chat) {
        String[] chats = chat.split("\n");
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.stream(chats).filter(s -> s.contains(":->"))
                .skip(chats.length > COUNT_ROWS ? chats.length - COUNT_ROWS : 0)
                .forEach(s -> stringBuilder.append(s).append("\n"));
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
    public void loadChatHistory() {
        ArrayList<String> chatHistoryList = new ArrayList<>();

        if(chatHistory.exists()) {
            try(BufferedReader chatHistoryReader = new BufferedReader(new FileReader(chatHistory))){
                String str = "";
                while((str = chatHistoryReader.readLine()) != null){
                    chatHistoryList.add(str);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if(chatHistoryList.size() > 100){
            for(int i = chatHistoryList.size() - 101; i < chatHistoryList.size() - 1; i++) {
                System.out.println(chatHistoryList.get(i));
            }
        } else {
            for (String s : chatHistoryList) {
                System.out.println(s);
            }
        }
    }
}

package Backend;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class RequestBookBackend {
    private static final String TEXTBOOK_SPREADSHEET_CSV = "src/Database/TextbookSpreadsheet.csv";
    private static final String TEXTBOOK_PRIORITY_QUEUE_CSV = "src/Database/TextbookPriorityQueue.csv";

    public boolean requestBook(String bookName, String purpose, int userId) {
        try (BufferedReader br = new BufferedReader(new FileReader(TEXTBOOK_SPREADSHEET_CSV))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] book = line.split(",");
                if (book.length >= 2 && book[1].trim().equalsIgnoreCase(bookName)) {
                    updatePriorityQueue(bookName, purpose, userId);
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void updatePriorityQueue(String bookName, String purpose, int userId) {
        try (BufferedReader br = new BufferedReader(new FileReader(TEXTBOOK_PRIORITY_QUEUE_CSV))) {
            StringBuilder updatedContent = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String bookNameInFile = data[1].trim();
                if (bookNameInFile.equalsIgnoreCase(bookName)) {
                    if (purpose.equalsIgnoreCase("Course Teaching")) {
                        data[2] += " " + userId;
                    } else {
                        data[3] += " " + userId;
                    }
                }
                updatedContent.append(String.join(",", data)).append("\n");
            }
            try (FileWriter writer = new FileWriter(TEXTBOOK_PRIORITY_QUEUE_CSV)) {
                writer.write(updatedContent.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





}

package UI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class BookSearchStudent extends JFrame {

    public BookSearchStudent() {
        createUI();
    }

    private void createUI() {
        setTitle("Book Search");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 400);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

        // header
        JPanel headerPanel = new JPanel(new FlowLayout());
        headerPanel.add(new Button("Back"));
        headerPanel.add(new JLabel("Search for a book"));
        add(headerPanel);
        //headerPanel.setBorder(new EmptyBorder(100,50,10,50));

        // search bar
        JPanel searchPanel = new JPanel(new FlowLayout());
        JTextField searchBar = new JTextField();
        searchBar.setPreferredSize(new Dimension(300, searchBar.getPreferredSize().height));
        searchPanel.add(searchBar);
        add(searchPanel);

        // search results
        JPanel resultsPanel = new JPanel();
        resultsPanel.setLayout(new BoxLayout(resultsPanel, BoxLayout.Y_AXIS));
        resultsPanel.setBorder(new EmptyBorder(25,150,25,150));
        for (int i = 1; i <= 5; i++) { // example results
            resultsPanel.add(new JLabel("book " + i));
            resultsPanel.add(new Button("Add to cart"));
        }
        add(resultsPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BookSearchStudent();
            }
        });
    }
}

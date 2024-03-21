package UI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BookSearchStudent extends JFrame {

    private JTextField searchBar; // Reference to the search bar for input
    private JPanel resultsPanel; // Panel to display search results, acting as the "observer" of search

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

    // Method to perform search and update results
    private void performSearch(String query) {
        // Example search operation, updates resultsPanel
        resultsPanel.removeAll(); // Clear previous results
        for (int i = 1; i <= 5; i++) { // Simulated search results
            resultsPanel.add(new JLabel("Result for " + query + ": book " + i));
            JButton addToCartButton = new JButton("Add to cart");
            // Action listener for addToCartButton can be added here
            resultsPanel.add(addToCartButton);
        }
        resultsPanel.revalidate();
        resultsPanel.repaint();
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

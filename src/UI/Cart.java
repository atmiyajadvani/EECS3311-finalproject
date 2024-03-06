package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cart extends JFrame {
    private DefaultListModel<Book> bookListModel;
    private JList<Book> bookList;
    private JTextField titleField;
    private JTextField authorField;




    public Cart() {
        setTitle("Cart");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        bookListModel = new DefaultListModel<>();
        bookList = new JList<>(bookListModel);

        JScrollPane scrollPane = new JScrollPane(bookList);
        add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));

        JLabel titleLabel = new JLabel("Title:");
        titleField = new JTextField();
        JLabel authorLabel = new JLabel("Author:");
        authorField = new JTextField();

        JButton addButton = new JButton("Add Book");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addBook();
            }
        });

        JButton removeButton = new JButton("Remove Book");
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeBook();
            }
        });

        inputPanel.add(titleLabel);
        inputPanel.add(titleField);
        inputPanel.add(authorLabel);
        inputPanel.add(authorField);
        inputPanel.add(addButton);
        inputPanel.add(removeButton);

        add(inputPanel, BorderLayout.SOUTH);
    }

    private void addBook() {
        String title = titleField.getText();
        String author = authorField.getText();

        if (!title.isEmpty() && !author.isEmpty()) {
            Book newBook = new Book(title, author);
            bookListModel.addElement(newBook);

            // Clear input fields after adding the book
            titleField.setText("");
            authorField.setText("");
        }
    }

    private void removeBook() {
        int selectedIndex = bookList.getSelectedIndex();
        if (selectedIndex != -1) {
            bookListModel.removeElementAt(selectedIndex);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Cart().setVisible(true);
            }
        });
    }
}

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}

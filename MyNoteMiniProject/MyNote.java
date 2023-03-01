package MyNoteMiniProject;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class MyNote extends JFrame {
    private JTextArea noteArea;
    private Connection conn;
    private PreparedStatement saveStatement;
    private PreparedStatement openStatement;
    private final String dburl = "jdbc:mysql://localhost:3306/mynotedb";
    private final String dbuser = "root";
    private final String dbpassword = "akshatdasondhi";

    public MyNote() {
        super("MyNote");
        setLayout(new BorderLayout());
        noteArea = new JTextArea();
        noteArea.setBackground(Color.CYAN);
        noteArea.setFont(new Font("Segoe Script", Font.BOLD, 28));
        JScrollPane scrollPane = new JScrollPane(noteArea);
        add(scrollPane, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(new SaveListener());
        buttonPanel.add(saveButton);
        JButton openButton = new JButton("Open");
        openButton.addActionListener(new OpenListener());
        buttonPanel.add(openButton);
        add(buttonPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dburl, dbuser, dbpassword);
            saveStatement = conn.prepareStatement("INSERT INTO notes (note) VALUES (?)");
            openStatement = conn.prepareStatement("SELECT note FROM notes WHERE id = ?");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private class SaveListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                String note = noteArea.getText();
                saveStatement.setString(1, note);
                saveStatement.executeUpdate();
                JOptionPane.showMessageDialog(MyNote.this, "Note saved successfully.");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private class OpenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                String idString = JOptionPane.showInputDialog(MyNote.this, "Enter note ID:");
                int id = Integer.parseInt(idString);
                openStatement.setInt(1, id);
                ResultSet rs = openStatement.executeQuery();
                if (rs.next()) {
                    String note = rs.getString("note");
                    System.out.println(note);
                    noteArea.setText(note);
                } else {
                    JOptionPane.showMessageDialog(MyNote.this, "Note not found.");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new MyNote();
    }
}



// DataBase MySQL Code :
// show databases;
// create table notes(
// 	id int not null auto_increment,
//     name varchar(1000) not null,
//     primary key(id)
// );

// select * from notes 
package Program.AddressBook;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class AddressBookApp extends JFrame{
    private JTable contactTable;
    private DefaultTableModel tableModel;
    private ArrayList<Contact> contacts;

    public void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {

                this.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public AddressBookApp() {
        contacts = new ArrayList<>();
        initialize();
    }

    private void initialize() {
        this.setTitle("Address Book");
        this.setSize(900, 600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel nameLabel = new JLabel("Tên:");
        JTextField nameField = new JTextField(15);
        JLabel phoneLabel = new JLabel("Số Đth:");
        JTextField phoneField = new JTextField(15);
        JLabel emailLabel = new JLabel("Gmail:");
        JTextField emailField = new JTextField(15);

        JButton addButton = new JButton("Thêm liên hệ");
        JButton updateButton = new JButton("Cập nhật");
        JButton deleteButton = new JButton("Xóa liên hệ");

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(phoneLabel);
        panel.add(phoneField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(addButton);
        panel.add(updateButton);
        panel.add(deleteButton);

        this.add(panel, BorderLayout.NORTH);

        // Table to show contacts
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Tên");
        tableModel.addColumn("Số Điện Thoại");
        tableModel.addColumn("Gmail");
        contactTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(contactTable);
        this.add(scrollPane, BorderLayout.CENTER);

        // Event listeners
        addButton.addActionListener(e -> {
            String name = nameField.getText();
            String phone = phoneField.getText();
            String email = emailField.getText();

            if (!name.isEmpty() && !phone.isEmpty() && !email.isEmpty()) {
                Contact newContact = new Contact(name, phone, email);
                contacts.add(newContact);
                tableModel.addRow(new Object[]{name, phone, email});
                clearFields(nameField, phoneField, emailField);
            } else {
                JOptionPane.showMessageDialog(this, "Tất cả thông tin đều phải điền!");
            }
        });

        updateButton.addActionListener(e -> {
            int selectedRow = contactTable.getSelectedRow();
            if (selectedRow >= 0) {
                String name = nameField.getText();
                String phone = phoneField.getText();
                String email = emailField.getText();

                if (!name.isEmpty() && !phone.isEmpty() && !email.isEmpty()) {
                    Contact contact = contacts.get(selectedRow);
                    contact.setName(name);
                    contact.setPhone(phone);
                    contact.setEmail(email);
                    tableModel.setValueAt(name, selectedRow, 0);
                    tableModel.setValueAt(phone, selectedRow, 1);
                    tableModel.setValueAt(email, selectedRow, 2);
                    clearFields(nameField, phoneField, emailField);
                } else {
                    JOptionPane.showMessageDialog(this, "Tất cả thông tin đều phải điền!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Chọn 1 liên hệ để cập nhật!");
            }
        });

        deleteButton.addActionListener(e -> {
            int selectedRow = contactTable.getSelectedRow();
            if (selectedRow >= 0) {
                contacts.remove(selectedRow);
                tableModel.removeRow(selectedRow);
            } else {
                JOptionPane.showMessageDialog(this, "Chọn 1 liên hệ để xóa!");
            }
        });

        contactTable.getSelectionModel().addListSelectionListener(e -> {
            int selectedRow = contactTable.getSelectedRow();
            if (selectedRow >= 0) {
                String name = (String) tableModel.getValueAt(selectedRow, 0);
                String phone = (String) tableModel.getValueAt(selectedRow, 1);
                String email = (String) tableModel.getValueAt(selectedRow, 2);

                nameField.setText(name);
                phoneField.setText(phone);
                emailField.setText(email);
            }
        });
    }

    private void clearFields(JTextField nameField, JTextField phoneField, JTextField emailField) {
        nameField.setText("");
        phoneField.setText("");
        emailField.setText("");
    }
}
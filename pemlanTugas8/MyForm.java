import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyForm extends JFrame implements ActionListener {

    private JTextField namaField, tglLahirField, noDaftarField, telpField, emailField;
    private JTextArea alamatArea;
    private JButton submitButton;

    public MyForm() {
        setTitle("Form Daftar Ulang Mahasiswa Baru");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10);
        gbc.anchor = GridBagConstraints.WEST;

        // Komponen
        JLabel namaLabel = new JLabel("Nama Lengkap");
        namaField = new JTextField(20);

        JLabel tglLahirLabel = new JLabel("Tanggal Lahir MM/DD/YYYY");
        tglLahirField = new JTextField(20);

        JLabel noDaftarLabel = new JLabel("Nomor Pendaftaran");
        noDaftarField = new JTextField(20);

        JLabel telpLabel = new JLabel("No. Telp");
        telpField = new JTextField(20);

        JLabel alamatLabel = new JLabel("Alamat");
        alamatArea = new JTextArea(3, 20);
        JScrollPane scrollPane = new JScrollPane(alamatArea);

        JLabel emailLabel = new JLabel("E-mail");
        emailField = new JTextField(20);

        submitButton = new JButton("submit");
        submitButton.addActionListener(this);

        // Baris 0 - Nama Lengkap
        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(namaLabel, gbc);
        gbc.gridx = 1;
        panel.add(namaField, gbc);

        // Baris 1 - Tanggal Lahir
        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(tglLahirLabel, gbc);
        gbc.gridx = 1;
        panel.add(tglLahirField, gbc);

        // Baris 2 - Nomor Pendaftaran
        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(noDaftarLabel, gbc);
        gbc.gridx = 1;
        panel.add(noDaftarField, gbc);

        // Baris 3 - No. Telp
        gbc.gridx = 0; gbc.gridy = 3;
        panel.add(telpLabel, gbc);
        gbc.gridx = 1;
        panel.add(telpField, gbc);

        // Baris 4 - Alamat
        gbc.gridx = 0; gbc.gridy = 4;
        panel.add(alamatLabel, gbc);
        gbc.gridx = 1;
        panel.add(scrollPane, gbc);

        // Baris 5 - Email
        gbc.gridx = 0; gbc.gridy = 5;
        panel.add(emailLabel, gbc);
        gbc.gridx = 1;
        panel.add(emailField, gbc);

        // Baris 6 - Tombol Submit
        gbc.gridx = 1; gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(submitButton, gbc);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (namaField.getText().isEmpty() || tglLahirField.getText().isEmpty() || 
            noDaftarField.getText().isEmpty() || telpField.getText().isEmpty() || 
            alamatArea.getText().isEmpty() || emailField.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi ya", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, 
                "Apakah anda yakin data yang Anda isi sudah benar?", 
                "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);

        if (confirm == JOptionPane.OK_OPTION) {
            showDataWindow();
        }
    }

    private void showDataWindow() {
        JFrame dataFrame = new JFrame("Data Mahasiswa");
        dataFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dataFrame.setSize(400, 300);
        dataFrame.setLayout(new BorderLayout());

        JTextArea dataArea = new JTextArea();
        dataArea.setEditable(false);
        dataArea.setFont(new Font("Arial", Font.PLAIN, 12));

        // Format output
        StringBuilder sb = new StringBuilder();
        sb.append("Nama           : ").append(namaField.getText()).append("\n");
        sb.append("Tanggal Lahir  : ").append(tglLahirField.getText()).append("\n");
        sb.append("No.Pendaftaran : ").append(noDaftarField.getText()).append("\n");
        sb.append("No.Telp        : ").append(telpField.getText()).append("\n");
        sb.append("Alamat         : ").append(alamatArea.getText()).append("\n");
        sb.append("E-mail         : ").append(emailField.getText()).append("\n");

        dataArea.setText(sb.toString());

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.BLUE),
                "Data Mahasiswa",
                0, 0, new Font("Arial", Font.BOLD, 14)
        ));
        panel.add(dataArea, BorderLayout.CENTER);

        dataFrame.add(panel, BorderLayout.CENTER);
        dataFrame.setLocationRelativeTo(null);
        dataFrame.setVisible(true);
    }

   
}

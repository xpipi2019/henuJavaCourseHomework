import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 * @author XPIPI
 */
public class S9_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        // 窗体退出事件
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout());

        JPanel filePanel = new JPanel(new BorderLayout(5, 5));
        JLabel fileLabel = new JLabel("File:");
        JTextField fileField = new JTextField();
        JButton browseButton = new JButton("Browse");
        filePanel.add(fileLabel, BorderLayout.WEST);
        filePanel.add(fileField, BorderLayout.CENTER);
        filePanel.add(browseButton, BorderLayout.EAST);

        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        // 滚动条
        JScrollPane scrollPane = new JScrollPane(textArea);

        // 按钮区域
        JPanel buttonPanel = new JPanel(new BorderLayout(80, 0));
        JPanel leftButtons = new JPanel(new GridLayout(1, 3, 20, 0));
        JButton clearButton = new JButton("Clear");
        JButton readButton = new JButton("Read");
        JButton saveButton = new JButton("Save");
        leftButtons.add(clearButton);
        leftButtons.add(readButton);
        leftButtons.add(saveButton);

        JButton exitButton = new JButton("Exit");
        buttonPanel.add(leftButtons, BorderLayout.CENTER);
        buttonPanel.add(exitButton, BorderLayout.EAST);

        // 为各部分添加边框间距
        JPanel topWrapper = new JPanel(new BorderLayout());
        topWrapper.setBorder(BorderFactory.createEmptyBorder(50, 50, 0, 50));
        topWrapper.add(filePanel);

        JPanel centerWrapper = new JPanel(new BorderLayout());
        centerWrapper.setBorder(BorderFactory.createEmptyBorder(10, 50, 10, 50));
        centerWrapper.add(scrollPane);

        JPanel bottomWrapper = new JPanel(new BorderLayout());
        bottomWrapper.setBorder(BorderFactory.createEmptyBorder(10, 50, 10, 50));
        bottomWrapper.add(buttonPanel);

        frame.add(topWrapper, BorderLayout.NORTH);
        frame.add(centerWrapper, BorderLayout.CENTER);
        frame.add(bottomWrapper, BorderLayout.SOUTH);

        browseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(frame);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    fileField.setText(selectedFile.getAbsolutePath());
                }
            }
        });

        readButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filePath = fileField.getText();
                if (filePath.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "请先输入文件路径！", "警告", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                    //先清除再读取
                    textArea.setText("");
                    String line;
                    while ((line = reader.readLine()) != null) {
                        textArea.append(line + "\n");
                    }
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "读取文件失败：" + ex.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filePath = fileField.getText();
                if (filePath.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "请先输入文件路径！", "警告", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                    writer.write(textArea.getText());
                    JOptionPane.showMessageDialog(frame, "文件保存成功！", "提示", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "保存文件失败：" + ex.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

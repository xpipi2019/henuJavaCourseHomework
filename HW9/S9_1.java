import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author XPIPI
 */
public class S9_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("用户登录");
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setSize(300, 150);
        // Grid布局
        frame.setLayout(new GridLayout(3, 1, 5, 5));

        // 窗体退出事件
        frame.addWindowListener(new WindowAdapter() {
            @Override
             public void windowClosing(WindowEvent e) {
                 System.exit(0);
             }
        });

        JPanel userPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel userLabel = new JLabel("账号：");
        JTextField userText = new JTextField("admin", 15);
        userPanel.add(userLabel);
        userPanel.add(userText);

        JPanel passPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel passLabel = new JLabel("密码：");
        JPasswordField passText = new JPasswordField("123",15);
        passPanel.add(passLabel);
        passPanel.add(passText);

        JPanel actionPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JCheckBox rememberBox = new JCheckBox("记住密码", true);
        JButton loginButton = new JButton("确定");
        actionPanel.add(rememberBox);
        actionPanel.add(loginButton);

        frame.add(userPanel);
        frame.add(passPanel);
        frame.add(actionPanel);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passText.getPassword());

                if ("admin".equals(username) && "123".equals(password)) {
                    JOptionPane.showMessageDialog(frame, "登录成功！", "消息", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(1);
                } else {
                    JOptionPane.showMessageDialog(frame, "登录失败，账号或密码错误！", "消息", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        //frame.setBounds();
        // 居中
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}

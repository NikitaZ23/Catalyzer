package ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;

public class Chooser extends Component {
    public Chooser() {
        JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        // Создаем собственное контекстное меню
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem customMenuItem = new JMenuItem("Custom Menu Item");
        popupMenu.add(customMenuItem);

        // Добавляем слушателя для обработки действий при выборе пункта меню
        customMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File selectedFile = fileChooser.getSelectedFile();
                if (selectedFile != null) {
                    System.out.println(fileChooser.getSelectedFile());
                    JOptionPane.showMessageDialog(null, "Выбран файл: " + selectedFile.getName());
                } else {
                    JOptionPane.showMessageDialog(null, "Файл не выбран");
                }
            }
        });

        // Устанавливаем собственное контекстное меню для JFileChooser
        fileChooser.setComponentPopupMenu(popupMenu);
        fileChooser.setCurrentDirectory(new File("E:\\Android\\java\\Retribution"));
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.CANCEL_OPTION) {
            System.exit(0);
            System.out.println(fileChooser.getSelectedFile());
        }

//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.add(fileChooser);
//        frame.pack();
//        frame.setVisible(true);


//        fileChooser.setCurrentDirectory(new File("E:\\Android\\java\\q5\\q5\\src\\main\\java"));
//        fileChooser.setCurrentDirectory(new File("E:\\Android\\java\\Retribution"));
//        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
//        int result = fileChooser.showOpenDialog(this);
//
//        if (result == JFileChooser.APPROVE_OPTION) {
//            System.out.println(fileChooser.getSelectedFile());
//        }
    }
}

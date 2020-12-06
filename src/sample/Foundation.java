package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Foundation extends JFrame {
    public static void main(String []args){
        new Foundation();
    }
    public Foundation(){
        super("Document creator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createFileMenu());
        setJMenuBar(menuBar);
        setSize(300,228);
        setVisible(true);
    }
    public JMenu createFileMenu(){
        JMenu file = new JMenu("File");
        JMenu new1 = new JMenu("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem exit = new JMenuItem("Exit");

        JMenuItem textdocument = new JMenuItem("TextDocument");
        JMenuItem imagedocument = new JMenuItem("ImageDocument");
        JMenuItem musicdocument = new JMenuItem("MusicDocument");

        file.add(new1);
        file.add(open);
        file.add(exit);
        new1.add(textdocument);
        new1.add(imagedocument);
        new1.add(musicdocument);


        textdocument.addActionListener(e -> {
            System.out.println("textdocument");
            ICreateDocument iCreateDocument = new ICreateDocument();
            iCreateDocument.CreateNew();
            System.out.println("Файл создан");
        });
        imagedocument.addActionListener(e -> {
            System.out.println("imagedocument");
            ICreateDocument iCreateDocument = new ICreateDocument();
            iCreateDocument.CreateNew();
            System.out.println("Файл создан");
        });
        musicdocument.addActionListener(e -> {
            System.out.println("musicdocument");
            ICreateDocument iCreateDocument = new ICreateDocument();
            iCreateDocument.CreateNew();
            System.out.println("Файл создан");
        });

        open.addActionListener(e -> {
            System.out.println("Нажата open");
            ICreateDocument iCreateDocument = new ICreateDocument();
            iCreateDocument.CreateOpen();
            System.out.println("Открыт файл");
        });
        exit.addActionListener(e -> {
            System.out.println("Нажата exit");

            System.out.println("Файл закрыт");
        });
        return file;
    }
}

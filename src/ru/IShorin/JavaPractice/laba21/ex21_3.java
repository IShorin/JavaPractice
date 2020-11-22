package ru.IShorin.JavaPractice.laba21;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class Foundation extends JFrame {
    public static void main(String []args){
        new Foundation();
    }
    public Foundation(){
        super("Create Document");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createFileMenu());
        setJMenuBar(menuBar);
        setSize(500,500);
        setVisible(true);
    }
    public JMenu createFileMenu(){
        JMenu file = new JMenu("File");
        JMenu new_ = new JMenu("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem text_doc = new JMenuItem("TextDocument");
        JMenuItem img_doc = new JMenuItem("ImageDocument");
        JMenuItem mus_doc = new JMenuItem("MusicDocument");
        file.add(new_);
        file.add(open);
        new_.add(text_doc);
        new_.add(img_doc);
        new_.add(mus_doc);
        text_doc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Press textdoc");
                ICreateDocument iCreateDocument = new ICreateDocument();
                iCreateDocument.CreateNew();
                System.out.println("File created");
            }
        });
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажата open");
                ICreateDocument iCreateDocument = new ICreateDocument();
                iCreateDocument.CreateOpen();
                System.out.println("Открыт файл");
            }
        });
        return file;
    }
}
class ICreateDocument implements IDocument{
    public IDocument CreateNew(){
        IDocument document = new IDocument() {
            @Override
            public String toString() {
                return super.toString();
            }
        };
        new TextDocument();
        return document;
    }
    public IDocument CreateOpen(){
        IDocument document = new IDocument() {
            @Override
            public String toString() {
                return super.toString();
            }
        };
        new TextDocument();
        return document;
    }
}
 interface IDocument {
}
class ImageDocument implements IDocument {
    private int size;
}
class MusicDocument implements IDocument {
    private int size;
}
 class TextDocument implements IDocument {
}
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
public class GUI extends JFrame {
    ArrayList<Object> objects = new ArrayList<Object>();
    File file = new File("1.txt");
    private JTextField text1 = new JTextField("",2);
    private JButton button = new JButton("Добавити");
    public GUI(){
        super("Example");
        this.setBounds(400,400,250,250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(6,2,2,2));
        container.add(text1);
        container.add(button);
        button.addActionListener(new ButtonEventListener());
    }
        class ButtonEventListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                AddCollection(text1.getText());
                try {
                    FileWriter();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    FileReader();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                System.exit(0);
            }

            public void AddCollection(String text){
                objects.add(text);
            }
            public void FileWriter() throws IOException {
                FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
                writer.write("\n"+(String) objects.get((objects.size()-1)));
                writer.close();
            }
            public void FileReader() throws IOException {
                FileReader reader = new FileReader(file.getAbsolutePath());
                BufferedReader bufferedReader = new BufferedReader(reader);
                String fileStrings;
                while ((fileStrings=bufferedReader.readLine())!=null) {
                    objects.add(fileStrings);
                    System.out.println(objects.get((objects.size()-1)));
                }
                System.out.println(objects.size());
            }
        }
}

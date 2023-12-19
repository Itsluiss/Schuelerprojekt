import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SchuelerGUI {
    List<SchuelerGUI>list;
    private JButton hinzufügen;
    private JTextField Vorname;
    private JTextField Nachname;
    private JTextArea List;
    private JTextField vorname5;
    private JTextField nachname5;
    private JPanel Start;

    public static void main(String[] args) {
        JFrame frame = new JFrame("SchuelerGUI");
        frame.setContentPane(new SchuelerGUI().Start);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public SchuelerGUI(){
        list=new List<>();


        Nachname.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Verwaltung pSchülerGUI=new Verwaltung(Vorname.getText(),Nachname.getText());
if




            }
        });


        Vorname.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        hinzufügen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });







    }



















}

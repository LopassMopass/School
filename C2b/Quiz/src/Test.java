import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButton[] = new JRadioButton[5];
    JButton buttonNext;
    JButton buttonResult;
    ButtonGroup buttonGroup;
    int points = 0;
    int current = 0;
    //Pojmenovani a chovani
    Test (String s){
        super(s);//Nemusi byt
        label = new JLabel();
        add(label);
        buttonGroup = new ButtonGroup();
        for (int i = 0; i < 5; i++){
            radioButton[i] = new JRadioButton();
            add(radioButton[i]);
            buttonGroup.add(radioButton[i]);
        }
        buttonNext = new JButton("Next");
        buttonResult = new JButton("Result");
        buttonResult.setVisible(false);
        buttonResult.addActionListener(this);
        buttonNext.addActionListener(this);
        //-----------------------------------------------------------
        add(buttonNext);
        add(buttonResult);
        setData();
        //-----------------------------------------------------------
        label.setBounds(40,50,450,20);//label.setBounds(40,50,450,20);
        radioButton[0].setBounds(50,80,450,20);//radioButton[0].setBounds(50,80,450,20);
        radioButton[1].setBounds(50,110,200,20);//radioButton[1].setBounds(50,110,200,20);
        radioButton[2].setBounds(50,140,200,20);//radioButton[2].setBounds(50,140,200,20);
        radioButton[3].setBounds(50,170,200,20);//radioButton[3].setBounds(50,170,200,20);
        buttonNext.setBounds(100,240,90,30);//buttonNext.setBounds(100,240,90,30);
        buttonResult.setBounds(270,240,90,30);//buttonResult.setBounds(270,240,90,30);
        //-----------------------------------------------------------
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250,100);//setLocation(250,100);
        setVisible(true);
        setSize(600,350);//setSize(600,350);
    }
    //Otazky
    public void setData(){
        radioButton[4].setSelected(true);
        label.setFont(new Font("",Font.BOLD,20));
        //radioButton[0].setFont(new Font("",Font.PLAIN,14));
        //radioButton[1].setFont(new Font("",Font.PLAIN,14));
        //radioButton[2].setFont(new Font("",Font.PLAIN,14));
        //radioButton[3].setFont(new Font("",Font.PLAIN,14));
        if (current == 0){
            label.setText("Question 1: Swing class which is used for frames, is");
            radioButton[0].setText("A. Window.");
            radioButton[1].setText("B. Frame.");
            radioButton[2].setText("C. JFrame.");
            radioButton[3].setText("D. SwingFrame.");
        }
        if (current == 1){
            label.setText("Question 2: What sets the frame to 600 pixels wide by 350 high?");
            radioButton[0].setText("A. Frm.setVisible(600, 350);");
            radioButton[1].setText("B. Frm.paint(600, 350);");
            radioButton[2].setText("C. Frm.setSize(350, 600);");
            radioButton[3].setText("D. Frm.setSize(600, 350);");
        }
        if (current == 2){
            label.setText("Question 3: In what is the size of a frame on the screen measured?");
            radioButton[0].setText("A. Inches");
            radioButton[1].setText("B. Nits");
            radioButton[2].setText("C. Dots");
            radioButton[3].setText("D. Pixels");
        }
        if (current == 3){
            label.setText("Question 4: A container object in GUI programming is");
            radioButton[0].setText("A. Another name for an array or vector.");
            radioButton[1].setText("B. Any class that is made up of other classes.");
            radioButton[2].setText("C. A primitive variable that contains the actual data.");
            radioButton[3].setText("D. An object like a frame that has other GUI components placed inside of it.");
        }
        if (current == 4){
            label.setText("Question 5: JFrame myFrame = new JFrame (); Any command (such as the listed one) which creates a new object of a specific class is usually called a...");
            radioButton[0].setText("A. Constructor");
            radioButton[1].setText("B. Layout manager");
            radioButton[2].setText("C. Parameter");
            radioButton[3].setText("D. GUI");
        }

        label.setBounds(40,50,450,20);//label.setBounds(40,50,450,20);
        for (int i = 0,j = 0; i <= 90; i+=30, j++){
            //count++;
            radioButton[j].setBounds(50,80+i,200,20);//radioButton[j].setBounds(50,80+i,200,20);
        }
    }
    //Spravne odpovedi
    public boolean checkAnswear(){
        if (current == 0){
            return radioButton[2].isSelected();
        }
        if (current == 1){
            return radioButton[3].isSelected();
        }
        if (current == 2){
            return radioButton[3].isSelected();
        }
        if (current == 3){
            return radioButton[3].isSelected();
        }
        if (current == 4){
            return radioButton[0].isSelected();
        }
        return false;
    }
    //Jak se chova bNext a bResult. Stejne tak jako konec programu.
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonNext){
            if (checkAnswear())
                points = points + 1;
                current++;
                setData();
                if (current == 4) {
                    buttonNext.setEnabled(false);
                    buttonResult.setVisible(true);
                    buttonResult.setText("Result");
                }
        }
        if (e.getActionCommand().equals("Result")){
            if (checkAnswear())
                points = points + 1;
                current++;
                JOptionPane.showMessageDialog(this,"Answear Correct: "+points+"/5");
                System.exit(0);

        }
    }
}

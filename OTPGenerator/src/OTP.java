import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class OTP extends JFrame implements ActionListener {

    JButton new_OTP;
    JLabel resultLabel;

    OTP(){
        new_OTP = new JButton("Refresh");
        resultLabel = new JLabel("Your OTP Code");
        new_OTP.addActionListener(this);// do somthing on click

        /* UX setup */
        setLayout(new BorderLayout());
        resultLabel.setHorizontalAlignment(JLabel.CENTER); //center justifies the label
        add(new_OTP, BorderLayout.CENTER); // organization of components within frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// allows close operation
        setLocation(250,100);// controls the position
        setVisible(true);//shows the window
        setSize(600, 350);//controls the dimensions of the window
    }

    static char[] generate(int len){
       System.out.println("Generate OTP using radom(): ");
       String numbers ="0123456789";
       Random rnd_choose = new Random();
       char[] otp = new char[len];
       //choose a random index in the numbers string and put it in otp char array
       for(int i = 0; i < len; i++){
           otp[i] = numbers.charAt(rnd_choose.nextInt(numbers.length()));
       }
       return otp;
   }

   @Override
    public void actionPerformed(ActionEvent e) {
        int length = 6;
        resultLabel.setText(String.valueOf(OTP.generate(length)));

    }

    public static void main (String[] args){
        new OTP();
    }


}

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener{

    private JFrame frame;
    private JLabel label;
    private JButton button;
    private JPanel panel;
    private String currentTemp;
    private String FeelsLike;
    private String TempMax;
    private String TempMin;
    public GUI(String ct, String f, String tmax, String tmin){
        this.currentTemp = ct;
        this.FeelsLike = f;
        this.TempMax = tmax;
        this.TempMin = tmin;

        frame = new JFrame();

        button = new JButton("Weather in Haifa");
        label = new JLabel("");

        button.addActionListener(this);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(80,100,50,90));
        //  panel.setLayout(new GridLayout(1,0));
        panel.add(button);
        panel.add(label);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
//        label.setText("Temp in Haifa - current temp " + currentTemp + " \nFeels like: " + FeelsLike
//                + " \nMaximum temp: " + TempMax + " \nMinimum temp: " + TempMin);
//        label.setText("Feels like: " + FeelsLike);
//        label.setText("Maximum temp: " + TempMax);
//        label.setText("Minimum temp: " + TempMin);
        label.setText("Temp in Haifa - current temp " + currentTemp);

    }

}
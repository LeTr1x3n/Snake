package LeTr1x3n;

import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(640,665);
        setLocation(650,200);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args){

        MainWindow mw = new MainWindow();
    }
}

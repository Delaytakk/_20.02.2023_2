package org.example;

import org.w3c.dom.html.HTMLHeadingElement;

import javax.swing.*;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ToCreate sozdsnieNovoiZametki = new ToCreate();

        StartWork nachaloRezhimaRedatirovania = new StartWork();

        NameOfThePlan dataEntry = new NameOfThePlan(); //Объявление класса NemeOfThePlan (Название заметки(плана)
        Head zagolovok = new Head(); //Заголовок текста внутри заметок
        Subtitle gjdzagolovok = new Subtitle(); //Подзаголовок внутри текста
        TextovoePole bukavki = new TextovoePole();
        IntPaint pfoto = new IntPaint();
        Punkt galochka = new Punkt(); //Окошечко с галочкой, чтобы отмечать сделанное дело
        FinalPunkt procherk = new FinalPunkt();
        /*картинка ввод*/
        JFrame frame = new JFrame("my applcation");
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setVisible(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("C:\\Users\\LYMS\\IdeaProjects\\_20.02.2023_2\\paintFile\\tick.png"));
        frame.add(label);
    }
}
        class ToCreate {
            public void voice() { System.out.print(" ");
            }
        }

        class StartWork extends ToCreate{
            public void voice() {
                System.out.print(" ";

            }
        }
        class NameOfThePlan extends StartWork{
         public void voice() {
        System.out.print(" ";
    }
}
class Head extends StartWork{
    public void voice() {
        System.out.print(" ";
    }
}
class Subtitle extends StartWork{
    public void voice() {
        System.out.print(" ";
    }
}
class TextovoePole extends StartWork{
    public void voice() {
        System.out.print(" ";
    }
}
class IntPaint extends StartWork{
    public void voice() {
        System.out.print(" ";
    }
}
class Punkt extends StartWork{
    public void voice() {
        System.out.print(" ";
    }
}
class FinalPunkt extends StartWork{
    public void voice() {
        System.out.print(" ";
    }
}


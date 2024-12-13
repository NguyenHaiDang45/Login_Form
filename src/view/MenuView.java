package view;

import Program.AboutUs.AboutView;
import Program.AddressBook.AddressBookApp;
import Program.BMICalculatorApp.BMICalculator;
import Program.CalculatorApp.CalculatorApp;
import Program.ChangeColor.view.ChangeColorView;
import Program.CountdownTimer.CountdownTimer;
import Program.Counter.view.CounterView;
import Program.GuessTheNumber.GuessTheNumber;
import Program.LastButton.view.LastButtonView;
import Program.MyCalculate.view.MyCalculateView;
import Program.UnitConverter.UnitConverter;
import Program.help.HelpView;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MenuView extends JFrame {

    public MenuView() {
        this.init1();
        this.mainComponent();
    }

    private void mainComponent() {
        this.setLayout(null);

        //Text
        JPanel main_panel = new JPanel(new BorderLayout());

        Font font = new Font("Serif", Font.BOLD, 18);

        JLabel jl_wel = new JLabel("Welcome to my Menu Application!");
        jl_wel.setFont(font);

        main_panel.add(jl_wel, BorderLayout.CENTER);
        main_panel.setBounds(30, 260, 320, 50);

        //Image
        JPanel jp_image = new JPanel();
        JLabel jl_img = new JLabel();

        jp_image.add(jl_img);

        this.add(jp_image);
        this.add(main_panel);
    }

    private void init1() {
        //JFrame
        this.setTitle("Menu Application");
        this.setSize(350, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        URL url = SignUpView.class.getResource("icon3.png");
        Image img = Toolkit.getDefaultToolkit().createImage(url);

        this.setIconImage(img);

        //Thanh menu
        JMenuBar main_menu = new JMenuBar();

        //menu1
        JMenu fileMenu = new JMenu("File");

        //menu1_item
        JMenuItem newItem = new JMenuItem("Duplicate");
        newItem.addActionListener(e -> {
            MenuView menuView = new MenuView();
            menuView.setVisible(true);
        });

        JMenuItem helpMenu = new JMenuItem("Help");
        helpMenu.addActionListener(e -> {
            HelpView helpView = new HelpView();
            helpView.setVisible(true);
        });

        JMenuItem aboutItem = new JMenuItem("About me");
        aboutItem.addActionListener(e -> {
            AboutView aboutView = new AboutView();
            aboutView.setVisible(true);
        });

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> {
            this.dispose();
            SignUpView signUpView = new SignUpView();
            signUpView.setVisible(true);
        });

        fileMenu.add(newItem);
        fileMenu.add(helpMenu);
        fileMenu.add(aboutItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        //menu2
        JMenu testProg = new JMenu("Test");

        //menu2_item
        JMenuItem pro1 = new JMenuItem("Count Program");
        pro1.addActionListener(e -> {
            CounterView counterView = new CounterView();
            counterView.setVisible(true);
        });

        JMenuItem pro2 = new JMenuItem("Last Click Button");
        pro2.addActionListener(e -> {
            LastButtonView lastButtonView = new LastButtonView();
            lastButtonView.setVisible(true);
        });

        JMenuItem pro3 = new JMenuItem("Change Color");
        pro3.addActionListener(e -> {
            ChangeColorView changeColorView = new ChangeColorView();
            changeColorView.setVisible(true);
        });

        JMenuItem pro9 = new JMenuItem("Unit Converter");
        pro9.addActionListener(e -> {
            UnitConverter unitConverter = new UnitConverter();
            unitConverter.setVisible(true);
        });

        testProg.add(pro1);
        testProg.add(pro2);
        testProg.add(pro3);
        testProg.add(pro9);

        //menu3
        JMenu calcMenu = new JMenu("Calc");

        //menu3_item
        JMenuItem pro4 = new JMenuItem("Simple Calculation");
        pro4.addActionListener(e -> {
            MyCalculateView myCalculateView = new MyCalculateView();
            myCalculateView.setVisible(true);
        });

        JMenuItem pro5 = new JMenuItem("My Calculator");
        pro5.addActionListener(e -> {
            CalculatorApp calculatorApp = new CalculatorApp();
            calculatorApp.setVisible(true);
        });

        calcMenu.add(pro4);
        calcMenu.add(pro5);

        //menu4
        JMenu otherMenu = new JMenu("Other program");

        //menu4_item
        JMenuItem pro6 = new JMenuItem("Add Contact");
        pro6.addActionListener(e -> {
            AddressBookApp addressBookApp = new AddressBookApp();
            addressBookApp.setVisible(true);
        });

        JMenuItem pro7 = new JMenuItem("BMI Calculator");
        pro7.addActionListener(e -> {
            BMICalculator bmiCalculatorApp = new BMICalculator();
            bmiCalculatorApp.setVisible(true);
        });

        JMenuItem pro8 = new JMenuItem("Countdown Timer");
        pro8.addActionListener(e -> {
            CountdownTimer countdownTimer = new CountdownTimer();
            countdownTimer.setVisible(true);
        });

        JMenuItem pro10 = new JMenuItem("Guess The Number");
        pro10.addActionListener(e -> {
            GuessTheNumber guessTheNumber = new GuessTheNumber();
            guessTheNumber.setVisible(true);
        });

        otherMenu.add(pro6);
        otherMenu.add(pro7);
        otherMenu.add(pro8);
        otherMenu.add(pro10);

        main_menu.add(fileMenu);
        main_menu.add(testProg);
        main_menu.add(calcMenu);
        main_menu.add(otherMenu);

        this.setLayout(new BorderLayout());
        this.add(main_menu, BorderLayout.NORTH);
        this.setVisible(true);
    }
}
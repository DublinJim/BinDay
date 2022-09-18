package com.example.binday;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class HelloController implements Runnable {
    @FXML
    private ImageView imagePane1;
    @FXML
    private BorderPane borderPane1;

    @FXML
    private Text andTodayis;
    @FXML
    private Text message1;

    public HelloController() throws FileNotFoundException {
    }

    public static ObservableList<BankHoliday> observableList;
    //non fx vars
    static TimestringMaker timestringMaker;
    Boolean westOStoneSt;
    Boolean eastOfStoneSt;
    public static   ArrayList<BankHoliday> holBank = new ArrayList<>();

    @Override
    public void run() {


        observableList = FXCollections.observableArrayList(new BankHoliday("New Year's Day", "MONDAY", "Jan", 3, 2022),
                new BankHoliday("Family", "MONDAY", "Feb", 21, 2022),
                new BankHoliday("Good Friday", "FRIDAY", "Apr", 15, 2022),
                new BankHoliday("Victoria Day", "MONDAY", "May", 23, 2022),
                new BankHoliday("Canada Day", "FRIDAY", "Jul", 1, 2022),
                new BankHoliday("Labour Day", "MONDAY", "Sept", 5, 2022),
                new BankHoliday("Thanksgiving", "MONDAY", "Oct", 10, 2022),
                new BankHoliday("Christmas", "SUNDAY", "Dec", 25, 2022),
                new BankHoliday("Boxing Day", "MONDAY", "Dec", 26, 2022)

        );

        holBank.add(new BankHoliday("New Year's Day", "MONDAY", "Jan", 3, 2022));
        holBank.add(new BankHoliday("Family", "MONDAY", "Feb", 21, 2022));
        holBank.add(new BankHoliday("Victoria Day", "MONDAY", "May", 23, 2022));
        holBank.add(new BankHoliday("Canada Day", "FRIDAY", "Jul", 1, 2022));
        holBank.add(new BankHoliday("Labour Day", "MONDAY", "Sept", 5, 2022));
        holBank.add(new BankHoliday("Thanksgiving", "MONDAY", "Oct", 10, 2022));
        holBank.add(new BankHoliday("Christmas", "SUNDAY", "Dec", 25, 2022));
        holBank.add(new BankHoliday("Boxing Day", "MONDAY", "Dec", 26, 2022));


        Image backgroundImage = new Image("C:\\Users\\dubli\\IdeaProjects\\BinDay\\src\\main\\resources\\com\\example\\binday\\background.gif");

        Rectangle rect = new Rectangle(200, 200, Color.RED);
        ScrollPane s1 = new ScrollPane();
        s1.setPrefSize(120, 120);
        s1.setContent(rect);


    }


//    New Year's Day	Mon, Jan 3, 2022
//    Family Day	Mon, Feb 21, 2022
//    Good Friday	Fri, Apr 15, 2022
//    Victoria Day	Mon, May 23, 2022,
//    Canada Day	Fri, Jul 1, 2022
//    Labour Day	Mon, Sept 5, 2022
//    Thanksgiving	Mon, Oct 10, 2022
//    Christmas	Sun, Dec 25, 2022
//    Boxing Day	Mon, Dec 26, 2022
//    Christmas	Likely Mon, Dec 26, 2022


    @FXML
    private Text dateDisplay;
    Image fullBinCardboard = new Image(new FileInputStream("C:\\Users\\dubli\\IdeaProjects\\BinDay\\src\\main\\java\\com\\example\\binday\\fullbin.jpg"));
    Image noCollection = new Image(new FileInputStream("C:\\Users\\dubli\\IdeaProjects\\BinDay\\src\\main\\resources\\testImages\\Graphics\\dont-throw-trash-recycle-bin.jpg"));

    @FXML
    void showToday(MouseEvent event) {


        timestringMaker = new TimestringMaker();
        andTodayis.setText(timestringMaker.getDay());
        String today = timestringMaker.getDay();
        andTodayis.setText(today);
        String monthNow = timestringMaker.getMonth();
        int dayNum = timestringMaker.getDate();

        System.out.println("Day of the week is " + today);
        System.out.println("The date is " + dayNum);
        System.out.println("Month is " + monthNow);

        if (Objects.equals(today, "THURSDAY") || Objects.equals(today, "FRIDAY")) {
            dateDisplay.setText("Collection Today");
            imagePane1.setImage(fullBinCardboard);

        } else {
            dateDisplay.setText("No collection");
            imagePane1.setImage(noCollection);
        }
        borderPane1.setVisible(false);
        System.out.println("List "+holBank.get(1));

    }

    @FXML
    void showTomorrow() throws ParseException {
        String sourceDate = "2012-02-29";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date myDate = format.parse(sourceDate);
        // myDate = DateUtils.addDays(myDate, 1);

    }

    @FXML
    void eastOfStoneStreet(ActionEvent event) {
        message1.setVisible(true);
        eastOfStoneSt = true;
        message1.setText("East of Stone Street");


    }

    @FXML
    void westOfStoneStreet(ActionEvent event) {
        westOStoneSt = true;
        message1.setVisible(true);
        message1.setText("West of Stone Street");
    }
}


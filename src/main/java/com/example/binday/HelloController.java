package com.example.binday;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class HelloController implements Runnable {
    @FXML
    private ImageView imagePane1;

    @FXML
    private Label welcomeText;
    @FXML
    private Text andTodayis;

    public HelloController() throws FileNotFoundException {
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    //non fx vars
    static TimestringMaker demo;


    @Override
    public void run() {

    }

    ArrayList<String> cars = new ArrayList<String>();

    ObservableList<BankHoliday> observableList = FXCollections.observableArrayList(
            new BankHoliday("New Year's Day", "Mon", "Jan", 3, 2022),
            new BankHoliday("Family", "Mon", "Feb", 21, 2022),
            new BankHoliday("Good Friday", "Fri", "Apr", 15, 2022),
            new BankHoliday("Victoria Day", "Mon", "May", 23, 2022),
            new BankHoliday("Canada Day", "Fri", "Jul", 1, 2022),
            new BankHoliday("Labour Day", "Mon", "Sept", 5, 2022),
            new BankHoliday("Thanksgiving",	"Mon", "Oct", 10, 2022),
            new BankHoliday( "Christmas",	"Sun", "Dec", 25, 2022),
            new BankHoliday("Boxing Day"	,"Mon", "Dec", 26, 2022)

            );

//    New Year's Day	Mon, Jan 3, 2022
//    Family Day	Mon, Feb 21, 2022
//    Good Friday	Fri, Apr 15, 2022
//    Victoria Day	Mon, May 23, 2022
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
        demo = new TimestringMaker();
        andTodayis.setText(demo.getDay());
        String today = demo.getDay();
        andTodayis.setText(today);

        if (today == "THURSDAY" || today == "FRIDAY") {
            dateDisplay.setText("Collection Today");
            imagePane1.setImage(fullBinCardboard);

        } else {
            dateDisplay.setText("No collection");


            imagePane1.setImage(noCollection);
        }


    }


    @FXML
    void showTomorrow(MouseEvent event) throws ParseException {
        String sourceDate = "2012-02-29";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date myDate = format.parse(sourceDate);
        // myDate = DateUtils.addDays(myDate, 1);

    }

}
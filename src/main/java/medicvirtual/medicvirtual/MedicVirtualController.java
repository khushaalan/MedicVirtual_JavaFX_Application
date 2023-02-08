package medicvirtual.medicvirtual;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.File;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javafx.scene.control.DatePicker;
import javafx.stage.StageStyle;

import java.time.LocalDate;
import java.util.Arrays;
import java.text.DecimalFormat;
import java.nio.file.Files;
import java.io.*;


public class MedicVirtualController {
    //declare few things
    private Stage stage;
    private FileChooser fileChooser;
    private File selectedFile;
    private String filePath;
    private String default_gender;
    private String signinID;
    private String startDir = System.getProperty("user.dir");
    private String imgDir = startDir + "/src/main/resources/medicvirtual/medicvirtual/images/";
    private static final DecimalFormat df = new DecimalFormat("0.00");


    //create objects for all the model classes
    ViewProfile viewprofile = new ViewProfile();
    BookAppointment bookappointment = new BookAppointment();
    BuyMedicalSupplies buymedicalsupplies = new BuyMedicalSupplies();
    ReadMedicalNews readmedicalnews = new ReadMedicalNews();
    MonitorFitnessAndHealth monitorfitnessandhealth = new MonitorFitnessAndHealth();


    //Declare all the FXML elements
    //panel_root
    @FXML
    private Pane panel_root;



    //panel_signin
    @FXML
    private Pane panel_signin;
    @FXML
    private Pane panel_signin_region;
    @FXML
    private ImageView pic_logo_signin;
    @FXML
    private Label lbl_title_signin;
    @FXML
    private TextField txt_userid_signin;
    @FXML
    private PasswordField txt_password_signin;
    @FXML
    private ImageView pic_user_icon;
    @FXML
    private ImageView pic_password_icon;
    @FXML
    private Button btn_create_account_signin;
    @FXML
    private Button btn_signin_signin;
    @FXML
    private Label lbl_warning_signin;



    //panel_signup
    @FXML
    private Pane panel_signup;
    @FXML
    private Pane panel_signup_left;
    @FXML
    private Pane panel_signup_right;
    @FXML
    private ImageView pic_profile_signup;
    @FXML
    private Button btn_select_pic_signup;
    @FXML
    private Label lbl_title_signup;
    @FXML
    private Label lbl_description_signup;
    @FXML
    private Label lbl_userid_signup;
    @FXML
    private TextField txt_userid_signup;
    @FXML
    private Label lbl_password_signup;
    @FXML
    private TextField txt_password_signup;
    @FXML
    private Label lbl_full_name_signup;
    @FXML
    private TextField txt_full_name_signup;
    @FXML
    private Label lbl_id_signup;
    @FXML
    private TextField txt_id_signup;
    @FXML
    private Label lbl_phone_signup;
    @FXML
    private TextField txt_phone_signup;
    @FXML
    private Label lbl_address_signup;
    @FXML
    private TextField txt_address_signup;
    @FXML
    private Label lbl_gender_signup;
    @FXML
    private ComboBox cmb_gender_signup;
    @FXML
    private TextField txt_gender_signup;
    @FXML
    private Label lbl_weight_signup;
    @FXML
    private TextField txt_weight_signup;
    @FXML
    private Label lbl_height_signup;
    @FXML
    private TextField txt_height_signup;
    @FXML
    private Label lbl_age_signup;
    @FXML
    private TextField txt_age_signup;
    @FXML
    private Button btn_create_account_signup;



    //panel_sidebar
    @FXML
    private Pane panel_sidebar;
    @FXML
    private ImageView pic_logo_sidebar;
    @FXML
    private Label lbl_title_sidebar;
    @FXML
    private Button btn_view_profile_sidebar;
    @FXML
    private Button btn_book_appointment_sidebar;
    @FXML
    private Button btn_buy_medical_supplies_sidebar;
    @FXML
    private Button btn_read_medical_news_sidebar;
    @FXML
    private Button btn_monitor_fitness_and_health_sidebar;
    @FXML
    private Button btn_signout_sidebar;



    //panel_content
    @FXML
    private Pane panel_content;
    @FXML
    private Pane panel_dashboard;
    //panel_dashboard
    @FXML
    private Label lbl_title_dashboard;
    @FXML
    private Label lbl_description_dashboard;
    @FXML
    private ImageView pic_splashscreen_dashboard;
    //panel_view_profile
    @FXML
    private Pane panel_view_profile;
    @FXML
    private Pane panel_profile_info;
    @FXML
    private ImageView pic_profile_view_profile;
    @FXML
    private Button btn_select_picture_view_profile;
    @FXML
    private Label lbl_full_name_view_profile;
    @FXML
    private TextField txt_full_name_view_profile;
    @FXML
    private Label lbl_id_view_profile;
    @FXML
    private TextField txt_id_view_profile;
    @FXML
    private Label lbl_phone_view_profile;
    @FXML
    private TextField txt_phone_view_profile;
    @FXML
    private Label lbl_address_view_profile;
    @FXML
    private TextArea txt_address_view_profile;
    @FXML
    private Label lbl_gender_view_profile;
    @FXML
    private ComboBox cmb_gender_view_profile;
    @FXML
    private Label lbl_weight_view_profile;
    @FXML
    private TextField txt_weight_view_profile;
    @FXML
    private Label lbl_height_view_profile;
    @FXML
    private TextField txt_height_view_profile;
    @FXML
    private Label lbl_age_view_profile;
    @FXML
    private TextField txt_age_view_profile;
    @FXML
    private Label lbl_kg_view_profile;
    @FXML
    private Label lbl_cm_view_profile;
    @FXML
    private Label lbl_years_view_profile;
    @FXML
    private Button btn_save_view_profile;
    @FXML
    private Button btn_clear_view_profile;
    @FXML
    private Label lbl_warning_view_profile;
    //panel_book_appointment
    @FXML
    private Pane panel_book_appointment;
    @FXML
    private ImageView pic_doctor_book_appointment;
    @FXML
    private ComboBox cmb_doctors_book_appointment;
    @FXML
    private Label lbl_slots_book_appointment;
    @FXML
    private ComboBox cmb_slots_book_appointment;
    @FXML
    private Label lbl_date_book_appointment;
    @FXML
    private DatePicker dp_date_book_appointment;
    LocalDate selectedDate;
    @FXML
    private Button btn_book_appointment_book_appointment;
    @FXML
    private Button btn_clear_book_appointment;
    @FXML
    private Label lbl_alert_book_appointment;
    @FXML
    private Label lbl_hospital_name_book_appointment;
    @FXML
    private Label lbl_timeinfo_book_appointment;
    @FXML
    private Label lbl_dateinfo_book_appointment;
    //panel_buy_medical_supplies
    @FXML
    private Pane panel_buy_medical_supplies;
    @FXML
    private Pane panel_product_catalogue;
    @FXML
    private ListView lst_cart;
    @FXML
    private ImageView pic_product_buy_medical_supplies;
    @FXML
    private ComboBox cmb_products_buy_medical_supplies;
    @FXML
    private Label lbl_product_name_buy_medical_supplies;
    @FXML
    private Label lbl_rating_buy_medical_supplies;
    @FXML
    private Label lbl_price_buy_medical_supplies;
    @FXML
    private Label lbl_quantity_buy_medical_supplies;
    @FXML
    private TextField txt_quantity_buy_medical_supplies;
    @FXML
    private Label lbl_stock_buy_medical_supplies;
    @FXML
    private Button btn_addtocart_buy_medical_supplies;
    @FXML
    private Button btn_checkout_buy_medical_supplies;

    //panel_checkout
    @FXML
    private Pane panel_checkout;
    @FXML
    Circle circle_delivery;
    @FXML
    Circle circle_payment;
    @FXML
    Circle circle_complete;
    @FXML
    Line line_1;
    @FXML
    Line line_2;
    @FXML
    private Pane panel_delivery;
    //panel_delivery
    @FXML
    private Button btn_proceed_delivery;
    @FXML
    private Label lbl_delivery_address_checkout;
    @FXML
    private TextArea txt_shipping_address;
    @FXML
    private Pane panel_payment;
    //panel_payment
    @FXML
    private Button btn_proceed_payment;
    @FXML
    private Label lbl_payment_method_checkout;
    @FXML
    private Label lbl_total_checkout;
    @FXML
    private ImageView pic_visa_card;
    @FXML
    private Pane panel_card;
    @FXML
    private TextField txt_card_number;
    @FXML
    private TextField txt_cardholder_name;
    @FXML
    private TextField txt_expiry_month;
    @FXML
    private TextField txt_expiry_year;
    @FXML
    private TextField txt_cvv;
    @FXML
    private Pane panel_checkout_complete;
    //panel_checkout_complete
    @FXML
    private Label lbl_checkout_summary_title;
    @FXML
    private Label lbl_checkout_summary_description;
    @FXML
    private Button btn_return_checkout;
    @FXML
    private ImageView pic_payment_successful;
    private static Integer checkout_counter = 0;



    //panel_read_medical_news
    @FXML
    private Pane panel_read_medical_news;
    @FXML
    private ImageView pic_news_read_medical_news;
    @FXML
    private Label lbl_news1_read_medical_news;
    @FXML
    private Button btn_news1_read_medical_news;
    @FXML
    private Label lbl_news2_read_medical_news;
    @FXML
    private Button btn_news2_read_medical_news;
    @FXML
    private Label lbl_news3_read_medical_news;
    @FXML
    private Button btn_news3_read_medical_news;
    @FXML
    private Label lbl_news4_read_medical_news;
    @FXML
    private Button btn_news4_read_medical_news;
    //panel_news1
    @FXML
    private Pane panel_news1;
    @FXML
    private Label lbl_title_news1;
    @FXML
    private TextArea txt_description_news1;
    @FXML
    private Button btn_back_news1;
    //panel_news2
    @FXML
    private Pane panel_news2;
    @FXML
    private Label lbl_title_news2;
    @FXML
    private TextArea txt_description_news2;
    @FXML
    private Button btn_back_news2;
    //panel_news3
    @FXML
    private Pane panel_news3;
    @FXML
    private Label lbl_title_news3;
    @FXML
    private TextArea txt_description_news3;
    @FXML
    private Button btn_back_news3;
    //panel_news4
    @FXML
    private Pane panel_news4;
    @FXML
    private Label lbl_title_news4;
    @FXML
    private TextArea txt_description_news4;
    @FXML
    private Button btn_back_news4;
    //panel_monitor_fitness_and_health
    @FXML
    private Pane panel_monitor_fitness_and_health;
    @FXML
    private Label lbl_title_monitor_fitness_and_health;
    @FXML
    private Label lbl_bmi_monitor_fitness_and_health;
    @FXML
    private TextField txt_bmi_monitor_fitness_and_health;
    @FXML
    private Label lbl_calorie_monitor_fitness_and_health;
    @FXML
    private TextField txt_calorie_monitor_fitness_and_health;
    @FXML
    private Label lbl_bmi_class_monitor_fitness_and_health;
    @FXML
    private ImageView pic_bmi_class_monitor_fitness_and_health;
    //


    public void initialize(){
        Image image;
        image = new Image(imgDir + "MedicVirtual_logo.png");
        pic_logo_signin.setImage(image);
        image = new Image(imgDir + "username.png");
        pic_user_icon.setImage(image);
        image = new Image(imgDir + "password.png");
        pic_password_icon.setImage(image);
        image = new Image(imgDir + "no_profile_photo.jpg");
        pic_profile_signup.setImage(image);
        image = new Image(imgDir + "MedicVirtual_logo.png");
        pic_logo_sidebar.setImage(image);
        image = new Image(imgDir + "booking.png");
        pic_splashscreen_dashboard.setImage(image);
        image = new Image(imgDir + "no_profile_photo.jpg");
        pic_profile_view_profile.setImage(image);
        image = new Image(imgDir + "noproduct.png");
        pic_product_buy_medical_supplies.setImage(image);
        image = new Image(imgDir + "health-medical.jpg");
        pic_news_read_medical_news.setImage(image);
        image = new Image(imgDir + "bank_card.png");
        pic_visa_card.setImage(image);
        image = new Image(imgDir + "payment_successful.png");
        pic_payment_successful.setImage(image);
    }






    //Login
    public void login_clicked(ActionEvent e) {
        int count=0;
        for(int i=0; i<viewprofile.userid.size(); i++) {
            if (txt_userid_signin.getText().equals(viewprofile.userid.get(i)) && txt_password_signin.getText().equals(viewprofile.password.get(i))) {
                panel_sidebar.setVisible(true);
                panel_content.setVisible(true);
                panel_dashboard.setVisible(true);
                panel_signin.setVisible(false);
                System.out.println("Login");
                signinID = viewprofile.userid.get(i);
                count++;
                break;
            }
        }
        if(count==0){
            lbl_warning_signin.setText("The username or password you entered is incorrect. Please try again.");
            System.out.println("Invalid username or password");

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Invalid username or password");
            alert.setHeaderText("The username or password you entered is incorrect. Please try again.");
            alert.showAndWait();

        }
    }
    public void create_account_clicked(){
        panel_signin.setVisible(false);
        panel_signup.setVisible(true);
        panel_signup_right.setVisible(true);
        panel_signup_left.setVisible(false);
        filePath = imgDir + "no_profile_photo.jpg";
        Image image_default = new Image(filePath);
        pic_profile_signup.setImage(image_default);

        ObservableList<String> item_gender = cmb_gender_signup.getItems();
        item_gender.add("Male");
        item_gender.add("Female");
        cmb_gender_signup.setValue("Male");
    }

    //Sign Up
    public void signup_upload_picture(ActionEvent e) throws IOException {
            fileChooser = new FileChooser();
            fileChooser.setTitle("Open Resource File");
            selectedFile = fileChooser.showOpenDialog(stage);
            filePath = selectedFile.getAbsolutePath();

            File src = new File(filePath);
            viewprofile.setUserid(txt_userid_signup.getText());
            File dest = new File(imgDir + txt_userid_signup.getText() + ".jpg");
            if(dest.exists())
                dest.delete();
            Files.copy(src.toPath(), dest.toPath());

            Image image = new Image(dest.toPath().toString());
            pic_profile_signup.setImage(image);
            viewprofile.setProfile(txt_userid_signup.getText(), txt_password_signup.getText(), txt_full_name_signup.getText(), txt_id_signup.getText(), txt_phone_signup.getText(), txt_address_signup.getText(), (String) cmb_gender_signup.getValue(), Double.parseDouble(txt_weight_signup.getText()), Double.parseDouble(txt_height_signup.getText()), Integer.parseInt(txt_age_signup.getText()), dest.toPath().toString());
            panel_signin.setVisible(true);
            panel_signup_left.setVisible(false);
            panel_signup.setVisible(false);
            System.out.println("Congratulation! You have successfully created an account.");
    }
    public void create_account_clicked_signup(){
        txt_userid_signup.setText(txt_userid_signup.getText());
        txt_password_signup.setText(txt_password_signup.getText());
        txt_full_name_signup.setText(txt_full_name_signup.getText());
        txt_id_signup.setText(txt_id_signup.getText());
        txt_phone_signup.setText(txt_phone_signup.getText());
        txt_address_signup.setText(txt_address_signup.getText());
        txt_gender_signup.setText(txt_gender_signup.getText());
        cmb_gender_signup.setValue(cmb_gender_signup.getValue());
        txt_weight_signup.setText(txt_weight_signup.getText());
        txt_height_signup.setText(txt_height_signup.getText());
        txt_age_signup.setText(txt_age_signup.getText());

        if(!txt_userid_signup.getText().isEmpty() && !txt_password_signup.getText().isEmpty() && !txt_full_name_signup.getText().isEmpty() &&  !txt_id_signup.getText().isEmpty() &&!txt_phone_signup.getText().isEmpty() && !txt_address_signup.getText().isEmpty() && !txt_weight_signup.getText().isEmpty() && !txt_height_signup.getText().isEmpty() && !txt_age_signup.getText().isEmpty()) {
            System.out.println("Select your profile picture");
            panel_signup_left.setVisible(true);
            panel_signup_right.setVisible(false);
        }
        else{
            System.out.println("Please enter your details");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("No input");
            alert.setContentText("Please enter your details to create an account.");
            alert.showAndWait();
        }
    }

    //View User Profile
    public void view_profile(ActionEvent e) {
        txt_address_view_profile.setStyle("-fx-font-size: 10px;");
        lbl_warning_view_profile.setText("You can edit your profile here. Please click on the save button to save your changes.");
        lbl_warning_view_profile.setStyle("-fx-text-fill: red;");
        System.out.println("view_profile");
        panel_dashboard.setVisible(false);
        panel_view_profile.setVisible(true);
        panel_book_appointment.setVisible(false);
        panel_buy_medical_supplies.setVisible(false);
        panel_read_medical_news.setVisible(false);
        panel_monitor_fitness_and_health.setVisible(false);
        panel_checkout.setVisible(false);

        panel_news1.setVisible(false);
        panel_news2.setVisible(false);
        panel_news3.setVisible(false);
        panel_news4.setVisible(false);


        btn_view_profile_sidebar.setStyle("-fx-background-color: coral;");
        btn_book_appointment_sidebar.setStyle("-fx-background-color: #0c182f;");
        btn_buy_medical_supplies_sidebar.setStyle("-fx-background-color: #0c182f;");
        btn_read_medical_news_sidebar.setStyle("-fx-background-color: #0c182f;");
        btn_monitor_fitness_and_health_sidebar.setStyle("-fx-background-color: #0c182f;");

        ObservableList<String> item_gender = cmb_gender_view_profile.getItems();
        item_gender.add("Male");
        item_gender.add("Female");
        default_gender = item_gender.get(0);
        cmb_gender_view_profile.setValue(default_gender);

        for(int i=0; i<viewprofile.userid.size(); i++) {
            if (signinID.equals(viewprofile.userid.get(i))){
                txt_full_name_view_profile.setText(viewprofile.name.get(i));
                txt_id_view_profile.setText(viewprofile.id.get(i));
                txt_address_view_profile.setText(viewprofile.address.get(i));
                txt_phone_view_profile.setText(viewprofile.phone.get(i));
                cmb_gender_view_profile.setValue(viewprofile.gender.get(i));
                txt_weight_view_profile.setText(viewprofile.weight.get(i).toString());
                txt_height_view_profile.setText(viewprofile.height.get(i).toString());
                txt_age_view_profile.setText(viewprofile.age.get(i).toString());
                Image user_image = new Image(viewprofile.pic_path.get(i));
                pic_profile_view_profile.setImage(user_image);

            }
        }

    }
    public void save_profile_info(ActionEvent e) {

        System.out.println("Your edit has been saved.");
        lbl_warning_view_profile.setStyle("-fx-text-fill: green;");
        lbl_warning_view_profile.setText("Your edit has been saved.");
        viewprofile.name.set(viewprofile.userid.indexOf(signinID), txt_full_name_view_profile.getText());
        viewprofile.id.set(viewprofile.userid.indexOf(signinID), txt_id_view_profile.getText());
        viewprofile.phone.set(viewprofile.userid.indexOf(signinID), txt_phone_view_profile.getText());
        viewprofile.address.set(viewprofile.userid.indexOf(signinID), txt_address_view_profile.getText());
        viewprofile.weight.set(viewprofile.userid.indexOf(signinID), Double.parseDouble(txt_weight_view_profile.getText()));
        viewprofile.height.set(viewprofile.userid.indexOf(signinID), Double.parseDouble(txt_height_view_profile.getText()));
        viewprofile.age.set(viewprofile.userid.indexOf(signinID), Integer.parseInt(txt_age_view_profile.getText()));

        //System.out.println("Name : " + txt_full_name_view_profile.getText());
        //System.out.println("IC Number : " + txt_id_view_profile.getText());
        //System.out.println("Address : " + txt_address_view_profile.getText());
        //System.out.println("Gender : " + cmb_gender_view_profile.getValue());
        //System.out.println("Weight : " + txt_weight_view_profile.getText());
        //System.out.println("Height : " + txt_height_view_profile.getText());
        //System.out.println();

    }
    public void clear_profile_info(ActionEvent e) {
        txt_full_name_view_profile.setText("");
        txt_id_view_profile.setText("");
        txt_address_view_profile.setText("");
        txt_phone_view_profile.setText("");
        cmb_gender_view_profile.setValue(default_gender);
        txt_weight_view_profile.setText("0");
        txt_height_view_profile.setText("0");
        txt_age_view_profile.setText("1");
        Image image_default = new Image(imgDir + "no_profile_photo.jpg");
        pic_profile_view_profile.setImage(image_default);
    }
    public void select_a_picture() throws IOException {
        System.out.println("Select a Picture");
        fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        selectedFile = fileChooser.showOpenDialog(stage);
        filePath = selectedFile.getAbsolutePath();

        File src = new File(filePath);
        File dest = new File(imgDir + signinID + ".jpg");
        if(dest.exists())
            dest.delete();
        Files.copy(src.toPath(), dest.toPath());

        Image image = new Image(viewprofile.pic_path.get(viewprofile.getIndex(signinID)));
        pic_profile_view_profile.setImage(image);
    }


    //Book Medical Appoinment
    public void book_appointment(ActionEvent e) {
        System.out.println("book_appointment");
        lbl_alert_book_appointment.setText("Please select your preferred date, time, doctor and hospital");
        panel_dashboard.setVisible(false);
        panel_view_profile.setVisible(false);
        panel_book_appointment.setVisible(true);
        panel_buy_medical_supplies.setVisible(false);
        panel_read_medical_news.setVisible(false);
        panel_monitor_fitness_and_health.setVisible(false);
        panel_checkout.setVisible(false);

        panel_news1.setVisible(false);
        panel_news2.setVisible(false);
        panel_news3.setVisible(false);
        panel_news4.setVisible(false);

        btn_view_profile_sidebar.setStyle("-fx-background-color: #0c182f;");
        btn_book_appointment_sidebar.setStyle("-fx-background-color: coral;");
        btn_buy_medical_supplies_sidebar.setStyle("-fx-background-color: #0c182f;");
        btn_read_medical_news_sidebar.setStyle("-fx-background-color: #0c182f;");
        btn_monitor_fitness_and_health_sidebar.setStyle("-fx-background-color: #0c182f;");


        ObservableList<String> item_doctors = cmb_doctors_book_appointment.getItems();
        item_doctors.addAll(bookappointment.doctor_list);
        cmb_doctors_book_appointment.setValue(bookappointment.doctor_list.get(0));
        dp_date_book_appointment.setValue(LocalDate.now());
    }

    //Handle the doctor selection event
    public void doctor_selection_event(ActionEvent e) {
        String selected_doctor = (String) cmb_doctors_book_appointment.getValue();

            if(!cmb_slots_book_appointment.getItems().isEmpty()) {
                cmb_slots_book_appointment.getItems().clear();
            }
            //System.out.println("You have selected the doctor: " + selected_doctor);
            ObservableList<String> item_slots = cmb_slots_book_appointment.getItems();
            item_slots.addAll(bookappointment.getSlotList((String) cmb_doctors_book_appointment.getValue(),cmb_doctors_book_appointment.getSelectionModel().getSelectedIndex()));
            cmb_slots_book_appointment.setValue(item_slots.get(0));
            Image image_doctor = new Image(bookappointment.doctor_picture_list.get(cmb_doctors_book_appointment.getSelectionModel().getSelectedIndex()));
            pic_doctor_book_appointment.setImage(image_doctor);
            lbl_hospital_name_book_appointment.setText(bookappointment.hospital_list.get(cmb_doctors_book_appointment.getSelectionModel().getSelectedIndex()));
    }

    //Handle the slot selection event
    public void slot_selection_event(ActionEvent e) {
        String selected_slot = (String) cmb_slots_book_appointment.getValue();
        lbl_timeinfo_book_appointment.setText((String) cmb_slots_book_appointment.getValue());
    }

    //Handle the date picker event
    public void date_picker_event(ActionEvent e) {
        selectedDate = dp_date_book_appointment.getValue();
        lbl_dateinfo_book_appointment.setText("( " + selectedDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + " )");
    }
    public void book_appointment_submit(ActionEvent e) {
        lbl_alert_book_appointment.setText("Your Booking is confirmed. Have a nice day");
        //appointmenthistory.addAppointment(viewprofile.getName(signinID), (String) cmb_doctors_book_appointment.getValue(), bookappointment.hospital_list.get(cmb_doctors_book_appointment.getSelectionModel().getSelectedIndex()), (String) cmb_slots_book_appointment.getValue(), dp_date_book_appointment.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        //appointmenthistory.getAppointmentHistory();
    }
    public void clear_book_appointment_info() {
        cmb_doctors_book_appointment.setValue(bookappointment.doctor_list.get(0));
        cmb_slots_book_appointment.setValue(bookappointment.getSlotList((String) cmb_doctors_book_appointment.getValue(),cmb_doctors_book_appointment.getSelectionModel().getSelectedIndex()).get(0));
        dp_date_book_appointment.setValue(LocalDate.now());
        lbl_alert_book_appointment.setText("Please select your preferred date, time, doctor and hospital");
    }

    //Buy Medical Supplies
    public void buy_medical_supplies(ActionEvent e) {
        System.out.println("buy_medical_supplies");
        panel_dashboard.setVisible(false);
        panel_view_profile.setVisible(false);
        panel_book_appointment.setVisible(false);
        panel_buy_medical_supplies.setVisible(true);
        panel_read_medical_news.setVisible(false);
        panel_monitor_fitness_and_health.setVisible(false);
        panel_checkout.setVisible(false);

        panel_news1.setVisible(false);
        panel_news2.setVisible(false);
        panel_news3.setVisible(false);
        panel_news4.setVisible(false);

        btn_view_profile_sidebar.setStyle("-fx-background-color: #0c182f;");
        btn_book_appointment_sidebar.setStyle("-fx-background-color: #0c182f;");
        btn_buy_medical_supplies_sidebar.setStyle("-fx-background-color: coral;");
        btn_read_medical_news_sidebar.setStyle("-fx-background-color: #0c182f;");
        btn_monitor_fitness_and_health_sidebar.setStyle("-fx-background-color: #0c182f;");

        ObservableList<String> item_products = cmb_products_buy_medical_supplies.getItems();
        item_products.addAll(buymedicalsupplies.getProductList());

        cmb_products_buy_medical_supplies.setValue(buymedicalsupplies.product_name_list.get(0));
        lst_cart.getItems().clear();
        if(checkout_counter == 0) {
            buymedicalsupplies.emptyProductList();
            buymedicalsupplies.default_product();
            update_panel(e);
        }

    }
    public void update_panel(ActionEvent e) {
        lbl_product_name_buy_medical_supplies.setText(buymedicalsupplies.product_name_list.get(cmb_products_buy_medical_supplies.getSelectionModel().getSelectedIndex()));
        lbl_rating_buy_medical_supplies.setText(buymedicalsupplies.product_rating_list.get(cmb_products_buy_medical_supplies.getSelectionModel().getSelectedIndex()));
        lbl_price_buy_medical_supplies.setText(buymedicalsupplies.product_price_list.get(cmb_products_buy_medical_supplies.getSelectionModel().getSelectedIndex()));
        Image image_product = new Image(buymedicalsupplies.product_pic_path_list.get(cmb_products_buy_medical_supplies.getSelectionModel().getSelectedIndex()));
        pic_product_buy_medical_supplies.setImage(image_product);
        lbl_stock_buy_medical_supplies.setText(buymedicalsupplies.product_stock_list.get(cmb_products_buy_medical_supplies.getSelectionModel().getSelectedIndex()) + " in stock");
    }
    public void add_to_cart() {
        int quantity = Integer.valueOf(txt_quantity_buy_medical_supplies.getText());
        if (quantity < buymedicalsupplies.product_stock_list.get(cmb_products_buy_medical_supplies.getSelectionModel().getSelectedIndex())) {
            System.out.println(buymedicalsupplies.add_items_to_cart(quantity, buymedicalsupplies.product_stock_list.get(cmb_products_buy_medical_supplies.getSelectionModel().getSelectedIndex())));
            ObservableList<String> item_cart = lst_cart.getItems();
            for (int i = 0; i < quantity; i++) {
                item_cart.add(buymedicalsupplies.product_name_list.get(cmb_products_buy_medical_supplies.getSelectionModel().getSelectedIndex()));
            }
            buymedicalsupplies.calculateTotal(Double.parseDouble(buymedicalsupplies.product_price_list.get(cmb_products_buy_medical_supplies.getSelectionModel().getSelectedIndex())), quantity);
            int temp = buymedicalsupplies.product_stock_list.get(cmb_products_buy_medical_supplies.getSelectionModel().getSelectedIndex()) - quantity;
            if (buymedicalsupplies.product_stock_list.get(cmb_products_buy_medical_supplies.getSelectionModel().getSelectedIndex()) > 0) {
                buymedicalsupplies.product_stock_list.set(cmb_products_buy_medical_supplies.getSelectionModel().getSelectedIndex(), temp);
                lbl_stock_buy_medical_supplies.setText(buymedicalsupplies.product_stock_list.get(cmb_products_buy_medical_supplies.getSelectionModel().getSelectedIndex()) + " in stock");
            }
        }

          else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText("Invalid Quantity Information");
            alert.setContentText("Make sure the quantity does not exceeds stock value ");
            alert.showAndWait();
        }
        lst_cart.setStyle("-fx-font-size: 7px;");
    }
    public void proceed_to_checkout() {
        if(lst_cart.getItems().size()>0) {
            System.out.println("Proceed to Checkout");
            panel_buy_medical_supplies.setVisible(false);
            panel_checkout.setVisible(true);
            panel_delivery.setVisible(true);
            panel_payment.setVisible(false);
            panel_checkout_complete.setVisible(false);

            circle_delivery.setFill(Color.web("#ff0000"));
            circle_payment.setFill(Color.web("#ffffff"));
            circle_complete.setFill(Color.web("#ffffff"));
            line_1.setStroke(Color.web("#ffffff"));
            line_2.setStroke(Color.web("#ffffff"));
        }
        else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error");
            alert.setHeaderText("No Items in Cart");
            alert.setContentText("Please add items to cart before proceeding to checkout");
            alert.showAndWait();
        }
    }

    public void save_delivery_info(){
        if(txt_shipping_address.getText().isEmpty() || txt_shipping_address.getText().equals("Enter Shipping Address")){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText("No Shipping Address");
            alert.setContentText("Please enter shipping address before proceeding to checkout");
            alert.showAndWait();
        }
        else{
            System.out.println("Delivery Informaton Saved");
            panel_delivery.setVisible(false);
            panel_payment.setVisible(true);
            panel_checkout_complete.setVisible(false);

            circle_delivery.setFill(Color.web("#ff0000"));
            circle_payment.setFill(Color.web("#ff0000"));
            circle_complete.setFill(Color.web("#ffffff"));
            line_1.setStroke(Color.web("#ff0000"));
            line_2.setStroke(Color.web("#ffffff"));

            System.out.println("Delivery Address: " + txt_shipping_address.getText());
            lbl_total_checkout.setText("Total: RM" + df.format(buymedicalsupplies.getTotal()));
        }
    }

    public void save_payment_info(){
        if(txt_card_number.getText().isEmpty() || txt_cardholder_name.getText().isEmpty() || txt_expiry_month.getText().isEmpty() || txt_expiry_year.getText().isEmpty() || txt_cvv.getText().isEmpty() || !txt_card_number.getText().matches("\\d+") || !txt_cardholder_name.getText().matches("[a-zA-Z\\s]+") || !txt_expiry_month.getText().matches("\\d+") || !txt_expiry_year.getText().matches("\\d+") || !txt_cvv.getText().matches("\\d+")){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText("Invalid Payment Information");
            alert.setContentText("Please fill in your payment information before proceeding to checkout");
            alert.showAndWait();
        }
        else {
            System.out.println("Payment Informaton Saved");
            panel_delivery.setVisible(false);
            panel_payment.setVisible(false);
            panel_checkout_complete.setVisible(true);
            checkout_counter++;

            circle_delivery.setFill(Color.web("#ff0000"));
            circle_payment.setFill(Color.web("#ff0000"));
            circle_complete.setFill(Color.web("#ff0000"));
            line_1.setStroke(Color.web("#ff0000"));
            line_2.setStroke(Color.web("#ff0000"));

            System.out.println("Card Number: " + txt_card_number.getText());
            System.out.println("Card Holder Name: " + txt_cardholder_name.getText());
            System.out.println("Card Expiry Month: " + txt_expiry_month.getText());
            System.out.println("Card Expiry Year: " + txt_expiry_year.getText());
            System.out.println("Card CVV: " + txt_cvv.getText());
        }
    }

    public void return_to_buy_medical_supplies(){
        System.out.println("Return to Buy Medical Supplies");
        panel_buy_medical_supplies.setVisible(true);
        panel_checkout.setVisible(false);
        panel_delivery.setVisible(false);
        panel_payment.setVisible(false);
        panel_checkout_complete.setVisible(false);

        circle_delivery.setFill(Color.web("#ffffff"));
        circle_payment.setFill(Color.web("#ffffff"));
        circle_complete.setFill(Color.web("#ffffff"));
        line_1.setStroke(Color.web("#ffffff"));
        line_2.setStroke(Color.web("#ffffff"));

        lst_cart.getItems().clear();
        cmb_products_buy_medical_supplies.setValue(buymedicalsupplies.product_name_list.get(0));
    }

    //Read Medical News
    public void read_medical_news(ActionEvent e) {
        System.out.println("read_medical_news");
        panel_dashboard.setVisible(false);
        panel_view_profile.setVisible(false);
        panel_book_appointment.setVisible(false);
        panel_buy_medical_supplies.setVisible(false);
        panel_read_medical_news.setVisible(true);
        panel_monitor_fitness_and_health.setVisible(false);

        panel_news1.setVisible(false);
        panel_news2.setVisible(false);
        panel_news3.setVisible(false);
        panel_news4.setVisible(false);

        btn_view_profile_sidebar.setStyle("-fx-background-color: #0c182f;");
        btn_book_appointment_sidebar.setStyle("-fx-background-color: #0c182f;");
        btn_buy_medical_supplies_sidebar.setStyle("-fx-background-color: #0c182f;");
        btn_read_medical_news_sidebar.setStyle("-fx-background-color: coral;");
        btn_monitor_fitness_and_health_sidebar.setStyle("-fx-background-color: #0c182f;");
        btn_news1_read_medical_news.setText(readmedicalnews.get_news_list().get(0));
        btn_news2_read_medical_news.setText(readmedicalnews.get_news_list().get(1));
        btn_news3_read_medical_news.setText(readmedicalnews.get_news_list().get(2));
        btn_news4_read_medical_news.setText(readmedicalnews.get_news_list().get(3));
    }
    public void news1_open_page() {
        System.out.println("News 1 is opened");
        panel_dashboard.setVisible(false);
        panel_view_profile.setVisible(false);
        panel_book_appointment.setVisible(false);
        panel_buy_medical_supplies.setVisible(false);
        panel_read_medical_news.setVisible(false);
        panel_monitor_fitness_and_health.setVisible(false);

        panel_news1.setVisible(true);
        panel_news2.setVisible(false);
        panel_news3.setVisible(false);
        panel_news4.setVisible(false);
        lbl_title_news1.setText(readmedicalnews.get_news_list().get(0));
        txt_description_news1.setText(readmedicalnews.get_news_description_list().get(0));
    }
    public void news2_open_page() {
        System.out.println("News 2 is opened");
        panel_dashboard.setVisible(false);
        panel_view_profile.setVisible(false);
        panel_book_appointment.setVisible(false);
        panel_buy_medical_supplies.setVisible(false);
        panel_read_medical_news.setVisible(false);
        panel_monitor_fitness_and_health.setVisible(false);

        panel_news1.setVisible(false);
        panel_news2.setVisible(true);
        panel_news3.setVisible(false);
        panel_news4.setVisible(false);
        lbl_title_news2.setText(readmedicalnews.get_news_list().get(1));
        txt_description_news2.setText(readmedicalnews.get_news_description_list().get(1));
    }
    public void news3_open_page() {
        System.out.println("News 3 is opened");
        panel_dashboard.setVisible(false);
        panel_view_profile.setVisible(false);
        panel_book_appointment.setVisible(false);
        panel_buy_medical_supplies.setVisible(false);
        panel_read_medical_news.setVisible(false);
        panel_monitor_fitness_and_health.setVisible(false);

        panel_news1.setVisible(false);
        panel_news2.setVisible(false);
        panel_news3.setVisible(true);
        panel_news4.setVisible(false);
        lbl_title_news3.setText(readmedicalnews.get_news_list().get(2));
        txt_description_news3.setText(readmedicalnews.get_news_description_list().get(2));
    }
    public void news4_open_page() {
        System.out.println("News 4 is opened");
        panel_dashboard.setVisible(false);
        panel_view_profile.setVisible(false);
        panel_book_appointment.setVisible(false);
        panel_buy_medical_supplies.setVisible(false);
        panel_read_medical_news.setVisible(false);
        panel_monitor_fitness_and_health.setVisible(false);

        panel_news1.setVisible(false);
        panel_news2.setVisible(false);
        panel_news3.setVisible(false);
        panel_news4.setVisible(true);

        lbl_title_news4.setText(readmedicalnews.get_news_list().get(3));
        txt_description_news4.setText(readmedicalnews.get_news_description_list().get(3));
    }
    public void back(){
        System.out.println("Returning to the main News Page");
        panel_dashboard.setVisible(false);
        panel_view_profile.setVisible(false);
        panel_book_appointment.setVisible(false);
        panel_buy_medical_supplies.setVisible(false);
        panel_read_medical_news.setVisible(true);
        panel_monitor_fitness_and_health.setVisible(false);

        panel_news1.setVisible(false);
        panel_news2.setVisible(false);
        panel_news3.setVisible(false);
        panel_news4.setVisible(false);
    }

    //Monitor User's Fitness and Health
    public void monitor_fitness_and_health(ActionEvent e){

            System.out.println("monitor_fitness_and_health");

            lbl_title_monitor_fitness_and_health.setText("Good Day, " + viewprofile.getName(signinID) + "!");
            txt_bmi_monitor_fitness_and_health.setText(String.valueOf(df.format(monitorfitnessandhealth.calculate_BMI(viewprofile.weight.get(viewprofile.getIndex(signinID)), viewprofile.height.get(viewprofile.getIndex(signinID))))));
            txt_calorie_monitor_fitness_and_health.setText(String.valueOf(df.format(monitorfitnessandhealth.calculate_calorie(viewprofile.weight.get(viewprofile.getIndex(signinID)), viewprofile.height.get(viewprofile.getIndex(signinID)), viewprofile.age.get(viewprofile.getIndex(signinID)), viewprofile.getGender(signinID)))));
            lbl_bmi_class_monitor_fitness_and_health.setText("Your BMI is in the " + monitorfitnessandhealth.getBMIclass(monitorfitnessandhealth.calculate_BMI(viewprofile.weight.get(viewprofile.getIndex(signinID)), viewprofile.height.get(viewprofile.getIndex(signinID)))) + " category.");
            Image image = new Image(monitorfitnessandhealth.getBMIclassPic(monitorfitnessandhealth.getBMIclass(monitorfitnessandhealth.calculate_BMI(viewprofile.weight.get(viewprofile.getIndex(signinID)), viewprofile.height.get(viewprofile.getIndex(signinID))))));
            pic_bmi_class_monitor_fitness_and_health.setImage(image);

            panel_dashboard.setVisible(false);
            panel_view_profile.setVisible(false);
            panel_book_appointment.setVisible(false);
            panel_buy_medical_supplies.setVisible(false);
            panel_read_medical_news.setVisible(false);
            panel_monitor_fitness_and_health.setVisible(true);

            panel_news1.setVisible(false);
            panel_news2.setVisible(false);
            panel_news3.setVisible(false);
            panel_news4.setVisible(false);

            btn_view_profile_sidebar.setStyle("-fx-background-color: #0c182f;");
            btn_book_appointment_sidebar.setStyle("-fx-background-color: #0c182f;");
            btn_buy_medical_supplies_sidebar.setStyle("-fx-background-color: #0c182f;");
            btn_read_medical_news_sidebar.setStyle("-fx-background-color: #0c182f;");
            btn_monitor_fitness_and_health_sidebar.setStyle("-fx-background-color: coral;");
    }

    //exit program
    public void exit(ActionEvent e){
        panel_dashboard.setVisible(false);
        panel_view_profile.setVisible(false);
        panel_book_appointment.setVisible(false);
        panel_buy_medical_supplies.setVisible(false);
        panel_read_medical_news.setVisible(false);
        panel_monitor_fitness_and_health.setVisible(false);

        btn_view_profile_sidebar.setStyle("-fx-background-color: #0c182f;");
        btn_book_appointment_sidebar.setStyle("-fx-background-color: #0c182f;");
        btn_buy_medical_supplies_sidebar.setStyle("-fx-background-color: #0c182f;");
        btn_read_medical_news_sidebar.setStyle("-fx-background-color: #0c182f;");
        btn_monitor_fitness_and_health_sidebar.setStyle("-fx-background-color: #0c182f;");
        //System.out.println("BYE !");
        //model.exit_program();

        System.out.println("Logout");
        panel_signin.setVisible(true);
        panel_sidebar.setVisible(false);
        panel_content.setVisible(false);
        //reset the warning label in the login panel
        lbl_warning_signin.setText("Please enter your userID and password");
    }
}
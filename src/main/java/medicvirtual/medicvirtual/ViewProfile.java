package medicvirtual.medicvirtual;

import java.util.ArrayList;

public class ViewProfile{
    String startDir = System.getProperty("user.dir");
    String imgDir = startDir + "/src/main/resources/medicvirtual/medicvirtual/images/";
    ArrayList<String> userid = new ArrayList<String>();
    ArrayList<String> password = new ArrayList<String>();
    ArrayList<String> name = new ArrayList<String>();
    ArrayList<String> id = new ArrayList<String>();
    ArrayList<String> phone = new ArrayList<String>();
    ArrayList<String> address = new ArrayList<String>();
    ArrayList<String> gender = new ArrayList<String>();
    ArrayList<Double> weight = new ArrayList<Double>();
    ArrayList<Double> height = new ArrayList<Double>();
    ArrayList<Integer> age = new ArrayList<Integer>();
    ArrayList<String> pic_path = new ArrayList<String>();

    public ViewProfile(){
        default_values();
    }
    public String getName(String signinID){
        int temp =0;
        for(int i=0;i<userid.size();i++){
            if(userid.get(i).equals(signinID)){
                temp=i;
            }
        }

        return name.get(temp);
    }
    public Integer getIndex(String signinID){
        int temp =0;
        for(int i=0;i<userid.size();i++){
            if(userid.get(i).equals(signinID)){
                temp=i;
            }
        }
        return temp;
    }
    public Boolean getGender(String signinID){
        String gender_string = gender.get(this.getIndex(signinID));
        if(gender_string.equals("Male") || gender_string.equals("MALE") || gender_string.equals("male")){
            return true;
        }
        else return false;
    }
    public void setUserid(String userid) {
        this.userid.add(userid);
    }
    public void setProfile(String user_name_login, String password_login, String user_fullname, String user_id, String user_phonenumber, String user_address, String user_gender, Double user_weight, Double user_height, Integer user_age, String user_pic_path){
        //userid.add(user_name_login);
        password.add(password_login);
        id.add(user_id);
        name.add(user_fullname);
        phone.add(user_phonenumber);
        address.add(user_address);
        gender.add(user_gender);
        weight.add(user_weight);
        height.add(user_height);
        age.add(user_age);
        pic_path.add(user_pic_path);
    }
    public void default_values(){
        //since we don't have a database, we will use arraylist to store the data. Just keep adding users here
        //admin
        userid.add("admin");
        password.add("admin");
        name.add("Admin");
        id.add("000000000000");
        phone.add("0123456789");
        address.add("01, Taman Utama 2, 09000 Kulim, Kedah");
        gender.add("Male");
        weight.add(60.0);
        height.add(166.0);
        age.add(33);
        pic_path.add(imgDir + this.userid.get(0) + ".jpg");


        //user_1
        userid.add("khushaalan");
        password.add("khushaalan");
        name.add("Khushaalan Arjunan");
        id.add("001013030968");
        phone.add("0123456789");
        address.add("No.12, Taman Melor, 09000 Kulim, Kedah");
        gender.add("Male");
        weight.add(60.0);
        height.add(166.0);
        age.add(23);
        pic_path.add(imgDir + this.userid.get(1) + ".jpg");

        //user_2
        userid.add("samira");
        password.add("samira");
        name.add("Samira Nair Vasu Davan");
        id.add("021023-04-1002");
        phone.add("0112436889");
        address.add("No.21, Taman Tiram, 09000 Kulim, Kedah");
        gender.add("Female");
        weight.add(58.0);
        height.add(158.0);
        age.add(21);
        pic_path.add(imgDir + this.userid.get(2) + ".jpg");

        //user_3
        userid.add("pravin");
        password.add("pravin");
        name.add("Pravinashwarn A/L Raja Sageran");
        id.add("020125-07-3253");
        phone.add("01724266589");
        address.add("No.88, Taman Bukit Kechil, 09000 Kulim, Kedah");
        gender.add("Male");
        weight.add(50.0);
        height.add(156.0);
        age.add(21);
        pic_path.add(imgDir + this.userid.get(3) + ".jpg");

        //user_4
        userid.add("roshan");
        password.add("roshan");
        name.add("ROSHAN LAU JEE VAN");
        id.add("020922-08-5863");
        phone.add("01224395364");
        address.add("No.536, Taman Bayam, 09000 Kulim, Kedah");
        gender.add("Male");
        weight.add(68.0);
        height.add(168.0);
        age.add(21);
        pic_path.add(imgDir + this.userid.get(4) + ".jpg");
    }
}
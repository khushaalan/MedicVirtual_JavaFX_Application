package medicvirtual.medicvirtual;

import java.util.ArrayList;
import java.util.HashMap;

public class BookAppointment {
    String startDir = System.getProperty("user.dir");
    String nophoto = startDir + "/src/main/resources/medicvirtual/medicvirtual/images/no_profile_photo.jpg";
    ArrayList<String> hospital_list = new ArrayList<String>();
    ArrayList<String> doctor_list = new ArrayList<String>();
    ArrayList<String> doctor_picture_list = new ArrayList<String>();
    ArrayList<String> appointment_slot_list = new ArrayList<String>();
    HashMap<String,Integer> appointment_slot_list_count = new HashMap<String,Integer>();

    public BookAppointment() {
        default_values();
    }
    public void default_values(){
        doctor_list.add("Dr. Adam");
        hospital_list.add("Hospital Kulim");
        doctor_picture_list.add(startDir + "/src/main/resources/medicvirtual/medicvirtual/images/dr.adam.jpg");
        appointment_slot_list_count.put("Dr. Adam", 3);
        appointment_slot_list.add("10:00 AM");
        appointment_slot_list.add("12:00 PM");
        appointment_slot_list.add("2:00 PM");

        doctor_list.add("Dr. Melinda");
        hospital_list.add("Hospital Kulim");
        doctor_picture_list.add(startDir + "/src/main/resources/medicvirtual/medicvirtual/images/dr.melinda.jpg");
        appointment_slot_list_count.put("Dr. Melinda", 4);
        appointment_slot_list.add("10:00 AM");
        appointment_slot_list.add("2:00 PM");
        appointment_slot_list.add("4:00 PM");
        appointment_slot_list.add("6:00 PM");

        doctor_list.add("Dr. Matthew");
        hospital_list.add("Hospital Kulim");
        doctor_picture_list.add(startDir + "/src/main/resources/medicvirtual/medicvirtual/images/dr.matthew.jpg");
        appointment_slot_list_count.put("Dr. Matthew", 2);
        appointment_slot_list.add("8:00 AM");
        appointment_slot_list.add("10:00 AM");



        //hospital_2

        doctor_list.add("Dr. James");
        hospital_list.add("Hospital Penang");
        doctor_picture_list.add(startDir + "/src/main/resources/medicvirtual/medicvirtual/images/dr.james.jpg");
        appointment_slot_list_count.put("Dr. James", 3);
        appointment_slot_list.add("8:00 AM");
        appointment_slot_list.add("10:00 AM");
        appointment_slot_list.add("12:00 PM");

        doctor_list.add("Dr. Shashnita");
        hospital_list.add("Hospital Penang");
        doctor_picture_list.add(startDir + "/src/main/resources/medicvirtual/medicvirtual/images/dr.shashnita.jpg");
        appointment_slot_list_count.put("Dr. Shashnita", 4);
        appointment_slot_list.add("12:00 PM");
        appointment_slot_list.add("02:00 PM");
        appointment_slot_list.add("04:00 PM");
        appointment_slot_list.add("06:00 PM");


        doctor_list.add("Dr. Atika");
        hospital_list.add("Hospital Penang");
        doctor_picture_list.add(startDir + "/src/main/resources/medicvirtual/medicvirtual/images/dr.atika.jpg");
        appointment_slot_list_count.put("Dr. Atika", 2);
        appointment_slot_list.add("10:00 AM");
        appointment_slot_list.add("12:00 PM");


        //hospital_3
        doctor_list.add("Dr. Ashwin");
        hospital_list.add("Hospital UKM");
        doctor_picture_list.add(startDir + "/src/main/resources/medicvirtual/medicvirtual/images/dr.ashwin.jpg");
        appointment_slot_list_count.put("Dr. Ashwin", 3);
        appointment_slot_list.add("12:00 PM");
        appointment_slot_list.add("02:00 PM");
        appointment_slot_list.add("04:00 PM");

        doctor_list.add("Dr. Ashraf");
        hospital_list.add("Hospital UKM");
        doctor_picture_list.add(startDir + "/src/main/resources/medicvirtual/medicvirtual/images/dr.ashraf.jpg");
        appointment_slot_list_count.put("Dr. Ashraf", 4);
        appointment_slot_list.add("08:00 AM");
        appointment_slot_list.add("10:00 AM");
        appointment_slot_list.add("12:00 AM");
        appointment_slot_list.add("02:00 PM");

        doctor_list.add("Dr. Jessica");
        hospital_list.add("Hospital UKM");
        doctor_picture_list.add(startDir + "/src/main/resources/medicvirtual/medicvirtual/images/dr.jessica.jpg");
        appointment_slot_list_count.put("Dr. Jessica", 2);
        appointment_slot_list.add("02:00 PM");
        appointment_slot_list.add("04:00 PM");

    }
    public ArrayList<String> getSlotList(String doctor_name,Integer doctor_index){
        ArrayList<String> particular_slot_list = new ArrayList<String>();
        int count=0;
        for(int i=0;i<doctor_index;i++){
            count = count + appointment_slot_list_count.get(doctor_list.get(i));
        }
        for(int i=count;i<count+appointment_slot_list_count.get(doctor_list.get(doctor_index));i++){
            particular_slot_list.add(appointment_slot_list.get(i));
        }
        return particular_slot_list;
    }
}
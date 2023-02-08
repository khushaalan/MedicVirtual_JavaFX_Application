package medicvirtual.medicvirtual;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class BuyMedicalSupplies{
    String startDir = System.getProperty("user.dir");
    ArrayList<String> product_name_list = new ArrayList<String>();
    ArrayList<String> product_rating_list = new ArrayList<String>();
    ArrayList<String> product_price_list = new ArrayList<String>();
    ArrayList<String> product_pic_path_list = new ArrayList<String>();
    ArrayList<Integer> product_stock_list = new ArrayList<Integer>();
    ArrayList<Double> product_subtotal = new ArrayList<Double>();
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public BuyMedicalSupplies(){
        default_product();
    }
    public String add_items_to_cart(int quantity,int stock){
        String description="";
        if(quantity <= stock) {
            if (quantity == 1) {
                description = "You've successfully added " + quantity + " into the cart.";
            } else if (quantity > 1) {
                description = "You've successfully added " + quantity + " items into the cart.";
            } else {
                description = "No item is added into the cart.";
            }
        }
        else{
            description = "No stock available. Try reducing the quantity of the products that you pick.";
        }
        return description;
    }
    public void default_product(){
        product_name_list.add("STEGLATRO 15MG 28S");
        product_rating_list.add("****/*****");
        product_price_list.add("58.88");
        product_pic_path_list.add(startDir + "/src/main/resources/medicvirtual/medicvirtual/images/STEGLATRO 15MG 28S.png");
        product_stock_list.add(25);

        product_name_list.add("OLFEN-100 SR DEPOCAPS 10S");
        product_rating_list.add("****/*****");
        product_price_list.add("68.88");
        product_pic_path_list.add(startDir + "/src/main/resources/medicvirtual/medicvirtual/images/OLFEN-100 SR DEPOCAPS 10S.jpg");
        product_stock_list.add(20);

        product_name_list.add("(R)APO-AMITRIPTYLINE 25MG 10X10S");
        product_rating_list.add("****/*****");
        product_price_list.add("78.88");
        product_pic_path_list.add(startDir + "/src/main/resources/medicvirtual/medicvirtual/images/(R)APO-AMITRIPTYLINE 25MG 10X10S.jpg");
        product_stock_list.add(35);

        product_name_list.add("SALOSONE OINT. 15G");
        product_rating_list.add("***/*****");
        product_price_list.add("88.88");
        product_pic_path_list.add(startDir + "/src/main/resources/medicvirtual/medicvirtual/images/SALOSONE OINT. 15G.jpg");
        product_stock_list.add(18);

        product_name_list.add("(S)Live-Well C Burst 1000mg 30s");
        product_rating_list.add("***/*****");
        product_price_list.add("98.88");
        product_pic_path_list.add(startDir + "/src/main/resources/medicvirtual/medicvirtual/images/(S)Live-Well C Burst 1000mg 30s.jpg");
        product_stock_list.add(27);

        product_name_list.add("Bio-Life Bio-Zinc Complex 2X100s");
        product_rating_list.add("****/*****");
        product_price_list.add("108.88");
        product_pic_path_list.add(startDir + "/src/main/resources/medicvirtual/medicvirtual/images/Bio-Life Bio-Zinc Complex 2X100s.jpeg");
        product_stock_list.add(12);

        product_name_list.add("Berocca Sachet 2sx12");
        product_rating_list.add("*****/*****");
        product_price_list.add("118.88");
        product_pic_path_list.add(startDir + "/src/main/resources/medicvirtual/medicvirtual/images/Berocca Sachet 2sx12.jpg");
        product_stock_list.add(22);

        product_name_list.add("(E)Berry Bright With Stevia 10x8g");
        product_rating_list.add("*****/*****");
        product_price_list.add("128.88");
        product_pic_path_list.add(startDir + "/src/main/resources/medicvirtual/medicvirtual/images/(E)Berry Bright With Stevia 10x8g.jpg");
        product_stock_list.add(15);
    }
    public ArrayList<String> getProductList(){
        return product_name_list;
    }
    public void emptyProductList(){
        product_name_list.clear();
        product_rating_list.clear();
        product_price_list.clear();
        product_pic_path_list.clear();
        product_stock_list.clear();
    }
    public void calculateTotal(double product_price, int quantity) {
        product_subtotal.add(product_price * quantity);
    }
    public Double getTotal(){
        double total = 0;
        for(int i = 0; i < product_subtotal.size(); i++){
            total += product_subtotal.get(i);
        }
        return total;
    }

}
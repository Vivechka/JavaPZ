import java.util.Arrays;
import java.util.Comparator;


public class lab4 {
    private String type;
    private int price;
    private String worldSide;
    private String brand;
    private String useType;

    public lab4 (String in_type, int in_price, String in_brand, String in_worldSide, String in_useType){
        type = in_type;
        worldSide = in_worldSide;
        brand = in_brand;
        price = in_price;
        useType = in_useType;
    }

    public String getType(){
        return type;
    }
    public String getworldSide(){
        return worldSide;
    }
    public String getbrand(){
        return brand;
    }
    public int getprice(){
        return price;
    }
    public String getuseType() { return useType; }

    public static void main(String[] args) {

        lab4 [] arr = {new lab4("mascara", 150, "lamel", "European", "Decorative"),
                new lab4("face serum", 350, "the Ordinary", "American", "care"),
                new lab4("lipstick", 2250, "Tom Ford", "European", "Decorative")
        };

        Arrays.sort(arr, new sort_iprice());
        System.out.println("Масив сортований по ціні за зростанням:\n");
        for(int i = 0; i < arr.length; i++){
            System.out.format("Вид{ %s}  Ціна{ %d}  Бренд{ %s}  Частина світу-виробник{ %s}  Тип{ %s}\n", arr[i].getType(), arr[i].getprice(),  arr[i].getbrand(), arr[i].getworldSide(), arr[i].getuseType());
        }

        Arrays.sort(arr, new sort_iprice1());
        System.out.println("\nМасив сортований по ціні за спаданням:\n");
        for(int i = 0; i < arr.length; i++){
            System.out.format("Вид{ %s}  Ціна{ %d}  Бренд{ %s}  Частина світу-виробник{ %s}  Тип{ %s}\n", arr[i].getType(), arr[i].getprice(),  arr[i].getbrand(), arr[i].getworldSide(), arr[i].getuseType());
        }
    }

}
class sort_iprice implements Comparator<lab4>{
    @Override
    public int compare(lab4 o1, lab4 o2) { return o1.getprice() - o2.getprice(); }
}
class sort_iprice1 implements Comparator<lab4>{
    @Override
    public int compare(lab4 o1, lab4 o2) { return o2.getprice() - o1.getprice(); }
}

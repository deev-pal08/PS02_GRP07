package Retailshop;
import java.util.*;
import java.util.Map;

public class Shop {
    static Retailshop.Map<String, Retail> map = new Retailshop.Map<>();

    //driver method
    public static void main(String []args) {
        char option,ch = 'y';
        String local;
        Scanner sc = new Scanner(System.in);
        try {
            while (ch== 'Y' || ch == 'y') {
                System.out.println("\n Choose option of choice for following functions: \n");
                System.out.println(Utility.MENU);
                option = sc.next().charAt(0);
                System.out.println();

                List<String> keys = new ArrayList<>();
                keys = map.getKeys();

                switch (option) {
                    case 'a': {
                        Retail retail = Retail.setRetailShop();
                        map.add(retail.name, retail);
                        System.out.println("Entered record successfully!");
                        break;
                    }
                    case 'b': {
                        System.out.println(Utility.CASEB);
                        for (String key : keys) {
                            Retail value = map.get(key);
                            if (value.status.equals(Utility.TBD) || value.status.equals(Utility.OFD))
                                System.out.println(key + " -> " + value.status);
                        }
                        break;
                    }
                    case 'c': {
                        System.out.println("Enter the locality: ");
                        local = sc.next();
                        sc.nextLine();

                        for (String key : keys) {
                            Retail value = map.get(key);

                            if (value.locality.equalsIgnoreCase(local))
                            {
                                System.out.print(value.name);
                            }
                        }break;
                    }
                    case 'd':
                    {
                        int count = 0;
                        for (String key : keys) {
                            Retail value = map.get(key);
                            if (value.status.equals(Utility.D)) {
                                count++;
                            }
                        }
                        System.out.println("Number of retail shops to whom delivery has been done: " + count);
                        break;
                    }
                    case 'e' :
                    {
                        System.out.println("Thank you!");
                        break;
                    }
                    default :
                    {
                        System.out.println("Enter correct option.");
                        break;
                    }
                }
                System.out.print("\n Do you wish to continue?\n Enter Y/y for yes and N/n for no:  ");
                ch = sc.next().charAt(0);
                continue;
            }
        }catch(Exception e){
            throw(e);
        }

    }

}

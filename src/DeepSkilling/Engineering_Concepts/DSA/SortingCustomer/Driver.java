package DeepSkilling.Engineering_Concepts.DSA.SortingCustomer;

import java.util.ArrayList;

class Order {
    int orderId;
    String customerName;
    double amount;

    public Order(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }


}

public class Driver {

    public static ArrayList<Order> quickSort(ArrayList<Order> al) {

        if (al.size() <= 1) {
            return al;
        }

        double pivot = al.get(al.size() - 1).amount;

        ArrayList<Order> left = new ArrayList<>();
        ArrayList<Order> right = new ArrayList<>();

        for (int i = 0; i < al.size() - 1; i++) {
            if (al.get(i).amount <= pivot) {
                left.add(al.get(i));
            } else {
                right.add(al.get(i));
            }
        }

        left = quickSort(left);
        right = quickSort(right);

        ArrayList<Order> result = new ArrayList<>();

        result.addAll(left);
        result.add(al.get(al.size() - 1)); // Pivot
        result.addAll(right);

        return result;
    }

    public static void bubbleSort(ArrayList<Order> al) {
        int n = al.size();

        for(int i=0;i<n-1;i++){
            boolean swap=false;
            for(int j=1;j<n-i;j++){
                if (al.get(j).amount < al.get(j - 1).amount) {

                    Order temp = al.get(j);
                    al.set(j, al.get(j - 1));
                    al.set(j - 1, temp);

                    swap = true;
                }
            }
            if(!swap)break;
        }

    }

    public static void display(ArrayList<Order> al) {
        for (Order o : al) {
            System.out.println(
                    o.orderId + " " + o.customerName + " " + o.amount
            );
        }
    }

    public static void main(String[] args) {

        ArrayList<Order> store = new ArrayList<>();

        store.add(new Order(103, "Aman", 1500));
        store.add(new Order(101, "Rahul", 2500));
        store.add(new Order(105, "Priya", 1800));
        store.add(new Order(102, "Neha", 3200));
        store.add(new Order(104, "Rohan", 2100));


        System.out.println("Before Sorting:");
        Driver.display(store);

//        Driver.bubbleSort(store);
//        System.out.println("\nAfter Sorting: based on amount");
//        Driver.display(store);

        ArrayList<Order> ans=Driver.quickSort(store);

        System.out.println("\nAfter Sorting: based on amount");
        Driver.display(ans);
    }

//    Quicksort is generally preferred over Bubblesort because for larger datasets
//    its average time complexity beats bubble by a major difference
//    ex-for 10,000 orders

//    bubble sort will take approx( 1,000,000 operations) O(n^2)
//    quick sort will take approx( 140,000 operations) O(nlogn)


}
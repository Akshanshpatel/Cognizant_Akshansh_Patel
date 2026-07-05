package DeepSkilling.Engineering_Concepts.DSA.E_commerce;

import java.util.ArrayList;

class Product{
    int id;
    String name;
    String category;

    public Product(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public static void linearSearch(int id,ArrayList<Product> al){
        for(int i=0;i<al.size();i++){
            if(id==al.get(i).id){
                int ans=i+1;
                System.out.println("Product found using Linear search at "+ans+" position= "+al.get(i).name);
                return;
            }
        }
        System.out.println("No such product");
    }

    public static void binarySearch(int id, ArrayList<Product> al) {
        int low = 0;
        int high = al.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (al.get(mid).id == id) {
                System.out.println("Product found using Binary search at " + (mid + 1) + " position= "+al.get(mid).name);
                return;
            } else if (al.get(mid).id < id) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("No such product");
    }

}


// Q--> What is O() & how it helps in analyzing algos?

// Ans-> O() defines how algorithm's space or time requirement grows as input grows. It helps in defining algo as it
// helps find how efficient algorithms are, compare diff algos

// where Best case is the least time/space required , Average is the expected one and Worst case is the maximum time/space algo can take

public class driver {
    public static void main(String[] args) {
        ArrayList<Product> store = new ArrayList<>();

        store.add(new Product(1, "Sujata Fan", "Electronics"));
        store.add(new Product(2, "Oppo Earbuds", "Electronics"));
        store.add(new Product(3, "Mouse", "Electronics"));
        store.add(new Product(4, "Keyboard", "Electronics"));
        store.add(new Product(5, "Monitor", "Electronics"));

        Product.linearSearch(2,store);

        Product.binarySearch(4, store);
    }

//    Binary Search is more suitable for finding items as it takes only O(logn) time complexity Only constraint--Works on sorted storage
//    Linear search take O(n) time but searches the target in any storage sorted or not..

}

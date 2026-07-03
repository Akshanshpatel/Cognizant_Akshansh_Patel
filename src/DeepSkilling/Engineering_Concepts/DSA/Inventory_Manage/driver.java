package DeepSkilling.Engineering_Concepts.DSA.Inventory_Manage;

// Q-1 -> Why DS are essential in handling large inventories?
// Q-2 -> Which types of Ds are used for storing them why?

// Ans1--> Because using DS for handling inventories gives many advantages as storing them randomly
//          Faster searching(Hashset O(1), BST O(logn) ), faster insertion, deletion, better memory use and scalability

// Ans2 --> Some are HashSet, HashMap , Arrays, Binary Search Trees, etc..

import java.util.ArrayList;

//different classes diff responsibilities--> SOLID principles

public class driver{

    static class Product{
        int id;
        String name;
        int quantity;
        double price;

        public Product(int id, String name, int quantity, double price) {
            this.id = id;
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }
    }

    static class Inventory{
        ArrayList<Product> store=new ArrayList<>();

        public void addProduct(int id, String name, int quantity, double price){
            store.add(new Product(id, name, quantity, price));
        }

        public void updateProd(int id, String name, int quantity, double price){
            for(Product p:store){
                if(p.id==id){
                    p.name=name;
                    p.quantity=quantity;
                    p.price=price;
                    return;
                }
                System.out.println("Product updated successfully..");
            }
            System.out.println("Product not found");
        }

        public void deleteProd(int id) {
            for (int i = 0; i < store.size(); i++) {
                if (store.get(i).id == id) {
                    store.remove(i);
                    return;
                }
            }
            System.out.println("Product does not exist.");
        }

        public void displayProducts(){
            System.out.println("Id--Name--Price--Quantity");
            for(int i=0;i< store.size();i++){
                System.out.println(i+"-> "+store.get(i).id+" "+store.get(i).name+" "+store.get(i).price+" "+store.get(i).quantity);
            }
        }

    }

    public static void main(String[] args) {

        Inventory d_mart = new Inventory();

        // Add products
        d_mart.addProduct(101, "Laptop", 5, 55000);
        d_mart.addProduct(102, "Mouse", 20, 500);
        d_mart.addProduct(103, "Keyboard", 15, 1200);

        // Display all products
        System.out.println("Initial Inventory:");
        d_mart.displayProducts();

        // Update a product
        d_mart.updateProd(102, "Wireless Mouse", 18, 800);

        // Delete a product
        d_mart.deleteProd(101);

        // Display after update and delete
        System.out.println("\nInventory After Update and Delete:");
        d_mart.displayProducts();
    }
}

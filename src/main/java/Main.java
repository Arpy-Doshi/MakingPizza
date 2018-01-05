public class Main
{
    public static void main(String args[])
    {

        // Create an object of class Chef
        // new Chef();

        // Declare a variable chef with reference type Chef and Assign it a newly created Chef object
        Chef chef = new Chef();

        // Assign value to instance variable "name" of chef object
        chef.setName("Shruti");


        Consumer consumer = new Consumer();
        consumer.setName("Arpy");  /// Instead of customer_a give a real person's name

        // call instance method "placeOrder" of consumer object by passing chef as an argument
        consumer.placeOrder(chef);



    }
}

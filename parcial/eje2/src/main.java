import DTO.toy;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main_Toy {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        String opc = "1";
        toy_interface1 cosa= (toy_interface1) new toy();

        do {
            Scanner d=new Scanner(System.in);
            System.out.println("""
                    ~~~~~ Menu ~~~~~\n
                     1.Add Toy\n
                     2.To list \n
                     3.Edit Toy\n
                     4.Remove Toy\n
                     5.Observe the Number of Toys\n
                     6.To leave\n""");
            opc= d.next();
            switch (opc){
                case "1":{
                    System.out.println("~~~~~ Adding Toy ~~~~~");
                    System.out.println("Enter the id:");
                    int id= Integer.parseInt(d.next());
                    System.out.println("Enter the name:");
                    String name=d.next();
                    System.out.println("Category:");
                    String category=d.next();
                    System.out.println("Enter the price:");
                    Double price= d.nextDouble();
                    System.out.println("Enter the amount:");
                    int amount= Integer.parseInt(d.next());

                    cosa.save(new toy(id,name,category,price,amount));
                }
                case "2":{
                    System.out.println("~~~~~ List ~~~~~");
                    List<toy> Toys = cosa.findAll();
                    if (!Toys.isEmpty()){
                        Toys.forEach(System.out::println);
                    }else{
                        System.out.println("No records");
                    }
                }break;
                case "3":{
                    System.out.println("~~~~~ Editing Toy ~~~~~");
                    System.out.println("Enter the id number of the toy you want to edit:");
                    int idEdit = Integer.parseInt(d.next());
                    toy existingToy = cosa.findById(idEdit);

                    if (existingToy != null) {
                        System.out.println("Enter the name:");
                        String newname=d.next();
                        System.out.println("Category:");
                        String newcategory=d.next();
                        System.out.println("Enter the price:");
                        Double newprice= d.nextDouble();
                        System.out.println("Enter the amount:");
                        int newamount= Integer.parseInt(d.next());
                        existingToy.setToyName(newname);
                        existingToy.setCategoryToy(newcategory);
                        existingToy.setPrice(newprice);
                        existingToy.setExistingQuantity(newamount);
                        cosa.update(existingToy);
                        System.out.println("The toy data has been updated.");
                    } else {
                        System.out.println("No toys were found with the id provided.");
                    }
                }break;
                case "4":{
                    System.out.println("~~~~~ Removing Toy ~~~~~");
                    System.out.println("Enter Id number:");
                    int id= Integer.parseInt(d.next());
                    boolean buscar= cosa.findById(id)==null;
                    if (!buscar){
                        System.out.println("Se solicito la eliminación del Juguete: "+cosa.findById(id));
                        cosa.delete(cosa.findById(id));
                        System.out.println("The toy was removed");
                    }else {
                        System.out.println("No toy found with that id");
                    }
                }break;
                case "5":{
                    System.out.println("~~~~~ Number of Toys ~~~~~");
                    int totalToys= cosa.findAll().stream().mapToInt(toy::getExistingQuantity).sum();
                    System.out.println("In the store there are "+ totalToys + " Toys in total.");
                }break;
                case "6":{
                    opc="6";
                }break;
            }

        }while (!opc.equals("6"));
    }
}

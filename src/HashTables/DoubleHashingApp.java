/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashTables;

import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class DoubleHashingApp {

  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 10;
        HashChain hc = new HashChain(size);

        while (true) {
            System.out.println("Pilih:");
            System.out.println("[1] Insert");
            System.out.println("[2] Delete");
            System.out.println("[3] Find");
            System.out.println("[4] Display Table");
            System.out.println("[5] Exit");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Insert value:  ");
                    int data = input.nextInt();
                    hc.insert(data);
                    break;

                case 2:
                    System.out.print("Delete value: : ");
                    int keyToDelete = input.nextInt();
                    hc.delete(keyToDelete);
                    break;

                case 3:
                    System.out.print("Find value: : ");
                    int keyToFind = input.nextInt();
                    Link foundLink = hc.find(keyToFind);
                    if (foundLink == null) {
                        System.out.println("not found");
                    } else {
                        System.out.println("found: " + foundLink.getKey());
                    }
                    break;

                case 4:
                    System.out.println("Displaying Hash Table:");
                    hc.displayTable();
                    break;

                case 5:
                    System.out.println("Exiting Application");
                    input.close();
                    return;

                default:
                    System.out.println("invalid option!");
            }
        }
  }
}

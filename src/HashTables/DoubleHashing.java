/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashTables;

/**
 *
 * @author Sheila
 */
public class DoubleHashing {

    private int[] table;
    private int size;

    public DoubleHashing(int size) {
        this.size = size;
        table = new int[size];
    }

    private int hashFunc1(int key) {
        return key % size;
    }

    private int hashFunc2(int key) {
        return 5 - (key % 5);
    }

    public void insert(int data) {
        int index = hashFunc1(data);
        int step = hashFunc2(data);

        while (table[index] != 0) {
            index = (index + step) % size;
        }
        table[index] = data;
    }

    public boolean find(int data) {
        int index = hashFunc1(data);
        int step = hashFunc2(data);

        while (table[index] != 0) {
            if (table[index] == data) {
                return true;
            }
            index = (index + step) % size;
        }
        return false;
    }

    public void display() {
        System.out.println("Hash Table:");
        for (int i = 0; i < size; i++) {
            if (table[i] != 0) {
                System.out.println("Index " + i + ": " + table[i]);
            } else {
                System.out.println("Index " + i + ": empty");
            }
        }
    }
    

    public void delete(int data) {
        int index = hashFunc1(data);
        int step = hashFunc2(data);

        while (table[index] != 0) {
            if (table[index] == data) {
                table[index] = 0;
                return;
            }
            index = (index + step) % size;
        }
        System.out.println("not found!");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

/**
 *
 * @author Sheila
 */
class Arrays{
    private int arr[];
    private int nElemen;
    
    public Arrays(int size){
        arr = new int[size];
        nElemen = 0;
    }
    
    public void insert(int value){
        arr[nElemen] = value;
        nElemen++;
    }
    
    public void display(){
        for(int i = 0; i < nElemen; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    
    public void mergeSort(){
        int[] workSpace = new int[nElemen];
        recMergeSort(workSpace, 0, nElemen-1);
    }
    
    public void recMergeSort(int[] workSpace, int lowerBound, int upperBound){
        if(lowerBound == upperBound){
            return;
        }else{
            int mid = (lowerBound + upperBound) / 2;
            recMergeSort(workSpace, lowerBound, mid);
            recMergeSort(workSpace, mid + 1, upperBound);
            merge(workSpace, lowerBound, mid + 1, upperBound);
        }
    }
    
    public void merge(int[] workSpace, int lowIndex, int highIndex, int upperBound){
        int j = 0;
        int lowerBound = lowIndex;
        int mid = highIndex - 1;
        int nItem = upperBound - lowerBound + 1;
        
        while(lowIndex <= mid && highIndex <= upperBound){
            if(arr[lowIndex] < arr[highIndex]){
                workSpace[j++] = arr[lowIndex++];
            }else{
                workSpace[j++] = arr[highIndex++];
            }
        }
        
        while(lowIndex <= mid){
            workSpace[j++] = arr[lowIndex++];
        }
        
        while(highIndex <= upperBound){
            workSpace[j++] = arr[highIndex++];
        }
        
        for(j = 0; j < nItem; j++){
            arr[lowerBound + j] = workSpace[j];
        }
    }
} //akhir class 

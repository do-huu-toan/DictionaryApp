/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import models.*;

/**
 *
 * @author DHT
 */
public class DictionaryCommandLine extends DictionaryManagement{
    public void dictionaryBasic(){
        insertFromCommandline(); //Nhập dữ liệu
    }
    //Hiển thị kết quả: 
    public void showAllWords(){
        System.out.println("No\t\tEnglish\t\tVietnamese");
        for(int i = 0;i < listWord.size();i++){
            System.out.println(i+1 + "\t\t" + listWord.get(i).getWordTarget() + "\t\t" + listWord.get(i).getWordExplain());
        }
    }
    public void dictionaryAdvanced() throws FileNotFoundException, IOException{
        insertFromFile();
        showAllWords();
        //dictionaryLookup();
    }
    public void dictionarySearcher(){
        boolean isFind = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tu bat dau: ");
        String searcher = scanner.nextLine();
        System.out.println("No\t\tEnglish\t\tVietnamese");
        for(int i = 0;i < listWord.size();i++){
            if(listWord.get(i).getWordTarget().startsWith(searcher)){
                isFind = true;
                System.out.println(i+1 + "\t\t" + listWord.get(i).getWordTarget() + "\t\t" + listWord.get(i).getWordExplain());
            }
        }
        if(!isFind){
            System.out.println("Not Found");
        }
    }
    
    public Dictionary dictionaryFilter(String text){
        Dictionary result = new Dictionary();
        for(int i = 0;i < listWord.size();i++){
            if(listWord.get(i).getWordTarget().startsWith(text)){
                result.add(listWord.get(i));
            }
        }
        return result;
    }
    /*
    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("Xin chào");
        DictionaryCommandLine main = new DictionaryCommandLine();
        //main.dictionaryAdvanced();
        //main.dictionarySearcher();
        //main.insertFromCommandline();
        //main.dictionaryExportToFile();
        main.insertFromFile();
        main.showAllWords();
        
    }
*/
}

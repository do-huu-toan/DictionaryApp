/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;
import models.*;

/**
 *
 * @author DHT
 */
public class DictionaryManagement extends Dictionary{
    protected String urlData ;
    public DictionaryManagement(){
        
    }
    //Chức năng nhập liệu:
    public void insertFromCommandline(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập từ tiếng Anh: ");
        String wordTarget = input.nextLine();
        System.out.println("Nhập từ tiếng Việt: ");
        String wordExplain = input.nextLine();
        
    }
    //Chức năng insert dữ liệu từ file dictionaries.txt
    public void insertFromFile() throws FileNotFoundException{ //Exception lỗi mở File
        //Đọc nội dung
        //System.out.print(urlData);
        File f = new File(urlData);
        try (Scanner input = new Scanner(f)) {
            while(input.hasNextLine()){
                String[] content = input.nextLine().split("=");
                Word w = new Word(content[0], content[1]);
                listWord.add(w);
                System.out.println("Done!");
            }
        }
        
    }
    //Tra cứu từ điển 
    public String dictionaryLookup(){
        String result = "Not Found";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tu muon tra cuu: ");
        String search = scanner.nextLine();
        for(Word i:listWord){
            if(i.getWordTarget().equals(search))
            {
                result = i.getWordExplain();
                break;
            }
        }
        System.out.println(result);
        return result;
    }
}

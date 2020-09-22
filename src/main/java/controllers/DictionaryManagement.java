/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream; //OutputStream File
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Scanner;
import models.*;

/**
 *
 * @author DHT
 */
public class DictionaryManagement extends Dictionary{
    protected String urlData;
    
    public DictionaryManagement(){
        urlData = "data/dictionaries.txt";
    }
    //Chức năng nhập liệu:
    public void insertFromCommandline(){
        
        Scanner input = new Scanner(System.in, "UTF-8");
        System.out.println("Nhap so tu: ");
        int n = Integer.parseInt(input.nextLine()); //Chống trôi lệnh
        
        for(int i = 0; i < n;i++)
        {
            System.out.println("Nhap tu Tieng Anh: ");
            String wordTarget = input.nextLine();
            System.out.println("Nhap nghia Tieng Viet: ");
            String wordExplain = input.nextLine();
            Word newWord = new Word(wordTarget, wordExplain);
            listWord.add(newWord);
        }
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
            }
        }
    }
    //Tra cứu từ điển 
    public void dictionaryLookup(){
        boolean isFind = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tu can tra nghia: ");
        String searchWord = scanner.nextLine();
        for(Word i : listWord){
            if(i.getWordTarget().equals(searchWord)){
                System.out.println(i.getWordExplain());
                isFind = true;
                break;
            }
        }
        if(!isFind)System.out.println("Not Found");
    }
    public void dictionaryExportToFile() throws FileNotFoundException, UnsupportedEncodingException{
            //System.out.println(urlData);
            File f = new File(urlData);
            PrintWriter doc = new PrintWriter(f);
            //System.out.println("Start Record");
            listWord.forEach(i -> {
             
            String content = i.getWordTarget() + "=" + i.getWordExplain();
            System.out.println(content);
            doc.println(content);
            });
            doc.close();
    }
}

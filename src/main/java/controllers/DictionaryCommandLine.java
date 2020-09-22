/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.FileNotFoundException;
import models.Word;

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
    public void dictionaryAdvanced() throws FileNotFoundException{
        insertFromFile();
        showAllWords();
        dictionaryLookup();
    }
    public static void main(String[] args) throws FileNotFoundException {
        DictionaryCommandLine main = new DictionaryCommandLine();
        main.dictionaryAdvanced();
    }
}

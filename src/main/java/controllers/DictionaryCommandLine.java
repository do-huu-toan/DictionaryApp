/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.FileNotFoundException;

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
        
    }
    public void dictionaryAdvanced() throws FileNotFoundException{
        insertFromFile();
        showAllWords();
        dictionaryLookup();
    }
    
}

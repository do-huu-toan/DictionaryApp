/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author DHT
 */
public class Dictionary{
    protected ArrayList<Word> listWord;
    public Dictionary(){
        listWord = new ArrayList<Word>();
        
    }
    public void setListWord(ArrayList<Word> list){
        this.listWord = list;
    }
    public ArrayList<Word> getListWord(){
        return this.listWord;
    }
    public void add(Word w){
        listWord.add(w);
    }

    public Word size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

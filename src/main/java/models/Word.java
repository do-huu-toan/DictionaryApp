package models;
/**
 *
 * @author DHT
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Word {
    private String word_target;
    private String word_explain;
    
    public Word(String _wordTarget, String _wordExplain){
        this.word_target = _wordTarget;
        this.word_explain = _wordExplain;
    }
    public void setWordTarget(String _word){
        this.word_target = _word;
    }
    public String getWordTarget(){
        return this.word_target;
    }

    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }
    
    public String getWordExplain() {
        return this.word_explain;
    }
    public static void main(String[] args) {
        System.out.println("Hello");
    }
    
}

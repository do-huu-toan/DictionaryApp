/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Views;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import controllers.DictionaryCommandLine;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import javax.swing.DefaultListModel;
import models.Dictionary;
import models.Word;
/**
 *
 * @author DHT
 */
public class searchPanel extends javax.swing.JPanel{

    /**
     * Creates new form searchPanel
     */
    DictionaryCommandLine DC;
    
    public void loadDataToList(DefaultListModel dataListWord){
        //this.DC = DC;
        lst_listWord.setModel(dataListWord);
    }
    public searchPanel(DictionaryCommandLine DC, DefaultListModel dataListWord) {
        System.out.println("Khoi tao searchPanel");
        initComponents();
        this.DC = DC;
        loadDataToList(dataListWord);
        setSize(1100,570);
        
    }

    searchPanel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelGradiente3 = new rspanelgradiente.RSPanelGradiente();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_listWord = new javax.swing.JList<>();
        btn_searchText = new rojeru_san.RSButton();
        txt_TextTranslate = new rojeru_san.RSMTextFull();
        btn_Speaking = new rojerusan.RSButtonIconI();
        checkbox_useApi = new javax.swing.JCheckBox();
        cb_Language = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_Mean = new javax.swing.JTextPane();

        rSPanelGradiente3.setToolTipText("");
        rSPanelGradiente3.setColorPrimario(new java.awt.Color(255, 255, 255));
        rSPanelGradiente3.setColorSecundario(new java.awt.Color(255, 255, 255));
        rSPanelGradiente3.setLayout(null);

        lst_listWord.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        lst_listWord.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lst_listWord.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lst_listWord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lst_listWord.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lst_listWordValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lst_listWord);

        rSPanelGradiente3.add(jScrollPane1);
        jScrollPane1.setBounds(20, 110, 491, 403);

        btn_searchText.setText("Dịch");
        btn_searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchTextActionPerformed(evt);
            }
        });
        rSPanelGradiente3.add(btn_searchText);
        btn_searchText.setBounds(377, 11, 136, 29);

        txt_TextTranslate.setPlaceholder("Gõ văn bản cần dịch");
        txt_TextTranslate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_TextTranslateKeyTyped(evt);
            }
        });
        rSPanelGradiente3.add(txt_TextTranslate);
        txt_TextTranslate.setBounds(10, 11, 353, 40);

        btn_Speaking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/speaking.png"))); // NOI18N
        btn_Speaking.setText("Phát âm");
        btn_Speaking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Speaking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SpeakingActionPerformed(evt);
            }
        });
        rSPanelGradiente3.add(btn_Speaking);
        btn_Speaking.setBounds(324, 519, 177, 40);

        checkbox_useApi.setText("Sử dụng API để dịch văn bản?");
        rSPanelGradiente3.add(checkbox_useApi);
        checkbox_useApi.setBounds(340, 60, 169, 40);

        cb_Language.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vietnamese - English", "English - Vietnamese" }));
        cb_Language.setSelectedIndex(1);
        rSPanelGradiente3.add(cb_Language);
        cb_Language.setBounds(100, 70, 132, 20);

        jLabel1.setText("Chọn ngôn ngữ: ");
        rSPanelGradiente3.add(jLabel1);
        jLabel1.setBounds(20, 70, 81, 20);

        txt_Mean.setEditable(false);
        txt_Mean.setBorder(null);
        txt_Mean.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_Mean.setToolTipText("");
        jScrollPane2.setViewportView(txt_Mean);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelGradiente3, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(rSPanelGradiente3, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void lst_listWordValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lst_listWordValueChanged
        // TODO add your handling code here:
        String searchWord = lst_listWord.getSelectedValue();
        String content = DC.dictionaryLookup(searchWord);
        txt_Mean.setText(content);
    }//GEN-LAST:event_lst_listWordValueChanged
    
    
    
    private void btn_searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchTextActionPerformed
        // TODO add your handling code here: 
        if(checkbox_useApi.getSelectedObjects() != null){
            
            String pathAPI = "https://dht-translate-api.herokuapp.com/api/";
            
            if(cb_Language.getSelectedIndex() == 0)
            {

                try {
                    pathAPI = pathAPI + "vi-en/" + URLEncoder.encode(txt_TextTranslate.getText(), "UTF-8").replace("+", "%20");
                } catch (Exception ex) {
                    txt_Mean.setText("Không thể giải mã văn bản");
                }

            }
            if(cb_Language.getSelectedIndex() == 1)
            {
                try {
                    pathAPI = pathAPI +  "en-vi/" + URLEncoder.encode(txt_TextTranslate.getText(), "UTF-8").replace("+", "%20");
                } catch (Exception ex) {
                    txt_Mean.setText("Không thể giải mã văn bản");
                }

            }

            try {
                
                txt_Mean.setText(sendHttpGETRequest(pathAPI));
            } catch (Exception ex) {
                txt_Mean.setText("Không kết nối được đến api ! Kiểm tra lại kết nối internet");
            }
        }

    }//GEN-LAST:event_btn_searchTextActionPerformed

    @SuppressWarnings("empty-statement")
    private void txt_TextTranslateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TextTranslateKeyTyped
        // TODO add your handling code here:
        String searchWord = txt_TextTranslate.getText();
        searchWord += evt.getKeyChar(); //Nhận hết ký tự cuối cùng
        searchWord = searchWord.toLowerCase().trim();
        Dictionary filterList =  new Dictionary();

        if(searchWord.equals("")) filterList.setListWord(DC.getListWord());
        else{
            filterList = DC.dictionaryFilter(searchWord);

        };
        var filterWord = new DefaultListModel<String>();
        for( Word i : filterList.getListWord()){
            filterWord.addElement(i.getWordTarget());
        }

        lst_listWord.setModel(filterWord);
        if(filterWord.size() > 0)lst_listWord.setSelectedIndex(0);

    }//GEN-LAST:event_txt_TextTranslateKeyTyped
    private String sendHttpGETRequest(String url_get) throws IOException {
        URL obj = new URL(url_get);
        HttpURLConnection httpURLConnection = (HttpURLConnection) obj.openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
        int responseCode = httpURLConnection.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in .readLine()) != null) {
                response.append(inputLine);
            } in .close();

            // print result
            System.out.println(response.toString());
            byte[] bytes = response.toString().getBytes();
            return new String(bytes,StandardCharsets.UTF_8); //Chuyển Raw String - UTF8 để khi build app không lỗi font
        } else {
            System.out.println("GET request not worked");
            String res = "Not found 404";
            return res;
        }
        
        
        /*
        for (int i = 1; i <= 8; i++) {
            System.out.println(httpURLConnection.getHeaderFieldKey(i) + " = " + httpURLConnection.getHeaderField(i));
        }
        */

    }
    private void btn_SpeakingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SpeakingActionPerformed
        // TODO add your handling code here:
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice voice = VoiceManager.getInstance().getVoice("kevin16");
        if(voice!=null){
            voice.allocate();
            if(lst_listWord.getSelectedIndex() != -1)voice.speak(lst_listWord.getSelectedValue());
            else voice.speak(txt_TextTranslate.getText());
        }
    }//GEN-LAST:event_btn_SpeakingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonIconI btn_Speaking;
    private rojeru_san.RSButton btn_searchText;
    private javax.swing.JComboBox<String> cb_Language;
    private javax.swing.JCheckBox checkbox_useApi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lst_listWord;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente3;
    private javax.swing.JTextPane txt_Mean;
    private rojeru_san.RSMTextFull txt_TextTranslate;
    // End of variables declaration//GEN-END:variables
}

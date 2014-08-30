/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lakpura;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author JanithWanniWin8
 */
public class TimeKeeper implements Runnable{
    
    public JLabel lbl;
    public TimeKeeper(JLabel x) {
        lbl = x;
    }

    
    @Override
    public void run() {
        try {
            while(true){
            DateFormat df2  = new SimpleDateFormat("HH:mm ss");
            Date d = new Date();
            lbl.setText(df2.format(d));
            Thread.sleep(1000);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
}

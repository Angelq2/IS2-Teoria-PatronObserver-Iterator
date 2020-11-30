package patronobserver;

import javax.swing.JTextArea;

/**
 *
 * @author angel
 */
public class AnalogClockDisplay extends ClockDisplay {
   
    public AnalogClockDisplay(String title){
        super(title);
    }
    
    @Override
    public void refreshClockDisplay(JTextArea clockDisplay, String hour, String minut, String seconds) {
        clockDisplay.setText("Analog Clock: " + hour + ":" + minut + ":" + seconds);
    }
}

package patronobserver;

import javax.swing.JTextArea;

/**
 *
 * @author angel
 */
public class DigitalClockDisplay extends ClockDisplay{

    public DigitalClockDisplay(String title){
        super(title);
    }
    
    @Override
    public void refreshClockDisplay(JTextArea clockDisplay, String hour, String minut, String seconds) {
        clockDisplay.setText("Display Clock: " + hour + ":" + minut + ":" + seconds);
    }
}

package patronobserver;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *  CLASE PRINCIPAL DE LO QUE SERIA EL OBSERVADOR
 * @author angel
 */
public abstract class ClockDisplay extends JFrame implements Observer {
    
    private JTextArea clockDisplay;
    private TimeStam timeStam;

    public ClockDisplay(String title) {
        super(title);
        this.setContentPane(createClockPane());
        this.addWindowListener(new WindowCloseManager());
        this.pack();
        this.setVisible(true);
    }
    
    @Override
    public void update(Subject subject){
        this.timeStam = (TimeStam) subject.getStatusSubject();
        refreshClockDisplay(clockDisplay, timeStam.getHour().toString(), timeStam.getMinut().toString(), timeStam.getSeconds().toString());
    }
    private JPanel createClockPane() {
        JPanel clockPanel = new JPanel();
        clockPanel.setLayout(new BorderLayout());
        clockDisplay = new JTextArea(10,40);
        clockDisplay.setEditable(false);
        JScrollPane scrollDisplay = new JScrollPane(clockDisplay);
        clockPanel.add(scrollDisplay,BorderLayout.CENTER);
        return clockPanel;
    }
   
    public abstract void refreshClockDisplay(JTextArea clockDisplay, String hour, String minut, String seconds);
   

    private static class WindowCloseManager extends WindowAdapter{

        public void WindowClosing(WindowEvent windowEvent) {
            System.exit(0);
        }
    }
    
    
}

package patronobserver;

/**
 *
 * @author angel
 */
public class Clock extends Subject{
    
    private Integer hour,minut,seconds;

    public Clock(Integer hour, Integer minut, Integer seconds) {
        this.hour = hour;
        this.minut = minut;
        this.seconds = seconds;
    }
    
    @Override
    public void updateStatusSubject(){
        tickTack();
        this.notifyObservers();
                
    }
    
    @Override
    public Object getStatusSubject(){
        return getTimeStam();
    }

    private void tickTack() {
        hour = minut == 59 && seconds == 59 ? (hour + 1) % 24 : hour;
        minut = seconds == 59? (minut + 1) % 60 : minut;
        seconds = (seconds + 1) % 60;
    }

    private Object getTimeStam() {
        return new TimeStam(hour,minut,seconds);
    }
}

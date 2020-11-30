package patronobserver;

/**
 *
 * @author angel
 */
public class TimeStam {
    
    private final Integer hour,minut,seconds;

    public TimeStam(Integer hour, Integer minut, Integer seconds) {
        this.hour = hour;
        this.minut = minut;
        this.seconds = seconds;
    }

    public Integer getHour() {
        return hour;
    }

    public Integer getMinut() {
        return minut;
    }

    public Integer getSeconds() {
        return seconds;
    }
    

}

package patronobserver;

/**
 *
 * @author angel
 */
public class PatronObserver {


    //estamos creando un sujeto(reloj) inicializado de forma especifica tenemos dos(Madrid y Berlin)
    //hay cuatro observadores, dos para madrid y dos para berlin
    // cualquier cambio que haga en el proceos de madrid yo qquiero que se comunicque con los observer de Madrid
    //igual con Berlin

    public static void main(String[] args) {
        
        Clock clockMadrid = new Clock(0,0,0);
        Clock clockBerlin = new Clock(1,0,0);
        
        ClockDisplay analogClockDisplayMadrid = new AnalogClockDisplay("Analog Clock Madrid");
        ClockDisplay digitalClockDisplayMadrid = new DigitalClockDisplay("Digital Clock Madrid");
        
        ClockDisplay analogClockDisplayBerlin = new AnalogClockDisplay("Analog Clock Berlin");
        ClockDisplay digitalClockDisplayBerlin = new AnalogClockDisplay("Analog Clock Madrid");
        
        clockMadrid.addObserver(analogClockDisplayMadrid);
        clockMadrid.addObserver(digitalClockDisplayMadrid);
        
        clockBerlin.addObserver(analogClockDisplayBerlin);
        clockBerlin.addObserver(digitalClockDisplayBerlin);
        
        while(true){
            clockMadrid.updateStatusSubject();
            clockBerlin.updateStatusSubject();
        }
                
        
    }

    
}

public class MyClass extends Microphone {
    public MyClass(String name, String color, int model) {
        super(name, color, model);
        //TODO Auto-generated constructor stub
    }
    public static void main(String[] args) {
        Microphone mic=new Microphone("Marshall AmpliMic","Black",479952);
        /*mic.color="Black";
        mic.name="Marshall AmpliMic";
        mic.model= 479952;*/
        System.out.println(mic.color +" and "+mic.name+" and "+ mic.model);
        mic.turnOn();
        mic.setVolume();
        mic.turnOff();
    }
}

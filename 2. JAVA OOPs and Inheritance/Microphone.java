public class Microphone{
    String name;
    String color;
    int model;
    public Microphone(String name, String color, int model){
        this.name=name;
        this.color=color;
        this.model=model;
    }
    public void turnOff(){
        System.out.println(this.name+ " Turn Off");
    }
    public void turnOn(){
        System.out.println(this.name+ "Turn On");
    }
    public void setVolume(){
        System.out.println(this.name + " Setting Volume");
    }
    
}

/*class MyClass {
    public static void main(String[] args) {
        Microphone mic=new Microphone();
        mic.color="Black";
        mic.name="Marshall AmpliMic";
        mic.model=479952;
        System.out.println(mic);
    }
}
*/
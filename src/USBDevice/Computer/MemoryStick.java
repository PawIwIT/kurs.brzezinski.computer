package USBDevice.Computer;

public class MemoryStick implements USBDevice {

    private String name;
    private boolean eject=false;

    public MemoryStick(String name) {
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("Connected Memory Stick");
        return true;

    }

    @Override
    public boolean disconnect() {
        if (!eject){
            System.out.println("Please eject Memory Stick first");
            return false;
        } else {
            System.out.println("MemoryStick disconected");
            return true;
        }

    }
    public void eject(){
        System.out.println("Enjecting Memory Stick");
        eject=true;
    }

    @Override
    public String getName() {
        return name;
    }
}

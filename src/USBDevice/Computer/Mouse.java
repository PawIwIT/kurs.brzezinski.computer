package USBDevice.Computer;

public class Mouse implements USBDevice {

    private String name;

    public Mouse(String name){
        this.name=name;
    }

    @Override
    public boolean connect() {
        System.out.println("Mouse conected");
        return true;
    }

    @Override
    public boolean disconnect() {
        System.out.println("Mouse disconected");
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}

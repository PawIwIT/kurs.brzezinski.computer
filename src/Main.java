import Drive.Computer.HDDDrive;
import Drive.Computer.SSDDrive;
import USBDevice.Computer.MemoryStick;
import USBDevice.Computer.Mouse;
import file.Computer.imageFile.GIFImageFile;
import file.Computer.imageFile.JPGImageFile;
import file.Computer.musicFile.Computer.MP3MusicFile;

public class Main {
    public static void main(String[] args) {

        GIFImageFile gif1 = new GIFImageFile("nazwa1.gif", 100);
        JPGImageFile jpg1 = new JPGImageFile("nazwa1.jpg", 200,80);
        MP3MusicFile mp3 = new MP3MusicFile("plik.mp3", 200, "DicoPolo", "Oczy Zielone", 90);
        //utworzylismy 3 pliki nastepnie chcemy je zapisac na dysku

        SSDDrive drive = new SSDDrive();
        drive.addFile(mp3);
        drive.addFile(gif1);
        drive.addFile(jpg1);

        drive.listFile();
        drive.findFile("plik.mp3");
        System.out.println();

    }

}
package Drive.Computer;

import file.Computer.File;
import file.Computer.imageFile.GIFImageFile;



public interface Drive {
// w interfejsie nie piszemy w jakis sposob pliki zostana dodane i wyswietlone

    //przeslaniamy dana metode
    void addFile(File file);

    void listFile();

    File findFile(String name);
}

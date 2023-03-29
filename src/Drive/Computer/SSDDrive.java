package Drive.Computer;

import file.Computer.File;
import file.Computer.imageFile.GIFImageFile;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SSDDrive implements Drive {
    private Map<String, File> files = new HashMap<>();

    @Override
    public void addFile(File file) {
    files.put(file.getName(),file);
    }
    @Override
    public void listFile() {
        Collection<File> fileCollections = files.values();

        for (File file:fileCollections) {
            System.out.println(file.getName());
        }
    }

    @Override
    public File findFile(String name) {
        return files.get(name);
    }
}

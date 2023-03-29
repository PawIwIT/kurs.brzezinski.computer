package file.Computer.imageFile;

import file.Computer.AbstractFile;
import file.Computer.FileType;

public abstract class AbstractImageFile extends AbstractFile {
    protected AbstractImageFile(String name, int size) {
      super(name,size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}

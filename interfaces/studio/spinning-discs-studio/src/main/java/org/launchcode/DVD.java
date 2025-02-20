package org.launchcode;

public class DVD extends Media implements Rewritable{
    public DVD(String name) {
        super(name, "DVD", 1200, 4700);
    }

    @Override
    public String toString() {
        return super.toString() + getFormattedFileList("Video Files");
    }

    //methods required by Rewriteable

    @Override
    public void writeFile(File file) {
        spinDisc();
        if (getFiles().contains(file)) {
            System.out.println("The video " + file.getName() + " has already been added.");
        } else if (getSpaceUsed() + file.getSize() > getCapacity()) {
            System.out.println("Warning: There is not enough space on the " + getDiscType() + " for " + file.getName() + ".");
        } else {
            getFiles().add(file);
            System.out.println("The video" + file.getName() + " has been added to " + getDiscType() + ".");
        }
    }

    @Override
    public void removeFile(File file) {
        spinDisc();
        if (fileIsPresent(file)) {
            getFiles().remove(file);
            System.out.println("The file " + file.getName() + " has been removed from the " + getDiscType());
        }
    }

    @Override
    public void reformatDisc() {
        spinDisc();
        getFiles().clear();
    }

    @Override
    public void runFile(File file) {
        if (fileIsPresent(file)) {
            spinDisc();
            System.out.println("Watching " + file.getName() + "...");
        }
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}

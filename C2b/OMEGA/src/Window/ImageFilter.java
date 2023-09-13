/**
 * The ImageFilter class is a file filter used to filter image files when selecting files in a file chooser.
 * It extends the FileFilter class and defines the criteria for accepting or rejecting files based on their extensions.
 */
package Window;

import javax.swing.filechooser.FileFilter;
import java.io.File;

public class ImageFilter extends FileFilter {
    public final static String JPEG = "jpeg";
    public final static String JPG = "jpg";
    public final static String PNG = "png";

    /**
     * Determines whether a file should be accepted or not based on its extension.
     *
     * @param file the file being considered
     * @return true if the file is a directory or has an accepted extension, false otherwise
     */
    @Override
    public boolean accept(File file) {
        if (file.isDirectory()) {
            return true;
        }

        String extension = getExtension(file);
        if (extension != null) {
            return extension.equals(JPEG) || extension.equals(JPG) || extension.equals(PNG);
        }

        return false;
    }

    /**
     * Returns the description of the file filter.
     *
     * @return the description of the file filter
     */
    @Override
    public String getDescription() {
        return "Image Only";
    }

    /**
     * Retrieves the extension of a file.
     *
     * @param file the file
     * @return the extension of the file, or null if no extension is found
     */
    private String getExtension(File file) {
        String extension = null;
        String fileName = file.getName();
        int dotIndex = fileName.lastIndexOf('.');

        if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
            extension = fileName.substring(dotIndex + 1).toLowerCase();
        }

        return extension;
    }
}

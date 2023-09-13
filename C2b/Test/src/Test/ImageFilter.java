package Test;

import javax.swing.filechooser.FileFilter;
import java.io.File;

public class ImageFilter extends FileFilter
{
    public final static String JPEG = "jpeg";
    public final static String JPG = "jpg";
    public final static String PNG = "png";

    @Override
    public boolean accept(File file)
    {
        if (file.isDirectory())
        {
            return true;
        }

        String extension = getExtension(file);
        if (extension != null)
        {
            return extension.equals(JPEG) || extension.equals(JPG) || extension.equals(PNG);
        }

        return false;
    }

    @Override
    public String getDescription()
    {
        return "Image Only";
    }

    private String getExtension(File file)
    {
        String extension = null;
        String fileName = file.getName();
        int dotIndex = fileName.lastIndexOf('.');

        if (dotIndex > 0 && dotIndex < fileName.length() - 1)
        {
            extension = fileName.substring(dotIndex + 1).toLowerCase();
        }

        return extension;
    }
}

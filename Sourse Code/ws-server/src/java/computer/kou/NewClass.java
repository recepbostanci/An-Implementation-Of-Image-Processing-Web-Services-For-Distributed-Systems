/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package computer.kou;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageReader;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
/**
 *
 * @author BSTNC
 */
public class NewClass {
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            EdgeDetectionService eds = new EdgeDetectionService();
             byte [] ar = eds.ImageTrans(File2Binary("c:/kiz.jpg"), "prewit", "Manuel", 0.01, "Vertical");
                Binary2File("C:/ist2.jpg",ar );
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     private static byte[] File2Binary(String URL) {
        FileInputStream fis = null;
        byte[] bytes = null;
        File file = null;
        try {

            file = new File(URL);
            fis = new FileInputStream(file);
            //InputStream in = resource.openStream();
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            try {
                for (int readNum; (readNum = fis.read(buf)) != -1;) {
                    bos.write(buf, 0, readNum);
                }
            } catch (IOException ex) {
            }
            bytes = bos.toByteArray();

        } catch (FileNotFoundException ex) {
            //Logger.getLogger(EdgeDetection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bytes;



    }

    private static void Binary2File(String KaydetmeDizini, byte [] bytes){

        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
            Iterator<?> readers = ImageIO.getImageReadersByFormatName("jpg");
            ImageReader reader = (ImageReader) readers.next();
            Object source = bis; // File or InputStream, it seems file is OK
            ImageInputStream iis = ImageIO.createImageInputStream(source);
            //Returns an ImageInputStream that will take its input from the given Object
            reader.setInput(iis, true);
            ImageReadParam param = reader.getDefaultReadParam();
            Image image = reader.read(0, param);
            //got an image file
            BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
            //bufferedImage is the RenderedImage to be written
            Graphics2D g2 = bufferedImage.createGraphics();
            g2.drawImage(image, null, null);
            File imageFile = new File(KaydetmeDizini);
            ImageIO.write(bufferedImage, "jpg", imageFile);
        } catch (IOException ex) {
            //Logger.getLogger(EdgeDetection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

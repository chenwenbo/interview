package com.interview.question005;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 第 0001 题：做为 Apple Store App 独立开发者，你要搞限时促销，为你的应用生成激活码（或者优惠券），使用 Python 如何生成 200 个激活码（或者优惠券）？
 * 第 0005 题：你有一个目录，装了很多照片，把它们的尺寸变成都不大于 iPhone5 分辨率的大小。
 * 参考链接:https://my.oschina.net/acitiviti/blog/370638
 */
public class ImageSizeProcess {

    /**
     * 生成iphone5的尺寸
     *
     * @param srcImagePath
     * @param formatName
     * @param targetPath
     * @param iphoneSize
     * @throws IOException
     */
    public void generateIphoneSizeImage(String srcImagePath, String formatName, String targetPath, IphoneSizeEnum iphoneSize) throws IOException {
        FileOutputStream fos = null;
        try {
            BufferedImage image = ImageIO.read(new File(srcImagePath));
            fos = new FileOutputStream(targetPath);
            ImageIO.write(drawImage(image, iphoneSize), formatName, fos);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                fos.close();
            }
        }
    }

    private BufferedImage drawImage(BufferedImage image, IphoneSizeEnum iphone5) {
        int widthRate = image.getWidth() / iphone5.getWidth();
        int heightRate = image.getHeight() / iphone5.getHeight();
        //判断分辨率是否满足
        if (widthRate > 1 || heightRate > 1) {
            int rate = widthRate > heightRate ? widthRate : heightRate;
            BufferedImage img = new BufferedImage(image.getWidth() / rate, image.getHeight() / rate, BufferedImage.TYPE_INT_RGB);
            //创建java2D对象
            Graphics2D g2d = (Graphics2D) img.getGraphics();
            //用源图像填充背景
            g2d.drawImage(image, 0, 0, image.getWidth() / rate, image.getHeight() / rate, null);
            g2d.dispose();
            return img;
        }
        return image;
    }

}

package com.interview.question000;

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
public class DrawImage {

    /**
     * 在图片上设置文字
     *
     * @param srcImagePath 图片路径
     * @param word         输入显示在图片上的文字
     * @throws IOException
     */
    public void drawWordInImage(String srcImagePath, String word, String formatName, String targetPath) throws IOException {
        FileOutputStream fos = null;
        try {
            BufferedImage image = ImageIO.read(new File(srcImagePath));
            fos = new FileOutputStream(targetPath);
            ImageIO.write(drawImage(word, image), formatName, fos);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                fos.close();
            }
        }
    }

    private BufferedImage drawImage(String num, BufferedImage image) {
        //创建java2D对象
        Graphics2D g2d = image.createGraphics();
        //用源图像填充背景
        g2d.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null, null);
        //设置透明度
        AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1);
        g2d.setComposite(ac);
        //设置文字字体名称、样式、大小
        g2d.setFont(new Font("宋体", Font.BOLD, image.getWidth() / 5));
        g2d.setColor(Color.RED);//设置字体颜色
        g2d.drawString(num, image.getWidth() - image.getWidth() / 5, image.getHeight() / 5);
        g2d.dispose();
        return image;
    }

}

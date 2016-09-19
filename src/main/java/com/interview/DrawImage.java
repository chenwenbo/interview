package com.interview;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

/**
 * 将你的 QQ 头像（或者微博头像）右上角加上红色的数字，类似于微信未读信息数量那种提示效果。
 */
public class DrawImage {

    /**
     * 在图片上设置文字
     * @param srcImagePath	图片路径
     * @param word		输入显示在图片上的文字
     * @throws IOException
     */
    public void drawWordInImage(String srcImagePath, String word, String formatName, String targetPath) throws IOException {
        FileOutputStream fos=null;
        try {
            BufferedImage image = ImageIO.read(new File(srcImagePath));
            drawImage(word, image);

            fos=new FileOutputStream(targetPath);
            ImageIO.write(image, formatName, fos);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(fos!=null){
                fos.close();
            }
        }
    }

    /**
     * 生成iphone5的尺寸
     * @param srcImagePath
     * @param word
     * @param formatName
     * @param targetPath
     * @throws IOException
     */
    public void generateIphone5Image(String srcImagePath, String word, String formatName, String targetPath) throws IOException {
        FileOutputStream fos=null;
        try {
            BufferedImage image = ImageIO.read(new File(srcImagePath));
            drawImage(image);

            fos=new FileOutputStream(targetPath);
            ImageIO.write(image, formatName, fos);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(fos!=null){
                fos.close();
            }
        }
    }

    private void drawImage(BufferedImage image) {
         //创建java2D对象
        Graphics2D g2d=image.createGraphics();
        //用源图像填充背景
        g2d.drawImage(image, 0, 0, image.getWidth()/2, image.getHeight()/2, null);
        g2d.dispose();
    }

    private void drawImage(String num, BufferedImage image) {
        //创建java2D对象
        Graphics2D g2d=image.createGraphics();
        //用源图像填充背景
        g2d.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null, null);
        //设置透明度
        AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1);
        g2d.setComposite(ac);
        //设置文字字体名称、样式、大小
        g2d.setFont(new Font("宋体", Font.BOLD, image.getWidth()/5));
        g2d.setColor(Color.RED);//设置字体颜色
        g2d.drawString(num, image.getWidth()-image.getWidth()/5, image.getHeight()/5);
        g2d.dispose();
    }

}

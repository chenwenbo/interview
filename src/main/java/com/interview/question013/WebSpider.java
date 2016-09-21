package com.interview.question013;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 第 0013 题： 用 Python 写一个爬图片的程序，爬 这个链接里的日本妹子图片 :-)
 */
public class WebSpider {

    public void fetchImage(String url) throws IOException {
        Elements images = getImage(url);
        File dir = new File(".");
        String filePath =  dir.getCanonicalPath() + File.separator + "girl";
        for (Element image : images) {
            downImgs(image.attr("src"),filePath);
        }
    }

    public Elements getImage(String url) throws IOException {
        Document doc = Jsoup.connect(url).get();
        return doc.body().select("img[class=BDE_Image]");
    }

    /**
     *  下载文件夹到本地
     * @param imgsrc 图片地址
     * @param filePath 存储图片地址
     *
     * */
    public void downImgs(String imgsrc,String filePath) throws IOException {
        //获取图片
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            //创建目录
            File files = new File(filePath);
            if(!files.exists()){
                files.mkdirs();
            }
            URL url = new URL(imgsrc);
            //连接网络图片地址
            HttpURLConnection uc=(HttpURLConnection) url.openConnection();
            //获取连接的输入流
            is=uc.getInputStream();

            //创建文件
            File file=new File(filePath+imgsrc.substring(imgsrc.lastIndexOf("/")));
            //输入到本地
            fos=new FileOutputStream(file);
            int line=-1;
            while((line=is.read())!=-1){
                fos.write(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(null!=is){
                is.close();
            }
            if(null!=fos){
                fos.close();
            }
        }

    }

}

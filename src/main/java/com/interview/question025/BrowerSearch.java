package com.interview.question025;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;
import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * 第 0025 题： 使用 Python 实现：对着电脑吼一声,自动打开浏览器中的默认网站。
 * 1. recore audio 2. use google api parse audio to txt 3. search this txt
 */
public class BrowerSearch {
    public static void main(String[] args) throws URISyntaxException, IOException {
        browerSearch(recognitionVoice());
    }

    public static String recognitionVoice() {
        //TODO speech to text ? 1 : use google api recognition voice 2 : use third-party library
        return "http://www.baidu.com";
    }

    public static void browerSearch(String uri) throws IOException, URISyntaxException {
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().browse(new URI(uri));
        }
    }

    public void recoreAudio() throws LineUnavailableException {
        AudioFormat format = new AudioFormat(8000.0f, 16, 1, true, true);
        TargetDataLine line = AudioSystem.getTargetDataLine(format);
        // Assume that the TargetDataLine, line, has already
        // been obtained and opened.
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int numBytesRead;
        byte[] data = new byte[line.getBufferSize() / 5];

        // Begin audio capture.
        line.start();

        // Read the next chunk of data from the TargetDataLine.
        numBytesRead = line.read(data, 0, data.length);
        // Save this chunk of data.
        out.write(data, 0, numBytesRead);
    }
}

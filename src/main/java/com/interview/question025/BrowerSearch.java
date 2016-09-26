package com.interview.question025;

import com.interview.question025.microphone.Microphone;
import com.interview.question025.recognizer.FlacEncoder;
import com.interview.question025.recognizer.GoogleResponse;
import com.interview.question025.recognizer.Recognizer;

import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import static com.interview.other.Contants.INPUT_AUDIO_PATH;

/**
 * 第 0025 题： 使用 Python 实现：对着电脑吼一声,自动打开浏览器中的默认网站。
 * 1. recore audio 2. use google api parse audio to txt 3. search this txt
 */
public class BrowerSearch {

    public static final String WAV_FILE = "025.wav";
    public static final String FLAC_FILE = "025.flac";

    public static void main(String[] args) throws URISyntaxException, IOException, LineUnavailableException {
        File inputFile = recoreAudio();
        String result = recognitionVoice(inputFile, new File(INPUT_AUDIO_PATH+ FLAC_FILE));
        browerSearch(result);
    }

    public static String recognitionVoice(File inputFile, File outputFile) throws IOException {
        Recognizer recognizer = new Recognizer(Recognizer.Languages.AUTO_DETECT, "apiKey");
        FlacEncoder flacEncoder = new FlacEncoder();
        flacEncoder.convertWaveToFlac(inputFile, outputFile);
        GoogleResponse response = recognizer.getRecognizedDataForFlac(outputFile);
        String result = response.getResponse();
        return result;
    }

    public static void browerSearch(String uri) throws IOException, URISyntaxException {
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().browse(new URI(uri));
        }
    }

    public static File recoreAudio() throws LineUnavailableException {
        Microphone microphont = new Microphone(AudioFileFormat.Type.WAVE);
        File audioFile = new File(INPUT_AUDIO_PATH+ WAV_FILE);
        microphont.captureAudioToFile(audioFile);
        return audioFile;
    }
}

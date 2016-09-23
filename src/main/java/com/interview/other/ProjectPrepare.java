package com.interview.other;

import java.io.File;

/**
 * 创建项目所需目录
 */
public class ProjectPrepare {

    public void file() {
        createDir(Contants.OUTPUT_GIRL_PATH);
        createDir(Contants.OUTPUT_IMAGE_PATH);
        createDir(Contants.OUTPUT_XLS_PATH);
        createDir(Contants.OUTPUT_XML_PATH);
    }

    private void createDir(String path) {
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdir();
        }
    }
}

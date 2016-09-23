package com.interview.question005;

public enum IphoneSizeEnum {

    IPHONE5(640,1136), IPHONE6(750,1134), IPHONE6P(1242,2208);

    private final int width;
    private final int height;

    IphoneSizeEnum(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

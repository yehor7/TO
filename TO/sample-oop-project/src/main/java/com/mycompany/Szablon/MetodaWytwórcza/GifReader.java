package com.mycompany.oop.factorymethod;

public class GifReader implements ImageReader {
    private DecodedImage decodedImage;
 
    public GifReader(String image) {
        this.decodedImage = new DecodedImage(image);
    }
 
    public DecodedImage getDecodeImage() {
        return decodedImage;
    }
}

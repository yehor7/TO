package com.mycompany.oop.factorymethod;

public class JpegReader implements ImageReader {
    private DecodedImage decodedImage;
 
    public JpegReader(String image) {
        decodedImage = new DecodedImage(image);
    }
 
    public DecodedImage getDecodeImage() {
        return decodedImage;
    }
}
    

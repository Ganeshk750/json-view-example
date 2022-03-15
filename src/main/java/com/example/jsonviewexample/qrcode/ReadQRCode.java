package com.example.jsonviewexample.qrcode;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;

public class ReadQRCode {

    public static void main(String[] args) {

        try {
            String path = "C:\\Users\\HP\\Videos\\Short-Concept-For-Project\\json-view-example\\qrcode\\test.jpg";
            BufferedImage bufferedImage = ImageIO.read(new FileInputStream(path));
            BufferedImageLuminanceSource bufferedImageLuminanceSource = new BufferedImageLuminanceSource(bufferedImage);
            HybridBinarizer hybridBinarizer = new HybridBinarizer(bufferedImageLuminanceSource);
            BinaryBitmap bitmap = new BinaryBitmap(hybridBinarizer);
            MultiFormatReader multiFormatReader = new MultiFormatReader();
            Result result = multiFormatReader.decode(bitmap);
            System.out.println(result.getText());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

package com.example.jsonviewexample.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.nio.file.Paths;

public class GenerateQRCode {

    public static void main(String[] args) throws Exception {

        String data = "https://github.com/Ganeshk750";
        String path = "C:\\Users\\HP\\Videos\\Short-Concept-For-Project\\json-view-example\\qrcode\\test.jpg";

        BitMatrix matrix = new MultiFormatWriter()
                .encode(data, BarcodeFormat.QR_CODE, 500, 500);
        MatrixToImageWriter.writeToPath(matrix, "jpg", Paths.get(path));
    }
}

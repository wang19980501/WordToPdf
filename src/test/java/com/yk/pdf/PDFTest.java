package com.yk.pdf;

public class PDFTest {

    public static void main(String[] args) {
        PDF pdf = new PDF("D:\\熊烽-拍卖确认付款单.pdf");
        try {
            pdf.toWord("D:\\熊烽-拍卖确认付款单.docx");
//            pdf.extractText("C:/Users/User/Documents/lishi/test.txt");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            pdf.close();
        }
    }
}

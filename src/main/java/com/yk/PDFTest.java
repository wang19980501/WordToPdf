package com.yk;

import com.yk.pdf.PDF;

public class PDFTest {

    public static void main(String[] args) {
        PDF pdf = new PDF("D:\\test.pdf");
        try {
            pdf.toWord("D:\\test.docx");
//            pdf.extractText("C:/Users/User/Documents/lishi/test.txt");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            pdf.close();
        }
    }
}

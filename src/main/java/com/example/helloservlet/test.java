package com.example.helloservlet;

import java.io.IOException;
import java.text.ParseException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class test {
    public static void main(String[] args) throws ParseException {

        String URL = "https://movie.naver.com/movie/sdb/rank/rmovie.naver";
        Document doc;

        try {
            doc = Jsoup.connect(URL).get();
            Elements movieList = doc.select("#targetImage");
            System.out.println(movieList.attr("src"));
            int i = 0;
            for (Element e : movieList){
                System.out.println(e.attr("title"));
                System.out.println(e.attr("href"));

                String code = e.attr(("href"));
                String[] codeArr = code.split("=");
//                System.out.println("https://movie.naver.com/movie/bi/mi/photoViewPopup.naver?movieCode=" + codeArr[1]);


            }


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
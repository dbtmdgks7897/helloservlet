package com.example.helloservlet.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NaverApi {
    public static List<String> movie(){

        List<String> list = new ArrayList<>();
        String URL = "https://movie.naver.com/movie/sdb/rank/rmovie.naver";
        Document doc;

        try {
            doc = Jsoup.connect(URL).get();
            Elements movieList =doc.select(".tit3 > a");
            for (Element e : movieList){
//                System.out.println(e.attr("title"));
                System.out.println(e.attr("href"));


                String code = e.attr(("href"));
                String[] codeArr = code.split("=");
                URL = "https://movie.naver.com/movie/bi/mi/photoViewPopup.naver?movieCode=" + codeArr[1];
                doc = Jsoup.connect(URL).get();
                movieList = doc.select("#targetImage");
                list.add();

                System.out.println();
            }


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return list;
    }
}

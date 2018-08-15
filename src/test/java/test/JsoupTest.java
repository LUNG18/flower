package test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class JsoupTest {


    @Test
    public void test01(){
        try {
            String host = "https://www.unileverfoodsolutions.com.cn";
//            List<String> list = readTxt("d:lung/recipe.txt");
//            for(int i=0; i<list.size(); i++){
                Document doc = Jsoup.connect(host + "/recipes/jlhhhhglsnrf.html").timeout(3000).get();
                String img_src = doc.getElementsByClass("recipe-img").first().select("img").attr("src");
                String artid = doc.getElementsByClass("nav-bottom-2").first().select("ul li").get(2).select("a").attr("artid");
                String path = "D:lung/image/" + artid + ".png";
                download(host+img_src, path);
//            }
            System.out.println("完成");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void download(String strUrl,String path){
        URL url = null;
        try {
            url = new URL(strUrl);
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
            return;
        }

        InputStream is = null;
        try {
            is = url.openStream();
        } catch (IOException e1) {
            e1.printStackTrace();
            return;
        }

        OutputStream os = null;
        try{
            os = new FileOutputStream(path);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while((bytesRead = is.read(buffer,0,8192))!=-1){
                os.write(buffer,0,bytesRead);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
            return;
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }

    private static List<String> readTxt(String path){
        File file = new File(path);
        List<String> list = new ArrayList<String>();
        String recipeName = "";
        int i = 1;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((recipeName = br.readLine())!=null){
                list.add(recipeName);
                System.out.println("第"+i+"个 ： "+recipeName);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("第"+i+"个出问题");
        }
        return list;
    }
}

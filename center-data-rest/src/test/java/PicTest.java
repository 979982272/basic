import com.baidu.aip.ocr.AipOcr;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;

import static com.htree.datacenter.rest.util.BaiduUtil.basicGeneral;

/**
 * @author weihua
 * @description
 * @date 2020/2/26 0026
 **/
public class PicTest {

    //public static final String PIC_PATH = "http://yzyx-guangzhou20180315-1256259170.cos-website.ap-guangzhou.myqcloud.com/2020/01/05/15/14236442_1_1th.jpg";
    public static final String PIC_PATH = "http://yzyx-guangzhou20180315-1256259170.cos-website.ap-guangzhou.myqcloud.com/2020/05/27/10/14795215_1_2th.jpg";
    private static final String word = "机身联";

    public final static void main(String[] args) throws Exception {
        System.out.println("识别结果:" + process());
    }

    private static boolean process() throws Exception {
        boolean result = false;
        JSONObject res = basicGeneral(PIC_PATH);
        JSONArray wordsResult = res.getJSONArray("words_result");
        JSONObject wordLine = null;
        for (int i = 0; i < wordsResult.length(); i++) {
            wordLine = wordsResult.getJSONObject(i);
            System.out.println(wordLine);
            if (wordLine.getString("words").indexOf(word) >= 0) {
                result = true;
                break;
            }
        }
        return result;
    }



}

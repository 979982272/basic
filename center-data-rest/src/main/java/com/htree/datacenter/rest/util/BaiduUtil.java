package com.htree.datacenter.rest.util;

import com.baidu.aip.ocr.AipOcr;
import org.apache.commons.lang.math.RandomUtils;
import org.hibernate.validator.internal.util.privilegedactions.NewInstance;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author weihua
 * @description 百度工具 单个id 每天可以调用五万次通用文字识别
 * @date 2020/2/26 0026
 **/
public class BaiduUtil {


    public static JSONObject basicGeneral(String url) {
        AipOcr aipOcr = getAipOcr();
        return aipOcr.basicGeneralUrl(url, getOptions());
    }

    /**
     * 每次请求都创建信息的客户端
     *
     * @return
     */
    private static AipOcr getAipOcr() {
        // 初始化一个AipOcr
        BaiduApiInfo baiduApiInfo = getBaiduApiInfo();
        AipOcr client = new AipOcr(baiduApiInfo.getAPP_ID(), baiduApiInfo.getAPI_KEY(), baiduApiInfo.getSECRET_KEY());
        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
        return client;
    }

    /**
     * 随机获取已配置的百度api信息
     * 每个id 会限制调用次数，可以多配几个
     *
     * @return
     */
    private static BaiduApiInfo getBaiduApiInfo() {
        List<BaiduApiInfo> apiInfos = createBaiduApiInfo();
        BaiduApiInfo baiduApiInfo = apiInfos.get(RandomUtils.nextInt(apiInfos.size()));
        return baiduApiInfo;
    }

    /**
     * 配置多个百度api信息
     *
     * @return
     */
    private static List<BaiduApiInfo> createBaiduApiInfo() {
        List<BaiduApiInfo> baiduApiInfos = new ArrayList<>();
        BaiduApiInfo b1 = new BaiduApiInfo("18282548", "9Mjlx7LmrjeX8ymHGF26DSyG", "keyUX36ZrBCSs1f1ssenrr4vcR1h3BsC");
        BaiduApiInfo b2 = new BaiduApiInfo("20110989", "M1tBdCh9gsKsziyrkiGTEGCG", "90YrQfVoxfwBiNaMz5Go7jfip9GUrZSs");
        BaiduApiInfo b3 = new BaiduApiInfo("20111046", "qcuiZGG3R4BG3C49ZGpE2mxP", "mkZtnxMwi66139VEuRPpfww0XkKpXiXo");
        BaiduApiInfo b4 = new BaiduApiInfo("20111144", "eMde6GcwB11cUXnEQ8hVit4m", "j3Bp4Ns0j3ZCf0GA2jpMDsHMMa5gT1zF");
        baiduApiInfos.add(b1);
        baiduApiInfos.add(b2);
        baiduApiInfos.add(b3);
        baiduApiInfos.add(b4);
        return baiduApiInfos;
    }

    /**
     * 调用配置参数
     * http://ai.baidu.com/ai-doc/OCR/nk3h7yc12
     *
     * @return
     */
    private static HashMap<String, String> getOptions() {
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("language_type", "CHN_ENG");
        options.put("detect_direction", "true");
        options.put("detect_language", "true");
        options.put("probability", "true");
        return options;
    }
}

class BaiduApiInfo {
    private String APP_ID;

    private String API_KEY;

    private String SECRET_KEY;

    public BaiduApiInfo(String APP_ID, String API_KEY, String SECRET_KEY) {
        this.APP_ID = APP_ID;
        this.API_KEY = API_KEY;
        this.SECRET_KEY = SECRET_KEY;
    }

    public String getAPP_ID() {
        return APP_ID;
    }

    public void setAPP_ID(String APP_ID) {
        this.APP_ID = APP_ID;
    }

    public String getAPI_KEY() {
        return API_KEY;
    }

    public void setAPI_KEY(String API_KEY) {
        this.API_KEY = API_KEY;
    }

    public String getSECRET_KEY() {
        return SECRET_KEY;
    }

    public void setSECRET_KEY(String SECRET_KEY) {
        this.SECRET_KEY = SECRET_KEY;
    }
}

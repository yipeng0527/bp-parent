package com.bp.business.util;

import com.google.common.collect.Lists;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;

/**
 * @Author yipeng
 * @Date 2020/9/25 11:33
 * @Version 1.0
 * @Desc Gson操作工具类
 */
public class GsonUtil {

    private static Gson gson = new GsonBuilder().disableHtmlEscaping().create();

    public static String toJson(Object obj) {
        return gson.toJson(obj);
    }

    public static <T> T fromJson(String json, Class<T> type) {
        return gson.fromJson(json, type);
    }

    public static <T> T fromJson(String json, Type type) {
        return gson.fromJson(json, type);
    }

    public static <T> List<T> fromJsonArray(String json, Class<T> type) {
        JsonParser parser = new JsonParser();
        JsonElement element = parser.parse(json);
        List<T> result = Lists.newArrayList();
        if (element.isJsonArray()) {
            JsonArray jsonArray = element.getAsJsonArray();
            for (Iterator it = jsonArray.iterator(); it.hasNext(); ) {
                JsonElement jsonElement = (JsonElement) it.next();
                T obj = gson.fromJson(jsonElement, type);
                result.add(obj);
            }
        }
        return result;
    }
}

package com.lcdt.suyunsoft.item.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class SessionUtils {
    /**
     * 获取session.
     * 
     * @return
     */

    public static HttpSession getSession() {
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes) ra).getRequest();
        return request.getSession();
    }

    /**
     * 获取Request.
     * 
     * @return
     */

    public static HttpServletRequest getRequest() {
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes) ra).getRequest();
        return request;
    }

    /**
     * 获取session中的shopId
     * @return
     */
    public static Long getShopId() {
        HttpSession session = getSession();
        Object shopId = session.getAttribute("shopId");
        if (shopId != null) {
            return (Long) shopId;
        }
        return null;
    }

    /**
     * 获取compId
     * @return
     */
    public static Long getCompId() {
        HttpSession session = getSession();
        Object compId = session.getAttribute("compId");
        if (compId != null) {
            return (Long) compId;
        }
        return null;
    }
}

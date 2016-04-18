package com.cnblogs.yjmyzz.utils;

import java.util.List;

/**
*
* @author LvBaolin
* @date: 2016年4月18日
* @time: 上午10:22:55
*/
public class ListUtil {

	public static String getString(List<?> list) {
		if (list == null) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for (Object o : list) {
			sb.append(o.toString() + " ");
		}
		return sb.toString().trim();
	}

}

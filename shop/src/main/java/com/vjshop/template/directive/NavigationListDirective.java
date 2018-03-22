
package com.vjshop.template.directive;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.vjshop.Filter;
import com.vjshop.Order;
import com.vjshop.entity.TNavigation;
import com.vjshop.service.TNavigationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

/**
 * 模板指令 - 导航列表
 * 
 * @author VJSHOP Team
 * @version 4.0
 */
@Component("navigationListDirective")
public class NavigationListDirective extends BaseDirective {

	/** 变量名称 */
	private static final String VARIABLE_NAME = "navigations";

	@Autowired
	private TNavigationService navigationService;

	/**
	 * 执行
	 * 
	 * @param env
	 *            环境变量
	 * @param params
	 *            参数
	 * @param loopVars
	 *            循环变量
	 * @param body
	 *            模板内容
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body) throws TemplateException, IOException {
		Integer count = getCount(params);
		List<Filter> filters = getFilters(params, TNavigation.class);
		List<Order> orders = getOrders(params);
		boolean useCache = useCache(env, params);
		List<TNavigation> navigations = navigationService.findList(count, filters, orders, useCache);
		setLocalVariable(VARIABLE_NAME, navigations, env, body);
	}

}
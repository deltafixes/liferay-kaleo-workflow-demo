package com.deltafixes.portlet.assets;

import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deltafixes.model.EmployeeHiring;
import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.asset.kernel.model.BaseJSPAssetRenderer;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.StringUtil;

public class EmployeeHiringAssetRenderer extends BaseJSPAssetRenderer<EmployeeHiring>  {
	private final EmployeeHiring employeeHiring;
	 
	public EmployeeHiringAssetRenderer(EmployeeHiring employeeHiring) {
		this.employeeHiring = employeeHiring;
	}
	 
	@Override
	public EmployeeHiring getAssetObject() {
		return employeeHiring;
	}

	@Override
	public long getGroupId() {
		return employeeHiring.getGroupId();
	}

	@Override
	public long getUserId() {
		return employeeHiring.getUserId();
	}

	@Override
	public String getUserName() {
		return employeeHiring.getUserName();
	}

	@Override
	public String getUuid() {
		return employeeHiring.getUuid();
	}

	@Override
	public String getClassName() {
		return EmployeeHiring.class.getName();
	}

	@Override
	public long getClassPK() {
		return employeeHiring.getEmployeeHiringId();
	}

	@Override
	public String getSummary(PortletRequest portletRequest, PortletResponse portletResponse) {
		return employeeHiring.getSummary();
	}

	@Override
	public String getTitle(Locale locale) {
		return employeeHiring.getTitle();
	}

	@Override
	public String getJspPath(HttpServletRequest request, String template) {
		if (template.equals(AssetRenderer.TEMPLATE_FULL_CONTENT)){
			request.setAttribute("employeeHiring", employeeHiring);
			return null; //"/asset/" + template + ".jsp";
		} else {
			return null;
		}
	}
	
	@Override
	public boolean include(HttpServletRequest request, HttpServletResponse response, String template) throws Exception {
		request.setAttribute("employeeHiring", employeeHiring);
		request.setAttribute("HtmlUtil", HtmlUtil.getHtml());
		request.setAttribute("StringUtil", new StringUtil());
	    return super.include(request, response, template);
	}
}

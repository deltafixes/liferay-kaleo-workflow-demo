package com.deltafixes.portlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.deltafixes.model.EmployeeHiring;
import com.deltafixes.portlet.constants.EmployeeHiringPortletKeys;
import com.deltafixes.service.EmployeeHiringLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=Deltafixes",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=EmployeeHiring",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + EmployeeHiringPortletKeys.EMPLOYEEHIRING,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class EmployeeHiringPortlet extends MVCPortlet {

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		DynamicQuery query = EmployeeHiringLocalServiceUtil.dynamicQuery();
		query.addOrder(OrderFactoryUtil.desc("employeeHiringId"));
		List<EmployeeHiring> list = EmployeeHiringLocalServiceUtil.dynamicQuery(query);
		renderRequest.setAttribute("employeeHiringList", list);
		super.render(renderRequest, renderResponse);
	}

}
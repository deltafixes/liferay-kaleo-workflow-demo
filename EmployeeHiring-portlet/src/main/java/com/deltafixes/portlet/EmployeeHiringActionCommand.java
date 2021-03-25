package com.deltafixes.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.deltafixes.portlet.constants.EmployeeHiringPortletKeys;
import com.deltafixes.service.EmployeeHiringLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

@Component(property = {
		"javax.portlet.name=" + EmployeeHiringPortletKeys.EMPLOYEEHIRING,
		"mvc.command.name=" + EmployeeHiringPortletKeys.MVC_ACTION_COMMAND_NAME
	},
	service = MVCActionCommand.class)

public class EmployeeHiringActionCommand extends BaseMVCActionCommand {
private static final Log _log = LogFactoryUtil.getLog(EmployeeHiringActionCommand.class);
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		serviceContext.setScopeGroupId(themeDisplay.getScopeGroupId());
		serviceContext.setCompanyId(themeDisplay.getCompanyId());
		serviceContext.setUserId(themeDisplay.getUserId());
		
		String action = ParamUtil.getString(actionRequest, "action");
		if(action.equalsIgnoreCase(EmployeeHiringPortletKeys.ACTION_ADD)) {
			String title = ParamUtil.getString(actionRequest, "title");
			String summary = ParamUtil.getString(actionRequest, "summary");
			String name = ParamUtil.getString(actionRequest, "name");
			String technology = ParamUtil.getString(actionRequest, "technology");
			String experience = ParamUtil.getString(actionRequest, "experience");
			EmployeeHiringLocalServiceUtil.addEmployeeHiring(title, summary, name, technology, experience, serviceContext);
			_log.info("New employee hiring entry added.");
		}
	}
}

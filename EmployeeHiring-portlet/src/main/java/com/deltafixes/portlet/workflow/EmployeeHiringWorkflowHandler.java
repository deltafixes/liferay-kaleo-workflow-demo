package com.deltafixes.portlet.workflow;

import java.io.Serializable;
import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.deltafixes.model.EmployeeHiring;
import com.deltafixes.service.EmployeeHiringLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.ResourceActionsUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.workflow.BaseWorkflowHandler;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandler;

@Component(
		property = { "model.class.name=com.deltafixes.model.EmployeeHiring" }, 
		service = WorkflowHandler.class)

public class EmployeeHiringWorkflowHandler extends BaseWorkflowHandler<EmployeeHiring> {
	
	private EmployeeHiringLocalService employeeHiringLocalService;
	   
	@Reference(unbind = "-")
	protected void setLeaveService(EmployeeHiringLocalService tenureAwardLocalService) {
		this.employeeHiringLocalService = tenureAwardLocalService;
    }
	   
	@Override
	public String getClassName() {
		return EmployeeHiring.class.getName();
	}

	@Override
	public String getType(Locale locale) {
		return ResourceActionsUtil.getModelResource(locale, getClassName());
	}

	@Override
	public EmployeeHiring updateStatus(int status, Map<String, Serializable> workflowContext) throws PortalException {
		long userId = GetterUtil.getLong((String)workflowContext.get(WorkflowConstants.CONTEXT_USER_ID));
	    long employeeHiringId = GetterUtil.getLong((String)workflowContext.get(WorkflowConstants.CONTEXT_ENTRY_CLASS_PK));
	    ServiceContext serviceContext = (ServiceContext) workflowContext.get(WorkflowConstants.CONTEXT_SERVICE_CONTEXT );
	    return employeeHiringLocalService.updateStatus(userId, employeeHiringId, status, serviceContext);
	}
}

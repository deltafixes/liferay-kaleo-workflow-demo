package com.deltafixes.portlet.assets;

import javax.servlet.ServletContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.deltafixes.model.EmployeeHiring;
import com.deltafixes.portlet.constants.EmployeeHiringPortletKeys;
import com.deltafixes.service.EmployeeHiringLocalService;
import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.asset.kernel.model.BaseAssetRendererFactory;
import com.liferay.portal.kernel.exception.PortalException;

@Component(
		 
		immediate = true,
		property = {
				"javax.portlet.name=" + EmployeeHiringPortletKeys.EMPLOYEEHIRING,
		},
		service = AssetRendererFactory.class)

public class EmployeeHiringAssetRenderFactory extends BaseAssetRendererFactory<EmployeeHiring>  {

	private EmployeeHiringLocalService employeeHiringLocalService;
	private ServletContext servletContext;

	public EmployeeHiringAssetRenderFactory() {
        setClassName(EmployeeHiring.class.getName());
        setCategorizable(true);
        setLinkable(true);
        setPortletId(EmployeeHiringPortletKeys.EMPLOYEEHIRING);
        setSearchable(true);
        setSelectable(true);
	}
	 
	@Reference(unbind = "-")
	protected void setLeaveService(EmployeeHiringLocalService employeeHiringLocalService) {
		this.employeeHiringLocalService = employeeHiringLocalService;
	}

	@Reference(unbind = "-")
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}
	 
	@Override
	public AssetRenderer<EmployeeHiring> getAssetRenderer(long classPK, int type) throws PortalException {
		EmployeeHiring employeeHiring = employeeHiringLocalService.getEmployeeHiring(classPK);
		EmployeeHiringAssetRenderer assetRenders = new EmployeeHiringAssetRenderer(employeeHiring);	
	    assetRenders.setAssetRendererType(type);
	    assetRenders.setServletContext(servletContext);
	    return assetRenders;
	 }

	 @Override
	 public String getType() {
	     return "employeeHiring";
	 }

	 @Override
	 public String getClassName() {
	     return EmployeeHiring.class.getName();
	 }
}

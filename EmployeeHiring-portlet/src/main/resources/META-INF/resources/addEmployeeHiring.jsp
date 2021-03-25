<%@ include file="./init.jsp" %>
<h6>Add New Employee Hiring</h6>

<liferay-portlet:actionURL name="<%=EmployeeHiringPortletKeys.MVC_ACTION_COMMAND_NAME %>" var="addEmployeeHiring">
 	<portlet:param name="action" value="<%= EmployeeHiringPortletKeys.ACTION_ADD %>" />
</liferay-portlet:actionURL>

<aui:form action="${addEmployeeHiring}" cssClass="container-fluid-1280" method="post" name="fm">
	<aui:fieldset markupView="lexicon">
		<aui:input name="title" label="code"><aui:validator name="required"/></aui:input>
		<aui:input name="summary"><aui:validator name="required"/></aui:input>
		<aui:input name="name"><aui:validator name="required"/></aui:input>
		<aui:input name="technology" label="Technology"><aui:validator name="required"/></aui:input>
		<aui:input name="experience" label="Experience"><aui:validator name="required"/></aui:input>
		<aui:button type="submit"></aui:button>
	</aui:fieldset> 
</aui:form>


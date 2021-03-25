<%@ include file="/init.jsp" %>
<portlet:renderURL var="addEntryJSP">
	<portlet:param name="mvcPath" value="/addEmployeeHiring.jsp"/>
</portlet:renderURL>
<aui:button value="Add Entry" onClick="${addEntryJSP}"></aui:button>
<br/>

<liferay-ui:search-container emptyResultsMessage="no-data-found" iteratorURL="<%=renderResponse.createRenderURL()%>" >
	<liferay-ui:search-container-results results="${employeeHiringList}">
</liferay-ui:search-container-results>
 
 <liferay-ui:search-container-row className="com.deltafixes.model.EmployeeHiring" modelVar="eh" keyProperty="employeeHiringId" > 
 <portlet:renderURL var="rowURL" > 
	 <portlet:param name="employeeHiringId" value="${eh.employeeHiringId}" /> 
	 <portlet:param name="mvcRenderCommandName" value="viewInfo"/>
 </portlet:renderURL>
 <liferay-ui:search-container-column-user userId="${eh.userId}" showDetails="false" name="User" />
 <liferay-ui:search-container-column-text property="title" name="code"/> 
 <liferay-ui:search-container-column-text property="name" name="name"/>
 <liferay-ui:search-container-column-text property="technology" name="Technology"/>
 <liferay-ui:search-container-column-text property="experience" name="Experience"/>
 <liferay-ui:search-container-column-date property="createDate" name="date"/>
 <liferay-ui:search-container-column-status property="status" name="Status" />
 </liferay-ui:search-container-row>
 <liferay-ui:search-iterator />
</liferay-ui:search-container>
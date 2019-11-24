<%--
- list.jsp
-
- Copyright (c) 2019 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<acme:list>
	<acme:list-column code="authenticated.job.list.label.reference"  width="5%"  path="reference"/>
	<acme:list-column code="authenticated.job.list.label.title"  width="5%"  path="title"/>
    <acme:list-column code="authenticated.job.list.label.status"  width="5%"  path="status"/>
	<acme:list-column code="authenticated.job.list.label.deadline"  width="5%"  path="deadline"/>
	<acme:list-column code="authenticated.job.list.label.salary"  width="5%"  path="salary"/>
	<acme:list-column code="authenticated.job.list.label.link"  width="5%"  path="link"/>
    <acme:list-column code="authenticated.job.list.label.isActive"  width="5%"  path="isActive"/>
    <acme:list-column code="authenticated.job.list.label.descriptor"  width="5%"  path="descriptor"/>
    <acme:list-column code="authenticated.job.list.label.employer"  width="5%"  path="employer"/>
	<%-- <acme:list-column code="authenticated.job.list.label.applications" >
	<acme:form-url code="authenticated.job.list.label.applications" path="/applications/list"/>
	</acme:list-column> --%> 
  

</acme:list>

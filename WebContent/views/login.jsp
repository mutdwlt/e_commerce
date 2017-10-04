<%@ taglib prefix="s" uri="/struts-tags" %>

<section id="main">
<s:form action="loginAction">
	<s:textfield label="Email" key="email" />
	<s:password label="Password" key="password" />
	<s:submit/>
</s:form>
</section>
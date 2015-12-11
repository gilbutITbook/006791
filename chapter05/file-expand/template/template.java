package ${packageName};

/**
 * ${className}。
 * Gradle로 자동 생성하고 있다
 */
public class ${className} {
<% fields.each { type, fieldName -> %>
    private ${type} ${fieldName};<% } %>

    public void ${className}() {}
<% fields.each { type, fieldName ->
	String methodName = fieldName.capitalize() %>
    public ${type} get${methodName}() {
    	return ${fieldName};
    }
    public void set${methodName}(${type} ${fieldName}) {
    	this.${fieldName} = ${fieldName};
    }<% } %>    
}
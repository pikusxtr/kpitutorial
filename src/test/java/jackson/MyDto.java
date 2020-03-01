package jackson;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

public class MyDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String stringValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> stringList;

    private int intValue;
    private Boolean booleanValueClass;
    private boolean booleanValuePrimitive;

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public Boolean getBooleanValueClass() {
        return booleanValueClass;
    }

    public void setBooleanValueClass(Boolean booleanValueClass) {
        this.booleanValueClass = booleanValueClass;
    }

    public boolean isBooleanValuePrimitive() {
        return booleanValuePrimitive;
    }

    public void setBooleanValuePrimitive(boolean booleanValuePrimitive) {
        this.booleanValuePrimitive = booleanValuePrimitive;
    }
}
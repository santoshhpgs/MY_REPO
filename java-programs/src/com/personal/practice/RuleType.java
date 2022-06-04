package com.personal.practice;

import java.util.Arrays;
import java.util.List;

public enum RuleType {
	
    VALIDATION("businessrules.custom.rule.type.validation",
            "categoryNameKey1",
            "packageNameKey1",
            true,
            Arrays.asList(IBRVersion.COP)),

    VALIDATION_CONSIGNMENT_MANAGEMENT("businessrules.custom.rule.type.validation.consignment.management",
            "categoryNameKey2",
            "packageNameKey2",
            true,
            Arrays.asList(IBRVersion.COP,IBRVersion.COP)),
    MARK_ORDER_LINES_SPLIT("businessrules.custom.rule.type.mark.order.lines.split",
            "categoryNameKey3",
            "packageNameKey3",
           true,
            Arrays.asList(IBRVersion.OVC));
	
	
    private String displayName;

    private String categoryNameKey;

    private String packageNameKey;

    private boolean dataFieldsRequired;

    private List<IBRVersion> versions;
    
    RuleType(String displayName, String categoryNameKey, String packageNameKey, boolean dataFieldsRequired, List<IBRVersion> versions) {
        this.displayName = displayName;
        this.categoryNameKey = categoryNameKey;
        this.packageNameKey = packageNameKey;
        this.dataFieldsRequired = dataFieldsRequired;
        this.versions = versions;
    }
    
    
    public String getDisplayName() {
        return displayName;
    }

    public String getCategoryNameKey() {
        return categoryNameKey;
    }

    public String getPackageNameKey() {
        return packageNameKey;
    }

    public boolean isDataFieldsRequired() {
        return dataFieldsRequired;
    }
    
    public List<IBRVersion> getversions() {
        return versions;
    }
    
}

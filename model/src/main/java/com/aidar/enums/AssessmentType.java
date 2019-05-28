package com.aidar.enums;

public enum  AssessmentType {

    LIKE("like"),
    DISLIKE("dislike");

    private String representation;

    AssessmentType(String representation) {
        this.representation = representation;
    }

    public String getRepresentation() {
        return representation;
    }

    public static AssessmentType getAssessmentType(String assessment) {
        for (AssessmentType t : values()) {
            if (t.toString().equalsIgnoreCase(assessment)) {
                return t;
            }
        }
        return null;
    }

}

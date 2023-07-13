package com.example.urinalysis.model;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Result {
    private Integer id;
    private String inspectorName;
    private String rbc;
    private String wbc;
    private String squamousEpithelial;
    private String urothelialEpithelial;
    private String renalTubularEpithelial;
    private String other;
    private String message;
    
    public Result(Integer id, String inspectorName, String rbc, String wbc, String squamousEpithelial,
                  String urothelialEpithelial, String renalTubularEpithelial, String other, String message) {
        this.id = id;
        this.inspectorName = inspectorName;
        this.rbc = rbc;
        this.wbc = wbc;
        this.squamousEpithelial = squamousEpithelial;
        this.urothelialEpithelial = urothelialEpithelial;
        this.renalTubularEpithelial = renalTubularEpithelial;
        this.other = other;
        this.message = message;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Result result = (Result) obj;
        return Objects.equals(id, result.id)
                && Objects.equals(inspectorName, result.inspectorName)
                && Objects.equals(rbc, result.rbc)
                && Objects.equals(wbc, result.wbc)
                && Objects.equals(squamousEpithelial, result.squamousEpithelial)
                && Objects.equals(urothelialEpithelial, result.urothelialEpithelial)
                && Objects.equals(renalTubularEpithelial, result.renalTubularEpithelial)
                && Objects.equals(other, result.other)
                && Objects.equals(message, result.message);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, inspectorName, rbc, wbc, squamousEpithelial, urothelialEpithelial,
                renalTubularEpithelial, other, message);
    }
}


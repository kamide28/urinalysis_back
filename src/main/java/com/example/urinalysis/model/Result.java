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
        Result other = (Result) obj;
        return Objects.equals(id, other.id)
                && Objects.equals(inspectorName, other.inspectorName)
                && Objects.equals(rbc, other.rbc)
                && Objects.equals(wbc, other.wbc)
                && Objects.equals(squamousEpithelial, other.squamousEpithelial)
                && Objects.equals(urothelialEpithelial, other.urothelialEpithelial)
                && Objects.equals(renalTubularEpithelial, other.renalTubularEpithelial)
                && Objects.equals(other, other.other)
                && Objects.equals(message, other.message);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, inspectorName, rbc, wbc, squamousEpithelial, urothelialEpithelial,
                renalTubularEpithelial, other, message);
    }
}

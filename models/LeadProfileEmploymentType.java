package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Employment Type values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LeadProfileEmploymentType implements ValuedEnum {
    Employed("Employed"),
    PartTime("PartTime"),
    SelfEmployed("SelfEmployed"),
    Contractor("Contractor"),
    Unemployed("Unemployed"),
    Retired("Retired"),
    Student("Student"),
    Military("Military"),
    Homemaker("Homemaker"),
    Disabled("Disabled"),
    Other("Other");
    public final String value;
    LeadProfileEmploymentType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LeadProfileEmploymentType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Employed": return Employed;
            case "PartTime": return PartTime;
            case "SelfEmployed": return SelfEmployed;
            case "Contractor": return Contractor;
            case "Unemployed": return Unemployed;
            case "Retired": return Retired;
            case "Student": return Student;
            case "Military": return Military;
            case "Homemaker": return Homemaker;
            case "Disabled": return Disabled;
            case "Other": return Other;
            default: return null;
        }
    }
}

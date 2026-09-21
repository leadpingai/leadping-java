package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Classifies a lead&apos;s reported marital status when required by a qualification or integration workflow.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LeadProfileMaritalStatus implements ValuedEnum {
    Married("Married"),
    Single("Single"),
    Widow("Widow"),
    Separated("Separated"),
    Divorced("Divorced");
    public final String value;
    LeadProfileMaritalStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LeadProfileMaritalStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Married": return Married;
            case "Single": return Single;
            case "Widow": return Widow;
            case "Separated": return Separated;
            case "Divorced": return Divorced;
            default: return null;
        }
    }
}

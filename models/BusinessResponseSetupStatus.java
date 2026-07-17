package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported User Setup Status values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BusinessResponseSetupStatus implements ValuedEnum {
    Personal("Personal"),
    Business("Business"),
    Details("Details"),
    Compliance("Compliance"),
    Phone("Phone"),
    Plan("Plan"),
    Billing("Billing"),
    Review("Review"),
    Complete("Complete");
    public final String value;
    BusinessResponseSetupStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BusinessResponseSetupStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Personal": return Personal;
            case "Business": return Business;
            case "Details": return Details;
            case "Compliance": return Compliance;
            case "Phone": return Phone;
            case "Plan": return Plan;
            case "Billing": return Billing;
            case "Review": return Review;
            case "Complete": return Complete;
            default: return null;
        }
    }
}

package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Describes a user&apos;s progress through required Leadping profile and account setup tasks.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OrganizationResponseSetupStatus implements ValuedEnum {
    Personal("Personal"),
    Organization("Organization"),
    Details("Details"),
    Compliance("Compliance"),
    Phone("Phone"),
    Plan("Plan"),
    Billing("Billing"),
    Review("Review"),
    Complete("Complete");
    public final String value;
    OrganizationResponseSetupStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OrganizationResponseSetupStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Personal": return Personal;
            case "Organization": return Organization;
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

package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Identifies the Leadping subscription plan that determines organization features, allowances, and billing behavior.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OrganizationTableRowBillingPlan implements ValuedEnum {
    Annual("Annual"),
    Monthly("Monthly");
    public final String value;
    OrganizationTableRowBillingPlan(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OrganizationTableRowBillingPlan forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Annual": return Annual;
            case "Monthly": return Monthly;
            default: return null;
        }
    }
}

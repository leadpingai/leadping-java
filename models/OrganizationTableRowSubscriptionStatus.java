package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Describes an organization&apos;s billing subscription lifecycle, including trial, active, delinquent, canceled, and expired states.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OrganizationTableRowSubscriptionStatus implements ValuedEnum {
    Pending("Pending"),
    Active("Active"),
    Overdue("Overdue"),
    Canceled("Canceled");
    public final String value;
    OrganizationTableRowSubscriptionStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OrganizationTableRowSubscriptionStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Pending": return Pending;
            case "Active": return Active;
            case "Overdue": return Overdue;
            case "Canceled": return Canceled;
            default: return null;
        }
    }
}

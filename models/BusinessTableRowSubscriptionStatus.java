package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Subscription Status values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BusinessTableRowSubscriptionStatus implements ValuedEnum {
    Pending("Pending"),
    Active("Active"),
    Overdue("Overdue"),
    Canceled("Canceled");
    public final String value;
    BusinessTableRowSubscriptionStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BusinessTableRowSubscriptionStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
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

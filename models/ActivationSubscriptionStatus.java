package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Activation Subscription Status values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ActivationSubscriptionStatus implements ValuedEnum {
    Pending("Pending"),
    Active("Active"),
    Failed("Failed"),
    Canceled("Canceled");
    public final String value;
    ActivationSubscriptionStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ActivationSubscriptionStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Pending": return Pending;
            case "Active": return Active;
            case "Failed": return Failed;
            case "Canceled": return Canceled;
            default: return null;
        }
    }
}

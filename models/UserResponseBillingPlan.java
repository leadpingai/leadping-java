package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Billing Plan values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserResponseBillingPlan implements ValuedEnum {
    Annual("Annual"),
    Monthly("Monthly");
    public final String value;
    UserResponseBillingPlan(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserResponseBillingPlan forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Annual": return Annual;
            case "Monthly": return Monthly;
            default: return null;
        }
    }
}

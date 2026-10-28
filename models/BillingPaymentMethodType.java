package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Reusable payment types supported for immediate billing payments.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BillingPaymentMethodType implements ValuedEnum {
    Card("card"),
    Link("link");
    public final String value;
    BillingPaymentMethodType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BillingPaymentMethodType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "card": return Card;
            case "link": return Link;
            default: return null;
        }
    }
}

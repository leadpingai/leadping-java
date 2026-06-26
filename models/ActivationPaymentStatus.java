package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Activation Payment Status values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ActivationPaymentStatus implements ValuedEnum {
    PaymentMethodPending("PaymentMethodPending"),
    PaymentMethodConfirmed("PaymentMethodConfirmed"),
    Failed("Failed");
    public final String value;
    ActivationPaymentStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ActivationPaymentStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "PaymentMethodPending": return PaymentMethodPending;
            case "PaymentMethodConfirmed": return PaymentMethodConfirmed;
            case "Failed": return Failed;
            default: return null;
        }
    }
}

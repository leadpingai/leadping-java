package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the lifecycle state for a wallet credit lot.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WalletResponseCreditStatus implements ValuedEnum {
    Active("active"),
    Consumed("consumed"),
    Expired("expired"),
    Refunded("refunded"),
    Voided("voided"),
    Disputed("disputed");
    public final String value;
    WalletResponseCreditStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WalletResponseCreditStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "consumed": return Consumed;
            case "expired": return Expired;
            case "refunded": return Refunded;
            case "voided": return Voided;
            case "disputed": return Disputed;
            default: return null;
        }
    }
}

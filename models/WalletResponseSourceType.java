package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the source that created a wallet credit lot.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WalletResponseSourceType implements ValuedEnum {
    Purchase("purchase"),
    Promo("promo"),
    Admin_adjustment("admin_adjustment"),
    Refund_adjustment("refund_adjustment"),
    Chargeback_reversal("chargeback_reversal"),
    Compromise_restoration("compromise_restoration");
    public final String value;
    WalletResponseSourceType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WalletResponseSourceType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "purchase": return Purchase;
            case "promo": return Promo;
            case "admin_adjustment": return Admin_adjustment;
            case "refund_adjustment": return Refund_adjustment;
            case "chargeback_reversal": return Chargeback_reversal;
            case "compromise_restoration": return Compromise_restoration;
            default: return null;
        }
    }
}

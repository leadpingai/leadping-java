package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Transaction Type values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TransactionType implements ValuedEnum {
    Debit("Debit"),
    Adjustment("Adjustment"),
    Deposit("Deposit");
    public final String value;
    TransactionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TransactionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Debit": return Debit;
            case "Adjustment": return Adjustment;
            case "Deposit": return Deposit;
            default: return null;
        }
    }
}

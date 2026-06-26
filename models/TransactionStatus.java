package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Transaction Status values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TransactionStatus implements ValuedEnum {
    Pending("Pending"),
    Confirmed("Confirmed"),
    Failed("Failed");
    public final String value;
    TransactionStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TransactionStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Pending": return Pending;
            case "Confirmed": return Confirmed;
            case "Failed": return Failed;
            default: return null;
        }
    }
}

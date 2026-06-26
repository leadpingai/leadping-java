package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported SMS Warmup Action Status values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SmsWarmupActionStatus implements ValuedEnum {
    Scheduled("Scheduled"),
    Sending("Sending"),
    Sent("Sent"),
    Delivered("Delivered"),
    Received("Received"),
    Failed("Failed"),
    Skipped("Skipped"),
    Paused("Paused"),
    Blocked("Blocked"),
    Cancelled("Cancelled");
    public final String value;
    SmsWarmupActionStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SmsWarmupActionStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Scheduled": return Scheduled;
            case "Sending": return Sending;
            case "Sent": return Sent;
            case "Delivered": return Delivered;
            case "Received": return Received;
            case "Failed": return Failed;
            case "Skipped": return Skipped;
            case "Paused": return Paused;
            case "Blocked": return Blocked;
            case "Cancelled": return Cancelled;
            default: return null;
        }
    }
}

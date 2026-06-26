package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines durable outbound delivery request statuses.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OutboundDeliveryStatus implements ValuedEnum {
    Pending("pending"),
    Scheduled("scheduled"),
    Reserved("reserved"),
    Sending("sending"),
    Sent("sent"),
    Failed("failed"),
    Skipped("skipped"),
    Blocked("blocked"),
    Cancelled("cancelled");
    public final String value;
    OutboundDeliveryStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OutboundDeliveryStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "scheduled": return Scheduled;
            case "reserved": return Reserved;
            case "sending": return Sending;
            case "sent": return Sent;
            case "failed": return Failed;
            case "skipped": return Skipped;
            case "blocked": return Blocked;
            case "cancelled": return Cancelled;
            default: return null;
        }
    }
}

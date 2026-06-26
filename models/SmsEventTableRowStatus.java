package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported SMS Message Status values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SmsEventTableRowStatus implements ValuedEnum {
    Draft("draft"),
    Scheduled("scheduled"),
    Queued("queued"),
    Sending("sending"),
    Sent("sent"),
    Received("received"),
    Delivered("delivered"),
    Failed("failed"),
    Undeliverable("undeliverable"),
    Opted_out("opted_out"),
    Blocked_compliance("blocked_compliance"),
    Blocked_billing("blocked_billing"),
    Blocked_missing_campaign("blocked_missing_campaign"),
    Canceled("canceled");
    public final String value;
    SmsEventTableRowStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SmsEventTableRowStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "draft": return Draft;
            case "scheduled": return Scheduled;
            case "queued": return Queued;
            case "sending": return Sending;
            case "sent": return Sent;
            case "received": return Received;
            case "delivered": return Delivered;
            case "failed": return Failed;
            case "undeliverable": return Undeliverable;
            case "opted_out": return Opted_out;
            case "blocked_compliance": return Blocked_compliance;
            case "blocked_billing": return Blocked_billing;
            case "blocked_missing_campaign": return Blocked_missing_campaign;
            case "canceled": return Canceled;
            default: return null;
        }
    }
}

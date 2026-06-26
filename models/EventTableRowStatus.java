package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Event timeline status values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EventTableRowStatus implements ValuedEnum {
    Pending("Pending"),
    InProgress("InProgress"),
    Completed("Completed"),
    Cancelled("Cancelled"),
    Scheduled("Scheduled"),
    Queued("Queued"),
    Sending("Sending"),
    Sent("Sent"),
    Received("Received"),
    Delivered("Delivered"),
    Undeliverable("Undeliverable"),
    OptedOut("Opted out"),
    Blocked("Blocked"),
    Initiated("Initiated"),
    Ringing("Ringing"),
    Active("Active"),
    Ended("Ended"),
    Missed("Missed"),
    Voicemail("Voicemail"),
    Failed("Failed"),
    Canceled("Canceled");
    public final String value;
    EventTableRowStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EventTableRowStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Pending": return Pending;
            case "InProgress": return InProgress;
            case "Completed": return Completed;
            case "Cancelled": return Cancelled;
            case "Scheduled": return Scheduled;
            case "Queued": return Queued;
            case "Sending": return Sending;
            case "Sent": return Sent;
            case "Received": return Received;
            case "Delivered": return Delivered;
            case "Undeliverable": return Undeliverable;
            case "Opted out": return OptedOut;
            case "Blocked": return Blocked;
            case "Initiated": return Initiated;
            case "Ringing": return Ringing;
            case "Active": return Active;
            case "Ended": return Ended;
            case "Missed": return Missed;
            case "Voicemail": return Voicemail;
            case "Failed": return Failed;
            case "Canceled": return Canceled;
            default: return null;
        }
    }
}

package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the durable state machine statuses for voice call warmup attempts.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PhoneNumberWarmupCallStatus implements ValuedEnum {
    Created("Created"),
    Scheduled("Scheduled"),
    Placing("Placing"),
    Ringing("Ringing"),
    Answered("Answered"),
    Connected("Connected"),
    Completed("Completed"),
    Failed("Failed"),
    Canceled("Canceled"),
    Skipped("Skipped"),
    TimedOut("TimedOut");
    public final String value;
    PhoneNumberWarmupCallStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PhoneNumberWarmupCallStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Created": return Created;
            case "Scheduled": return Scheduled;
            case "Placing": return Placing;
            case "Ringing": return Ringing;
            case "Answered": return Answered;
            case "Connected": return Connected;
            case "Completed": return Completed;
            case "Failed": return Failed;
            case "Canceled": return Canceled;
            case "Skipped": return Skipped;
            case "TimedOut": return TimedOut;
            default: return null;
        }
    }
}

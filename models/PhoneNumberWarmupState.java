package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported SMS Warmup Health State values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PhoneNumberWarmupState implements ValuedEnum {
    NotStarted("Not Started"),
    Warming("Warming"),
    Healthy("Healthy"),
    NeedsAttention("Needs Attention"),
    Paused("Paused"),
    Blocked("Blocked"),
    Ready("Ready");
    public final String value;
    PhoneNumberWarmupState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PhoneNumberWarmupState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Not Started": return NotStarted;
            case "Warming": return Warming;
            case "Healthy": return Healthy;
            case "Needs Attention": return NeedsAttention;
            case "Paused": return Paused;
            case "Blocked": return Blocked;
            case "Ready": return Ready;
            default: return null;
        }
    }
}

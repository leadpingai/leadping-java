package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported SMS readiness states.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PhoneNumberReadinessState implements ValuedEnum {
    NotStarted("Not Started"),
    InProgress("In Progress"),
    Paused("Paused"),
    Blocked("Blocked"),
    Ready("Ready");
    public final String value;
    PhoneNumberReadinessState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PhoneNumberReadinessState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Not Started": return NotStarted;
            case "In Progress": return InProgress;
            case "Paused": return Paused;
            case "Blocked": return Blocked;
            case "Ready": return Ready;
            default: return null;
        }
    }
}

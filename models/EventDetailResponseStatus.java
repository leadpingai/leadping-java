package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Event status values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EventDetailResponseStatus implements ValuedEnum {
    Pending("Pending"),
    InProgress("InProgress"),
    Completed("Completed"),
    Failed("Failed"),
    Cancelled("Cancelled");
    public final String value;
    EventDetailResponseStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EventDetailResponseStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Pending": return Pending;
            case "InProgress": return InProgress;
            case "Completed": return Completed;
            case "Failed": return Failed;
            case "Cancelled": return Cancelled;
            default: return null;
        }
    }
}

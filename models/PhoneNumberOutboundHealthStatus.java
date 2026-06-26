package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines phone-number outbound health states used by pacing.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PhoneNumberOutboundHealthStatus implements ValuedEnum {
    Unknown("unknown"),
    New("new"),
    Healthy("healthy"),
    Warmup("warmup"),
    Limited("limited"),
    Cooling_down("cooling_down"),
    Suspended("suspended"),
    Disabled("disabled");
    public final String value;
    PhoneNumberOutboundHealthStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PhoneNumberOutboundHealthStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "new": return New;
            case "healthy": return Healthy;
            case "warmup": return Warmup;
            case "limited": return Limited;
            case "cooling_down": return Cooling_down;
            case "suspended": return Suspended;
            case "disabled": return Disabled;
            default: return null;
        }
    }
}

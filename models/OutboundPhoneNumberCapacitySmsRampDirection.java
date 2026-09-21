package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates whether a phone number&apos;s channel capacity is increasing, decreasing, or stable.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OutboundPhoneNumberCapacitySmsRampDirection implements ValuedEnum {
    Up("up"),
    Down("down"),
    None("none");
    public final String value;
    OutboundPhoneNumberCapacitySmsRampDirection(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OutboundPhoneNumberCapacitySmsRampDirection forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "up": return Up;
            case "down": return Down;
            case "none": return None;
            default: return null;
        }
    }
}

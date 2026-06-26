package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported health states for controlled internal voice call warmup.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PhoneNumberResponseCallWarmupState implements ValuedEnum {
    NotStarted("Not Started"),
    NotEligible("Not Eligible"),
    Warming("Warming"),
    Warmed("Warmed"),
    Paused("Paused"),
    NeedsAttention("Needs Attention"),
    Blocked("Blocked");
    public final String value;
    PhoneNumberResponseCallWarmupState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PhoneNumberResponseCallWarmupState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Not Started": return NotStarted;
            case "Not Eligible": return NotEligible;
            case "Warming": return Warming;
            case "Warmed": return Warmed;
            case "Paused": return Paused;
            case "Needs Attention": return NeedsAttention;
            case "Blocked": return Blocked;
            default: return null;
        }
    }
}

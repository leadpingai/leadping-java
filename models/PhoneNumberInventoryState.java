package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Leadping-owned inventory state for phone-number assignment and routing.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PhoneNumberInventoryState implements ValuedEnum {
    Available("Available"),
    Assigned("Assigned"),
    PendingVerification("Pending verification"),
    ReadyForSMS("Ready for SMS"),
    ReadyForVoice("Ready for voice"),
    Restricted("Restricted"),
    Suspended("Suspended"),
    Failed("Failed"),
    Released("Released"),
    PendingRelease("Pending release"),
    WarmupOnly("Warmup-only"),
    InternalTestOnly("Internal/test-only");
    public final String value;
    PhoneNumberInventoryState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PhoneNumberInventoryState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Available": return Available;
            case "Assigned": return Assigned;
            case "Pending verification": return PendingVerification;
            case "Ready for SMS": return ReadyForSMS;
            case "Ready for voice": return ReadyForVoice;
            case "Restricted": return Restricted;
            case "Suspended": return Suspended;
            case "Failed": return Failed;
            case "Released": return Released;
            case "Pending release": return PendingRelease;
            case "Warmup-only": return WarmupOnly;
            case "Internal/test-only": return InternalTestOnly;
            default: return null;
        }
    }
}

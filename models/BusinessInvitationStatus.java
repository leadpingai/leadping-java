package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Business Invitation Status values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BusinessInvitationStatus implements ValuedEnum {
    Pending("Pending"),
    Accepted("Accepted"),
    Expired("Expired"),
    Revoked("Revoked"),
    Resent("Resent"),
    FailedToSend("Failed to send");
    public final String value;
    BusinessInvitationStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BusinessInvitationStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Pending": return Pending;
            case "Accepted": return Accepted;
            case "Expired": return Expired;
            case "Revoked": return Revoked;
            case "Resent": return Resent;
            case "Failed to send": return FailedToSend;
            default: return null;
        }
    }
}

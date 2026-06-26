package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Represents the status of an internal phone number in the system.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum InternalPhoneNumberStatus implements ValuedEnum {
    Unregistered("Unregistered"),
    Provisioning("Provisioning"),
    FailedProvisioning("FailedProvisioning"),
    Active("Active"),
    Expired("Expired"),
    Suspended("Suspended"),
    PendingRelease("PendingRelease");
    public final String value;
    InternalPhoneNumberStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static InternalPhoneNumberStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Unregistered": return Unregistered;
            case "Provisioning": return Provisioning;
            case "FailedProvisioning": return FailedProvisioning;
            case "Active": return Active;
            case "Expired": return Expired;
            case "Suspended": return Suspended;
            case "PendingRelease": return PendingRelease;
            default: return null;
        }
    }
}

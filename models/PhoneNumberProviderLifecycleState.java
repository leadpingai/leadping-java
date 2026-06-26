package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Phone Number Provider Lifecycle State values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PhoneNumberProviderLifecycleState implements ValuedEnum {
    Unknown("Unknown"),
    Requested("Requested"),
    Purchasing("Purchasing"),
    Purchased("Purchased"),
    Provisioning("Provisioning"),
    Active("Active"),
    Failed("Failed"),
    Released("Released"),
    Suspended("Suspended");
    public final String value;
    PhoneNumberProviderLifecycleState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PhoneNumberProviderLifecycleState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Unknown": return Unknown;
            case "Requested": return Requested;
            case "Purchasing": return Purchasing;
            case "Purchased": return Purchased;
            case "Provisioning": return Provisioning;
            case "Active": return Active;
            case "Failed": return Failed;
            case "Released": return Released;
            case "Suspended": return Suspended;
            default: return null;
        }
    }
}

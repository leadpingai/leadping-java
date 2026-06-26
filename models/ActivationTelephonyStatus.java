package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Activation Telephony Status values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ActivationTelephonyStatus implements ValuedEnum {
    NotStarted("NotStarted"),
    ProvisioningPending("ProvisioningPending"),
    PartiallyProvisioned("PartiallyProvisioned"),
    Ready("Ready"),
    Failed("Failed"),
    BlockedRequiresOperatorAction("BlockedRequiresOperatorAction");
    public final String value;
    ActivationTelephonyStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ActivationTelephonyStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "NotStarted": return NotStarted;
            case "ProvisioningPending": return ProvisioningPending;
            case "PartiallyProvisioned": return PartiallyProvisioned;
            case "Ready": return Ready;
            case "Failed": return Failed;
            case "BlockedRequiresOperatorAction": return BlockedRequiresOperatorAction;
            default: return null;
        }
    }
}

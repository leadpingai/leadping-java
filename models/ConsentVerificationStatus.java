package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Leadping&apos;s assessment of the supporting consent evidence.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ConsentVerificationStatus implements ValuedEnum {
    Verified("Verified"),
    Unverified("Unverified"),
    Quarantined("Quarantined");
    public final String value;
    ConsentVerificationStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConsentVerificationStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Verified": return Verified;
            case "Unverified": return Unverified;
            case "Quarantined": return Quarantined;
            default: return null;
        }
    }
}

package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Identifies the kind of lookup action performed for a phone identity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PhoneIdentityLookupActionType implements ValuedEnum {
    Validation("validation"),
    Enrichment("enrichment"),
    UnwantedNumberCheck("unwanted-number-check");
    public final String value;
    PhoneIdentityLookupActionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PhoneIdentityLookupActionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "validation": return Validation;
            case "enrichment": return Enrichment;
            case "unwanted-number-check": return UnwantedNumberCheck;
            default: return null;
        }
    }
}

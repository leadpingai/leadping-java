package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Identifies the outcome of a phone identity lookup action.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PhoneIdentityLookupActionStatus implements ValuedEnum {
    Succeeded("succeeded"),
    Failed("failed");
    public final String value;
    PhoneIdentityLookupActionStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PhoneIdentityLookupActionStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "succeeded": return Succeeded;
            case "failed": return Failed;
            default: return null;
        }
    }
}

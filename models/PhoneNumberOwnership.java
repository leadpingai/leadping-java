package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Identifies whose traffic a phone number serves, independently of provider control.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PhoneNumberOwnership implements ValuedEnum {
    Unassigned("Unassigned"),
    Leadping("Leadping"),
    Organization("Organization");
    public final String value;
    PhoneNumberOwnership(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PhoneNumberOwnership forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Unassigned": return Unassigned;
            case "Leadping": return Leadping;
            case "Organization": return Organization;
            default: return null;
        }
    }
}

package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Represents a gender classification used for demographic or identification purposes.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LeadProfileGender implements ValuedEnum {
    M("M"),
    F("F"),
    NonBinary("NonBinary"),
    PreferNotToSay("PreferNotToSay"),
    Other("Other");
    public final String value;
    LeadProfileGender(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LeadProfileGender forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "M": return M;
            case "F": return F;
            case "NonBinary": return NonBinary;
            case "PreferNotToSay": return PreferNotToSay;
            case "Other": return Other;
            default: return null;
        }
    }
}

package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Controlled disposition categories used for reporting, automation, and analytics.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DispositionRequestCategory implements ValuedEnum {
    Open("Open"),
    Qualified("Qualified"),
    Converted("Converted"),
    Lost("Lost"),
    Invalid("Invalid"),
    Duplicate("Duplicate");
    public final String value;
    DispositionRequestCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DispositionRequestCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Open": return Open;
            case "Qualified": return Qualified;
            case "Converted": return Converted;
            case "Lost": return Lost;
            case "Invalid": return Invalid;
            case "Duplicate": return Duplicate;
            default: return null;
        }
    }
}

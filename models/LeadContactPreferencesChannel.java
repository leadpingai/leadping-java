package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Supported LeadContactChannel values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LeadContactPreferencesChannel implements ValuedEnum {
    Email("Email"),
    Phone("Phone"),
    Sms("Sms");
    public final String value;
    LeadContactPreferencesChannel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LeadContactPreferencesChannel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Email": return Email;
            case "Phone": return Phone;
            case "Sms": return Sms;
            default: return null;
        }
    }
}

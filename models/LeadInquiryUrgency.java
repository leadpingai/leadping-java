package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Supported LeadUrgency values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LeadInquiryUrgency implements ValuedEnum {
    Flexible("Flexible"),
    Soon("Soon"),
    Urgent("Urgent");
    public final String value;
    LeadInquiryUrgency(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LeadInquiryUrgency forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Flexible": return Flexible;
            case "Soon": return Soon;
            case "Urgent": return Urgent;
            default: return null;
        }
    }
}

package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Interest expressed in the lead&apos;s first inbound text reply, independent of contact consent.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LeadMetadataSentiment implements ValuedEnum {
    Positive("Positive"),
    Negative("Negative");
    public final String value;
    LeadMetadataSentiment(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LeadMetadataSentiment forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Positive": return Positive;
            case "Negative": return Negative;
            default: return null;
        }
    }
}

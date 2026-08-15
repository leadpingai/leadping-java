package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the asynchronous verification and enrichment lifecycle for a lead.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LeadResponseProcessingStatus implements ValuedEnum {
    Verifying("Verifying"),
    Validating("Validating"),
    Enriching("Enriching"),
    Ready("Ready"),
    Invalid("Invalid"),
    Failed("Failed");
    public final String value;
    LeadResponseProcessingStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LeadResponseProcessingStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Verifying": return Verifying;
            case "Validating": return Validating;
            case "Enriching": return Enriching;
            case "Ready": return Ready;
            case "Invalid": return Invalid;
            case "Failed": return Failed;
            default: return null;
        }
    }
}

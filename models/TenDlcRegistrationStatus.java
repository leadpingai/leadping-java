package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the provider lifecycle for an individual 10DLC brand or campaign.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TenDlcRegistrationStatus implements ValuedEnum {
    NotSubmitted("NotSubmitted"),
    Pending("Pending"),
    Approved("Approved"),
    Rejected("Rejected"),
    Failed("Failed");
    public final String value;
    TenDlcRegistrationStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TenDlcRegistrationStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "NotSubmitted": return NotSubmitted;
            case "Pending": return Pending;
            case "Approved": return Approved;
            case "Rejected": return Rejected;
            case "Failed": return Failed;
            default: return null;
        }
    }
}

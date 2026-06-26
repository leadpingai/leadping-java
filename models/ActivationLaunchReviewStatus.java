package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Activation Launch Review Status values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ActivationLaunchReviewStatus implements ValuedEnum {
    NotReady("NotReady"),
    Pending("Pending"),
    Approved("Approved"),
    NotRequired("NotRequired"),
    Blocked("Blocked");
    public final String value;
    ActivationLaunchReviewStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ActivationLaunchReviewStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "NotReady": return NotReady;
            case "Pending": return Pending;
            case "Approved": return Approved;
            case "NotRequired": return NotRequired;
            case "Blocked": return Blocked;
            default: return null;
        }
    }
}

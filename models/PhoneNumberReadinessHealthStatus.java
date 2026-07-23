package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported SMS readiness health assessments.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PhoneNumberReadinessHealthStatus implements ValuedEnum {
    NotEvaluated("Not Evaluated"),
    Evaluating("Evaluating"),
    Healthy("Healthy"),
    NeedsAttention("Needs Attention"),
    Blocked("Blocked");
    public final String value;
    PhoneNumberReadinessHealthStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PhoneNumberReadinessHealthStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Not Evaluated": return NotEvaluated;
            case "Evaluating": return Evaluating;
            case "Healthy": return Healthy;
            case "Needs Attention": return NeedsAttention;
            case "Blocked": return Blocked;
            default: return null;
        }
    }
}

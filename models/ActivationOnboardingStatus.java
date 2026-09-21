package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Describes completion and blocking state for an organization&apos;s core Leadping onboarding requirements.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ActivationOnboardingStatus implements ValuedEnum {
    Draft("Draft"),
    Submitted("Submitted"),
    Failed("Failed");
    public final String value;
    ActivationOnboardingStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ActivationOnboardingStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Draft": return Draft;
            case "Submitted": return Submitted;
            case "Failed": return Failed;
            default: return null;
        }
    }
}

package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported voice call warmup stages for a Leadping-managed phone number.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PhoneNumberResponseCallWarmupStage implements ValuedEnum {
    Stage0("Stage 0"),
    Stage1("Stage 1"),
    Stage2("Stage 2"),
    Stage3("Stage 3"),
    Stage4("Stage 4");
    public final String value;
    PhoneNumberResponseCallWarmupStage(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PhoneNumberResponseCallWarmupStage forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Stage 0": return Stage0;
            case "Stage 1": return Stage1;
            case "Stage 2": return Stage2;
            case "Stage 3": return Stage3;
            case "Stage 4": return Stage4;
            default: return null;
        }
    }
}

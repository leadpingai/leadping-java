package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported SMS Traffic Type values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SmsEventTableRowTrafficType implements ValuedEnum {
    RealLead("RealLead"),
    Warmup("Warmup"),
    Test("Test"),
    SystemInternal("SystemInternal"),
    FailedAttempt("FailedAttempt");
    public final String value;
    SmsEventTableRowTrafficType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SmsEventTableRowTrafficType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "RealLead": return RealLead;
            case "Warmup": return Warmup;
            case "Test": return Test;
            case "SystemInternal": return SystemInternal;
            case "FailedAttempt": return FailedAttempt;
            default: return null;
        }
    }
}

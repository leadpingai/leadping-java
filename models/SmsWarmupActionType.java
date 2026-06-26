package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported SMS Warmup Action Type values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SmsWarmupActionType implements ValuedEnum {
    OutboundMessage("OutboundMessage"),
    ReplyMessage("ReplyMessage"),
    HealthCheck("HealthCheck"),
    Audit("Audit");
    public final String value;
    SmsWarmupActionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SmsWarmupActionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "OutboundMessage": return OutboundMessage;
            case "ReplyMessage": return ReplyMessage;
            case "HealthCheck": return HealthCheck;
            case "Audit": return Audit;
            default: return null;
        }
    }
}

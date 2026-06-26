package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the source that requested outbound delivery.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SendSmsRequestOutboundSource implements ValuedEnum {
    Manual("manual"),
    Automation("automation"),
    Campaign("campaign"),
    Import("import"),
    Api("api"),
    System_notification("system_notification"),
    Warmup("warmup"),
    Retry("retry");
    public final String value;
    SendSmsRequestOutboundSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SendSmsRequestOutboundSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "manual": return Manual;
            case "automation": return Automation;
            case "campaign": return Campaign;
            case "import": return Import;
            case "api": return Api;
            case "system_notification": return System_notification;
            case "warmup": return Warmup;
            case "retry": return Retry;
            default: return null;
        }
    }
}

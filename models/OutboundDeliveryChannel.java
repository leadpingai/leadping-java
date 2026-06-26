package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines outbound delivery channels protected by delivery control.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OutboundDeliveryChannel implements ValuedEnum {
    Sms("sms"),
    Voice("voice"),
    Email("email"),
    Webhook("webhook"),
    Internal_notification("internal_notification");
    public final String value;
    OutboundDeliveryChannel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OutboundDeliveryChannel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sms": return Sms;
            case "voice": return Voice;
            case "email": return Email;
            case "webhook": return Webhook;
            case "internal_notification": return Internal_notification;
            default: return null;
        }
    }
}

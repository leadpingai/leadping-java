package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Event timeline type values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EventDetailResponseTimelineType implements ValuedEnum {
    Message("Message"),
    Sms("Sms"),
    Mms("Mms"),
    Call("Call"),
    Voicemail("Voicemail"),
    Note("Note"),
    Disposition("Disposition"),
    LeadCreated("LeadCreated"),
    LeadUpdated("LeadUpdated"),
    Notification("Notification"),
    Payment("Payment"),
    Warmup("Warmup");
    public final String value;
    EventDetailResponseTimelineType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EventDetailResponseTimelineType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Message": return Message;
            case "Sms": return Sms;
            case "Mms": return Mms;
            case "Call": return Call;
            case "Voicemail": return Voicemail;
            case "Note": return Note;
            case "Disposition": return Disposition;
            case "LeadCreated": return LeadCreated;
            case "LeadUpdated": return LeadUpdated;
            case "Notification": return Notification;
            case "Payment": return Payment;
            case "Warmup": return Warmup;
            default: return null;
        }
    }
}

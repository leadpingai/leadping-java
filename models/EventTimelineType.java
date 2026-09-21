package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Classifies the kind of activity displayed in a lead or conversation event timeline.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EventTimelineType implements ValuedEnum {
    Message("Message"),
    Sms("Sms"),
    Mms("Mms"),
    Call("Call"),
    Voicemail("Voicemail"),
    Note("Note"),
    LeadStatusChange("LeadStatusChange"),
    LeadCreated("LeadCreated"),
    LeadUpdated("LeadUpdated"),
    Notification("Notification"),
    Payment("Payment"),
    Warmup("Warmup");
    public final String value;
    EventTimelineType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EventTimelineType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Message": return Message;
            case "Sms": return Sms;
            case "Mms": return Mms;
            case "Call": return Call;
            case "Voicemail": return Voicemail;
            case "Note": return Note;
            case "LeadStatusChange": return LeadStatusChange;
            case "LeadCreated": return LeadCreated;
            case "LeadUpdated": return LeadUpdated;
            case "Notification": return Notification;
            case "Payment": return Payment;
            case "Warmup": return Warmup;
            default: return null;
        }
    }
}

package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines priority classes used when pacing outbound delivery.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SendSmsRequestOutboundPriority implements ValuedEnum {
    Critical_internal_notification("critical_internal_notification"),
    Fresh_inbound_lead_response("fresh_inbound_lead_response"),
    Manual_user_initiated("manual_user_initiated"),
    Active_conversation_reply("active_conversation_reply"),
    Automation_follow_up("automation_follow_up"),
    Campaign_message("campaign_message"),
    Imported_lead_campaign("imported_lead_campaign"),
    Warmup("warmup"),
    Retry("retry");
    public final String value;
    SendSmsRequestOutboundPriority(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SendSmsRequestOutboundPriority forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "critical_internal_notification": return Critical_internal_notification;
            case "fresh_inbound_lead_response": return Fresh_inbound_lead_response;
            case "manual_user_initiated": return Manual_user_initiated;
            case "active_conversation_reply": return Active_conversation_reply;
            case "automation_follow_up": return Automation_follow_up;
            case "campaign_message": return Campaign_message;
            case "imported_lead_campaign": return Imported_lead_campaign;
            case "warmup": return Warmup;
            case "retry": return Retry;
            default: return null;
        }
    }
}

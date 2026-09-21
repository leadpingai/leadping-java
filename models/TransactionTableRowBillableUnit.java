package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Identifies the metered unit used to price Leadping usage, such as a message, call minute, lookup, or phone number.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TransactionTableRowBillableUnit implements ValuedEnum {
    Lead_received("lead_received"),
    Phone_identity_lookup("phone_identity_lookup"),
    Sms_segment("sms_segment"),
    Mms_message("mms_message"),
    Email_message("email_message"),
    Voice_minute("voice_minute"),
    Phone_number_month("phone_number_month"),
    Warmup_sms_segment("warmup_sms_segment"),
    Warmup_voice_minute("warmup_voice_minute"),
    Website_setup("website_setup"),
    Openai_operation("openai_operation"),
    Domain_registration("domain_registration"),
    OneZerodlc_application("10dlc_application"),
    OneZerodlc_campaign_month("10dlc_campaign_month"),
    Payment_processing_fee("payment_processing_fee"),
    Connection_action("connection_action"),
    Automation_run("automation_run");
    public final String value;
    TransactionTableRowBillableUnit(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TransactionTableRowBillableUnit forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "lead_received": return Lead_received;
            case "phone_identity_lookup": return Phone_identity_lookup;
            case "sms_segment": return Sms_segment;
            case "mms_message": return Mms_message;
            case "email_message": return Email_message;
            case "voice_minute": return Voice_minute;
            case "phone_number_month": return Phone_number_month;
            case "warmup_sms_segment": return Warmup_sms_segment;
            case "warmup_voice_minute": return Warmup_voice_minute;
            case "website_setup": return Website_setup;
            case "openai_operation": return Openai_operation;
            case "domain_registration": return Domain_registration;
            case "10dlc_application": return OneZerodlc_application;
            case "10dlc_campaign_month": return OneZerodlc_campaign_month;
            case "payment_processing_fee": return Payment_processing_fee;
            case "connection_action": return Connection_action;
            case "automation_run": return Automation_run;
            default: return null;
        }
    }
}

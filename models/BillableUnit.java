package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Billable Unit values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BillableUnit implements ValuedEnum {
    Sms_segment("sms_segment"),
    Mms_message("mms_message"),
    Email_message("email_message"),
    Voice_minute("voice_minute"),
    Phone_number_month("phone_number_month"),
    Warmup_sms_segment("warmup_sms_segment"),
    Warmup_voice_minute("warmup_voice_minute"),
    Website_setup("website_setup"),
    Domain_registration("domain_registration"),
    OneZerodlc_application("10dlc_application"),
    Connection_action("connection_action"),
    Automation_run("automation_run");
    public final String value;
    BillableUnit(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BillableUnit forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sms_segment": return Sms_segment;
            case "mms_message": return Mms_message;
            case "email_message": return Email_message;
            case "voice_minute": return Voice_minute;
            case "phone_number_month": return Phone_number_month;
            case "warmup_sms_segment": return Warmup_sms_segment;
            case "warmup_voice_minute": return Warmup_voice_minute;
            case "website_setup": return Website_setup;
            case "domain_registration": return Domain_registration;
            case "10dlc_application": return OneZerodlc_application;
            case "connection_action": return Connection_action;
            case "automation_run": return Automation_run;
            default: return null;
        }
    }
}

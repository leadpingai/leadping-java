package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Phone Call Status values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PhoneCallStatus implements ValuedEnum {
    Scheduled("scheduled"),
    Queued("queued"),
    Initiated("initiated"),
    Ringing("ringing"),
    In_progress("in_progress"),
    Active("active"),
    Completed("completed"),
    Ended("ended"),
    Busy("busy"),
    No_answer("no_answer"),
    Failed("failed"),
    Canceled("canceled"),
    Missed("missed"),
    Transferred("transferred"),
    Voicemail("voicemail"),
    Blocked_billing("blocked_billing"),
    Blocked_phone_number_status("blocked_phone_number_status"),
    Blocked_configuration("blocked_configuration"),
    Blocked_permission("blocked_permission"),
    Configuration_required("configuration_required");
    public final String value;
    PhoneCallStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PhoneCallStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "scheduled": return Scheduled;
            case "queued": return Queued;
            case "initiated": return Initiated;
            case "ringing": return Ringing;
            case "in_progress": return In_progress;
            case "active": return Active;
            case "completed": return Completed;
            case "ended": return Ended;
            case "busy": return Busy;
            case "no_answer": return No_answer;
            case "failed": return Failed;
            case "canceled": return Canceled;
            case "missed": return Missed;
            case "transferred": return Transferred;
            case "voicemail": return Voicemail;
            case "blocked_billing": return Blocked_billing;
            case "blocked_phone_number_status": return Blocked_phone_number_status;
            case "blocked_configuration": return Blocked_configuration;
            case "blocked_permission": return Blocked_permission;
            case "configuration_required": return Configuration_required;
            default: return null;
        }
    }
}

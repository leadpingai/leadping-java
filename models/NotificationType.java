package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Notification Type values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum NotificationType implements ValuedEnum {
    General("General"),
    Lead("Lead"),
    Call("Call"),
    Sms("Sms"),
    Billing("Billing"),
    System("System"),
    Success("Success"),
    Warning("Warning"),
    Error("Error"),
    Info("Info"),
    Announcement("Announcement"),
    Activation("Activation");
    public final String value;
    NotificationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static NotificationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "General": return General;
            case "Lead": return Lead;
            case "Call": return Call;
            case "Sms": return Sms;
            case "Billing": return Billing;
            case "System": return System;
            case "Success": return Success;
            case "Warning": return Warning;
            case "Error": return Error;
            case "Info": return Info;
            case "Announcement": return Announcement;
            case "Activation": return Activation;
            default: return null;
        }
    }
}

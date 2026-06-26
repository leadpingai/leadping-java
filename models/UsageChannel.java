package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Usage Channel values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UsageChannel implements ValuedEnum {
    Sms("sms"),
    Mms("mms"),
    Email("email"),
    Voice("voice"),
    Phone_number("phone_number"),
    Warmup("warmup"),
    Website("website"),
    Domain("domain"),
    OneZerodlc("10dlc"),
    Connection("connection"),
    Automation("automation");
    public final String value;
    UsageChannel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UsageChannel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sms": return Sms;
            case "mms": return Mms;
            case "email": return Email;
            case "voice": return Voice;
            case "phone_number": return Phone_number;
            case "warmup": return Warmup;
            case "website": return Website;
            case "domain": return Domain;
            case "10dlc": return OneZerodlc;
            case "connection": return Connection;
            case "automation": return Automation;
            default: return null;
        }
    }
}

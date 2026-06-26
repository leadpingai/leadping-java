package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * An enumerator describing phone line types
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PhoneLookupLineType implements ValuedEnum {
    Wireline("Wireline"),
    Wireless("Wireless"),
    VoWiFi("VoWiFi"),
    VoIP("VoIP"),
    PrePaidWireless("PrePaidWireless"),
    Unknown("Unknown");
    public final String value;
    PhoneLookupLineType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PhoneLookupLineType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Wireline": return Wireline;
            case "Wireless": return Wireless;
            case "VoWiFi": return VoWiFi;
            case "VoIP": return VoIP;
            case "PrePaidWireless": return PrePaidWireless;
            case "Unknown": return Unknown;
            default: return null;
        }
    }
}

package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * An enumerator describing carrier types
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PhoneLookupCarrierType implements ValuedEnum {
    FixedLine("FixedLine"),
    Mobile("Mobile"),
    Voip("Voip"),
    FixedLineOrMobile("FixedLineOrMobile"),
    TollFree("TollFree"),
    PremiumRate("PremiumRate"),
    SharedCost("SharedCost"),
    PersonalNumber("PersonalNumber"),
    Pager("Pager"),
    Uan("Uan"),
    Voicemail("Voicemail"),
    Unknown("Unknown");
    public final String value;
    PhoneLookupCarrierType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PhoneLookupCarrierType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "FixedLine": return FixedLine;
            case "Mobile": return Mobile;
            case "Voip": return Voip;
            case "FixedLineOrMobile": return FixedLineOrMobile;
            case "TollFree": return TollFree;
            case "PremiumRate": return PremiumRate;
            case "SharedCost": return SharedCost;
            case "PersonalNumber": return PersonalNumber;
            case "Pager": return Pager;
            case "Uan": return Uan;
            case "Voicemail": return Voicemail;
            case "Unknown": return Unknown;
            default: return null;
        }
    }
}

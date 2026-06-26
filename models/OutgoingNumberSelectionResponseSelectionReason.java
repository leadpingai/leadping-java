package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Outgoing Number Selection Reason values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OutgoingNumberSelectionResponseSelectionReason implements ValuedEnum {
    StickyConversation("StickyConversation"),
    LeadAssigned("LeadAssigned"),
    CampaignOrSource("CampaignOrSource"),
    Preferred("Preferred"),
    LocalArea("LocalArea"),
    HealthyPool("HealthyPool"),
    FallbackDefault("FallbackDefault"),
    ManualOverride("ManualOverride");
    public final String value;
    OutgoingNumberSelectionResponseSelectionReason(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OutgoingNumberSelectionResponseSelectionReason forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "StickyConversation": return StickyConversation;
            case "LeadAssigned": return LeadAssigned;
            case "CampaignOrSource": return CampaignOrSource;
            case "Preferred": return Preferred;
            case "LocalArea": return LocalArea;
            case "HealthyPool": return HealthyPool;
            case "FallbackDefault": return FallbackDefault;
            case "ManualOverride": return ManualOverride;
            default: return null;
        }
    }
}

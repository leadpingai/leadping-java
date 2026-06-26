package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Business Setup Step values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BusinessRequestSetupStep implements ValuedEnum {
    DomainFinding("DomainFinding"),
    DomainOptionsFound("DomainOptionsFound"),
    SiteGenerating("SiteGenerating"),
    SiteGenerated("SiteGenerated"),
    BrandSubmitted("BrandSubmitted"),
    BrandApproved("BrandApproved"),
    CampaignSubmitted("CampaignSubmitted"),
    CampaignApproved("CampaignApproved"),
    CarrierReviewing("CarrierReviewing"),
    TenDlcComplete("TenDlcComplete"),
    Complete("Complete");
    public final String value;
    BusinessRequestSetupStep(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BusinessRequestSetupStep forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "DomainFinding": return DomainFinding;
            case "DomainOptionsFound": return DomainOptionsFound;
            case "SiteGenerating": return SiteGenerating;
            case "SiteGenerated": return SiteGenerated;
            case "BrandSubmitted": return BrandSubmitted;
            case "BrandApproved": return BrandApproved;
            case "CampaignSubmitted": return CampaignSubmitted;
            case "CampaignApproved": return CampaignApproved;
            case "CarrierReviewing": return CarrierReviewing;
            case "TenDlcComplete": return TenDlcComplete;
            case "Complete": return Complete;
            default: return null;
        }
    }
}

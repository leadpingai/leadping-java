package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Website Lifecycle Status values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WebsiteLifecycleStatus implements ValuedEnum {
    NotStarted("NotStarted"),
    DomainSuggestionsPending("DomainSuggestionsPending"),
    DomainSelectionPending("DomainSelectionPending"),
    DomainPurchasePending("DomainPurchasePending"),
    DomainPurchased("DomainPurchased"),
    WebsiteGenerationQueued("WebsiteGenerationQueued"),
    WebsiteGenerating("WebsiteGenerating"),
    WebsiteDeploymentQueued("WebsiteDeploymentQueued"),
    WebsiteDeploying("WebsiteDeploying"),
    WebsiteLive("WebsiteLive"),
    WebsiteFailed("WebsiteFailed"),
    ManuallyBypassed("ManuallyBypassed");
    public final String value;
    WebsiteLifecycleStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WebsiteLifecycleStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "NotStarted": return NotStarted;
            case "DomainSuggestionsPending": return DomainSuggestionsPending;
            case "DomainSelectionPending": return DomainSelectionPending;
            case "DomainPurchasePending": return DomainPurchasePending;
            case "DomainPurchased": return DomainPurchased;
            case "WebsiteGenerationQueued": return WebsiteGenerationQueued;
            case "WebsiteGenerating": return WebsiteGenerating;
            case "WebsiteDeploymentQueued": return WebsiteDeploymentQueued;
            case "WebsiteDeploying": return WebsiteDeploying;
            case "WebsiteLive": return WebsiteLive;
            case "WebsiteFailed": return WebsiteFailed;
            case "ManuallyBypassed": return ManuallyBypassed;
            default: return null;
        }
    }
}

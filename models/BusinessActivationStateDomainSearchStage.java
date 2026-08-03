package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the stages of a domain search.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BusinessActivationStateDomainSearchStage implements ValuedEnum {
    Queued("Queued"),
    AskingOpenAi("AskingOpenAi"),
    CheckingCloudflare("CheckingCloudflare"),
    Ranking("Ranking"),
    Complete("Complete"),
    Failed("Failed");
    public final String value;
    BusinessActivationStateDomainSearchStage(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BusinessActivationStateDomainSearchStage forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Queued": return Queued;
            case "AskingOpenAi": return AskingOpenAi;
            case "CheckingCloudflare": return CheckingCloudflare;
            case "Ranking": return Ranking;
            case "Complete": return Complete;
            case "Failed": return Failed;
            default: return null;
        }
    }
}

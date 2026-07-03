package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Customer Activation Status values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BusinessTableRowActivationStatus implements ValuedEnum {
    DraftOnboarding("DraftOnboarding"),
    PaymentMethodPending("PaymentMethodPending"),
    PaymentMethodConfirmed("PaymentMethodConfirmed"),
    SubscriptionPending("SubscriptionPending"),
    SubscriptionReceived("SubscriptionReceived"),
    SubscriptionActive("SubscriptionActive"),
    LaunchReviewPending("LaunchReviewPending"),
    TelephonyProvisioningPending("TelephonyProvisioningPending"),
    TelephonyPartiallyProvisioned("TelephonyPartiallyProvisioned"),
    TelephonyReady("TelephonyReady"),
    AwaitingReview("AwaitingReview"),
    DomainSelection("DomainSelection"),
    WebsiteSetup("WebsiteSetup"),
    ComplianceRegistration("ComplianceRegistration"),
    ReadyForApproval("ReadyForApproval"),
    Active("Active"),
    Failed("Failed"),
    Blocked("Blocked"),
    BlockedRequiresOperatorAction("BlockedRequiresOperatorAction"),
    ManuallyBypassed("ManuallyBypassed");
    public final String value;
    BusinessTableRowActivationStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BusinessTableRowActivationStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "DraftOnboarding": return DraftOnboarding;
            case "PaymentMethodPending": return PaymentMethodPending;
            case "PaymentMethodConfirmed": return PaymentMethodConfirmed;
            case "SubscriptionPending": return SubscriptionPending;
            case "SubscriptionReceived": return SubscriptionReceived;
            case "SubscriptionActive": return SubscriptionActive;
            case "LaunchReviewPending": return LaunchReviewPending;
            case "TelephonyProvisioningPending": return TelephonyProvisioningPending;
            case "TelephonyPartiallyProvisioned": return TelephonyPartiallyProvisioned;
            case "TelephonyReady": return TelephonyReady;
            case "AwaitingReview": return AwaitingReview;
            case "DomainSelection": return DomainSelection;
            case "WebsiteSetup": return WebsiteSetup;
            case "ComplianceRegistration": return ComplianceRegistration;
            case "ReadyForApproval": return ReadyForApproval;
            case "Active": return Active;
            case "Failed": return Failed;
            case "Blocked": return Blocked;
            case "BlockedRequiresOperatorAction": return BlockedRequiresOperatorAction;
            case "ManuallyBypassed": return ManuallyBypassed;
            default: return null;
        }
    }
}

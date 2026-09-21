package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Describes an organization&apos;s overall 10DLC registration lifecycle across brand and messaging campaign submission.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TenDlcApplicationStatus implements ValuedEnum {
    NotStarted("NotStarted"),
    DraftGenerated("DraftGenerated"),
    DraftIncomplete("DraftIncomplete"),
    ReadyToSubmit("ReadyToSubmit"),
    Submitted("Submitted"),
    PendingTelnyxReview("PendingTelnyxReview"),
    Approved("Approved"),
    Rejected("Rejected"),
    NeedsChanges("NeedsChanges"),
    ResubmissionReady("ResubmissionReady"),
    Failed("Failed");
    public final String value;
    TenDlcApplicationStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TenDlcApplicationStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "NotStarted": return NotStarted;
            case "DraftGenerated": return DraftGenerated;
            case "DraftIncomplete": return DraftIncomplete;
            case "ReadyToSubmit": return ReadyToSubmit;
            case "Submitted": return Submitted;
            case "PendingTelnyxReview": return PendingTelnyxReview;
            case "Approved": return Approved;
            case "Rejected": return Rejected;
            case "NeedsChanges": return NeedsChanges;
            case "ResubmissionReady": return ResubmissionReady;
            case "Failed": return Failed;
            default: return null;
        }
    }
}

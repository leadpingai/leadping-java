package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported 10DLC Application Status values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TenDlcApplicationStatus implements ValuedEnum {
    NotStarted("NotStarted"),
    DraftGenerated("DraftGenerated"),
    DraftNeedsAdminReview("DraftNeedsAdminReview"),
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
            case "DraftNeedsAdminReview": return DraftNeedsAdminReview;
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

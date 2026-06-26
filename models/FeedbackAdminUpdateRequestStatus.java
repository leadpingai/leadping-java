package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines admin triage statuses for durable product feedback.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FeedbackAdminUpdateRequestStatus implements ValuedEnum {
    New("new"),
    Reviewed("reviewed"),
    Planned("planned"),
    In_progress("in_progress"),
    Shipped("shipped"),
    Closed("closed"),
    Ignored("ignored");
    public final String value;
    FeedbackAdminUpdateRequestStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FeedbackAdminUpdateRequestStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "new": return New;
            case "reviewed": return Reviewed;
            case "planned": return Planned;
            case "in_progress": return In_progress;
            case "shipped": return Shipped;
            case "closed": return Closed;
            case "ignored": return Ignored;
            default: return null;
        }
    }
}

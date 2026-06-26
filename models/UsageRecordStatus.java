package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Usage Record Status values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UsageRecordStatus implements ValuedEnum {
    Recorded("recorded"),
    Rated("rated"),
    Pending_invoice("pending_invoice"),
    Invoiced("invoiced"),
    Charged("charged"),
    Failed("failed"),
    Refunded_credited("refunded_credited"),
    Non_billable_internal("non_billable_internal"),
    Blocked_due_to_billing("blocked_due_to_billing");
    public final String value;
    UsageRecordStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UsageRecordStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "recorded": return Recorded;
            case "rated": return Rated;
            case "pending_invoice": return Pending_invoice;
            case "invoiced": return Invoiced;
            case "charged": return Charged;
            case "failed": return Failed;
            case "refunded_credited": return Refunded_credited;
            case "non_billable_internal": return Non_billable_internal;
            case "blocked_due_to_billing": return Blocked_due_to_billing;
            default: return null;
        }
    }
}

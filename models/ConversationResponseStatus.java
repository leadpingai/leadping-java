package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the customer-facing operational status for an inbox conversation.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ConversationResponseStatus implements ValuedEnum {
    Needs_reply("needs_reply"),
    Waiting("waiting"),
    Failed("failed"),
    Open("open");
    public final String value;
    ConversationResponseStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConversationResponseStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "needs_reply": return Needs_reply;
            case "waiting": return Waiting;
            case "failed": return Failed;
            case "open": return Open;
            default: return null;
        }
    }
}

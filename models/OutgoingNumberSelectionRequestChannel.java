package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Outgoing Number Channel values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OutgoingNumberSelectionRequestChannel implements ValuedEnum {
    Sms("sms"),
    Call("call");
    public final String value;
    OutgoingNumberSelectionRequestChannel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OutgoingNumberSelectionRequestChannel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sms": return Sms;
            case "call": return Call;
            default: return null;
        }
    }
}

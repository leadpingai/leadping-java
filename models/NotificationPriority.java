package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Notification Priority values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum NotificationPriority implements ValuedEnum {
    Low("Low"),
    Medium("Medium"),
    High("High"),
    Critical("Critical");
    public final String value;
    NotificationPriority(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static NotificationPriority forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Low": return Low;
            case "Medium": return Medium;
            case "High": return High;
            case "Critical": return Critical;
            default: return null;
        }
    }
}

package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported user data export statuses values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserDataExportStatuses implements ValuedEnum {
    Pending("Pending"),
    Processing("Processing"),
    Completed("Completed"),
    Failed("Failed"),
    Expired("Expired");
    public final String value;
    UserDataExportStatuses(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserDataExportStatuses forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Pending": return Pending;
            case "Processing": return Processing;
            case "Completed": return Completed;
            case "Failed": return Failed;
            case "Expired": return Expired;
            default: return null;
        }
    }
}

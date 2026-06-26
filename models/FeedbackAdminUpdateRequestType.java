package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the type of product feedback submitted from inside Leadping.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FeedbackAdminUpdateRequestType implements ValuedEnum {
    Bug("bug"),
    Confusing("confusing"),
    Feature_request("feature_request"),
    Missing_capability("missing_capability"),
    Other("other");
    public final String value;
    FeedbackAdminUpdateRequestType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FeedbackAdminUpdateRequestType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "bug": return Bug;
            case "confusing": return Confusing;
            case "feature_request": return Feature_request;
            case "missing_capability": return Missing_capability;
            case "other": return Other;
            default: return null;
        }
    }
}

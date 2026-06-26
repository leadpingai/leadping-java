package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * An enumerator for sort direction during querying
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OrderByOptionDirection implements ValuedEnum {
    Asc("asc"),
    Desc("desc");
    public final String value;
    OrderByOptionDirection(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OrderByOptionDirection forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "asc": return Asc;
            case "desc": return Desc;
            default: return null;
        }
    }
}

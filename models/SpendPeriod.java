package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Calendar period for an organization channel budget, in UTC.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SpendPeriod implements ValuedEnum {
    Day("day"),
    Week("week"),
    Month("month");
    public final String value;
    SpendPeriod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SpendPeriod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "day": return Day;
            case "week": return Week;
            case "month": return Month;
            default: return null;
        }
    }
}

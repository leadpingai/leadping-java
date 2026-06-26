package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Known sources that can change a lead&apos;s current disposition.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CurrentDispositionSummarySource implements ValuedEnum {
    User("User"),
    AI("AI"),
    Automation("Automation"),
    System("System"),
    API("API");
    public final String value;
    CurrentDispositionSummarySource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CurrentDispositionSummarySource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "User": return User;
            case "AI": return AI;
            case "Automation": return Automation;
            case "System": return System;
            case "API": return API;
            default: return null;
        }
    }
}

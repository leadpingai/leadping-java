package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Known sources that can change a lead&apos;s current disposition.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DispositionResponseChangeSource implements ValuedEnum {
    User("User"),
    AI("AI"),
    Automation("Automation"),
    System("System"),
    API("API");
    public final String value;
    DispositionResponseChangeSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DispositionResponseChangeSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
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

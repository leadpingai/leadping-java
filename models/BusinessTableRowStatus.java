package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines the supported Business Status values.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BusinessTableRowStatus implements ValuedEnum {
    SettingUp("SettingUp"),
    SetupCompleted("SetupCompleted"),
    Active("Active");
    public final String value;
    BusinessTableRowStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BusinessTableRowStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "SettingUp": return SettingUp;
            case "SetupCompleted": return SetupCompleted;
            case "Active": return Active;
            default: return null;
        }
    }
}

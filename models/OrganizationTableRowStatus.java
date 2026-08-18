package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Describes an organization&apos;s account lifecycle and whether it can actively use Leadping services.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OrganizationTableRowStatus implements ValuedEnum {
    SettingUp("SettingUp"),
    SetupCompleted("SetupCompleted"),
    Active("Active");
    public final String value;
    OrganizationTableRowStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OrganizationTableRowStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "SettingUp": return SettingUp;
            case "SetupCompleted": return SetupCompleted;
            case "Active": return Active;
            default: return null;
        }
    }
}

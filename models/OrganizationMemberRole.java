package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Identifies an organization member&apos;s access level and permission scope within Leadping.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OrganizationMemberRole implements ValuedEnum {
    AccountAdmin("Account Admin"),
    Owner("Owner"),
    Admin("Admin"),
    Agent("Agent");
    public final String value;
    OrganizationMemberRole(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OrganizationMemberRole forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Account Admin": return AccountAdmin;
            case "Owner": return Owner;
            case "Admin": return Admin;
            case "Agent": return Agent;
            default: return null;
        }
    }
}

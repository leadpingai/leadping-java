package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The provider responsible for a lead&apos;s consent certificate.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LeadIntakeRequestConsentCertificateType implements ValuedEnum {
    TrustedForm("TrustedForm"),
    Leadping("Leadping"),
    Other("Other");
    public final String value;
    LeadIntakeRequestConsentCertificateType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LeadIntakeRequestConsentCertificateType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "TrustedForm": return TrustedForm;
            case "Leadping": return Leadping;
            case "Other": return Other;
            default: return null;
        }
    }
}

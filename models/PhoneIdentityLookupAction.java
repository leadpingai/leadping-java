package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * An auditable lookup, enrichment, or reputation check performed for a phone identity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneIdentityLookupAction implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of this phone identity lookup action.
     */
    private String id;
    /**
     * The UTC timestamp when the lookup action occurred.
     */
    private OffsetDateTime occurredAt;
    /**
     * The provider that performed the phone identity lookup.
     */
    private String provider;
    /**
     * The provider cost incurred by this lookup action, in USD.
     */
    private Double providerCostAmount;
    /**
     * The provider pricing version used to calculate the lookup cost.
     */
    private String providerPricingVersion;
    /**
     * Identifies the outcome of a phone identity lookup action.
     */
    private PhoneIdentityLookupActionStatus status;
    /**
     * Identifies the kind of lookup action performed for a phone identity.
     */
    private PhoneIdentityLookupActionType type;
    /**
     * Instantiates a new {@link PhoneIdentityLookupAction} and sets the default values.
     */
    public PhoneIdentityLookupAction() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneIdentityLookupAction}
     */
    @jakarta.annotation.Nonnull
    public static PhoneIdentityLookupAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneIdentityLookupAction();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("occurredAt", (n) -> { this.setOccurredAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("provider", (n) -> { this.setProvider(n.getStringValue()); });
        deserializerMap.put("providerCostAmount", (n) -> { this.setProviderCostAmount(n.getDoubleValue()); });
        deserializerMap.put("providerPricingVersion", (n) -> { this.setProviderPricingVersion(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(PhoneIdentityLookupActionStatus::forValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(PhoneIdentityLookupActionType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The unique identifier of this phone identity lookup action.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the occurredAt property value. The UTC timestamp when the lookup action occurred.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getOccurredAt() {
        return this.occurredAt;
    }
    /**
     * Gets the provider property value. The provider that performed the phone identity lookup.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProvider() {
        return this.provider;
    }
    /**
     * Gets the providerCostAmount property value. The provider cost incurred by this lookup action, in USD.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getProviderCostAmount() {
        return this.providerCostAmount;
    }
    /**
     * Gets the providerPricingVersion property value. The provider pricing version used to calculate the lookup cost.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProviderPricingVersion() {
        return this.providerPricingVersion;
    }
    /**
     * Gets the status property value. Identifies the outcome of a phone identity lookup action.
     * @return a {@link PhoneIdentityLookupActionStatus}
     */
    @jakarta.annotation.Nullable
    public PhoneIdentityLookupActionStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the type property value. Identifies the kind of lookup action performed for a phone identity.
     * @return a {@link PhoneIdentityLookupActionType}
     */
    @jakarta.annotation.Nullable
    public PhoneIdentityLookupActionType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("id", this.getId());
        writer.writeOffsetDateTimeValue("occurredAt", this.getOccurredAt());
        writer.writeStringValue("provider", this.getProvider());
        writer.writeDoubleValue("providerCostAmount", this.getProviderCostAmount());
        writer.writeStringValue("providerPricingVersion", this.getProviderPricingVersion());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeEnumValue("type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the id property value. The unique identifier of this phone identity lookup action.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the occurredAt property value. The UTC timestamp when the lookup action occurred.
     * @param value Value to set for the occurredAt property.
     */
    public void setOccurredAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.occurredAt = value;
    }
    /**
     * Sets the provider property value. The provider that performed the phone identity lookup.
     * @param value Value to set for the provider property.
     */
    public void setProvider(@jakarta.annotation.Nullable final String value) {
        this.provider = value;
    }
    /**
     * Sets the providerCostAmount property value. The provider cost incurred by this lookup action, in USD.
     * @param value Value to set for the providerCostAmount property.
     */
    public void setProviderCostAmount(@jakarta.annotation.Nullable final Double value) {
        this.providerCostAmount = value;
    }
    /**
     * Sets the providerPricingVersion property value. The provider pricing version used to calculate the lookup cost.
     * @param value Value to set for the providerPricingVersion property.
     */
    public void setProviderPricingVersion(@jakarta.annotation.Nullable final String value) {
        this.providerPricingVersion = value;
    }
    /**
     * Sets the status property value. Identifies the outcome of a phone identity lookup action.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final PhoneIdentityLookupActionStatus value) {
        this.status = value;
    }
    /**
     * Sets the type property value. Identifies the kind of lookup action performed for a phone identity.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final PhoneIdentityLookupActionType value) {
        this.type = value;
    }
}

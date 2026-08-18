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
 * Describes a Leadping-managed phone number, including capabilities, messaging registration, health, and assignment details.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneNumberResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * UTC timestamp when the resource was created.
     */
    private OffsetDateTime createdAt;
    /**
     * Indicates whether this phone number is active and available in the Leadping API.
     */
    private Boolean enabled;
    /**
     * Stable unique identifier of the resource.
     */
    private String id;
    /**
     * Indicates whether Leadping provisions and manages this phone number.
     */
    private Boolean leadpingOwned;
    /**
     * UTC timestamp when the resource was last modified, or null when it has not been updated.
     */
    private OffsetDateTime modifiedAt;
    /**
     * Human-readable display name of the resource.
     */
    private String name;
    /**
     * E.164 phone number exposed by this phone number.
     */
    private String number;
    /**
     * Organization summary connected to this phone number.
     */
    private PhoneNumberResponseOrganization organization;
    /**
     * Identifier of the canonical phone identity for this number.
     */
    private String phoneIdentityId;
    /**
     * Routing metadata that connects this phone number to teams, campaigns, and sources.
     */
    private PhoneNumberRoutingMetadata routing;
    /**
     * SMS and call warmup for this phone number.
     */
    private PhoneNumberReadiness warmup;
    /**
     * Instantiates a new {@link PhoneNumberResponse} and sets the default values.
     */
    public PhoneNumberResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneNumberResponse}
     */
    @jakarta.annotation.Nonnull
    public static PhoneNumberResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneNumberResponse();
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
     * Gets the createdAt property value. UTC timestamp when the resource was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the enabled property value. Indicates whether this phone number is active and available in the Leadping API.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("leadpingOwned", (n) -> { this.setLeadpingOwned(n.getBooleanValue()); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getStringValue()); });
        deserializerMap.put("organization", (n) -> { this.setOrganization(n.getObjectValue(PhoneNumberResponseOrganization::createFromDiscriminatorValue)); });
        deserializerMap.put("phoneIdentityId", (n) -> { this.setPhoneIdentityId(n.getStringValue()); });
        deserializerMap.put("routing", (n) -> { this.setRouting(n.getObjectValue(PhoneNumberRoutingMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("warmup", (n) -> { this.setWarmup(n.getObjectValue(PhoneNumberReadiness::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Stable unique identifier of the resource.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the leadpingOwned property value. Indicates whether Leadping provisions and manages this phone number.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLeadpingOwned() {
        return this.leadpingOwned;
    }
    /**
     * Gets the modifiedAt property value. UTC timestamp when the resource was last modified, or null when it has not been updated.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * Gets the name property value. Human-readable display name of the resource.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the number property value. E.164 phone number exposed by this phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNumber() {
        return this.number;
    }
    /**
     * Gets the organization property value. Organization summary connected to this phone number.
     * @return a {@link PhoneNumberResponseOrganization}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberResponseOrganization getOrganization() {
        return this.organization;
    }
    /**
     * Gets the phoneIdentityId property value. Identifier of the canonical phone identity for this number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneIdentityId() {
        return this.phoneIdentityId;
    }
    /**
     * Gets the routing property value. Routing metadata that connects this phone number to teams, campaigns, and sources.
     * @return a {@link PhoneNumberRoutingMetadata}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberRoutingMetadata getRouting() {
        return this.routing;
    }
    /**
     * Gets the warmup property value. SMS and call warmup for this phone number.
     * @return a {@link PhoneNumberReadiness}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberReadiness getWarmup() {
        return this.warmup;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("leadpingOwned", this.getLeadpingOwned());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("number", this.getNumber());
        writer.writeObjectValue("organization", this.getOrganization());
        writer.writeStringValue("phoneIdentityId", this.getPhoneIdentityId());
        writer.writeObjectValue("routing", this.getRouting());
        writer.writeObjectValue("warmup", this.getWarmup());
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
     * Sets the createdAt property value. UTC timestamp when the resource was created.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the enabled property value. Indicates whether this phone number is active and available in the Leadping API.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the id property value. Stable unique identifier of the resource.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the leadpingOwned property value. Indicates whether Leadping provisions and manages this phone number.
     * @param value Value to set for the leadpingOwned property.
     */
    public void setLeadpingOwned(@jakarta.annotation.Nullable final Boolean value) {
        this.leadpingOwned = value;
    }
    /**
     * Sets the modifiedAt property value. UTC timestamp when the resource was last modified, or null when it has not been updated.
     * @param value Value to set for the modifiedAt property.
     */
    public void setModifiedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedAt = value;
    }
    /**
     * Sets the name property value. Human-readable display name of the resource.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the number property value. E.164 phone number exposed by this phone number.
     * @param value Value to set for the number property.
     */
    public void setNumber(@jakarta.annotation.Nullable final String value) {
        this.number = value;
    }
    /**
     * Sets the organization property value. Organization summary connected to this phone number.
     * @param value Value to set for the organization property.
     */
    public void setOrganization(@jakarta.annotation.Nullable final PhoneNumberResponseOrganization value) {
        this.organization = value;
    }
    /**
     * Sets the phoneIdentityId property value. Identifier of the canonical phone identity for this number.
     * @param value Value to set for the phoneIdentityId property.
     */
    public void setPhoneIdentityId(@jakarta.annotation.Nullable final String value) {
        this.phoneIdentityId = value;
    }
    /**
     * Sets the routing property value. Routing metadata that connects this phone number to teams, campaigns, and sources.
     * @param value Value to set for the routing property.
     */
    public void setRouting(@jakarta.annotation.Nullable final PhoneNumberRoutingMetadata value) {
        this.routing = value;
    }
    /**
     * Sets the warmup property value. SMS and call warmup for this phone number.
     * @param value Value to set for the warmup property.
     */
    public void setWarmup(@jakarta.annotation.Nullable final PhoneNumberReadiness value) {
        this.warmup = value;
    }
}

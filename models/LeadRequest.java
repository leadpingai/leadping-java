package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Request schema for the Leadping API lead request, including the fields clients can send.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeadRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Contact details for the lead or customer represented by this lead request.
     */
    private LeadContact contact;
    /**
     * Demographic profile details for the lead represented by this lead request.
     */
    private LeadProfile customer;
    /**
     * Indicates whether this lead request is active and available in the Leadping API.
     */
    private Boolean enabled;
    /**
     * The unique identifier for the entity, when updating an existing entity.
     */
    private String id;
    /**
     * Structured metadata used for attribution, integrations, and reporting on this lead request.
     */
    private LeadMetadata metadata;
    /**
     * Tag IDs assigned to or filtered against this lead.
     */
    private java.util.List<String> tagIds;
    /**
     * Tag names assigned to this lead when matching existing tags by name.
     */
    private java.util.List<String> tagNames;
    /**
     * Instantiates a new {@link LeadRequest} and sets the default values.
     */
    public LeadRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LeadRequest}
     */
    @jakarta.annotation.Nonnull
    public static LeadRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LeadRequest();
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
     * Gets the contact property value. Contact details for the lead or customer represented by this lead request.
     * @return a {@link LeadContact}
     */
    @jakarta.annotation.Nullable
    public LeadContact getContact() {
        return this.contact;
    }
    /**
     * Gets the customer property value. Demographic profile details for the lead represented by this lead request.
     * @return a {@link LeadProfile}
     */
    @jakarta.annotation.Nullable
    public LeadProfile getCustomer() {
        return this.customer;
    }
    /**
     * Gets the enabled property value. Indicates whether this lead request is active and available in the Leadping API.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("contact", (n) -> { this.setContact(n.getObjectValue(LeadContact::createFromDiscriminatorValue)); });
        deserializerMap.put("customer", (n) -> { this.setCustomer(n.getObjectValue(LeadProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(LeadMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("tagIds", (n) -> { this.setTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("tagNames", (n) -> { this.setTagNames(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The unique identifier for the entity, when updating an existing entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the metadata property value. Structured metadata used for attribution, integrations, and reporting on this lead request.
     * @return a {@link LeadMetadata}
     */
    @jakarta.annotation.Nullable
    public LeadMetadata getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the tagIds property value. Tag IDs assigned to or filtered against this lead.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }
    /**
     * Gets the tagNames property value. Tag names assigned to this lead when matching existing tags by name.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTagNames() {
        return this.tagNames;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("contact", this.getContact());
        writer.writeObjectValue("customer", this.getCustomer());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeStringValue("id", this.getId());
        writer.writeObjectValue("metadata", this.getMetadata());
        writer.writeCollectionOfPrimitiveValues("tagIds", this.getTagIds());
        writer.writeCollectionOfPrimitiveValues("tagNames", this.getTagNames());
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
     * Sets the contact property value. Contact details for the lead or customer represented by this lead request.
     * @param value Value to set for the contact property.
     */
    public void setContact(@jakarta.annotation.Nullable final LeadContact value) {
        this.contact = value;
    }
    /**
     * Sets the customer property value. Demographic profile details for the lead represented by this lead request.
     * @param value Value to set for the customer property.
     */
    public void setCustomer(@jakarta.annotation.Nullable final LeadProfile value) {
        this.customer = value;
    }
    /**
     * Sets the enabled property value. Indicates whether this lead request is active and available in the Leadping API.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the id property value. The unique identifier for the entity, when updating an existing entity.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the metadata property value. Structured metadata used for attribution, integrations, and reporting on this lead request.
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final LeadMetadata value) {
        this.metadata = value;
    }
    /**
     * Sets the tagIds property value. Tag IDs assigned to or filtered against this lead.
     * @param value Value to set for the tagIds property.
     */
    public void setTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.tagIds = value;
    }
    /**
     * Sets the tagNames property value. Tag names assigned to this lead when matching existing tags by name.
     * @param value Value to set for the tagNames property.
     */
    public void setTagNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.tagNames = value;
    }
}

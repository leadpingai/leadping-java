package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Request schema for the Leadping API lead source request, including the fields clients can send.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SourceRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Product allowlist used to accept or route leads from this source.
     */
    private java.util.List<String> allowedProducts;
    /**
     * State or region allowlist used to accept leads from this source.
     */
    private java.util.List<String> allowedStates;
    /**
     * Source API key used to authenticate inbound lead delivery to Leadping.
     */
    private String apiKey;
    /**
     * Configured cost charged when this source creates a billable lead.
     */
    private UntypedNode costPerLead;
    /**
     * Tag IDs automatically assigned to leads created by this source.
     */
    private java.util.List<String> defaultTagIds;
    /**
     * Tag names automatically assigned to leads created by this source.
     */
    private java.util.List<String> defaultTagNames;
    /**
     * Human-readable description that explains this lead source request to API users.
     */
    private String description;
    /**
     * Indicates whether this lead source request is active and available in the Leadping API.
     */
    private Boolean enabled;
    /**
     * The unique identifier for the entity, when updating an existing entity.
     */
    private String id;
    /**
     * The display name for the entity.
     */
    private String name;
    /**
     * Indicates whether Leadping should issue a new API key for this source.
     */
    private Boolean regenerateApiKey;
    /**
     * Indicates whether leads from this source must include a TrustedForm certificate for consent proof.
     */
    private Boolean requiresTrustedForm;
    /**
     * Instantiates a new {@link SourceRequest} and sets the default values.
     */
    public SourceRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SourceRequest}
     */
    @jakarta.annotation.Nonnull
    public static SourceRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SourceRequest();
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
     * Gets the allowedProducts property value. Product allowlist used to accept or route leads from this source.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedProducts() {
        return this.allowedProducts;
    }
    /**
     * Gets the allowedStates property value. State or region allowlist used to accept leads from this source.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedStates() {
        return this.allowedStates;
    }
    /**
     * Gets the apiKey property value. Source API key used to authenticate inbound lead delivery to Leadping.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApiKey() {
        return this.apiKey;
    }
    /**
     * Gets the costPerLead property value. Configured cost charged when this source creates a billable lead.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getCostPerLead() {
        return this.costPerLead;
    }
    /**
     * Gets the defaultTagIds property value. Tag IDs automatically assigned to leads created by this source.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDefaultTagIds() {
        return this.defaultTagIds;
    }
    /**
     * Gets the defaultTagNames property value. Tag names automatically assigned to leads created by this source.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDefaultTagNames() {
        return this.defaultTagNames;
    }
    /**
     * Gets the description property value. Human-readable description that explains this lead source request to API users.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the enabled property value. Indicates whether this lead source request is active and available in the Leadping API.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("allowedProducts", (n) -> { this.setAllowedProducts(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("allowedStates", (n) -> { this.setAllowedStates(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("apiKey", (n) -> { this.setApiKey(n.getStringValue()); });
        deserializerMap.put("costPerLead", (n) -> { this.setCostPerLead(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultTagIds", (n) -> { this.setDefaultTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defaultTagNames", (n) -> { this.setDefaultTagNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("regenerateApiKey", (n) -> { this.setRegenerateApiKey(n.getBooleanValue()); });
        deserializerMap.put("requiresTrustedForm", (n) -> { this.setRequiresTrustedForm(n.getBooleanValue()); });
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
     * Gets the name property value. The display name for the entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the regenerateApiKey property value. Indicates whether Leadping should issue a new API key for this source.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRegenerateApiKey() {
        return this.regenerateApiKey;
    }
    /**
     * Gets the requiresTrustedForm property value. Indicates whether leads from this source must include a TrustedForm certificate for consent proof.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequiresTrustedForm() {
        return this.requiresTrustedForm;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("allowedProducts", this.getAllowedProducts());
        writer.writeCollectionOfPrimitiveValues("allowedStates", this.getAllowedStates());
        writer.writeStringValue("apiKey", this.getApiKey());
        writer.writeObjectValue("costPerLead", this.getCostPerLead());
        writer.writeCollectionOfPrimitiveValues("defaultTagIds", this.getDefaultTagIds());
        writer.writeCollectionOfPrimitiveValues("defaultTagNames", this.getDefaultTagNames());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("name", this.getName());
        writer.writeBooleanValue("regenerateApiKey", this.getRegenerateApiKey());
        writer.writeBooleanValue("requiresTrustedForm", this.getRequiresTrustedForm());
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
     * Sets the allowedProducts property value. Product allowlist used to accept or route leads from this source.
     * @param value Value to set for the allowedProducts property.
     */
    public void setAllowedProducts(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.allowedProducts = value;
    }
    /**
     * Sets the allowedStates property value. State or region allowlist used to accept leads from this source.
     * @param value Value to set for the allowedStates property.
     */
    public void setAllowedStates(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.allowedStates = value;
    }
    /**
     * Sets the apiKey property value. Source API key used to authenticate inbound lead delivery to Leadping.
     * @param value Value to set for the apiKey property.
     */
    public void setApiKey(@jakarta.annotation.Nullable final String value) {
        this.apiKey = value;
    }
    /**
     * Sets the costPerLead property value. Configured cost charged when this source creates a billable lead.
     * @param value Value to set for the costPerLead property.
     */
    public void setCostPerLead(@jakarta.annotation.Nullable final UntypedNode value) {
        this.costPerLead = value;
    }
    /**
     * Sets the defaultTagIds property value. Tag IDs automatically assigned to leads created by this source.
     * @param value Value to set for the defaultTagIds property.
     */
    public void setDefaultTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.defaultTagIds = value;
    }
    /**
     * Sets the defaultTagNames property value. Tag names automatically assigned to leads created by this source.
     * @param value Value to set for the defaultTagNames property.
     */
    public void setDefaultTagNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.defaultTagNames = value;
    }
    /**
     * Sets the description property value. Human-readable description that explains this lead source request to API users.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the enabled property value. Indicates whether this lead source request is active and available in the Leadping API.
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
     * Sets the name property value. The display name for the entity.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the regenerateApiKey property value. Indicates whether Leadping should issue a new API key for this source.
     * @param value Value to set for the regenerateApiKey property.
     */
    public void setRegenerateApiKey(@jakarta.annotation.Nullable final Boolean value) {
        this.regenerateApiKey = value;
    }
    /**
     * Sets the requiresTrustedForm property value. Indicates whether leads from this source must include a TrustedForm certificate for consent proof.
     * @param value Value to set for the requiresTrustedForm property.
     */
    public void setRequiresTrustedForm(@jakarta.annotation.Nullable final Boolean value) {
        this.requiresTrustedForm = value;
    }
}

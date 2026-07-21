package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * List item schema for Leadping API lead source table row results shown in searchable tables.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SourceTableRow implements AdditionalDataHolder, Parsable {
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
     * Source API key used to authenticate inbound lead delivery to Leadping. Unlike a business API key, this value remains available to authorized source users.
     */
    private String apiKey;
    /**
     * UTC timestamp when the source API key was last used.
     */
    private OffsetDateTime apiKeyLastUsedAt;
    /**
     * Masked preview of the source API key for compact display.
     */
    private String apiKeyPreview;
    /**
     * Total number of authenticated requests made with this source API key.
     */
    private Long apiKeyTotalUses;
    /**
     * Business summary connected to this lead source table row.
     */
    private SourceTableRowBusiness business;
    /**
     * Business ID that owns this lead source.
     */
    private String businessId;
    /**
     * Indicates whether the business or sender passed compliance review.
     */
    private Boolean complianceApproved;
    /**
     * Configured cost charged when this source creates a billable lead.
     */
    private UntypedNode costPerLead;
    /**
     * UTC timestamp when this lead source table row was created.
     */
    private OffsetDateTime createdAt;
    /**
     * User summary for the person who created this lead source table row.
     */
    private SourceTableRowCreatedByUser createdByUser;
    /**
     * Tag IDs automatically assigned to leads created by this source.
     */
    private java.util.List<String> defaultTagIds;
    /**
     * Default tag summaries automatically applied to leads from this source.
     */
    private java.util.List<TagSummary> defaultTags;
    /**
     * Human-readable description that explains this lead source table row to API users.
     */
    private String description;
    /**
     * Indicates whether this lead source table row is active and available in the Leadping API.
     */
    private Boolean enabled;
    /**
     * UTC timestamp when this source first delivered a lead to Leadping.
     */
    private OffsetDateTime firstLeadReceivedAt;
    /**
     * Unique Leadping identifier for this lead source table row.
     */
    private String id;
    /**
     * UTC timestamp when this source most recently delivered a lead to Leadping.
     */
    private OffsetDateTime lastLeadReceivedAt;
    /**
     * UTC timestamp when this lead source table row was last modified.
     */
    private OffsetDateTime modifiedAt;
    /**
     * User summary for the person who last modified this lead source table row.
     */
    private SourceTableRowModifiedByUser modifiedByUser;
    /**
     * Display name for this lead source table row in the Leadping API.
     */
    private String name;
    /**
     * Indicates whether leads from this source must include a TrustedForm certificate for consent proof.
     */
    private Boolean requiresTrustedForm;
    /**
     * User summary connected to this lead source table row.
     */
    private SourceTableRowUser user;
    /**
     * Instantiates a new {@link SourceTableRow} and sets the default values.
     */
    public SourceTableRow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SourceTableRow}
     */
    @jakarta.annotation.Nonnull
    public static SourceTableRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SourceTableRow();
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
     * Gets the apiKey property value. Source API key used to authenticate inbound lead delivery to Leadping. Unlike a business API key, this value remains available to authorized source users.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApiKey() {
        return this.apiKey;
    }
    /**
     * Gets the apiKeyLastUsedAt property value. UTC timestamp when the source API key was last used.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getApiKeyLastUsedAt() {
        return this.apiKeyLastUsedAt;
    }
    /**
     * Gets the apiKeyPreview property value. Masked preview of the source API key for compact display.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApiKeyPreview() {
        return this.apiKeyPreview;
    }
    /**
     * Gets the apiKeyTotalUses property value. Total number of authenticated requests made with this source API key.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getApiKeyTotalUses() {
        return this.apiKeyTotalUses;
    }
    /**
     * Gets the business property value. Business summary connected to this lead source table row.
     * @return a {@link SourceTableRowBusiness}
     */
    @jakarta.annotation.Nullable
    public SourceTableRowBusiness getBusiness() {
        return this.business;
    }
    /**
     * Gets the businessId property value. Business ID that owns this lead source.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessId() {
        return this.businessId;
    }
    /**
     * Gets the complianceApproved property value. Indicates whether the business or sender passed compliance review.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getComplianceApproved() {
        return this.complianceApproved;
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
     * Gets the createdAt property value. UTC timestamp when this lead source table row was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the createdByUser property value. User summary for the person who created this lead source table row.
     * @return a {@link SourceTableRowCreatedByUser}
     */
    @jakarta.annotation.Nullable
    public SourceTableRowCreatedByUser getCreatedByUser() {
        return this.createdByUser;
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
     * Gets the defaultTags property value. Default tag summaries automatically applied to leads from this source.
     * @return a {@link java.util.List<TagSummary>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TagSummary> getDefaultTags() {
        return this.defaultTags;
    }
    /**
     * Gets the description property value. Human-readable description that explains this lead source table row to API users.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the enabled property value. Indicates whether this lead source table row is active and available in the Leadping API.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(24);
        deserializerMap.put("allowedProducts", (n) -> { this.setAllowedProducts(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("allowedStates", (n) -> { this.setAllowedStates(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("apiKey", (n) -> { this.setApiKey(n.getStringValue()); });
        deserializerMap.put("apiKeyLastUsedAt", (n) -> { this.setApiKeyLastUsedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("apiKeyPreview", (n) -> { this.setApiKeyPreview(n.getStringValue()); });
        deserializerMap.put("apiKeyTotalUses", (n) -> { this.setApiKeyTotalUses(n.getLongValue()); });
        deserializerMap.put("business", (n) -> { this.setBusiness(n.getObjectValue(SourceTableRowBusiness::createFromDiscriminatorValue)); });
        deserializerMap.put("businessId", (n) -> { this.setBusinessId(n.getStringValue()); });
        deserializerMap.put("complianceApproved", (n) -> { this.setComplianceApproved(n.getBooleanValue()); });
        deserializerMap.put("costPerLead", (n) -> { this.setCostPerLead(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdByUser", (n) -> { this.setCreatedByUser(n.getObjectValue(SourceTableRowCreatedByUser::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultTagIds", (n) -> { this.setDefaultTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defaultTags", (n) -> { this.setDefaultTags(n.getCollectionOfObjectValues(TagSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("firstLeadReceivedAt", (n) -> { this.setFirstLeadReceivedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("lastLeadReceivedAt", (n) -> { this.setLastLeadReceivedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("modifiedByUser", (n) -> { this.setModifiedByUser(n.getObjectValue(SourceTableRowModifiedByUser::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("requiresTrustedForm", (n) -> { this.setRequiresTrustedForm(n.getBooleanValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(SourceTableRowUser::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the firstLeadReceivedAt property value. UTC timestamp when this source first delivered a lead to Leadping.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstLeadReceivedAt() {
        return this.firstLeadReceivedAt;
    }
    /**
     * Gets the id property value. Unique Leadping identifier for this lead source table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the lastLeadReceivedAt property value. UTC timestamp when this source most recently delivered a lead to Leadping.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastLeadReceivedAt() {
        return this.lastLeadReceivedAt;
    }
    /**
     * Gets the modifiedAt property value. UTC timestamp when this lead source table row was last modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * Gets the modifiedByUser property value. User summary for the person who last modified this lead source table row.
     * @return a {@link SourceTableRowModifiedByUser}
     */
    @jakarta.annotation.Nullable
    public SourceTableRowModifiedByUser getModifiedByUser() {
        return this.modifiedByUser;
    }
    /**
     * Gets the name property value. Display name for this lead source table row in the Leadping API.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
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
     * Gets the user property value. User summary connected to this lead source table row.
     * @return a {@link SourceTableRowUser}
     */
    @jakarta.annotation.Nullable
    public SourceTableRowUser getUser() {
        return this.user;
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
        writer.writeOffsetDateTimeValue("apiKeyLastUsedAt", this.getApiKeyLastUsedAt());
        writer.writeStringValue("apiKeyPreview", this.getApiKeyPreview());
        writer.writeLongValue("apiKeyTotalUses", this.getApiKeyTotalUses());
        writer.writeObjectValue("business", this.getBusiness());
        writer.writeStringValue("businessId", this.getBusinessId());
        writer.writeBooleanValue("complianceApproved", this.getComplianceApproved());
        writer.writeObjectValue("costPerLead", this.getCostPerLead());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeObjectValue("createdByUser", this.getCreatedByUser());
        writer.writeCollectionOfPrimitiveValues("defaultTagIds", this.getDefaultTagIds());
        writer.writeCollectionOfObjectValues("defaultTags", this.getDefaultTags());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeOffsetDateTimeValue("firstLeadReceivedAt", this.getFirstLeadReceivedAt());
        writer.writeStringValue("id", this.getId());
        writer.writeOffsetDateTimeValue("lastLeadReceivedAt", this.getLastLeadReceivedAt());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
        writer.writeObjectValue("modifiedByUser", this.getModifiedByUser());
        writer.writeStringValue("name", this.getName());
        writer.writeBooleanValue("requiresTrustedForm", this.getRequiresTrustedForm());
        writer.writeObjectValue("user", this.getUser());
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
     * Sets the apiKey property value. Source API key used to authenticate inbound lead delivery to Leadping. Unlike a business API key, this value remains available to authorized source users.
     * @param value Value to set for the apiKey property.
     */
    public void setApiKey(@jakarta.annotation.Nullable final String value) {
        this.apiKey = value;
    }
    /**
     * Sets the apiKeyLastUsedAt property value. UTC timestamp when the source API key was last used.
     * @param value Value to set for the apiKeyLastUsedAt property.
     */
    public void setApiKeyLastUsedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.apiKeyLastUsedAt = value;
    }
    /**
     * Sets the apiKeyPreview property value. Masked preview of the source API key for compact display.
     * @param value Value to set for the apiKeyPreview property.
     */
    public void setApiKeyPreview(@jakarta.annotation.Nullable final String value) {
        this.apiKeyPreview = value;
    }
    /**
     * Sets the apiKeyTotalUses property value. Total number of authenticated requests made with this source API key.
     * @param value Value to set for the apiKeyTotalUses property.
     */
    public void setApiKeyTotalUses(@jakarta.annotation.Nullable final Long value) {
        this.apiKeyTotalUses = value;
    }
    /**
     * Sets the business property value. Business summary connected to this lead source table row.
     * @param value Value to set for the business property.
     */
    public void setBusiness(@jakarta.annotation.Nullable final SourceTableRowBusiness value) {
        this.business = value;
    }
    /**
     * Sets the businessId property value. Business ID that owns this lead source.
     * @param value Value to set for the businessId property.
     */
    public void setBusinessId(@jakarta.annotation.Nullable final String value) {
        this.businessId = value;
    }
    /**
     * Sets the complianceApproved property value. Indicates whether the business or sender passed compliance review.
     * @param value Value to set for the complianceApproved property.
     */
    public void setComplianceApproved(@jakarta.annotation.Nullable final Boolean value) {
        this.complianceApproved = value;
    }
    /**
     * Sets the costPerLead property value. Configured cost charged when this source creates a billable lead.
     * @param value Value to set for the costPerLead property.
     */
    public void setCostPerLead(@jakarta.annotation.Nullable final UntypedNode value) {
        this.costPerLead = value;
    }
    /**
     * Sets the createdAt property value. UTC timestamp when this lead source table row was created.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the createdByUser property value. User summary for the person who created this lead source table row.
     * @param value Value to set for the createdByUser property.
     */
    public void setCreatedByUser(@jakarta.annotation.Nullable final SourceTableRowCreatedByUser value) {
        this.createdByUser = value;
    }
    /**
     * Sets the defaultTagIds property value. Tag IDs automatically assigned to leads created by this source.
     * @param value Value to set for the defaultTagIds property.
     */
    public void setDefaultTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.defaultTagIds = value;
    }
    /**
     * Sets the defaultTags property value. Default tag summaries automatically applied to leads from this source.
     * @param value Value to set for the defaultTags property.
     */
    public void setDefaultTags(@jakarta.annotation.Nullable final java.util.List<TagSummary> value) {
        this.defaultTags = value;
    }
    /**
     * Sets the description property value. Human-readable description that explains this lead source table row to API users.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the enabled property value. Indicates whether this lead source table row is active and available in the Leadping API.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the firstLeadReceivedAt property value. UTC timestamp when this source first delivered a lead to Leadping.
     * @param value Value to set for the firstLeadReceivedAt property.
     */
    public void setFirstLeadReceivedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.firstLeadReceivedAt = value;
    }
    /**
     * Sets the id property value. Unique Leadping identifier for this lead source table row.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the lastLeadReceivedAt property value. UTC timestamp when this source most recently delivered a lead to Leadping.
     * @param value Value to set for the lastLeadReceivedAt property.
     */
    public void setLastLeadReceivedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastLeadReceivedAt = value;
    }
    /**
     * Sets the modifiedAt property value. UTC timestamp when this lead source table row was last modified.
     * @param value Value to set for the modifiedAt property.
     */
    public void setModifiedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedAt = value;
    }
    /**
     * Sets the modifiedByUser property value. User summary for the person who last modified this lead source table row.
     * @param value Value to set for the modifiedByUser property.
     */
    public void setModifiedByUser(@jakarta.annotation.Nullable final SourceTableRowModifiedByUser value) {
        this.modifiedByUser = value;
    }
    /**
     * Sets the name property value. Display name for this lead source table row in the Leadping API.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the requiresTrustedForm property value. Indicates whether leads from this source must include a TrustedForm certificate for consent proof.
     * @param value Value to set for the requiresTrustedForm property.
     */
    public void setRequiresTrustedForm(@jakarta.annotation.Nullable final Boolean value) {
        this.requiresTrustedForm = value;
    }
    /**
     * Sets the user property value. User summary connected to this lead source table row.
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final SourceTableRowUser value) {
        this.user = value;
    }
}

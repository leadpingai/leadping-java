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
 * Describes lead data returned by Leadping.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeadResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * UTC timestamp when this record was archived.
     */
    private OffsetDateTime archivedAt;
    /**
     * User ID of the person who archived this record.
     */
    private String archivedByUserId;
    /**
     * Optional note explaining why the lead was archived.
     */
    private String archiveNote;
    /**
     * Defines why a lead was removed from the active working pipeline.
     */
    private Integer archiveReason;
    /**
     * Contact details for the lead or customer represented by this lead response.
     */
    private LeadContact contact;
    /**
     * UTC timestamp when the resource was created.
     */
    private OffsetDateTime createdAt;
    /**
     * Current lead status change summary that describes the lead outcome.
     */
    private LeadResponseCurrentLeadStatus currentLeadStatus;
    /**
     * Demographic profile details for the lead represented by this lead response.
     */
    private LeadProfile customer;
    /**
     * UTC timestamp when this lead was soft deleted.
     */
    private OffsetDateTime deletedAt;
    /**
     * User ID of the person who soft deleted this lead.
     */
    private String deletedByUserId;
    /**
     * Indicates whether this lead response is active and available in the Leadping API.
     */
    private Boolean enabled;
    /**
     * Stable unique identifier of the resource.
     */
    private String id;
    /**
     * Indicates whether the lead has been archived in Leadping.
     */
    private Boolean isArchived;
    /**
     * Structured metadata used for attribution, integrations, and reporting on this lead response.
     */
    private LeadMetadata metadata;
    /**
     * UTC timestamp when the resource was last modified, or null when it has not been updated.
     */
    private OffsetDateTime modifiedAt;
    /**
     * Canonical phone identity and provider lookup details for this lead.
     */
    private LeadResponsePhoneIdentity phoneIdentity;
    /**
     * Defines the asynchronous verification and enrichment lifecycle for a lead.
     */
    private LeadResponseProcessingStatus processingStatus;
    /**
     * UTC timestamp when the processing stage last changed.
     */
    private OffsetDateTime processingStatusChangedAt;
    /**
     * Explanation when asynchronous lead processing is blocked or fails.
     */
    private String processingStatusReason;
    /**
     * Tags currently attached to this lead, source, or record.
     */
    private java.util.List<TagSummary> tags;
    /**
     * Instantiates a new {@link LeadResponse} and sets the default values.
     */
    public LeadResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LeadResponse}
     */
    @jakarta.annotation.Nonnull
    public static LeadResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LeadResponse();
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
     * Gets the archivedAt property value. UTC timestamp when this record was archived.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getArchivedAt() {
        return this.archivedAt;
    }
    /**
     * Gets the archivedByUserId property value. User ID of the person who archived this record.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getArchivedByUserId() {
        return this.archivedByUserId;
    }
    /**
     * Gets the archiveNote property value. Optional note explaining why the lead was archived.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getArchiveNote() {
        return this.archiveNote;
    }
    /**
     * Gets the archiveReason property value. Defines why a lead was removed from the active working pipeline.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getArchiveReason() {
        return this.archiveReason;
    }
    /**
     * Gets the contact property value. Contact details for the lead or customer represented by this lead response.
     * @return a {@link LeadContact}
     */
    @jakarta.annotation.Nullable
    public LeadContact getContact() {
        return this.contact;
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
     * Gets the currentLeadStatus property value. Current lead status change summary that describes the lead outcome.
     * @return a {@link LeadResponseCurrentLeadStatus}
     */
    @jakarta.annotation.Nullable
    public LeadResponseCurrentLeadStatus getCurrentLeadStatus() {
        return this.currentLeadStatus;
    }
    /**
     * Gets the customer property value. Demographic profile details for the lead represented by this lead response.
     * @return a {@link LeadProfile}
     */
    @jakarta.annotation.Nullable
    public LeadProfile getCustomer() {
        return this.customer;
    }
    /**
     * Gets the deletedAt property value. UTC timestamp when this lead was soft deleted.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDeletedAt() {
        return this.deletedAt;
    }
    /**
     * Gets the deletedByUserId property value. User ID of the person who soft deleted this lead.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeletedByUserId() {
        return this.deletedByUserId;
    }
    /**
     * Gets the enabled property value. Indicates whether this lead response is active and available in the Leadping API.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(20);
        deserializerMap.put("archivedAt", (n) -> { this.setArchivedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("archivedByUserId", (n) -> { this.setArchivedByUserId(n.getStringValue()); });
        deserializerMap.put("archiveNote", (n) -> { this.setArchiveNote(n.getStringValue()); });
        deserializerMap.put("archiveReason", (n) -> { this.setArchiveReason(n.getIntegerValue()); });
        deserializerMap.put("contact", (n) -> { this.setContact(n.getObjectValue(LeadContact::createFromDiscriminatorValue)); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("currentLeadStatus", (n) -> { this.setCurrentLeadStatus(n.getObjectValue(LeadResponseCurrentLeadStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("customer", (n) -> { this.setCustomer(n.getObjectValue(LeadProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("deletedAt", (n) -> { this.setDeletedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deletedByUserId", (n) -> { this.setDeletedByUserId(n.getStringValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isArchived", (n) -> { this.setIsArchived(n.getBooleanValue()); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(LeadMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("phoneIdentity", (n) -> { this.setPhoneIdentity(n.getObjectValue(LeadResponsePhoneIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("processingStatus", (n) -> { this.setProcessingStatus(n.getEnumValue(LeadResponseProcessingStatus::forValue)); });
        deserializerMap.put("processingStatusChangedAt", (n) -> { this.setProcessingStatusChangedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("processingStatusReason", (n) -> { this.setProcessingStatusReason(n.getStringValue()); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfObjectValues(TagSummary::createFromDiscriminatorValue)); });
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
     * Gets the isArchived property value. Indicates whether the lead has been archived in Leadping.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsArchived() {
        return this.isArchived;
    }
    /**
     * Gets the metadata property value. Structured metadata used for attribution, integrations, and reporting on this lead response.
     * @return a {@link LeadMetadata}
     */
    @jakarta.annotation.Nullable
    public LeadMetadata getMetadata() {
        return this.metadata;
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
     * Gets the phoneIdentity property value. Canonical phone identity and provider lookup details for this lead.
     * @return a {@link LeadResponsePhoneIdentity}
     */
    @jakarta.annotation.Nullable
    public LeadResponsePhoneIdentity getPhoneIdentity() {
        return this.phoneIdentity;
    }
    /**
     * Gets the processingStatus property value. Defines the asynchronous verification and enrichment lifecycle for a lead.
     * @return a {@link LeadResponseProcessingStatus}
     */
    @jakarta.annotation.Nullable
    public LeadResponseProcessingStatus getProcessingStatus() {
        return this.processingStatus;
    }
    /**
     * Gets the processingStatusChangedAt property value. UTC timestamp when the processing stage last changed.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getProcessingStatusChangedAt() {
        return this.processingStatusChangedAt;
    }
    /**
     * Gets the processingStatusReason property value. Explanation when asynchronous lead processing is blocked or fails.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProcessingStatusReason() {
        return this.processingStatusReason;
    }
    /**
     * Gets the tags property value. Tags currently attached to this lead, source, or record.
     * @return a {@link java.util.List<TagSummary>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TagSummary> getTags() {
        return this.tags;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("archivedAt", this.getArchivedAt());
        writer.writeStringValue("archivedByUserId", this.getArchivedByUserId());
        writer.writeStringValue("archiveNote", this.getArchiveNote());
        writer.writeIntegerValue("archiveReason", this.getArchiveReason());
        writer.writeObjectValue("contact", this.getContact());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeObjectValue("currentLeadStatus", this.getCurrentLeadStatus());
        writer.writeObjectValue("customer", this.getCustomer());
        writer.writeOffsetDateTimeValue("deletedAt", this.getDeletedAt());
        writer.writeStringValue("deletedByUserId", this.getDeletedByUserId());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isArchived", this.getIsArchived());
        writer.writeObjectValue("metadata", this.getMetadata());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
        writer.writeObjectValue("phoneIdentity", this.getPhoneIdentity());
        writer.writeEnumValue("processingStatus", this.getProcessingStatus());
        writer.writeOffsetDateTimeValue("processingStatusChangedAt", this.getProcessingStatusChangedAt());
        writer.writeStringValue("processingStatusReason", this.getProcessingStatusReason());
        writer.writeCollectionOfObjectValues("tags", this.getTags());
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
     * Sets the archivedAt property value. UTC timestamp when this record was archived.
     * @param value Value to set for the archivedAt property.
     */
    public void setArchivedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.archivedAt = value;
    }
    /**
     * Sets the archivedByUserId property value. User ID of the person who archived this record.
     * @param value Value to set for the archivedByUserId property.
     */
    public void setArchivedByUserId(@jakarta.annotation.Nullable final String value) {
        this.archivedByUserId = value;
    }
    /**
     * Sets the archiveNote property value. Optional note explaining why the lead was archived.
     * @param value Value to set for the archiveNote property.
     */
    public void setArchiveNote(@jakarta.annotation.Nullable final String value) {
        this.archiveNote = value;
    }
    /**
     * Sets the archiveReason property value. Defines why a lead was removed from the active working pipeline.
     * @param value Value to set for the archiveReason property.
     */
    public void setArchiveReason(@jakarta.annotation.Nullable final Integer value) {
        this.archiveReason = value;
    }
    /**
     * Sets the contact property value. Contact details for the lead or customer represented by this lead response.
     * @param value Value to set for the contact property.
     */
    public void setContact(@jakarta.annotation.Nullable final LeadContact value) {
        this.contact = value;
    }
    /**
     * Sets the createdAt property value. UTC timestamp when the resource was created.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the currentLeadStatus property value. Current lead status change summary that describes the lead outcome.
     * @param value Value to set for the currentLeadStatus property.
     */
    public void setCurrentLeadStatus(@jakarta.annotation.Nullable final LeadResponseCurrentLeadStatus value) {
        this.currentLeadStatus = value;
    }
    /**
     * Sets the customer property value. Demographic profile details for the lead represented by this lead response.
     * @param value Value to set for the customer property.
     */
    public void setCustomer(@jakarta.annotation.Nullable final LeadProfile value) {
        this.customer = value;
    }
    /**
     * Sets the deletedAt property value. UTC timestamp when this lead was soft deleted.
     * @param value Value to set for the deletedAt property.
     */
    public void setDeletedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.deletedAt = value;
    }
    /**
     * Sets the deletedByUserId property value. User ID of the person who soft deleted this lead.
     * @param value Value to set for the deletedByUserId property.
     */
    public void setDeletedByUserId(@jakarta.annotation.Nullable final String value) {
        this.deletedByUserId = value;
    }
    /**
     * Sets the enabled property value. Indicates whether this lead response is active and available in the Leadping API.
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
     * Sets the isArchived property value. Indicates whether the lead has been archived in Leadping.
     * @param value Value to set for the isArchived property.
     */
    public void setIsArchived(@jakarta.annotation.Nullable final Boolean value) {
        this.isArchived = value;
    }
    /**
     * Sets the metadata property value. Structured metadata used for attribution, integrations, and reporting on this lead response.
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final LeadMetadata value) {
        this.metadata = value;
    }
    /**
     * Sets the modifiedAt property value. UTC timestamp when the resource was last modified, or null when it has not been updated.
     * @param value Value to set for the modifiedAt property.
     */
    public void setModifiedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedAt = value;
    }
    /**
     * Sets the phoneIdentity property value. Canonical phone identity and provider lookup details for this lead.
     * @param value Value to set for the phoneIdentity property.
     */
    public void setPhoneIdentity(@jakarta.annotation.Nullable final LeadResponsePhoneIdentity value) {
        this.phoneIdentity = value;
    }
    /**
     * Sets the processingStatus property value. Defines the asynchronous verification and enrichment lifecycle for a lead.
     * @param value Value to set for the processingStatus property.
     */
    public void setProcessingStatus(@jakarta.annotation.Nullable final LeadResponseProcessingStatus value) {
        this.processingStatus = value;
    }
    /**
     * Sets the processingStatusChangedAt property value. UTC timestamp when the processing stage last changed.
     * @param value Value to set for the processingStatusChangedAt property.
     */
    public void setProcessingStatusChangedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.processingStatusChangedAt = value;
    }
    /**
     * Sets the processingStatusReason property value. Explanation when asynchronous lead processing is blocked or fails.
     * @param value Value to set for the processingStatusReason property.
     */
    public void setProcessingStatusReason(@jakarta.annotation.Nullable final String value) {
        this.processingStatusReason = value;
    }
    /**
     * Sets the tags property value. Tags currently attached to this lead, source, or record.
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<TagSummary> value) {
        this.tags = value;
    }
}

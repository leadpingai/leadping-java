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
 * Response schema for the Leadping API lead response returned to authenticated clients.
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
     * The date and time when the entity was created.
     */
    private OffsetDateTime createdAt;
    /**
     * Current disposition summary that describes the lead outcome.
     */
    private LeadResponseCurrentDisposition currentDisposition;
    /**
     * Demographic profile details for the lead represented by this lead response.
     */
    private LeadProfile customer;
    /**
     * Indicates whether this lead response is active and available in the Leadping API.
     */
    private Boolean enabled;
    /**
     * The unique identifier for the entity.
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
     * The date and time when the entity was last modified, if applicable.
     */
    private OffsetDateTime modifiedAt;
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
     * Gets the createdAt property value. The date and time when the entity was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the currentDisposition property value. Current disposition summary that describes the lead outcome.
     * @return a {@link LeadResponseCurrentDisposition}
     */
    @jakarta.annotation.Nullable
    public LeadResponseCurrentDisposition getCurrentDisposition() {
        return this.currentDisposition;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(14);
        deserializerMap.put("archivedAt", (n) -> { this.setArchivedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("archivedByUserId", (n) -> { this.setArchivedByUserId(n.getStringValue()); });
        deserializerMap.put("archiveNote", (n) -> { this.setArchiveNote(n.getStringValue()); });
        deserializerMap.put("archiveReason", (n) -> { this.setArchiveReason(n.getIntegerValue()); });
        deserializerMap.put("contact", (n) -> { this.setContact(n.getObjectValue(LeadContact::createFromDiscriminatorValue)); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("currentDisposition", (n) -> { this.setCurrentDisposition(n.getObjectValue(LeadResponseCurrentDisposition::createFromDiscriminatorValue)); });
        deserializerMap.put("customer", (n) -> { this.setCustomer(n.getObjectValue(LeadProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isArchived", (n) -> { this.setIsArchived(n.getBooleanValue()); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(LeadMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfObjectValues(TagSummary::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The unique identifier for the entity.
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
     * Gets the modifiedAt property value. The date and time when the entity was last modified, if applicable.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedAt() {
        return this.modifiedAt;
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
        writer.writeObjectValue("currentDisposition", this.getCurrentDisposition());
        writer.writeObjectValue("customer", this.getCustomer());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isArchived", this.getIsArchived());
        writer.writeObjectValue("metadata", this.getMetadata());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
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
     * Sets the createdAt property value. The date and time when the entity was created.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the currentDisposition property value. Current disposition summary that describes the lead outcome.
     * @param value Value to set for the currentDisposition property.
     */
    public void setCurrentDisposition(@jakarta.annotation.Nullable final LeadResponseCurrentDisposition value) {
        this.currentDisposition = value;
    }
    /**
     * Sets the customer property value. Demographic profile details for the lead represented by this lead response.
     * @param value Value to set for the customer property.
     */
    public void setCustomer(@jakarta.annotation.Nullable final LeadProfile value) {
        this.customer = value;
    }
    /**
     * Sets the enabled property value. Indicates whether this lead response is active and available in the Leadping API.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the id property value. The unique identifier for the entity.
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
     * Sets the modifiedAt property value. The date and time when the entity was last modified, if applicable.
     * @param value Value to set for the modifiedAt property.
     */
    public void setModifiedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedAt = value;
    }
    /**
     * Sets the tags property value. Tags currently attached to this lead, source, or record.
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<TagSummary> value) {
        this.tags = value;
    }
}

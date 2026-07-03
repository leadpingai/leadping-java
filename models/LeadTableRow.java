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
 * List item schema for Leadping API lead table row results shown in searchable tables.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeadTableRow implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Admin override that can enable or disable this record independently of normal status checks.
     */
    private LeadTableRowAdminEnablementOverride adminEnablementOverride;
    /**
     * UTC timestamp when this record was archived.
     */
    private OffsetDateTime archivedAt;
    /**
     * User ID of the person who archived this record.
     */
    private String archivedByUserId;
    /**
     * Defines why a lead was removed from the active working pipeline.
     */
    private Integer archiveReason;
    /**
     * Business ID that owns this lead.
     */
    private String businessId;
    /**
     * Business display name shown for this lead.
     */
    private String businessName;
    /**
     * UTC timestamp when this lead table row was created.
     */
    private OffsetDateTime createdAt;
    /**
     * Current disposition summary that describes the lead outcome.
     */
    private LeadTableRowCurrentDisposition currentDisposition;
    /**
     * Email address for the person represented by this lead table row.
     */
    private String email;
    /**
     * Indicates whether this lead table row is active and available in the Leadping API.
     */
    private Boolean enabled;
    /**
     * First name of the lead, user, or contact represented by this lead table row.
     */
    private String firstName;
    /**
     * Unique Leadping identifier for this lead table row.
     */
    private String id;
    /**
     * Whether this lead is archived.
     */
    private Boolean isArchived;
    /**
     * Last name of the lead, user, or contact represented by this lead table row.
     */
    private String lastName;
    /**
     * Phone details for the lead, user, or business represented by this lead table row.
     */
    private String phone;
    /**
     * Lead price or transaction price supplied to the Leadping API.
     */
    private UntypedNode price;
    /**
     * Lead source ID that created or supplied this lead.
     */
    private String sourceId;
    /**
     * Lead source display name shown for this lead.
     */
    private String sourceName;
    /**
     * Current lifecycle status for this lead table row in the Leadping API.
     */
    private String status;
    /**
     * Presentation tone that helps clients style the current status of this lead table row.
     */
    private String statusTone;
    /**
     * Tags currently attached to this lead, source, or record.
     */
    private java.util.List<TagSummary> tags;
    /**
     * UTC timestamp when this lead table row was last updated.
     */
    private OffsetDateTime updatedAt;
    /**
     * Instantiates a new {@link LeadTableRow} and sets the default values.
     */
    public LeadTableRow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LeadTableRow}
     */
    @jakarta.annotation.Nonnull
    public static LeadTableRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LeadTableRow();
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
     * Gets the adminEnablementOverride property value. Admin override that can enable or disable this record independently of normal status checks.
     * @return a {@link LeadTableRowAdminEnablementOverride}
     */
    @jakarta.annotation.Nullable
    public LeadTableRowAdminEnablementOverride getAdminEnablementOverride() {
        return this.adminEnablementOverride;
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
     * Gets the archiveReason property value. Defines why a lead was removed from the active working pipeline.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getArchiveReason() {
        return this.archiveReason;
    }
    /**
     * Gets the businessId property value. Business ID that owns this lead.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessId() {
        return this.businessId;
    }
    /**
     * Gets the businessName property value. Business display name shown for this lead.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessName() {
        return this.businessName;
    }
    /**
     * Gets the createdAt property value. UTC timestamp when this lead table row was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the currentDisposition property value. Current disposition summary that describes the lead outcome.
     * @return a {@link LeadTableRowCurrentDisposition}
     */
    @jakarta.annotation.Nullable
    public LeadTableRowCurrentDisposition getCurrentDisposition() {
        return this.currentDisposition;
    }
    /**
     * Gets the email property value. Email address for the person represented by this lead table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * Gets the enabled property value. Indicates whether this lead table row is active and available in the Leadping API.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(22);
        deserializerMap.put("adminEnablementOverride", (n) -> { this.setAdminEnablementOverride(n.getObjectValue(LeadTableRowAdminEnablementOverride::createFromDiscriminatorValue)); });
        deserializerMap.put("archivedAt", (n) -> { this.setArchivedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("archivedByUserId", (n) -> { this.setArchivedByUserId(n.getStringValue()); });
        deserializerMap.put("archiveReason", (n) -> { this.setArchiveReason(n.getIntegerValue()); });
        deserializerMap.put("businessId", (n) -> { this.setBusinessId(n.getStringValue()); });
        deserializerMap.put("businessName", (n) -> { this.setBusinessName(n.getStringValue()); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("currentDisposition", (n) -> { this.setCurrentDisposition(n.getObjectValue(LeadTableRowCurrentDisposition::createFromDiscriminatorValue)); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("firstName", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isArchived", (n) -> { this.setIsArchived(n.getBooleanValue()); });
        deserializerMap.put("lastName", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("phone", (n) -> { this.setPhone(n.getStringValue()); });
        deserializerMap.put("price", (n) -> { this.setPrice(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("sourceId", (n) -> { this.setSourceId(n.getStringValue()); });
        deserializerMap.put("sourceName", (n) -> { this.setSourceName(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("statusTone", (n) -> { this.setStatusTone(n.getStringValue()); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfObjectValues(TagSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("updatedAt", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstName property value. First name of the lead, user, or contact represented by this lead table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Gets the id property value. Unique Leadping identifier for this lead table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the isArchived property value. Whether this lead is archived.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsArchived() {
        return this.isArchived;
    }
    /**
     * Gets the lastName property value. Last name of the lead, user, or contact represented by this lead table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastName() {
        return this.lastName;
    }
    /**
     * Gets the phone property value. Phone details for the lead, user, or business represented by this lead table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhone() {
        return this.phone;
    }
    /**
     * Gets the price property value. Lead price or transaction price supplied to the Leadping API.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getPrice() {
        return this.price;
    }
    /**
     * Gets the sourceId property value. Lead source ID that created or supplied this lead.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceId() {
        return this.sourceId;
    }
    /**
     * Gets the sourceName property value. Lead source display name shown for this lead.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceName() {
        return this.sourceName;
    }
    /**
     * Gets the status property value. Current lifecycle status for this lead table row in the Leadping API.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the statusTone property value. Presentation tone that helps clients style the current status of this lead table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatusTone() {
        return this.statusTone;
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
     * Gets the updatedAt property value. UTC timestamp when this lead table row was last updated.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("adminEnablementOverride", this.getAdminEnablementOverride());
        writer.writeOffsetDateTimeValue("archivedAt", this.getArchivedAt());
        writer.writeStringValue("archivedByUserId", this.getArchivedByUserId());
        writer.writeIntegerValue("archiveReason", this.getArchiveReason());
        writer.writeStringValue("businessId", this.getBusinessId());
        writer.writeStringValue("businessName", this.getBusinessName());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeObjectValue("currentDisposition", this.getCurrentDisposition());
        writer.writeStringValue("email", this.getEmail());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeStringValue("firstName", this.getFirstName());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isArchived", this.getIsArchived());
        writer.writeStringValue("lastName", this.getLastName());
        writer.writeStringValue("phone", this.getPhone());
        writer.writeObjectValue("price", this.getPrice());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeStringValue("sourceName", this.getSourceName());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("statusTone", this.getStatusTone());
        writer.writeCollectionOfObjectValues("tags", this.getTags());
        writer.writeOffsetDateTimeValue("updatedAt", this.getUpdatedAt());
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
     * Sets the adminEnablementOverride property value. Admin override that can enable or disable this record independently of normal status checks.
     * @param value Value to set for the adminEnablementOverride property.
     */
    public void setAdminEnablementOverride(@jakarta.annotation.Nullable final LeadTableRowAdminEnablementOverride value) {
        this.adminEnablementOverride = value;
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
     * Sets the archiveReason property value. Defines why a lead was removed from the active working pipeline.
     * @param value Value to set for the archiveReason property.
     */
    public void setArchiveReason(@jakarta.annotation.Nullable final Integer value) {
        this.archiveReason = value;
    }
    /**
     * Sets the businessId property value. Business ID that owns this lead.
     * @param value Value to set for the businessId property.
     */
    public void setBusinessId(@jakarta.annotation.Nullable final String value) {
        this.businessId = value;
    }
    /**
     * Sets the businessName property value. Business display name shown for this lead.
     * @param value Value to set for the businessName property.
     */
    public void setBusinessName(@jakarta.annotation.Nullable final String value) {
        this.businessName = value;
    }
    /**
     * Sets the createdAt property value. UTC timestamp when this lead table row was created.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the currentDisposition property value. Current disposition summary that describes the lead outcome.
     * @param value Value to set for the currentDisposition property.
     */
    public void setCurrentDisposition(@jakarta.annotation.Nullable final LeadTableRowCurrentDisposition value) {
        this.currentDisposition = value;
    }
    /**
     * Sets the email property value. Email address for the person represented by this lead table row.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the enabled property value. Indicates whether this lead table row is active and available in the Leadping API.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the firstName property value. First name of the lead, user, or contact represented by this lead table row.
     * @param value Value to set for the firstName property.
     */
    public void setFirstName(@jakarta.annotation.Nullable final String value) {
        this.firstName = value;
    }
    /**
     * Sets the id property value. Unique Leadping identifier for this lead table row.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the isArchived property value. Whether this lead is archived.
     * @param value Value to set for the isArchived property.
     */
    public void setIsArchived(@jakarta.annotation.Nullable final Boolean value) {
        this.isArchived = value;
    }
    /**
     * Sets the lastName property value. Last name of the lead, user, or contact represented by this lead table row.
     * @param value Value to set for the lastName property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.lastName = value;
    }
    /**
     * Sets the phone property value. Phone details for the lead, user, or business represented by this lead table row.
     * @param value Value to set for the phone property.
     */
    public void setPhone(@jakarta.annotation.Nullable final String value) {
        this.phone = value;
    }
    /**
     * Sets the price property value. Lead price or transaction price supplied to the Leadping API.
     * @param value Value to set for the price property.
     */
    public void setPrice(@jakarta.annotation.Nullable final UntypedNode value) {
        this.price = value;
    }
    /**
     * Sets the sourceId property value. Lead source ID that created or supplied this lead.
     * @param value Value to set for the sourceId property.
     */
    public void setSourceId(@jakarta.annotation.Nullable final String value) {
        this.sourceId = value;
    }
    /**
     * Sets the sourceName property value. Lead source display name shown for this lead.
     * @param value Value to set for the sourceName property.
     */
    public void setSourceName(@jakarta.annotation.Nullable final String value) {
        this.sourceName = value;
    }
    /**
     * Sets the status property value. Current lifecycle status for this lead table row in the Leadping API.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the statusTone property value. Presentation tone that helps clients style the current status of this lead table row.
     * @param value Value to set for the statusTone property.
     */
    public void setStatusTone(@jakarta.annotation.Nullable final String value) {
        this.statusTone = value;
    }
    /**
     * Sets the tags property value. Tags currently attached to this lead, source, or record.
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<TagSummary> value) {
        this.tags = value;
    }
    /**
     * Sets the updatedAt property value. UTC timestamp when this lead table row was last updated.
     * @param value Value to set for the updatedAt property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.updatedAt = value;
    }
}

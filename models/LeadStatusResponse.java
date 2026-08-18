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
 * Represents a configurable status that can be assigned to leads.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeadStatusResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * LeadStatusChange category represented by the lead status.
     */
    private LeadStatusCategory category;
    /**
     * Display color assigned to the lead status.
     */
    private String color;
    /**
     * Unique identifier for the lead status.
     */
    private String id;
    /**
     * Indicates whether the lead status has been archived.
     */
    private Boolean isArchived;
    /**
     * Date and time when the lead status was last modified.
     */
    private OffsetDateTime modifiedAt;
    /**
     * Display name of the lead status.
     */
    private String name;
    /**
     * Identifier of the organization that owns the lead status.
     */
    private String organizationId;
    /**
     * Relative display order of the lead status.
     */
    private Integer sortOrder;
    /**
     * Instantiates a new {@link LeadStatusResponse} and sets the default values.
     */
    public LeadStatusResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LeadStatusResponse}
     */
    @jakarta.annotation.Nonnull
    public static LeadStatusResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LeadStatusResponse();
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
     * Gets the category property value. LeadStatusChange category represented by the lead status.
     * @return a {@link LeadStatusCategory}
     */
    @jakarta.annotation.Nullable
    public LeadStatusCategory getCategory() {
        return this.category;
    }
    /**
     * Gets the color property value. Display color assigned to the lead status.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getColor() {
        return this.color;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(LeadStatusCategory::forValue)); });
        deserializerMap.put("color", (n) -> { this.setColor(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isArchived", (n) -> { this.setIsArchived(n.getBooleanValue()); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("organizationId", (n) -> { this.setOrganizationId(n.getStringValue()); });
        deserializerMap.put("sortOrder", (n) -> { this.setSortOrder(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique identifier for the lead status.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the isArchived property value. Indicates whether the lead status has been archived.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsArchived() {
        return this.isArchived;
    }
    /**
     * Gets the modifiedAt property value. Date and time when the lead status was last modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * Gets the name property value. Display name of the lead status.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the organizationId property value. Identifier of the organization that owns the lead status.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrganizationId() {
        return this.organizationId;
    }
    /**
     * Gets the sortOrder property value. Relative display order of the lead status.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSortOrder() {
        return this.sortOrder;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("category", this.getCategory());
        writer.writeStringValue("color", this.getColor());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isArchived", this.getIsArchived());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("organizationId", this.getOrganizationId());
        writer.writeIntegerValue("sortOrder", this.getSortOrder());
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
     * Sets the category property value. LeadStatusChange category represented by the lead status.
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final LeadStatusCategory value) {
        this.category = value;
    }
    /**
     * Sets the color property value. Display color assigned to the lead status.
     * @param value Value to set for the color property.
     */
    public void setColor(@jakarta.annotation.Nullable final String value) {
        this.color = value;
    }
    /**
     * Sets the id property value. Unique identifier for the lead status.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the isArchived property value. Indicates whether the lead status has been archived.
     * @param value Value to set for the isArchived property.
     */
    public void setIsArchived(@jakarta.annotation.Nullable final Boolean value) {
        this.isArchived = value;
    }
    /**
     * Sets the modifiedAt property value. Date and time when the lead status was last modified.
     * @param value Value to set for the modifiedAt property.
     */
    public void setModifiedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedAt = value;
    }
    /**
     * Sets the name property value. Display name of the lead status.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the organizationId property value. Identifier of the organization that owns the lead status.
     * @param value Value to set for the organizationId property.
     */
    public void setOrganizationId(@jakarta.annotation.Nullable final String value) {
        this.organizationId = value;
    }
    /**
     * Sets the sortOrder property value. Relative display order of the lead status.
     * @param value Value to set for the sortOrder property.
     */
    public void setSortOrder(@jakarta.annotation.Nullable final Integer value) {
        this.sortOrder = value;
    }
}

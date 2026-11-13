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
 * An appointment visible to the current user, with history populated on detail requests.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppointmentResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The assignedToName property
     */
    private String assignedToName;
    /**
     * The assignedToUserId property
     */
    private String assignedToUserId;
    /**
     * The createdAt property
     */
    private OffsetDateTime createdAt;
    /**
     * The dismissedAt property
     */
    private OffsetDateTime dismissedAt;
    /**
     * The history property
     */
    private java.util.List<AppointmentActivity> history;
    /**
     * The id property
     */
    private String id;
    /**
     * The isDemo property
     */
    private Boolean isDemo;
    /**
     * The leadAvatarUrl property
     */
    private String leadAvatarUrl;
    /**
     * The leadEmail property
     */
    private String leadEmail;
    /**
     * The leadFirstName property
     */
    private String leadFirstName;
    /**
     * The leadId property
     */
    private String leadId;
    /**
     * The leadLastName property
     */
    private String leadLastName;
    /**
     * The leadName property
     */
    private String leadName;
    /**
     * The modifiedAt property
     */
    private OffsetDateTime modifiedAt;
    /**
     * The notes property
     */
    private String notes;
    /**
     * The organizationId property
     */
    private String organizationId;
    /**
     * The organizationName property
     */
    private String organizationName;
    /**
     * The reminderAt property
     */
    private OffsetDateTime reminderAt;
    /**
     * The revision property
     */
    private Long revision;
    /**
     * The startAt property
     */
    private OffsetDateTime startAt;
    /**
     * The status property
     */
    private String status;
    /**
     * The timeZoneId property
     */
    private String timeZoneId;
    /**
     * The title property
     */
    private String title;
    /**
     * Instantiates a new {@link AppointmentResponse} and sets the default values.
     */
    public AppointmentResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AppointmentResponse}
     */
    @jakarta.annotation.Nonnull
    public static AppointmentResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppointmentResponse();
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
     * Gets the assignedToName property value. The assignedToName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignedToName() {
        return this.assignedToName;
    }
    /**
     * Gets the assignedToUserId property value. The assignedToUserId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignedToUserId() {
        return this.assignedToUserId;
    }
    /**
     * Gets the createdAt property value. The createdAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the dismissedAt property value. The dismissedAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDismissedAt() {
        return this.dismissedAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(23);
        deserializerMap.put("assignedToName", (n) -> { this.setAssignedToName(n.getStringValue()); });
        deserializerMap.put("assignedToUserId", (n) -> { this.setAssignedToUserId(n.getStringValue()); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("dismissedAt", (n) -> { this.setDismissedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("history", (n) -> { this.setHistory(n.getCollectionOfObjectValues(AppointmentActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isDemo", (n) -> { this.setIsDemo(n.getBooleanValue()); });
        deserializerMap.put("leadAvatarUrl", (n) -> { this.setLeadAvatarUrl(n.getStringValue()); });
        deserializerMap.put("leadEmail", (n) -> { this.setLeadEmail(n.getStringValue()); });
        deserializerMap.put("leadFirstName", (n) -> { this.setLeadFirstName(n.getStringValue()); });
        deserializerMap.put("leadId", (n) -> { this.setLeadId(n.getStringValue()); });
        deserializerMap.put("leadLastName", (n) -> { this.setLeadLastName(n.getStringValue()); });
        deserializerMap.put("leadName", (n) -> { this.setLeadName(n.getStringValue()); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getStringValue()); });
        deserializerMap.put("organizationId", (n) -> { this.setOrganizationId(n.getStringValue()); });
        deserializerMap.put("organizationName", (n) -> { this.setOrganizationName(n.getStringValue()); });
        deserializerMap.put("reminderAt", (n) -> { this.setReminderAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("revision", (n) -> { this.setRevision(n.getLongValue()); });
        deserializerMap.put("startAt", (n) -> { this.setStartAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("timeZoneId", (n) -> { this.setTimeZoneId(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the history property value. The history property
     * @return a {@link java.util.List<AppointmentActivity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppointmentActivity> getHistory() {
        return this.history;
    }
    /**
     * Gets the id property value. The id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the isDemo property value. The isDemo property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDemo() {
        return this.isDemo;
    }
    /**
     * Gets the leadAvatarUrl property value. The leadAvatarUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadAvatarUrl() {
        return this.leadAvatarUrl;
    }
    /**
     * Gets the leadEmail property value. The leadEmail property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadEmail() {
        return this.leadEmail;
    }
    /**
     * Gets the leadFirstName property value. The leadFirstName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadFirstName() {
        return this.leadFirstName;
    }
    /**
     * Gets the leadId property value. The leadId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadId() {
        return this.leadId;
    }
    /**
     * Gets the leadLastName property value. The leadLastName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadLastName() {
        return this.leadLastName;
    }
    /**
     * Gets the leadName property value. The leadName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadName() {
        return this.leadName;
    }
    /**
     * Gets the modifiedAt property value. The modifiedAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * Gets the notes property value. The notes property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNotes() {
        return this.notes;
    }
    /**
     * Gets the organizationId property value. The organizationId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrganizationId() {
        return this.organizationId;
    }
    /**
     * Gets the organizationName property value. The organizationName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrganizationName() {
        return this.organizationName;
    }
    /**
     * Gets the reminderAt property value. The reminderAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReminderAt() {
        return this.reminderAt;
    }
    /**
     * Gets the revision property value. The revision property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getRevision() {
        return this.revision;
    }
    /**
     * Gets the startAt property value. The startAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartAt() {
        return this.startAt;
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the timeZoneId property value. The timeZoneId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTimeZoneId() {
        return this.timeZoneId;
    }
    /**
     * Gets the title property value. The title property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("assignedToName", this.getAssignedToName());
        writer.writeStringValue("assignedToUserId", this.getAssignedToUserId());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeOffsetDateTimeValue("dismissedAt", this.getDismissedAt());
        writer.writeCollectionOfObjectValues("history", this.getHistory());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isDemo", this.getIsDemo());
        writer.writeStringValue("leadAvatarUrl", this.getLeadAvatarUrl());
        writer.writeStringValue("leadEmail", this.getLeadEmail());
        writer.writeStringValue("leadFirstName", this.getLeadFirstName());
        writer.writeStringValue("leadId", this.getLeadId());
        writer.writeStringValue("leadLastName", this.getLeadLastName());
        writer.writeStringValue("leadName", this.getLeadName());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
        writer.writeStringValue("notes", this.getNotes());
        writer.writeStringValue("organizationId", this.getOrganizationId());
        writer.writeStringValue("organizationName", this.getOrganizationName());
        writer.writeOffsetDateTimeValue("reminderAt", this.getReminderAt());
        writer.writeLongValue("revision", this.getRevision());
        writer.writeOffsetDateTimeValue("startAt", this.getStartAt());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("timeZoneId", this.getTimeZoneId());
        writer.writeStringValue("title", this.getTitle());
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
     * Sets the assignedToName property value. The assignedToName property
     * @param value Value to set for the assignedToName property.
     */
    public void setAssignedToName(@jakarta.annotation.Nullable final String value) {
        this.assignedToName = value;
    }
    /**
     * Sets the assignedToUserId property value. The assignedToUserId property
     * @param value Value to set for the assignedToUserId property.
     */
    public void setAssignedToUserId(@jakarta.annotation.Nullable final String value) {
        this.assignedToUserId = value;
    }
    /**
     * Sets the createdAt property value. The createdAt property
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the dismissedAt property value. The dismissedAt property
     * @param value Value to set for the dismissedAt property.
     */
    public void setDismissedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.dismissedAt = value;
    }
    /**
     * Sets the history property value. The history property
     * @param value Value to set for the history property.
     */
    public void setHistory(@jakarta.annotation.Nullable final java.util.List<AppointmentActivity> value) {
        this.history = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the isDemo property value. The isDemo property
     * @param value Value to set for the isDemo property.
     */
    public void setIsDemo(@jakarta.annotation.Nullable final Boolean value) {
        this.isDemo = value;
    }
    /**
     * Sets the leadAvatarUrl property value. The leadAvatarUrl property
     * @param value Value to set for the leadAvatarUrl property.
     */
    public void setLeadAvatarUrl(@jakarta.annotation.Nullable final String value) {
        this.leadAvatarUrl = value;
    }
    /**
     * Sets the leadEmail property value. The leadEmail property
     * @param value Value to set for the leadEmail property.
     */
    public void setLeadEmail(@jakarta.annotation.Nullable final String value) {
        this.leadEmail = value;
    }
    /**
     * Sets the leadFirstName property value. The leadFirstName property
     * @param value Value to set for the leadFirstName property.
     */
    public void setLeadFirstName(@jakarta.annotation.Nullable final String value) {
        this.leadFirstName = value;
    }
    /**
     * Sets the leadId property value. The leadId property
     * @param value Value to set for the leadId property.
     */
    public void setLeadId(@jakarta.annotation.Nullable final String value) {
        this.leadId = value;
    }
    /**
     * Sets the leadLastName property value. The leadLastName property
     * @param value Value to set for the leadLastName property.
     */
    public void setLeadLastName(@jakarta.annotation.Nullable final String value) {
        this.leadLastName = value;
    }
    /**
     * Sets the leadName property value. The leadName property
     * @param value Value to set for the leadName property.
     */
    public void setLeadName(@jakarta.annotation.Nullable final String value) {
        this.leadName = value;
    }
    /**
     * Sets the modifiedAt property value. The modifiedAt property
     * @param value Value to set for the modifiedAt property.
     */
    public void setModifiedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedAt = value;
    }
    /**
     * Sets the notes property value. The notes property
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final String value) {
        this.notes = value;
    }
    /**
     * Sets the organizationId property value. The organizationId property
     * @param value Value to set for the organizationId property.
     */
    public void setOrganizationId(@jakarta.annotation.Nullable final String value) {
        this.organizationId = value;
    }
    /**
     * Sets the organizationName property value. The organizationName property
     * @param value Value to set for the organizationName property.
     */
    public void setOrganizationName(@jakarta.annotation.Nullable final String value) {
        this.organizationName = value;
    }
    /**
     * Sets the reminderAt property value. The reminderAt property
     * @param value Value to set for the reminderAt property.
     */
    public void setReminderAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.reminderAt = value;
    }
    /**
     * Sets the revision property value. The revision property
     * @param value Value to set for the revision property.
     */
    public void setRevision(@jakarta.annotation.Nullable final Long value) {
        this.revision = value;
    }
    /**
     * Sets the startAt property value. The startAt property
     * @param value Value to set for the startAt property.
     */
    public void setStartAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startAt = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the timeZoneId property value. The timeZoneId property
     * @param value Value to set for the timeZoneId property.
     */
    public void setTimeZoneId(@jakarta.annotation.Nullable final String value) {
        this.timeZoneId = value;
    }
    /**
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
}

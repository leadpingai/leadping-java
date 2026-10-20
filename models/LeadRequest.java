package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Defines the fields clients can send when working with lead.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeadRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Business represented by a lead contact.
     */
    private LeadRequestCompany company;
    /**
     * Public Leadping API schema for lead contact profile data.
     */
    private LeadContact contact;
    /**
     * Preferred contact language, channel, and callback windows; does not grant consent.
     */
    private LeadRequestContactPreferences contactPreferences;
    /**
     * Industry-specific JSON scalar or scalar-array answers; keys are stable field identifiers.
     */
    private LeadRequestCustomFields customFields;
    /**
     * Whether the lead is enabled.
     */
    private Boolean enabled;
    /**
     * Stable unique identifier of an existing resource to update; omit it when the API assigns an identifier during creation.
     */
    private String id;
    /**
     * The service or purchase requested by a lead.
     */
    private LeadRequestInquiry inquiry;
    /**
     * Public Leadping API schema for lead attribution metadata data.
     */
    private LeadMetadata metadata;
    /**
     * Public Leadping API schema for lead demographic profile data.
     */
    private LeadRequestProfile profile;
    /**
     * Describes a physical or mailing address using international locality, administrative-area, postal-code, and country fields.
     */
    private LeadRequestServiceAddress serviceAddress;
    /**
     * Optional tag IDs assigned to this lead. Defaults to an empty list when omitted.
     */
    private java.util.List<String> tagIds;
    /**
     * Optional tag names matched against existing tags. Defaults to an empty list when omitted.
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
     * Gets the company property value. Business represented by a lead contact.
     * @return a {@link LeadRequestCompany}
     */
    @jakarta.annotation.Nullable
    public LeadRequestCompany getCompany() {
        return this.company;
    }
    /**
     * Gets the contact property value. Public Leadping API schema for lead contact profile data.
     * @return a {@link LeadContact}
     */
    @jakarta.annotation.Nullable
    public LeadContact getContact() {
        return this.contact;
    }
    /**
     * Gets the contactPreferences property value. Preferred contact language, channel, and callback windows; does not grant consent.
     * @return a {@link LeadRequestContactPreferences}
     */
    @jakarta.annotation.Nullable
    public LeadRequestContactPreferences getContactPreferences() {
        return this.contactPreferences;
    }
    /**
     * Gets the customFields property value. Industry-specific JSON scalar or scalar-array answers; keys are stable field identifiers.
     * @return a {@link LeadRequestCustomFields}
     */
    @jakarta.annotation.Nullable
    public LeadRequestCustomFields getCustomFields() {
        return this.customFields;
    }
    /**
     * Gets the enabled property value. Whether the lead is enabled.
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
        deserializerMap.put("company", (n) -> { this.setCompany(n.getObjectValue(LeadRequestCompany::createFromDiscriminatorValue)); });
        deserializerMap.put("contact", (n) -> { this.setContact(n.getObjectValue(LeadContact::createFromDiscriminatorValue)); });
        deserializerMap.put("contactPreferences", (n) -> { this.setContactPreferences(n.getObjectValue(LeadRequestContactPreferences::createFromDiscriminatorValue)); });
        deserializerMap.put("customFields", (n) -> { this.setCustomFields(n.getObjectValue(LeadRequestCustomFields::createFromDiscriminatorValue)); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("inquiry", (n) -> { this.setInquiry(n.getObjectValue(LeadRequestInquiry::createFromDiscriminatorValue)); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(LeadMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("profile", (n) -> { this.setProfile(n.getObjectValue(LeadRequestProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("serviceAddress", (n) -> { this.setServiceAddress(n.getObjectValue(LeadRequestServiceAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("tagIds", (n) -> { this.setTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("tagNames", (n) -> { this.setTagNames(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Stable unique identifier of an existing resource to update; omit it when the API assigns an identifier during creation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the inquiry property value. The service or purchase requested by a lead.
     * @return a {@link LeadRequestInquiry}
     */
    @jakarta.annotation.Nullable
    public LeadRequestInquiry getInquiry() {
        return this.inquiry;
    }
    /**
     * Gets the metadata property value. Public Leadping API schema for lead attribution metadata data.
     * @return a {@link LeadMetadata}
     */
    @jakarta.annotation.Nullable
    public LeadMetadata getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the profile property value. Public Leadping API schema for lead demographic profile data.
     * @return a {@link LeadRequestProfile}
     */
    @jakarta.annotation.Nullable
    public LeadRequestProfile getProfile() {
        return this.profile;
    }
    /**
     * Gets the serviceAddress property value. Describes a physical or mailing address using international locality, administrative-area, postal-code, and country fields.
     * @return a {@link LeadRequestServiceAddress}
     */
    @jakarta.annotation.Nullable
    public LeadRequestServiceAddress getServiceAddress() {
        return this.serviceAddress;
    }
    /**
     * Gets the tagIds property value. Optional tag IDs assigned to this lead. Defaults to an empty list when omitted.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }
    /**
     * Gets the tagNames property value. Optional tag names matched against existing tags. Defaults to an empty list when omitted.
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
        writer.writeObjectValue("company", this.getCompany());
        writer.writeObjectValue("contact", this.getContact());
        writer.writeObjectValue("contactPreferences", this.getContactPreferences());
        writer.writeObjectValue("customFields", this.getCustomFields());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeStringValue("id", this.getId());
        writer.writeObjectValue("inquiry", this.getInquiry());
        writer.writeObjectValue("metadata", this.getMetadata());
        writer.writeObjectValue("profile", this.getProfile());
        writer.writeObjectValue("serviceAddress", this.getServiceAddress());
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
     * Sets the company property value. Business represented by a lead contact.
     * @param value Value to set for the company property.
     */
    public void setCompany(@jakarta.annotation.Nullable final LeadRequestCompany value) {
        this.company = value;
    }
    /**
     * Sets the contact property value. Public Leadping API schema for lead contact profile data.
     * @param value Value to set for the contact property.
     */
    public void setContact(@jakarta.annotation.Nullable final LeadContact value) {
        this.contact = value;
    }
    /**
     * Sets the contactPreferences property value. Preferred contact language, channel, and callback windows; does not grant consent.
     * @param value Value to set for the contactPreferences property.
     */
    public void setContactPreferences(@jakarta.annotation.Nullable final LeadRequestContactPreferences value) {
        this.contactPreferences = value;
    }
    /**
     * Sets the customFields property value. Industry-specific JSON scalar or scalar-array answers; keys are stable field identifiers.
     * @param value Value to set for the customFields property.
     */
    public void setCustomFields(@jakarta.annotation.Nullable final LeadRequestCustomFields value) {
        this.customFields = value;
    }
    /**
     * Sets the enabled property value. Whether the lead is enabled.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the id property value. Stable unique identifier of an existing resource to update; omit it when the API assigns an identifier during creation.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the inquiry property value. The service or purchase requested by a lead.
     * @param value Value to set for the inquiry property.
     */
    public void setInquiry(@jakarta.annotation.Nullable final LeadRequestInquiry value) {
        this.inquiry = value;
    }
    /**
     * Sets the metadata property value. Public Leadping API schema for lead attribution metadata data.
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final LeadMetadata value) {
        this.metadata = value;
    }
    /**
     * Sets the profile property value. Public Leadping API schema for lead demographic profile data.
     * @param value Value to set for the profile property.
     */
    public void setProfile(@jakarta.annotation.Nullable final LeadRequestProfile value) {
        this.profile = value;
    }
    /**
     * Sets the serviceAddress property value. Describes a physical or mailing address using international locality, administrative-area, postal-code, and country fields.
     * @param value Value to set for the serviceAddress property.
     */
    public void setServiceAddress(@jakarta.annotation.Nullable final LeadRequestServiceAddress value) {
        this.serviceAddress = value;
    }
    /**
     * Sets the tagIds property value. Optional tag IDs assigned to this lead. Defaults to an empty list when omitted.
     * @param value Value to set for the tagIds property.
     */
    public void setTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.tagIds = value;
    }
    /**
     * Sets the tagNames property value. Optional tag names matched against existing tags. Defaults to an empty list when omitted.
     * @param value Value to set for the tagNames property.
     */
    public void setTagNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.tagNames = value;
    }
}

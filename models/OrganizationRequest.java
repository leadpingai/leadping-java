package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Defines the fields clients can send when working with organization profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Postal address for the organization, lead, or contact represented by this organization profile request.
     */
    private OrganizationRequestAddress address;
    /**
     * Human-readable description that explains this organization profile request to API users.
     */
    private String description;
    /**
     * Employer Identification Number used for organization and 10DLC verification.
     */
    private String ein;
    /**
     * Indicates whether the organization serves customers younger than 90, for compliance and underwriting context.
     */
    private Boolean isYoungerThan90;
    /**
     * Primary organization name.
     */
    private String name;
    /**
     * Phone details for the lead, user, or organization represented by this organization profile request.
     */
    private String phone;
    /**
     * Alternate organization name or DBA shown in Leadping.
     */
    private String secondaryName;
    /**
     * Industry vertical used for lead routing, compliance review, and reporting.
     */
    private String vertical;
    /**
     * Organization website URL used for compliance, brand review, and lead attribution.
     */
    private String website;
    /**
     * Instantiates a new {@link OrganizationRequest} and sets the default values.
     */
    public OrganizationRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrganizationRequest}
     */
    @jakarta.annotation.Nonnull
    public static OrganizationRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationRequest();
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
     * Gets the address property value. Postal address for the organization, lead, or contact represented by this organization profile request.
     * @return a {@link OrganizationRequestAddress}
     */
    @jakarta.annotation.Nullable
    public OrganizationRequestAddress getAddress() {
        return this.address;
    }
    /**
     * Gets the description property value. Human-readable description that explains this organization profile request to API users.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the ein property value. Employer Identification Number used for organization and 10DLC verification.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEin() {
        return this.ein;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(OrganizationRequestAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("ein", (n) -> { this.setEin(n.getStringValue()); });
        deserializerMap.put("isYoungerThan90", (n) -> { this.setIsYoungerThan90(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("phone", (n) -> { this.setPhone(n.getStringValue()); });
        deserializerMap.put("secondaryName", (n) -> { this.setSecondaryName(n.getStringValue()); });
        deserializerMap.put("vertical", (n) -> { this.setVertical(n.getStringValue()); });
        deserializerMap.put("website", (n) -> { this.setWebsite(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isYoungerThan90 property value. Indicates whether the organization serves customers younger than 90, for compliance and underwriting context.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsYoungerThan90() {
        return this.isYoungerThan90;
    }
    /**
     * Gets the name property value. Primary organization name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the phone property value. Phone details for the lead, user, or organization represented by this organization profile request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhone() {
        return this.phone;
    }
    /**
     * Gets the secondaryName property value. Alternate organization name or DBA shown in Leadping.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSecondaryName() {
        return this.secondaryName;
    }
    /**
     * Gets the vertical property value. Industry vertical used for lead routing, compliance review, and reporting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVertical() {
        return this.vertical;
    }
    /**
     * Gets the website property value. Organization website URL used for compliance, brand review, and lead attribution.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebsite() {
        return this.website;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("address", this.getAddress());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("ein", this.getEin());
        writer.writeBooleanValue("isYoungerThan90", this.getIsYoungerThan90());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("phone", this.getPhone());
        writer.writeStringValue("secondaryName", this.getSecondaryName());
        writer.writeStringValue("vertical", this.getVertical());
        writer.writeStringValue("website", this.getWebsite());
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
     * Sets the address property value. Postal address for the organization, lead, or contact represented by this organization profile request.
     * @param value Value to set for the address property.
     */
    public void setAddress(@jakarta.annotation.Nullable final OrganizationRequestAddress value) {
        this.address = value;
    }
    /**
     * Sets the description property value. Human-readable description that explains this organization profile request to API users.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the ein property value. Employer Identification Number used for organization and 10DLC verification.
     * @param value Value to set for the ein property.
     */
    public void setEin(@jakarta.annotation.Nullable final String value) {
        this.ein = value;
    }
    /**
     * Sets the isYoungerThan90 property value. Indicates whether the organization serves customers younger than 90, for compliance and underwriting context.
     * @param value Value to set for the isYoungerThan90 property.
     */
    public void setIsYoungerThan90(@jakarta.annotation.Nullable final Boolean value) {
        this.isYoungerThan90 = value;
    }
    /**
     * Sets the name property value. Primary organization name.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the phone property value. Phone details for the lead, user, or organization represented by this organization profile request.
     * @param value Value to set for the phone property.
     */
    public void setPhone(@jakarta.annotation.Nullable final String value) {
        this.phone = value;
    }
    /**
     * Sets the secondaryName property value. Alternate organization name or DBA shown in Leadping.
     * @param value Value to set for the secondaryName property.
     */
    public void setSecondaryName(@jakarta.annotation.Nullable final String value) {
        this.secondaryName = value;
    }
    /**
     * Sets the vertical property value. Industry vertical used for lead routing, compliance review, and reporting.
     * @param value Value to set for the vertical property.
     */
    public void setVertical(@jakarta.annotation.Nullable final String value) {
        this.vertical = value;
    }
    /**
     * Sets the website property value. Organization website URL used for compliance, brand review, and lead attribution.
     * @param value Value to set for the website property.
     */
    public void setWebsite(@jakarta.annotation.Nullable final String value) {
        this.website = value;
    }
}

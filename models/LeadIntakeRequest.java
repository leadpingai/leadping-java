package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Request schema for the Leadping API lead intake request, including the fields clients can send.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeadIntakeRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * First street address line submitted by the lead intake source.
     */
    private String address1;
    /**
     * Second street address line submitted by the lead intake source.
     */
    private String address2;
    /**
     * Lead birth date used for demographic matching and insurance intake workflows.
     */
    private LocalDate birthDate;
    /**
     * City for the lead or business postal address.
     */
    private String city;
    /**
     * Lead date of birth supplied by intake sources and normalized into the lead profile.
     */
    private LocalDate dateOfBirth;
    /**
     * Direct-post price supplied by the lead source during intake.
     */
    private UntypedNode directPostPrice;
    /**
     * Email address for the person represented by this lead intake request.
     */
    private String email;
    /**
     * External system identifier used to reconcile this lead intake request across integrations.
     */
    private String externalId;
    /**
     * First name of the lead, user, or contact represented by this lead intake request.
     */
    private String firstName;
    /**
     * Lead gender supplied by intake sources and normalized when possible.
     */
    private String gender;
    /**
     * Landing page URL where the lead submitted their information.
     */
    private String landingPage;
    /**
     * Last name of the lead, user, or contact represented by this lead intake request.
     */
    private String lastName;
    /**
     * Phone details for the lead, user, or business represented by this lead intake request.
     */
    private String phone;
    /**
     * Source-provided phone type, such as mobile, landline, or VoIP, used during lead intake normalization.
     */
    private String phoneType;
    /**
     * Postal code for the lead or business address.
     */
    private String postalCode;
    /**
     * Lead price or transaction price supplied to the Leadping API.
     */
    private UntypedNode price;
    /**
     * Product or offer associated with the lead or source.
     */
    private String product;
    /**
     * Referring page or traffic source that sent the lead into Leadping.
     */
    private String referrer;
    /**
     * Seller-provided lead identifier used to deduplicate and reconcile lead delivery.
     */
    private String sellerLeadId;
    /**
     * Alternate seller-provided lead identifier used during intake normalization.
     */
    private String sellerLeadIdentifier;
    /**
     * Source-provided key-value metadata retained for lead attribution and integration troubleshooting.
     */
    private LeadIntakeRequestSourceMetadata sourceMetadata;
    /**
     * State, province, or region for the lead or business postal address.
     */
    private String state;
    /**
     * Affiliate or publisher sub ID captured for lead attribution.
     */
    private String subId;
    /**
     * Tag IDs assigned to or filtered against this lead.
     */
    private java.util.List<String> tagIds;
    /**
     * Tag names assigned to this lead when matching existing tags by name.
     */
    private java.util.List<String> tagNames;
    /**
     * TrustedForm certificate URL used as proof of consumer consent.
     */
    private String trustedFormUrl;
    /**
     * UTM campaign parameter captured for lead attribution reporting.
     */
    private String utmCampaign;
    /**
     * UTM content parameter captured for lead attribution reporting.
     */
    private String utmContent;
    /**
     * UTM medium parameter captured for lead attribution reporting.
     */
    private String utmMedium;
    /**
     * UTM source parameter captured for lead attribution reporting.
     */
    private String utmSource;
    /**
     * UTM term parameter captured for lead attribution reporting.
     */
    private String utmTerm;
    /**
     * Industry vertical used for lead routing, compliance review, and reporting.
     */
    private String vertical;
    /**
     * ZIP code submitted by the lead intake source.
     */
    private String zip;
    /**
     * Instantiates a new {@link LeadIntakeRequest} and sets the default values.
     */
    public LeadIntakeRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LeadIntakeRequest}
     */
    @jakarta.annotation.Nonnull
    public static LeadIntakeRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LeadIntakeRequest();
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
     * Gets the address1 property value. First street address line submitted by the lead intake source.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAddress1() {
        return this.address1;
    }
    /**
     * Gets the address2 property value. Second street address line submitted by the lead intake source.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAddress2() {
        return this.address2;
    }
    /**
     * Gets the birthDate property value. Lead birth date used for demographic matching and insurance intake workflows.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getBirthDate() {
        return this.birthDate;
    }
    /**
     * Gets the city property value. City for the lead or business postal address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the dateOfBirth property value. Lead date of birth supplied by intake sources and normalized into the lead profile.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }
    /**
     * Gets the directPostPrice property value. Direct-post price supplied by the lead source during intake.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getDirectPostPrice() {
        return this.directPostPrice;
    }
    /**
     * Gets the email property value. Email address for the person represented by this lead intake request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * Gets the externalId property value. External system identifier used to reconcile this lead intake request across integrations.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(33);
        deserializerMap.put("address1", (n) -> { this.setAddress1(n.getStringValue()); });
        deserializerMap.put("address2", (n) -> { this.setAddress2(n.getStringValue()); });
        deserializerMap.put("birthDate", (n) -> { this.setBirthDate(n.getLocalDateValue()); });
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("dateOfBirth", (n) -> { this.setDateOfBirth(n.getLocalDateValue()); });
        deserializerMap.put("directPostPrice", (n) -> { this.setDirectPostPrice(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("firstName", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("gender", (n) -> { this.setGender(n.getStringValue()); });
        deserializerMap.put("landingPage", (n) -> { this.setLandingPage(n.getStringValue()); });
        deserializerMap.put("lastName", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("phone", (n) -> { this.setPhone(n.getStringValue()); });
        deserializerMap.put("phoneType", (n) -> { this.setPhoneType(n.getStringValue()); });
        deserializerMap.put("postalCode", (n) -> { this.setPostalCode(n.getStringValue()); });
        deserializerMap.put("price", (n) -> { this.setPrice(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("product", (n) -> { this.setProduct(n.getStringValue()); });
        deserializerMap.put("referrer", (n) -> { this.setReferrer(n.getStringValue()); });
        deserializerMap.put("sellerLeadId", (n) -> { this.setSellerLeadId(n.getStringValue()); });
        deserializerMap.put("sellerLeadIdentifier", (n) -> { this.setSellerLeadIdentifier(n.getStringValue()); });
        deserializerMap.put("sourceMetadata", (n) -> { this.setSourceMetadata(n.getObjectValue(LeadIntakeRequestSourceMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("subId", (n) -> { this.setSubId(n.getStringValue()); });
        deserializerMap.put("tagIds", (n) -> { this.setTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("tagNames", (n) -> { this.setTagNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("trustedFormUrl", (n) -> { this.setTrustedFormUrl(n.getStringValue()); });
        deserializerMap.put("utmCampaign", (n) -> { this.setUtmCampaign(n.getStringValue()); });
        deserializerMap.put("utmContent", (n) -> { this.setUtmContent(n.getStringValue()); });
        deserializerMap.put("utmMedium", (n) -> { this.setUtmMedium(n.getStringValue()); });
        deserializerMap.put("utmSource", (n) -> { this.setUtmSource(n.getStringValue()); });
        deserializerMap.put("utmTerm", (n) -> { this.setUtmTerm(n.getStringValue()); });
        deserializerMap.put("vertical", (n) -> { this.setVertical(n.getStringValue()); });
        deserializerMap.put("zip", (n) -> { this.setZip(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstName property value. First name of the lead, user, or contact represented by this lead intake request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Gets the gender property value. Lead gender supplied by intake sources and normalized when possible.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGender() {
        return this.gender;
    }
    /**
     * Gets the landingPage property value. Landing page URL where the lead submitted their information.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLandingPage() {
        return this.landingPage;
    }
    /**
     * Gets the lastName property value. Last name of the lead, user, or contact represented by this lead intake request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastName() {
        return this.lastName;
    }
    /**
     * Gets the phone property value. Phone details for the lead, user, or business represented by this lead intake request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhone() {
        return this.phone;
    }
    /**
     * Gets the phoneType property value. Source-provided phone type, such as mobile, landline, or VoIP, used during lead intake normalization.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneType() {
        return this.phoneType;
    }
    /**
     * Gets the postalCode property value. Postal code for the lead or business address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPostalCode() {
        return this.postalCode;
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
     * Gets the product property value. Product or offer associated with the lead or source.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProduct() {
        return this.product;
    }
    /**
     * Gets the referrer property value. Referring page or traffic source that sent the lead into Leadping.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReferrer() {
        return this.referrer;
    }
    /**
     * Gets the sellerLeadId property value. Seller-provided lead identifier used to deduplicate and reconcile lead delivery.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSellerLeadId() {
        return this.sellerLeadId;
    }
    /**
     * Gets the sellerLeadIdentifier property value. Alternate seller-provided lead identifier used during intake normalization.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSellerLeadIdentifier() {
        return this.sellerLeadIdentifier;
    }
    /**
     * Gets the sourceMetadata property value. Source-provided key-value metadata retained for lead attribution and integration troubleshooting.
     * @return a {@link LeadIntakeRequestSourceMetadata}
     */
    @jakarta.annotation.Nullable
    public LeadIntakeRequestSourceMetadata getSourceMetadata() {
        return this.sourceMetadata;
    }
    /**
     * Gets the state property value. State, province, or region for the lead or business postal address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Gets the subId property value. Affiliate or publisher sub ID captured for lead attribution.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubId() {
        return this.subId;
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
     * Gets the trustedFormUrl property value. TrustedForm certificate URL used as proof of consumer consent.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTrustedFormUrl() {
        return this.trustedFormUrl;
    }
    /**
     * Gets the utmCampaign property value. UTM campaign parameter captured for lead attribution reporting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUtmCampaign() {
        return this.utmCampaign;
    }
    /**
     * Gets the utmContent property value. UTM content parameter captured for lead attribution reporting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUtmContent() {
        return this.utmContent;
    }
    /**
     * Gets the utmMedium property value. UTM medium parameter captured for lead attribution reporting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUtmMedium() {
        return this.utmMedium;
    }
    /**
     * Gets the utmSource property value. UTM source parameter captured for lead attribution reporting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUtmSource() {
        return this.utmSource;
    }
    /**
     * Gets the utmTerm property value. UTM term parameter captured for lead attribution reporting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUtmTerm() {
        return this.utmTerm;
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
     * Gets the zip property value. ZIP code submitted by the lead intake source.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getZip() {
        return this.zip;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("address1", this.getAddress1());
        writer.writeStringValue("address2", this.getAddress2());
        writer.writeLocalDateValue("birthDate", this.getBirthDate());
        writer.writeStringValue("city", this.getCity());
        writer.writeLocalDateValue("dateOfBirth", this.getDateOfBirth());
        writer.writeObjectValue("directPostPrice", this.getDirectPostPrice());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeStringValue("firstName", this.getFirstName());
        writer.writeStringValue("gender", this.getGender());
        writer.writeStringValue("landingPage", this.getLandingPage());
        writer.writeStringValue("lastName", this.getLastName());
        writer.writeStringValue("phone", this.getPhone());
        writer.writeStringValue("phoneType", this.getPhoneType());
        writer.writeStringValue("postalCode", this.getPostalCode());
        writer.writeObjectValue("price", this.getPrice());
        writer.writeStringValue("product", this.getProduct());
        writer.writeStringValue("referrer", this.getReferrer());
        writer.writeStringValue("sellerLeadId", this.getSellerLeadId());
        writer.writeStringValue("sellerLeadIdentifier", this.getSellerLeadIdentifier());
        writer.writeObjectValue("sourceMetadata", this.getSourceMetadata());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("subId", this.getSubId());
        writer.writeCollectionOfPrimitiveValues("tagIds", this.getTagIds());
        writer.writeCollectionOfPrimitiveValues("tagNames", this.getTagNames());
        writer.writeStringValue("trustedFormUrl", this.getTrustedFormUrl());
        writer.writeStringValue("utmCampaign", this.getUtmCampaign());
        writer.writeStringValue("utmContent", this.getUtmContent());
        writer.writeStringValue("utmMedium", this.getUtmMedium());
        writer.writeStringValue("utmSource", this.getUtmSource());
        writer.writeStringValue("utmTerm", this.getUtmTerm());
        writer.writeStringValue("vertical", this.getVertical());
        writer.writeStringValue("zip", this.getZip());
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
     * Sets the address1 property value. First street address line submitted by the lead intake source.
     * @param value Value to set for the address1 property.
     */
    public void setAddress1(@jakarta.annotation.Nullable final String value) {
        this.address1 = value;
    }
    /**
     * Sets the address2 property value. Second street address line submitted by the lead intake source.
     * @param value Value to set for the address2 property.
     */
    public void setAddress2(@jakarta.annotation.Nullable final String value) {
        this.address2 = value;
    }
    /**
     * Sets the birthDate property value. Lead birth date used for demographic matching and insurance intake workflows.
     * @param value Value to set for the birthDate property.
     */
    public void setBirthDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.birthDate = value;
    }
    /**
     * Sets the city property value. City for the lead or business postal address.
     * @param value Value to set for the city property.
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the dateOfBirth property value. Lead date of birth supplied by intake sources and normalized into the lead profile.
     * @param value Value to set for the dateOfBirth property.
     */
    public void setDateOfBirth(@jakarta.annotation.Nullable final LocalDate value) {
        this.dateOfBirth = value;
    }
    /**
     * Sets the directPostPrice property value. Direct-post price supplied by the lead source during intake.
     * @param value Value to set for the directPostPrice property.
     */
    public void setDirectPostPrice(@jakarta.annotation.Nullable final UntypedNode value) {
        this.directPostPrice = value;
    }
    /**
     * Sets the email property value. Email address for the person represented by this lead intake request.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the externalId property value. External system identifier used to reconcile this lead intake request across integrations.
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.externalId = value;
    }
    /**
     * Sets the firstName property value. First name of the lead, user, or contact represented by this lead intake request.
     * @param value Value to set for the firstName property.
     */
    public void setFirstName(@jakarta.annotation.Nullable final String value) {
        this.firstName = value;
    }
    /**
     * Sets the gender property value. Lead gender supplied by intake sources and normalized when possible.
     * @param value Value to set for the gender property.
     */
    public void setGender(@jakarta.annotation.Nullable final String value) {
        this.gender = value;
    }
    /**
     * Sets the landingPage property value. Landing page URL where the lead submitted their information.
     * @param value Value to set for the landingPage property.
     */
    public void setLandingPage(@jakarta.annotation.Nullable final String value) {
        this.landingPage = value;
    }
    /**
     * Sets the lastName property value. Last name of the lead, user, or contact represented by this lead intake request.
     * @param value Value to set for the lastName property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.lastName = value;
    }
    /**
     * Sets the phone property value. Phone details for the lead, user, or business represented by this lead intake request.
     * @param value Value to set for the phone property.
     */
    public void setPhone(@jakarta.annotation.Nullable final String value) {
        this.phone = value;
    }
    /**
     * Sets the phoneType property value. Source-provided phone type, such as mobile, landline, or VoIP, used during lead intake normalization.
     * @param value Value to set for the phoneType property.
     */
    public void setPhoneType(@jakarta.annotation.Nullable final String value) {
        this.phoneType = value;
    }
    /**
     * Sets the postalCode property value. Postal code for the lead or business address.
     * @param value Value to set for the postalCode property.
     */
    public void setPostalCode(@jakarta.annotation.Nullable final String value) {
        this.postalCode = value;
    }
    /**
     * Sets the price property value. Lead price or transaction price supplied to the Leadping API.
     * @param value Value to set for the price property.
     */
    public void setPrice(@jakarta.annotation.Nullable final UntypedNode value) {
        this.price = value;
    }
    /**
     * Sets the product property value. Product or offer associated with the lead or source.
     * @param value Value to set for the product property.
     */
    public void setProduct(@jakarta.annotation.Nullable final String value) {
        this.product = value;
    }
    /**
     * Sets the referrer property value. Referring page or traffic source that sent the lead into Leadping.
     * @param value Value to set for the referrer property.
     */
    public void setReferrer(@jakarta.annotation.Nullable final String value) {
        this.referrer = value;
    }
    /**
     * Sets the sellerLeadId property value. Seller-provided lead identifier used to deduplicate and reconcile lead delivery.
     * @param value Value to set for the sellerLeadId property.
     */
    public void setSellerLeadId(@jakarta.annotation.Nullable final String value) {
        this.sellerLeadId = value;
    }
    /**
     * Sets the sellerLeadIdentifier property value. Alternate seller-provided lead identifier used during intake normalization.
     * @param value Value to set for the sellerLeadIdentifier property.
     */
    public void setSellerLeadIdentifier(@jakarta.annotation.Nullable final String value) {
        this.sellerLeadIdentifier = value;
    }
    /**
     * Sets the sourceMetadata property value. Source-provided key-value metadata retained for lead attribution and integration troubleshooting.
     * @param value Value to set for the sourceMetadata property.
     */
    public void setSourceMetadata(@jakarta.annotation.Nullable final LeadIntakeRequestSourceMetadata value) {
        this.sourceMetadata = value;
    }
    /**
     * Sets the state property value. State, province, or region for the lead or business postal address.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.state = value;
    }
    /**
     * Sets the subId property value. Affiliate or publisher sub ID captured for lead attribution.
     * @param value Value to set for the subId property.
     */
    public void setSubId(@jakarta.annotation.Nullable final String value) {
        this.subId = value;
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
    /**
     * Sets the trustedFormUrl property value. TrustedForm certificate URL used as proof of consumer consent.
     * @param value Value to set for the trustedFormUrl property.
     */
    public void setTrustedFormUrl(@jakarta.annotation.Nullable final String value) {
        this.trustedFormUrl = value;
    }
    /**
     * Sets the utmCampaign property value. UTM campaign parameter captured for lead attribution reporting.
     * @param value Value to set for the utmCampaign property.
     */
    public void setUtmCampaign(@jakarta.annotation.Nullable final String value) {
        this.utmCampaign = value;
    }
    /**
     * Sets the utmContent property value. UTM content parameter captured for lead attribution reporting.
     * @param value Value to set for the utmContent property.
     */
    public void setUtmContent(@jakarta.annotation.Nullable final String value) {
        this.utmContent = value;
    }
    /**
     * Sets the utmMedium property value. UTM medium parameter captured for lead attribution reporting.
     * @param value Value to set for the utmMedium property.
     */
    public void setUtmMedium(@jakarta.annotation.Nullable final String value) {
        this.utmMedium = value;
    }
    /**
     * Sets the utmSource property value. UTM source parameter captured for lead attribution reporting.
     * @param value Value to set for the utmSource property.
     */
    public void setUtmSource(@jakarta.annotation.Nullable final String value) {
        this.utmSource = value;
    }
    /**
     * Sets the utmTerm property value. UTM term parameter captured for lead attribution reporting.
     * @param value Value to set for the utmTerm property.
     */
    public void setUtmTerm(@jakarta.annotation.Nullable final String value) {
        this.utmTerm = value;
    }
    /**
     * Sets the vertical property value. Industry vertical used for lead routing, compliance review, and reporting.
     * @param value Value to set for the vertical property.
     */
    public void setVertical(@jakarta.annotation.Nullable final String value) {
        this.vertical = value;
    }
    /**
     * Sets the zip property value. ZIP code submitted by the lead intake source.
     * @param value Value to set for the zip property.
     */
    public void setZip(@jakarta.annotation.Nullable final String value) {
        this.zip = value;
    }
}

package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Number-portability and routing data returned by Telnyx.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneLookupPortability implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Name of the carrier associated with the alternative service provider identifier.
     */
    private String alternativeCarrierName;
    /**
     * Carrier type associated with the alternative service provider identifier.
     */
    private String alternativeCarrierType;
    /**
     * Alternative service provider identifier reported for the number.
     */
    private String alternativeSpid;
    /**
     * Name of the carrier currently serving the number.
     */
    private String carrierName;
    /**
     * Type of carrier currently serving the number.
     */
    private String carrierType;
    /**
     * City reported by the portability lookup.
     */
    private String city;
    /**
     * Provider-native line type reported by the portability lookup.
     */
    private String lineType;
    /**
     * Local routing number used to route calls for the ported number.
     */
    private String localRoutingNumber;
    /**
     * Operating company number associated with the phone number.
     */
    private String operatingCompanyNumber;
    /**
     * Date on which the phone number was ported, as reported by the provider.
     */
    private String portedDate;
    /**
     * Current number-portability status reported by the provider.
     */
    private String portedStatus;
    /**
     * Service provider identifier currently associated with the number.
     */
    private String spid;
    /**
     * State or region reported by the portability lookup.
     */
    private String state;
    /**
     * Instantiates a new {@link PhoneLookupPortability} and sets the default values.
     */
    public PhoneLookupPortability() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneLookupPortability}
     */
    @jakarta.annotation.Nonnull
    public static PhoneLookupPortability createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneLookupPortability();
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
     * Gets the alternativeCarrierName property value. Name of the carrier associated with the alternative service provider identifier.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAlternativeCarrierName() {
        return this.alternativeCarrierName;
    }
    /**
     * Gets the alternativeCarrierType property value. Carrier type associated with the alternative service provider identifier.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAlternativeCarrierType() {
        return this.alternativeCarrierType;
    }
    /**
     * Gets the alternativeSpid property value. Alternative service provider identifier reported for the number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAlternativeSpid() {
        return this.alternativeSpid;
    }
    /**
     * Gets the carrierName property value. Name of the carrier currently serving the number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCarrierName() {
        return this.carrierName;
    }
    /**
     * Gets the carrierType property value. Type of carrier currently serving the number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCarrierType() {
        return this.carrierType;
    }
    /**
     * Gets the city property value. City reported by the portability lookup.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("alternativeCarrierName", (n) -> { this.setAlternativeCarrierName(n.getStringValue()); });
        deserializerMap.put("alternativeCarrierType", (n) -> { this.setAlternativeCarrierType(n.getStringValue()); });
        deserializerMap.put("alternativeSpid", (n) -> { this.setAlternativeSpid(n.getStringValue()); });
        deserializerMap.put("carrierName", (n) -> { this.setCarrierName(n.getStringValue()); });
        deserializerMap.put("carrierType", (n) -> { this.setCarrierType(n.getStringValue()); });
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("lineType", (n) -> { this.setLineType(n.getStringValue()); });
        deserializerMap.put("localRoutingNumber", (n) -> { this.setLocalRoutingNumber(n.getStringValue()); });
        deserializerMap.put("operatingCompanyNumber", (n) -> { this.setOperatingCompanyNumber(n.getStringValue()); });
        deserializerMap.put("portedDate", (n) -> { this.setPortedDate(n.getStringValue()); });
        deserializerMap.put("portedStatus", (n) -> { this.setPortedStatus(n.getStringValue()); });
        deserializerMap.put("spid", (n) -> { this.setSpid(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lineType property value. Provider-native line type reported by the portability lookup.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLineType() {
        return this.lineType;
    }
    /**
     * Gets the localRoutingNumber property value. Local routing number used to route calls for the ported number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocalRoutingNumber() {
        return this.localRoutingNumber;
    }
    /**
     * Gets the operatingCompanyNumber property value. Operating company number associated with the phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOperatingCompanyNumber() {
        return this.operatingCompanyNumber;
    }
    /**
     * Gets the portedDate property value. Date on which the phone number was ported, as reported by the provider.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPortedDate() {
        return this.portedDate;
    }
    /**
     * Gets the portedStatus property value. Current number-portability status reported by the provider.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPortedStatus() {
        return this.portedStatus;
    }
    /**
     * Gets the spid property value. Service provider identifier currently associated with the number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSpid() {
        return this.spid;
    }
    /**
     * Gets the state property value. State or region reported by the portability lookup.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("alternativeCarrierName", this.getAlternativeCarrierName());
        writer.writeStringValue("alternativeCarrierType", this.getAlternativeCarrierType());
        writer.writeStringValue("alternativeSpid", this.getAlternativeSpid());
        writer.writeStringValue("carrierName", this.getCarrierName());
        writer.writeStringValue("carrierType", this.getCarrierType());
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("lineType", this.getLineType());
        writer.writeStringValue("localRoutingNumber", this.getLocalRoutingNumber());
        writer.writeStringValue("operatingCompanyNumber", this.getOperatingCompanyNumber());
        writer.writeStringValue("portedDate", this.getPortedDate());
        writer.writeStringValue("portedStatus", this.getPortedStatus());
        writer.writeStringValue("spid", this.getSpid());
        writer.writeStringValue("state", this.getState());
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
     * Sets the alternativeCarrierName property value. Name of the carrier associated with the alternative service provider identifier.
     * @param value Value to set for the alternativeCarrierName property.
     */
    public void setAlternativeCarrierName(@jakarta.annotation.Nullable final String value) {
        this.alternativeCarrierName = value;
    }
    /**
     * Sets the alternativeCarrierType property value. Carrier type associated with the alternative service provider identifier.
     * @param value Value to set for the alternativeCarrierType property.
     */
    public void setAlternativeCarrierType(@jakarta.annotation.Nullable final String value) {
        this.alternativeCarrierType = value;
    }
    /**
     * Sets the alternativeSpid property value. Alternative service provider identifier reported for the number.
     * @param value Value to set for the alternativeSpid property.
     */
    public void setAlternativeSpid(@jakarta.annotation.Nullable final String value) {
        this.alternativeSpid = value;
    }
    /**
     * Sets the carrierName property value. Name of the carrier currently serving the number.
     * @param value Value to set for the carrierName property.
     */
    public void setCarrierName(@jakarta.annotation.Nullable final String value) {
        this.carrierName = value;
    }
    /**
     * Sets the carrierType property value. Type of carrier currently serving the number.
     * @param value Value to set for the carrierType property.
     */
    public void setCarrierType(@jakarta.annotation.Nullable final String value) {
        this.carrierType = value;
    }
    /**
     * Sets the city property value. City reported by the portability lookup.
     * @param value Value to set for the city property.
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the lineType property value. Provider-native line type reported by the portability lookup.
     * @param value Value to set for the lineType property.
     */
    public void setLineType(@jakarta.annotation.Nullable final String value) {
        this.lineType = value;
    }
    /**
     * Sets the localRoutingNumber property value. Local routing number used to route calls for the ported number.
     * @param value Value to set for the localRoutingNumber property.
     */
    public void setLocalRoutingNumber(@jakarta.annotation.Nullable final String value) {
        this.localRoutingNumber = value;
    }
    /**
     * Sets the operatingCompanyNumber property value. Operating company number associated with the phone number.
     * @param value Value to set for the operatingCompanyNumber property.
     */
    public void setOperatingCompanyNumber(@jakarta.annotation.Nullable final String value) {
        this.operatingCompanyNumber = value;
    }
    /**
     * Sets the portedDate property value. Date on which the phone number was ported, as reported by the provider.
     * @param value Value to set for the portedDate property.
     */
    public void setPortedDate(@jakarta.annotation.Nullable final String value) {
        this.portedDate = value;
    }
    /**
     * Sets the portedStatus property value. Current number-portability status reported by the provider.
     * @param value Value to set for the portedStatus property.
     */
    public void setPortedStatus(@jakarta.annotation.Nullable final String value) {
        this.portedStatus = value;
    }
    /**
     * Sets the spid property value. Service provider identifier currently associated with the number.
     * @param value Value to set for the spid property.
     */
    public void setSpid(@jakarta.annotation.Nullable final String value) {
        this.spid = value;
    }
    /**
     * Sets the state property value. State or region reported by the portability lookup.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.state = value;
    }
}

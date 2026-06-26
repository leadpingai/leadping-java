package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A minimal, serializable record type for physical mailing addresses, with support for international formats and compatibility with common APIs.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StreetAddress implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Optional additional notes or delivery instructions.
     */
    private String additionalInfo;
    /**
     * The city, town, or locality.
     */
    private String city;
    /**
     * The ISO 3166-1 alpha-2 country code (e.g., &quot;US&quot;, &quot;GB&quot;, &quot;CA&quot;).
     */
    private String country;
    /**
     * The primary address line (e.g., street address, P.O. box, company name).
     */
    private String line1;
    /**
     * The secondary address line (e.g., apartment, suite, unit, or building).
     */
    private String line2;
    /**
     * The postal or ZIP code.
     */
    private String postalCode;
    /**
     * The province or territory, if distinct from state in your use case (optional, use with care).
     */
    private String province;
    /**
     * The broader region, district, or administrative area (e.g., prefecture or county).
     */
    private String region;
    /**
     * The state, province, or equivalent administrative region. Commonly used in countries like the US, Canada, and Australia.
     */
    private String state;
    /**
     * Instantiates a new {@link StreetAddress} and sets the default values.
     */
    public StreetAddress() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link StreetAddress}
     */
    @jakarta.annotation.Nonnull
    public static StreetAddress createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StreetAddress();
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
     * Gets the additionalInfo property value. Optional additional notes or delivery instructions.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdditionalInfo() {
        return this.additionalInfo;
    }
    /**
     * Gets the city property value. The city, town, or locality.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the country property value. The ISO 3166-1 alpha-2 country code (e.g., &quot;US&quot;, &quot;GB&quot;, &quot;CA&quot;).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountry() {
        return this.country;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("additionalInfo", (n) -> { this.setAdditionalInfo(n.getStringValue()); });
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("line1", (n) -> { this.setLine1(n.getStringValue()); });
        deserializerMap.put("line2", (n) -> { this.setLine2(n.getStringValue()); });
        deserializerMap.put("postalCode", (n) -> { this.setPostalCode(n.getStringValue()); });
        deserializerMap.put("province", (n) -> { this.setProvince(n.getStringValue()); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the line1 property value. The primary address line (e.g., street address, P.O. box, company name).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLine1() {
        return this.line1;
    }
    /**
     * Gets the line2 property value. The secondary address line (e.g., apartment, suite, unit, or building).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLine2() {
        return this.line2;
    }
    /**
     * Gets the postalCode property value. The postal or ZIP code.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPostalCode() {
        return this.postalCode;
    }
    /**
     * Gets the province property value. The province or territory, if distinct from state in your use case (optional, use with care).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProvince() {
        return this.province;
    }
    /**
     * Gets the region property value. The broader region, district, or administrative area (e.g., prefecture or county).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegion() {
        return this.region;
    }
    /**
     * Gets the state property value. The state, province, or equivalent administrative region. Commonly used in countries like the US, Canada, and Australia.
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
        writer.writeStringValue("additionalInfo", this.getAdditionalInfo());
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("country", this.getCountry());
        writer.writeStringValue("line1", this.getLine1());
        writer.writeStringValue("line2", this.getLine2());
        writer.writeStringValue("postalCode", this.getPostalCode());
        writer.writeStringValue("province", this.getProvince());
        writer.writeStringValue("region", this.getRegion());
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
     * Sets the additionalInfo property value. Optional additional notes or delivery instructions.
     * @param value Value to set for the additionalInfo property.
     */
    public void setAdditionalInfo(@jakarta.annotation.Nullable final String value) {
        this.additionalInfo = value;
    }
    /**
     * Sets the city property value. The city, town, or locality.
     * @param value Value to set for the city property.
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the country property value. The ISO 3166-1 alpha-2 country code (e.g., &quot;US&quot;, &quot;GB&quot;, &quot;CA&quot;).
     * @param value Value to set for the country property.
     */
    public void setCountry(@jakarta.annotation.Nullable final String value) {
        this.country = value;
    }
    /**
     * Sets the line1 property value. The primary address line (e.g., street address, P.O. box, company name).
     * @param value Value to set for the line1 property.
     */
    public void setLine1(@jakarta.annotation.Nullable final String value) {
        this.line1 = value;
    }
    /**
     * Sets the line2 property value. The secondary address line (e.g., apartment, suite, unit, or building).
     * @param value Value to set for the line2 property.
     */
    public void setLine2(@jakarta.annotation.Nullable final String value) {
        this.line2 = value;
    }
    /**
     * Sets the postalCode property value. The postal or ZIP code.
     * @param value Value to set for the postalCode property.
     */
    public void setPostalCode(@jakarta.annotation.Nullable final String value) {
        this.postalCode = value;
    }
    /**
     * Sets the province property value. The province or territory, if distinct from state in your use case (optional, use with care).
     * @param value Value to set for the province property.
     */
    public void setProvince(@jakarta.annotation.Nullable final String value) {
        this.province = value;
    }
    /**
     * Sets the region property value. The broader region, district, or administrative area (e.g., prefecture or county).
     * @param value Value to set for the region property.
     */
    public void setRegion(@jakarta.annotation.Nullable final String value) {
        this.region = value;
    }
    /**
     * Sets the state property value. The state, province, or equivalent administrative region. Commonly used in countries like the US, Canada, and Australia.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.state = value;
    }
}

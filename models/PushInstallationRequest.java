package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Describes a mobile push installation. Identity and Azure tags are derived by the API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PushInstallationRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The application build number reported by the client.
     */
    private String appBuild;
    /**
     * The application bundle identifier or package name.
     */
    private String appIdentifier;
    /**
     * The human-readable application name reported by the client.
     */
    private String appName;
    /**
     * The semantic application version reported by the client.
     */
    private String appVersion;
    /**
     * The device model reported by the client.
     */
    private String deviceModel;
    /**
     * The mobile operating-system platform reported by the device.
     */
    private String devicePlatform;
    /**
     * The mobile operating-system version reported by the device.
     */
    private String deviceVersion;
    /**
     * The stable installation identifier assigned by the mobile client.
     */
    private String installationId;
    /**
     * Optional client metadata stored with the push installation.
     */
    private PushInstallationRequestMetadata metadata;
    /**
     * The Azure Notification Hubs platform name, such as apns or fcmv1.
     */
    private String platform;
    /**
     * The provider-issued push token or channel used to deliver notifications.
     */
    private String pushChannel;
    /**
     * Instantiates a new {@link PushInstallationRequest} and sets the default values.
     */
    public PushInstallationRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PushInstallationRequest}
     */
    @jakarta.annotation.Nonnull
    public static PushInstallationRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PushInstallationRequest();
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
     * Gets the appBuild property value. The application build number reported by the client.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppBuild() {
        return this.appBuild;
    }
    /**
     * Gets the appIdentifier property value. The application bundle identifier or package name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppIdentifier() {
        return this.appIdentifier;
    }
    /**
     * Gets the appName property value. The human-readable application name reported by the client.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppName() {
        return this.appName;
    }
    /**
     * Gets the appVersion property value. The semantic application version reported by the client.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppVersion() {
        return this.appVersion;
    }
    /**
     * Gets the deviceModel property value. The device model reported by the client.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceModel() {
        return this.deviceModel;
    }
    /**
     * Gets the devicePlatform property value. The mobile operating-system platform reported by the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDevicePlatform() {
        return this.devicePlatform;
    }
    /**
     * Gets the deviceVersion property value. The mobile operating-system version reported by the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceVersion() {
        return this.deviceVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("appBuild", (n) -> { this.setAppBuild(n.getStringValue()); });
        deserializerMap.put("appIdentifier", (n) -> { this.setAppIdentifier(n.getStringValue()); });
        deserializerMap.put("appName", (n) -> { this.setAppName(n.getStringValue()); });
        deserializerMap.put("appVersion", (n) -> { this.setAppVersion(n.getStringValue()); });
        deserializerMap.put("deviceModel", (n) -> { this.setDeviceModel(n.getStringValue()); });
        deserializerMap.put("devicePlatform", (n) -> { this.setDevicePlatform(n.getStringValue()); });
        deserializerMap.put("deviceVersion", (n) -> { this.setDeviceVersion(n.getStringValue()); });
        deserializerMap.put("installationId", (n) -> { this.setInstallationId(n.getStringValue()); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(PushInstallationRequestMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getStringValue()); });
        deserializerMap.put("pushChannel", (n) -> { this.setPushChannel(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the installationId property value. The stable installation identifier assigned by the mobile client.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInstallationId() {
        return this.installationId;
    }
    /**
     * Gets the metadata property value. Optional client metadata stored with the push installation.
     * @return a {@link PushInstallationRequestMetadata}
     */
    @jakarta.annotation.Nullable
    public PushInstallationRequestMetadata getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the platform property value. The Azure Notification Hubs platform name, such as apns or fcmv1.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlatform() {
        return this.platform;
    }
    /**
     * Gets the pushChannel property value. The provider-issued push token or channel used to deliver notifications.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPushChannel() {
        return this.pushChannel;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appBuild", this.getAppBuild());
        writer.writeStringValue("appIdentifier", this.getAppIdentifier());
        writer.writeStringValue("appName", this.getAppName());
        writer.writeStringValue("appVersion", this.getAppVersion());
        writer.writeStringValue("deviceModel", this.getDeviceModel());
        writer.writeStringValue("devicePlatform", this.getDevicePlatform());
        writer.writeStringValue("deviceVersion", this.getDeviceVersion());
        writer.writeStringValue("installationId", this.getInstallationId());
        writer.writeObjectValue("metadata", this.getMetadata());
        writer.writeStringValue("platform", this.getPlatform());
        writer.writeStringValue("pushChannel", this.getPushChannel());
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
     * Sets the appBuild property value. The application build number reported by the client.
     * @param value Value to set for the appBuild property.
     */
    public void setAppBuild(@jakarta.annotation.Nullable final String value) {
        this.appBuild = value;
    }
    /**
     * Sets the appIdentifier property value. The application bundle identifier or package name.
     * @param value Value to set for the appIdentifier property.
     */
    public void setAppIdentifier(@jakarta.annotation.Nullable final String value) {
        this.appIdentifier = value;
    }
    /**
     * Sets the appName property value. The human-readable application name reported by the client.
     * @param value Value to set for the appName property.
     */
    public void setAppName(@jakarta.annotation.Nullable final String value) {
        this.appName = value;
    }
    /**
     * Sets the appVersion property value. The semantic application version reported by the client.
     * @param value Value to set for the appVersion property.
     */
    public void setAppVersion(@jakarta.annotation.Nullable final String value) {
        this.appVersion = value;
    }
    /**
     * Sets the deviceModel property value. The device model reported by the client.
     * @param value Value to set for the deviceModel property.
     */
    public void setDeviceModel(@jakarta.annotation.Nullable final String value) {
        this.deviceModel = value;
    }
    /**
     * Sets the devicePlatform property value. The mobile operating-system platform reported by the device.
     * @param value Value to set for the devicePlatform property.
     */
    public void setDevicePlatform(@jakarta.annotation.Nullable final String value) {
        this.devicePlatform = value;
    }
    /**
     * Sets the deviceVersion property value. The mobile operating-system version reported by the device.
     * @param value Value to set for the deviceVersion property.
     */
    public void setDeviceVersion(@jakarta.annotation.Nullable final String value) {
        this.deviceVersion = value;
    }
    /**
     * Sets the installationId property value. The stable installation identifier assigned by the mobile client.
     * @param value Value to set for the installationId property.
     */
    public void setInstallationId(@jakarta.annotation.Nullable final String value) {
        this.installationId = value;
    }
    /**
     * Sets the metadata property value. Optional client metadata stored with the push installation.
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final PushInstallationRequestMetadata value) {
        this.metadata = value;
    }
    /**
     * Sets the platform property value. The Azure Notification Hubs platform name, such as apns or fcmv1.
     * @param value Value to set for the platform property.
     */
    public void setPlatform(@jakarta.annotation.Nullable final String value) {
        this.platform = value;
    }
    /**
     * Sets the pushChannel property value. The provider-issued push token or channel used to deliver notifications.
     * @param value Value to set for the pushChannel property.
     */
    public void setPushChannel(@jakarta.annotation.Nullable final String value) {
        this.pushChannel = value;
    }
}

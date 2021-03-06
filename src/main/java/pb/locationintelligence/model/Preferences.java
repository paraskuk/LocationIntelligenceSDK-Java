/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 3.7.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package pb.locationintelligence.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pb.locationintelligence.model.FieldsMatching;
import pb.locationintelligence.model.ReturnFieldsDescriptor;


/**
 * Preferences
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-28T14:56:37.023+05:30")
public class Preferences   {
  @SerializedName("returnAllCandidateInfo")
  private String returnAllCandidateInfo = "false";

  @SerializedName("fallbackToGeographic")
  private String fallbackToGeographic = null;

  @SerializedName("fallbackToPostal")
  private String fallbackToPostal = null;

  @SerializedName("maxReturnedCandidates")
  private String maxReturnedCandidates = null;

  @SerializedName("distance")
  private Double distance = null;

  @SerializedName("streetOffset")
  private String streetOffset = null;

  @SerializedName("cornerOffset")
  private String cornerOffset = null;

  @SerializedName("matchMode")
  private String matchMode = null;

  @SerializedName("clientLocale")
  private String clientLocale = null;

  @SerializedName("clientCoordSysName")
  private String clientCoordSysName = null;

  @SerializedName("distanceUnits")
  private String distanceUnits = null;

  @SerializedName("streetOffsetUnits")
  private String streetOffsetUnits = null;

  @SerializedName("cornerOffsetUnits")
  private String cornerOffsetUnits = null;

  @SerializedName("mustMatchFields")
  private FieldsMatching mustMatchFields = null;

  @SerializedName("returnFieldsDescriptor")
  private ReturnFieldsDescriptor returnFieldsDescriptor = null;

  @SerializedName("outputRecordType")
  private String outputRecordType = null;

  @SerializedName("customPreferences")
  private Map<String, Object> customPreferences = new HashMap<String, Object>();

  @SerializedName("preferredDictionaryOrders")
  private List<String> preferredDictionaryOrders = new ArrayList<String>();

  @SerializedName("outputCasing")
  private String outputCasing = null;

  @SerializedName("latLongOffset")
  private String latLongOffset = null;

  @SerializedName("squeeze")
  private String squeeze = null;

  @SerializedName("returnLatLongFields")
  private String returnLatLongFields = null;

  @SerializedName("useGeoTaxAuxiliaryFile")
  private String useGeoTaxAuxiliaryFile = null;

  @SerializedName("latLongFormat")
  private String latLongFormat = null;

  @SerializedName("defaultBufferWidth")
  private String defaultBufferWidth = null;

  @SerializedName("returnCensusFields")
  private String returnCensusFields = null;

  @SerializedName("taxRatetypeID")
  private String taxRatetypeID = null;

  public Preferences returnAllCandidateInfo(String returnAllCandidateInfo) {
    this.returnAllCandidateInfo = returnAllCandidateInfo;
    return this;
  }

   /**
   * Get returnAllCandidateInfo
   * @return returnAllCandidateInfo
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReturnAllCandidateInfo() {
    return returnAllCandidateInfo;
  }

  public void setReturnAllCandidateInfo(String returnAllCandidateInfo) {
    this.returnAllCandidateInfo = returnAllCandidateInfo;
  }

  public Preferences fallbackToGeographic(String fallbackToGeographic) {
    this.fallbackToGeographic = fallbackToGeographic;
    return this;
  }

   /**
   * Get fallbackToGeographic
   * @return fallbackToGeographic
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFallbackToGeographic() {
    return fallbackToGeographic;
  }

  public void setFallbackToGeographic(String fallbackToGeographic) {
    this.fallbackToGeographic = fallbackToGeographic;
  }

  public Preferences fallbackToPostal(String fallbackToPostal) {
    this.fallbackToPostal = fallbackToPostal;
    return this;
  }

   /**
   * Get fallbackToPostal
   * @return fallbackToPostal
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFallbackToPostal() {
    return fallbackToPostal;
  }

  public void setFallbackToPostal(String fallbackToPostal) {
    this.fallbackToPostal = fallbackToPostal;
  }

  public Preferences maxReturnedCandidates(String maxReturnedCandidates) {
    this.maxReturnedCandidates = maxReturnedCandidates;
    return this;
  }

   /**
   * Get maxReturnedCandidates
   * @return maxReturnedCandidates
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMaxReturnedCandidates() {
    return maxReturnedCandidates;
  }

  public void setMaxReturnedCandidates(String maxReturnedCandidates) {
    this.maxReturnedCandidates = maxReturnedCandidates;
  }

  public Preferences distance(Double distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public Preferences streetOffset(String streetOffset) {
    this.streetOffset = streetOffset;
    return this;
  }

   /**
   * Get streetOffset
   * @return streetOffset
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStreetOffset() {
    return streetOffset;
  }

  public void setStreetOffset(String streetOffset) {
    this.streetOffset = streetOffset;
  }

  public Preferences cornerOffset(String cornerOffset) {
    this.cornerOffset = cornerOffset;
    return this;
  }

   /**
   * Get cornerOffset
   * @return cornerOffset
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCornerOffset() {
    return cornerOffset;
  }

  public void setCornerOffset(String cornerOffset) {
    this.cornerOffset = cornerOffset;
  }

  public Preferences matchMode(String matchMode) {
    this.matchMode = matchMode;
    return this;
  }

   /**
   * Get matchMode
   * @return matchMode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMatchMode() {
    return matchMode;
  }

  public void setMatchMode(String matchMode) {
    this.matchMode = matchMode;
  }

  public Preferences clientLocale(String clientLocale) {
    this.clientLocale = clientLocale;
    return this;
  }

   /**
   * Get clientLocale
   * @return clientLocale
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getClientLocale() {
    return clientLocale;
  }

  public void setClientLocale(String clientLocale) {
    this.clientLocale = clientLocale;
  }

  public Preferences clientCoordSysName(String clientCoordSysName) {
    this.clientCoordSysName = clientCoordSysName;
    return this;
  }

   /**
   * Get clientCoordSysName
   * @return clientCoordSysName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getClientCoordSysName() {
    return clientCoordSysName;
  }

  public void setClientCoordSysName(String clientCoordSysName) {
    this.clientCoordSysName = clientCoordSysName;
  }

  public Preferences distanceUnits(String distanceUnits) {
    this.distanceUnits = distanceUnits;
    return this;
  }

   /**
   * Get distanceUnits
   * @return distanceUnits
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDistanceUnits() {
    return distanceUnits;
  }

  public void setDistanceUnits(String distanceUnits) {
    this.distanceUnits = distanceUnits;
  }

  public Preferences streetOffsetUnits(String streetOffsetUnits) {
    this.streetOffsetUnits = streetOffsetUnits;
    return this;
  }

   /**
   * Get streetOffsetUnits
   * @return streetOffsetUnits
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStreetOffsetUnits() {
    return streetOffsetUnits;
  }

  public void setStreetOffsetUnits(String streetOffsetUnits) {
    this.streetOffsetUnits = streetOffsetUnits;
  }

  public Preferences cornerOffsetUnits(String cornerOffsetUnits) {
    this.cornerOffsetUnits = cornerOffsetUnits;
    return this;
  }

   /**
   * Get cornerOffsetUnits
   * @return cornerOffsetUnits
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCornerOffsetUnits() {
    return cornerOffsetUnits;
  }

  public void setCornerOffsetUnits(String cornerOffsetUnits) {
    this.cornerOffsetUnits = cornerOffsetUnits;
  }

  public Preferences mustMatchFields(FieldsMatching mustMatchFields) {
    this.mustMatchFields = mustMatchFields;
    return this;
  }

   /**
   * Get mustMatchFields
   * @return mustMatchFields
  **/
  @ApiModelProperty(example = "null", value = "")
  public FieldsMatching getMustMatchFields() {
    return mustMatchFields;
  }

  public void setMustMatchFields(FieldsMatching mustMatchFields) {
    this.mustMatchFields = mustMatchFields;
  }

  public Preferences returnFieldsDescriptor(ReturnFieldsDescriptor returnFieldsDescriptor) {
    this.returnFieldsDescriptor = returnFieldsDescriptor;
    return this;
  }

   /**
   * Get returnFieldsDescriptor
   * @return returnFieldsDescriptor
  **/
  @ApiModelProperty(example = "null", value = "")
  public ReturnFieldsDescriptor getReturnFieldsDescriptor() {
    return returnFieldsDescriptor;
  }

  public void setReturnFieldsDescriptor(ReturnFieldsDescriptor returnFieldsDescriptor) {
    this.returnFieldsDescriptor = returnFieldsDescriptor;
  }

  public Preferences outputRecordType(String outputRecordType) {
    this.outputRecordType = outputRecordType;
    return this;
  }

   /**
   * Get outputRecordType
   * @return outputRecordType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOutputRecordType() {
    return outputRecordType;
  }

  public void setOutputRecordType(String outputRecordType) {
    this.outputRecordType = outputRecordType;
  }

  public Preferences customPreferences(Map<String, Object> customPreferences) {
    this.customPreferences = customPreferences;
    return this;
  }

   /**
   * Get customPreferences
   * @return customPreferences
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Object> getCustomPreferences() {
    return customPreferences;
  }

  public void setCustomPreferences(Map<String, Object> customPreferences) {
    this.customPreferences = customPreferences;
  }

  public Preferences preferredDictionaryOrders(List<String> preferredDictionaryOrders) {
    this.preferredDictionaryOrders = preferredDictionaryOrders;
    return this;
  }

   /**
   * Get preferredDictionaryOrders
   * @return preferredDictionaryOrders
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getPreferredDictionaryOrders() {
    return preferredDictionaryOrders;
  }

  public void setPreferredDictionaryOrders(List<String> preferredDictionaryOrders) {
    this.preferredDictionaryOrders = preferredDictionaryOrders;
  }

  public Preferences outputCasing(String outputCasing) {
    this.outputCasing = outputCasing;
    return this;
  }

   /**
   * Get outputCasing
   * @return outputCasing
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOutputCasing() {
    return outputCasing;
  }

  public void setOutputCasing(String outputCasing) {
    this.outputCasing = outputCasing;
  }

  public Preferences latLongOffset(String latLongOffset) {
    this.latLongOffset = latLongOffset;
    return this;
  }

   /**
   * Get latLongOffset
   * @return latLongOffset
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLatLongOffset() {
    return latLongOffset;
  }

  public void setLatLongOffset(String latLongOffset) {
    this.latLongOffset = latLongOffset;
  }

  public Preferences squeeze(String squeeze) {
    this.squeeze = squeeze;
    return this;
  }

   /**
   * Get squeeze
   * @return squeeze
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSqueeze() {
    return squeeze;
  }

  public void setSqueeze(String squeeze) {
    this.squeeze = squeeze;
  }

  public Preferences returnLatLongFields(String returnLatLongFields) {
    this.returnLatLongFields = returnLatLongFields;
    return this;
  }

   /**
   * Get returnLatLongFields
   * @return returnLatLongFields
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReturnLatLongFields() {
    return returnLatLongFields;
  }

  public void setReturnLatLongFields(String returnLatLongFields) {
    this.returnLatLongFields = returnLatLongFields;
  }

  public Preferences useGeoTaxAuxiliaryFile(String useGeoTaxAuxiliaryFile) {
    this.useGeoTaxAuxiliaryFile = useGeoTaxAuxiliaryFile;
    return this;
  }

   /**
   * Get useGeoTaxAuxiliaryFile
   * @return useGeoTaxAuxiliaryFile
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUseGeoTaxAuxiliaryFile() {
    return useGeoTaxAuxiliaryFile;
  }

  public void setUseGeoTaxAuxiliaryFile(String useGeoTaxAuxiliaryFile) {
    this.useGeoTaxAuxiliaryFile = useGeoTaxAuxiliaryFile;
  }

  public Preferences latLongFormat(String latLongFormat) {
    this.latLongFormat = latLongFormat;
    return this;
  }

   /**
   * Get latLongFormat
   * @return latLongFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLatLongFormat() {
    return latLongFormat;
  }

  public void setLatLongFormat(String latLongFormat) {
    this.latLongFormat = latLongFormat;
  }

  public Preferences defaultBufferWidth(String defaultBufferWidth) {
    this.defaultBufferWidth = defaultBufferWidth;
    return this;
  }

   /**
   * Get defaultBufferWidth
   * @return defaultBufferWidth
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDefaultBufferWidth() {
    return defaultBufferWidth;
  }

  public void setDefaultBufferWidth(String defaultBufferWidth) {
    this.defaultBufferWidth = defaultBufferWidth;
  }

  public Preferences returnCensusFields(String returnCensusFields) {
    this.returnCensusFields = returnCensusFields;
    return this;
  }

   /**
   * Get returnCensusFields
   * @return returnCensusFields
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReturnCensusFields() {
    return returnCensusFields;
  }

  public void setReturnCensusFields(String returnCensusFields) {
    this.returnCensusFields = returnCensusFields;
  }

  public Preferences taxRatetypeID(String taxRatetypeID) {
    this.taxRatetypeID = taxRatetypeID;
    return this;
  }

   /**
   * Get taxRatetypeID
   * @return taxRatetypeID
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTaxRatetypeID() {
    return taxRatetypeID;
  }

  public void setTaxRatetypeID(String taxRatetypeID) {
    this.taxRatetypeID = taxRatetypeID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Preferences preferences = (Preferences) o;
    return Objects.equals(this.returnAllCandidateInfo, preferences.returnAllCandidateInfo) &&
        Objects.equals(this.fallbackToGeographic, preferences.fallbackToGeographic) &&
        Objects.equals(this.fallbackToPostal, preferences.fallbackToPostal) &&
        Objects.equals(this.maxReturnedCandidates, preferences.maxReturnedCandidates) &&
        Objects.equals(this.distance, preferences.distance) &&
        Objects.equals(this.streetOffset, preferences.streetOffset) &&
        Objects.equals(this.cornerOffset, preferences.cornerOffset) &&
        Objects.equals(this.matchMode, preferences.matchMode) &&
        Objects.equals(this.clientLocale, preferences.clientLocale) &&
        Objects.equals(this.clientCoordSysName, preferences.clientCoordSysName) &&
        Objects.equals(this.distanceUnits, preferences.distanceUnits) &&
        Objects.equals(this.streetOffsetUnits, preferences.streetOffsetUnits) &&
        Objects.equals(this.cornerOffsetUnits, preferences.cornerOffsetUnits) &&
        Objects.equals(this.mustMatchFields, preferences.mustMatchFields) &&
        Objects.equals(this.returnFieldsDescriptor, preferences.returnFieldsDescriptor) &&
        Objects.equals(this.outputRecordType, preferences.outputRecordType) &&
        Objects.equals(this.customPreferences, preferences.customPreferences) &&
        Objects.equals(this.preferredDictionaryOrders, preferences.preferredDictionaryOrders) &&
        Objects.equals(this.outputCasing, preferences.outputCasing) &&
        Objects.equals(this.latLongOffset, preferences.latLongOffset) &&
        Objects.equals(this.squeeze, preferences.squeeze) &&
        Objects.equals(this.returnLatLongFields, preferences.returnLatLongFields) &&
        Objects.equals(this.useGeoTaxAuxiliaryFile, preferences.useGeoTaxAuxiliaryFile) &&
        Objects.equals(this.latLongFormat, preferences.latLongFormat) &&
        Objects.equals(this.defaultBufferWidth, preferences.defaultBufferWidth) &&
        Objects.equals(this.returnCensusFields, preferences.returnCensusFields) &&
        Objects.equals(this.taxRatetypeID, preferences.taxRatetypeID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnAllCandidateInfo, fallbackToGeographic, fallbackToPostal, maxReturnedCandidates, distance, streetOffset, cornerOffset, matchMode, clientLocale, clientCoordSysName, distanceUnits, streetOffsetUnits, cornerOffsetUnits, mustMatchFields, returnFieldsDescriptor, outputRecordType, customPreferences, preferredDictionaryOrders, outputCasing, latLongOffset, squeeze, returnLatLongFields, useGeoTaxAuxiliaryFile, latLongFormat, defaultBufferWidth, returnCensusFields, taxRatetypeID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Preferences {\n");
    
    sb.append("    returnAllCandidateInfo: ").append(toIndentedString(returnAllCandidateInfo)).append("\n");
    sb.append("    fallbackToGeographic: ").append(toIndentedString(fallbackToGeographic)).append("\n");
    sb.append("    fallbackToPostal: ").append(toIndentedString(fallbackToPostal)).append("\n");
    sb.append("    maxReturnedCandidates: ").append(toIndentedString(maxReturnedCandidates)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    streetOffset: ").append(toIndentedString(streetOffset)).append("\n");
    sb.append("    cornerOffset: ").append(toIndentedString(cornerOffset)).append("\n");
    sb.append("    matchMode: ").append(toIndentedString(matchMode)).append("\n");
    sb.append("    clientLocale: ").append(toIndentedString(clientLocale)).append("\n");
    sb.append("    clientCoordSysName: ").append(toIndentedString(clientCoordSysName)).append("\n");
    sb.append("    distanceUnits: ").append(toIndentedString(distanceUnits)).append("\n");
    sb.append("    streetOffsetUnits: ").append(toIndentedString(streetOffsetUnits)).append("\n");
    sb.append("    cornerOffsetUnits: ").append(toIndentedString(cornerOffsetUnits)).append("\n");
    sb.append("    mustMatchFields: ").append(toIndentedString(mustMatchFields)).append("\n");
    sb.append("    returnFieldsDescriptor: ").append(toIndentedString(returnFieldsDescriptor)).append("\n");
    sb.append("    outputRecordType: ").append(toIndentedString(outputRecordType)).append("\n");
    sb.append("    customPreferences: ").append(toIndentedString(customPreferences)).append("\n");
    sb.append("    preferredDictionaryOrders: ").append(toIndentedString(preferredDictionaryOrders)).append("\n");
    sb.append("    outputCasing: ").append(toIndentedString(outputCasing)).append("\n");
    sb.append("    latLongOffset: ").append(toIndentedString(latLongOffset)).append("\n");
    sb.append("    squeeze: ").append(toIndentedString(squeeze)).append("\n");
    sb.append("    returnLatLongFields: ").append(toIndentedString(returnLatLongFields)).append("\n");
    sb.append("    useGeoTaxAuxiliaryFile: ").append(toIndentedString(useGeoTaxAuxiliaryFile)).append("\n");
    sb.append("    latLongFormat: ").append(toIndentedString(latLongFormat)).append("\n");
    sb.append("    defaultBufferWidth: ").append(toIndentedString(defaultBufferWidth)).append("\n");
    sb.append("    returnCensusFields: ").append(toIndentedString(returnCensusFields)).append("\n");
    sb.append("    taxRatetypeID: ").append(toIndentedString(taxRatetypeID)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


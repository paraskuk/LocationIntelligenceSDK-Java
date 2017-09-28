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
import java.util.List;
import pb.locationintelligence.model.CandidateRange;
import pb.locationintelligence.model.FieldsMatching;
import pb.locationintelligence.model.GeoPos;
import pb.locationintelligence.model.GeocodeAddress;


/**
 * Candidate
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-28T14:56:37.023+05:30")
public class Candidate   {
  @SerializedName("precisionLevel")
  private Integer precisionLevel = null;

  @SerializedName("formattedStreetAddress")
  private String formattedStreetAddress = null;

  @SerializedName("formattedLocationAddress")
  private String formattedLocationAddress = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("precisionCode")
  private String precisionCode = null;

  @SerializedName("sourceDictionary")
  private String sourceDictionary = null;

  @SerializedName("matching")
  private FieldsMatching matching = null;

  @SerializedName("geometry")
  private GeoPos geometry = null;

  @SerializedName("address")
  private GeocodeAddress address = null;

  @SerializedName("ranges")
  private List<CandidateRange> ranges = new ArrayList<CandidateRange>();

  @SerializedName("worldGeocoded")
  private Boolean worldGeocoded = false;

  public Candidate precisionLevel(Integer precisionLevel) {
    this.precisionLevel = precisionLevel;
    return this;
  }

   /**
   * Get precisionLevel
   * @return precisionLevel
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPrecisionLevel() {
    return precisionLevel;
  }

  public void setPrecisionLevel(Integer precisionLevel) {
    this.precisionLevel = precisionLevel;
  }

  public Candidate formattedStreetAddress(String formattedStreetAddress) {
    this.formattedStreetAddress = formattedStreetAddress;
    return this;
  }

   /**
   * Get formattedStreetAddress
   * @return formattedStreetAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFormattedStreetAddress() {
    return formattedStreetAddress;
  }

  public void setFormattedStreetAddress(String formattedStreetAddress) {
    this.formattedStreetAddress = formattedStreetAddress;
  }

  public Candidate formattedLocationAddress(String formattedLocationAddress) {
    this.formattedLocationAddress = formattedLocationAddress;
    return this;
  }

   /**
   * Get formattedLocationAddress
   * @return formattedLocationAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFormattedLocationAddress() {
    return formattedLocationAddress;
  }

  public void setFormattedLocationAddress(String formattedLocationAddress) {
    this.formattedLocationAddress = formattedLocationAddress;
  }

  public Candidate identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Candidate precisionCode(String precisionCode) {
    this.precisionCode = precisionCode;
    return this;
  }

   /**
   * Get precisionCode
   * @return precisionCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPrecisionCode() {
    return precisionCode;
  }

  public void setPrecisionCode(String precisionCode) {
    this.precisionCode = precisionCode;
  }

  public Candidate sourceDictionary(String sourceDictionary) {
    this.sourceDictionary = sourceDictionary;
    return this;
  }

   /**
   * Get sourceDictionary
   * @return sourceDictionary
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSourceDictionary() {
    return sourceDictionary;
  }

  public void setSourceDictionary(String sourceDictionary) {
    this.sourceDictionary = sourceDictionary;
  }

  public Candidate matching(FieldsMatching matching) {
    this.matching = matching;
    return this;
  }

   /**
   * Get matching
   * @return matching
  **/
  @ApiModelProperty(example = "null", value = "")
  public FieldsMatching getMatching() {
    return matching;
  }

  public void setMatching(FieldsMatching matching) {
    this.matching = matching;
  }

  public Candidate geometry(GeoPos geometry) {
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @ApiModelProperty(example = "null", value = "")
  public GeoPos getGeometry() {
    return geometry;
  }

  public void setGeometry(GeoPos geometry) {
    this.geometry = geometry;
  }

  public Candidate address(GeocodeAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(example = "null", value = "")
  public GeocodeAddress getAddress() {
    return address;
  }

  public void setAddress(GeocodeAddress address) {
    this.address = address;
  }

  public Candidate ranges(List<CandidateRange> ranges) {
    this.ranges = ranges;
    return this;
  }

   /**
   * Get ranges
   * @return ranges
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CandidateRange> getRanges() {
    return ranges;
  }

  public void setRanges(List<CandidateRange> ranges) {
    this.ranges = ranges;
  }

  public Candidate worldGeocoded(Boolean worldGeocoded) {
    this.worldGeocoded = worldGeocoded;
    return this;
  }

   /**
   * Get worldGeocoded
   * @return worldGeocoded
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getWorldGeocoded() {
    return worldGeocoded;
  }

  public void setWorldGeocoded(Boolean worldGeocoded) {
    this.worldGeocoded = worldGeocoded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Candidate candidate = (Candidate) o;
    return Objects.equals(this.precisionLevel, candidate.precisionLevel) &&
        Objects.equals(this.formattedStreetAddress, candidate.formattedStreetAddress) &&
        Objects.equals(this.formattedLocationAddress, candidate.formattedLocationAddress) &&
        Objects.equals(this.identifier, candidate.identifier) &&
        Objects.equals(this.precisionCode, candidate.precisionCode) &&
        Objects.equals(this.sourceDictionary, candidate.sourceDictionary) &&
        Objects.equals(this.matching, candidate.matching) &&
        Objects.equals(this.geometry, candidate.geometry) &&
        Objects.equals(this.address, candidate.address) &&
        Objects.equals(this.ranges, candidate.ranges) &&
        Objects.equals(this.worldGeocoded, candidate.worldGeocoded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(precisionLevel, formattedStreetAddress, formattedLocationAddress, identifier, precisionCode, sourceDictionary, matching, geometry, address, ranges, worldGeocoded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Candidate {\n");
    
    sb.append("    precisionLevel: ").append(toIndentedString(precisionLevel)).append("\n");
    sb.append("    formattedStreetAddress: ").append(toIndentedString(formattedStreetAddress)).append("\n");
    sb.append("    formattedLocationAddress: ").append(toIndentedString(formattedLocationAddress)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    precisionCode: ").append(toIndentedString(precisionCode)).append("\n");
    sb.append("    sourceDictionary: ").append(toIndentedString(sourceDictionary)).append("\n");
    sb.append("    matching: ").append(toIndentedString(matching)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
    sb.append("    worldGeocoded: ").append(toIndentedString(worldGeocoded)).append("\n");
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


/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 3.6.0
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


/**
 * Match
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-13T02:57:26.849+05:30")
public class Match   {
  @SerializedName("confidence")
  private String confidence = null;

  @SerializedName("percentGeocode")
  private String percentGeocode = null;

  @SerializedName("precisionLevel")
  private String precisionLevel = null;

  @SerializedName("locationCode")
  private String locationCode = null;

  @SerializedName("matchCode")
  private String matchCode = null;

  public Match confidence(String confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * Get confidence
   * @return confidence
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getConfidence() {
    return confidence;
  }

  public void setConfidence(String confidence) {
    this.confidence = confidence;
  }

  public Match percentGeocode(String percentGeocode) {
    this.percentGeocode = percentGeocode;
    return this;
  }

   /**
   * Get percentGeocode
   * @return percentGeocode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPercentGeocode() {
    return percentGeocode;
  }

  public void setPercentGeocode(String percentGeocode) {
    this.percentGeocode = percentGeocode;
  }

  public Match precisionLevel(String precisionLevel) {
    this.precisionLevel = precisionLevel;
    return this;
  }

   /**
   * Get precisionLevel
   * @return precisionLevel
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPrecisionLevel() {
    return precisionLevel;
  }

  public void setPrecisionLevel(String precisionLevel) {
    this.precisionLevel = precisionLevel;
  }

  public Match locationCode(String locationCode) {
    this.locationCode = locationCode;
    return this;
  }

   /**
   * Get locationCode
   * @return locationCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }

  public Match matchCode(String matchCode) {
    this.matchCode = matchCode;
    return this;
  }

   /**
   * Get matchCode
   * @return matchCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMatchCode() {
    return matchCode;
  }

  public void setMatchCode(String matchCode) {
    this.matchCode = matchCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Match match = (Match) o;
    return Objects.equals(this.confidence, match.confidence) &&
        Objects.equals(this.percentGeocode, match.percentGeocode) &&
        Objects.equals(this.precisionLevel, match.precisionLevel) &&
        Objects.equals(this.locationCode, match.locationCode) &&
        Objects.equals(this.matchCode, match.matchCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidence, percentGeocode, precisionLevel, locationCode, matchCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Match {\n");
    
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    percentGeocode: ").append(toIndentedString(percentGeocode)).append("\n");
    sb.append("    precisionLevel: ").append(toIndentedString(precisionLevel)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    matchCode: ").append(toIndentedString(matchCode)).append("\n");
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


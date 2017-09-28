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
import pb.locationintelligence.model.Cbsa;
import pb.locationintelligence.model.Mcd;


/**
 * Census
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-28T14:56:37.023+05:30")
public class Census   {
  @SerializedName("cbsa")
  private Cbsa cbsa = null;

  @SerializedName("matchLevel")
  private String matchLevel = null;

  @SerializedName("matchCode")
  private String matchCode = null;

  @SerializedName("tract")
  private String tract = null;

  @SerializedName("mcd")
  private Mcd mcd = null;

  public Census cbsa(Cbsa cbsa) {
    this.cbsa = cbsa;
    return this;
  }

   /**
   * Get cbsa
   * @return cbsa
  **/
  @ApiModelProperty(example = "null", value = "")
  public Cbsa getCbsa() {
    return cbsa;
  }

  public void setCbsa(Cbsa cbsa) {
    this.cbsa = cbsa;
  }

  public Census matchLevel(String matchLevel) {
    this.matchLevel = matchLevel;
    return this;
  }

   /**
   * Get matchLevel
   * @return matchLevel
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMatchLevel() {
    return matchLevel;
  }

  public void setMatchLevel(String matchLevel) {
    this.matchLevel = matchLevel;
  }

  public Census matchCode(String matchCode) {
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

  public Census tract(String tract) {
    this.tract = tract;
    return this;
  }

   /**
   * Get tract
   * @return tract
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTract() {
    return tract;
  }

  public void setTract(String tract) {
    this.tract = tract;
  }

  public Census mcd(Mcd mcd) {
    this.mcd = mcd;
    return this;
  }

   /**
   * Get mcd
   * @return mcd
  **/
  @ApiModelProperty(example = "null", value = "")
  public Mcd getMcd() {
    return mcd;
  }

  public void setMcd(Mcd mcd) {
    this.mcd = mcd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Census census = (Census) o;
    return Objects.equals(this.cbsa, census.cbsa) &&
        Objects.equals(this.matchLevel, census.matchLevel) &&
        Objects.equals(this.matchCode, census.matchCode) &&
        Objects.equals(this.tract, census.tract) &&
        Objects.equals(this.mcd, census.mcd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cbsa, matchLevel, matchCode, tract, mcd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Census {\n");
    
    sb.append("    cbsa: ").append(toIndentedString(cbsa)).append("\n");
    sb.append("    matchLevel: ").append(toIndentedString(matchLevel)).append("\n");
    sb.append("    matchCode: ").append(toIndentedString(matchCode)).append("\n");
    sb.append("    tract: ").append(toIndentedString(tract)).append("\n");
    sb.append("    mcd: ").append(toIndentedString(mcd)).append("\n");
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


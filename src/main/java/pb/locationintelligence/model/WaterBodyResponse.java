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
import java.util.ArrayList;
import java.util.List;
import pb.locationintelligence.model.Address;
import pb.locationintelligence.model.WaterBody;


/**
 * WaterBodyResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-13T02:57:26.849+05:30")
public class WaterBodyResponse   {
  @SerializedName("waterBody")
  private List<WaterBody> waterBody = new ArrayList<WaterBody>();

  @SerializedName("matchedAddress")
  private Address matchedAddress = null;

  public WaterBodyResponse waterBody(List<WaterBody> waterBody) {
    this.waterBody = waterBody;
    return this;
  }

   /**
   * Get waterBody
   * @return waterBody
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<WaterBody> getWaterBody() {
    return waterBody;
  }

  public void setWaterBody(List<WaterBody> waterBody) {
    this.waterBody = waterBody;
  }

  public WaterBodyResponse matchedAddress(Address matchedAddress) {
    this.matchedAddress = matchedAddress;
    return this;
  }

   /**
   * Get matchedAddress
   * @return matchedAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public Address getMatchedAddress() {
    return matchedAddress;
  }

  public void setMatchedAddress(Address matchedAddress) {
    this.matchedAddress = matchedAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WaterBodyResponse waterBodyResponse = (WaterBodyResponse) o;
    return Objects.equals(this.waterBody, waterBodyResponse.waterBody) &&
        Objects.equals(this.matchedAddress, waterBodyResponse.matchedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(waterBody, matchedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WaterBodyResponse {\n");
    
    sb.append("    waterBody: ").append(toIndentedString(waterBody)).append("\n");
    sb.append("    matchedAddress: ").append(toIndentedString(matchedAddress)).append("\n");
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


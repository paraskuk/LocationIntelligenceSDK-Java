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
import pb.locationintelligence.model.AgeTheme;
import pb.locationintelligence.model.AttitudesAndMotivationTheme;
import pb.locationintelligence.model.AutomobileTheme;
import pb.locationintelligence.model.ChannelPreferencesTheme;
import pb.locationintelligence.model.CommuterPatternsTheme;
import pb.locationintelligence.model.EducationalAttainmentTheme;
import pb.locationintelligence.model.EthnicityTheme;
import pb.locationintelligence.model.FinancialProductsTheme;
import pb.locationintelligence.model.GenderTheme;
import pb.locationintelligence.model.HouseholdSizeTheme;
import pb.locationintelligence.model.IncomeTheme;
import pb.locationintelligence.model.MaritalStatusTheme;
import pb.locationintelligence.model.PurchasingBehaviorTheme;
import pb.locationintelligence.model.RaceTheme;


/**
 * DemographicsThemes
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-28T14:56:37.023+05:30")
public class DemographicsThemes   {
  @SerializedName("ageTheme")
  private AgeTheme ageTheme = null;

  @SerializedName("genderTheme")
  private GenderTheme genderTheme = null;

  @SerializedName("incomeTheme")
  private IncomeTheme incomeTheme = null;

  @SerializedName("raceTheme")
  private RaceTheme raceTheme = null;

  @SerializedName("ethnicityTheme")
  private EthnicityTheme ethnicityTheme = null;

  @SerializedName("maritalStatusTheme")
  private MaritalStatusTheme maritalStatusTheme = null;

  @SerializedName("automobileTheme")
  private AutomobileTheme automobileTheme = null;

  @SerializedName("purchasingBehaviorTheme")
  private PurchasingBehaviorTheme purchasingBehaviorTheme = null;

  @SerializedName("educationalAttainmentTheme")
  private EducationalAttainmentTheme educationalAttainmentTheme = null;

  @SerializedName("financialProductsTheme")
  private FinancialProductsTheme financialProductsTheme = null;

  @SerializedName("commuterPatternsTheme")
  private CommuterPatternsTheme commuterPatternsTheme = null;

  @SerializedName("attitudesAndMotivationTheme")
  private AttitudesAndMotivationTheme attitudesAndMotivationTheme = null;

  @SerializedName("channelPreferencesTheme")
  private ChannelPreferencesTheme channelPreferencesTheme = null;

  @SerializedName("householdSizeTheme")
  private HouseholdSizeTheme householdSizeTheme = null;

  public DemographicsThemes ageTheme(AgeTheme ageTheme) {
    this.ageTheme = ageTheme;
    return this;
  }

   /**
   * Get ageTheme
   * @return ageTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public AgeTheme getAgeTheme() {
    return ageTheme;
  }

  public void setAgeTheme(AgeTheme ageTheme) {
    this.ageTheme = ageTheme;
  }

  public DemographicsThemes genderTheme(GenderTheme genderTheme) {
    this.genderTheme = genderTheme;
    return this;
  }

   /**
   * Get genderTheme
   * @return genderTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public GenderTheme getGenderTheme() {
    return genderTheme;
  }

  public void setGenderTheme(GenderTheme genderTheme) {
    this.genderTheme = genderTheme;
  }

  public DemographicsThemes incomeTheme(IncomeTheme incomeTheme) {
    this.incomeTheme = incomeTheme;
    return this;
  }

   /**
   * Get incomeTheme
   * @return incomeTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public IncomeTheme getIncomeTheme() {
    return incomeTheme;
  }

  public void setIncomeTheme(IncomeTheme incomeTheme) {
    this.incomeTheme = incomeTheme;
  }

  public DemographicsThemes raceTheme(RaceTheme raceTheme) {
    this.raceTheme = raceTheme;
    return this;
  }

   /**
   * Get raceTheme
   * @return raceTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public RaceTheme getRaceTheme() {
    return raceTheme;
  }

  public void setRaceTheme(RaceTheme raceTheme) {
    this.raceTheme = raceTheme;
  }

  public DemographicsThemes ethnicityTheme(EthnicityTheme ethnicityTheme) {
    this.ethnicityTheme = ethnicityTheme;
    return this;
  }

   /**
   * Get ethnicityTheme
   * @return ethnicityTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public EthnicityTheme getEthnicityTheme() {
    return ethnicityTheme;
  }

  public void setEthnicityTheme(EthnicityTheme ethnicityTheme) {
    this.ethnicityTheme = ethnicityTheme;
  }

  public DemographicsThemes maritalStatusTheme(MaritalStatusTheme maritalStatusTheme) {
    this.maritalStatusTheme = maritalStatusTheme;
    return this;
  }

   /**
   * Get maritalStatusTheme
   * @return maritalStatusTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public MaritalStatusTheme getMaritalStatusTheme() {
    return maritalStatusTheme;
  }

  public void setMaritalStatusTheme(MaritalStatusTheme maritalStatusTheme) {
    this.maritalStatusTheme = maritalStatusTheme;
  }

  public DemographicsThemes automobileTheme(AutomobileTheme automobileTheme) {
    this.automobileTheme = automobileTheme;
    return this;
  }

   /**
   * Get automobileTheme
   * @return automobileTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public AutomobileTheme getAutomobileTheme() {
    return automobileTheme;
  }

  public void setAutomobileTheme(AutomobileTheme automobileTheme) {
    this.automobileTheme = automobileTheme;
  }

  public DemographicsThemes purchasingBehaviorTheme(PurchasingBehaviorTheme purchasingBehaviorTheme) {
    this.purchasingBehaviorTheme = purchasingBehaviorTheme;
    return this;
  }

   /**
   * Get purchasingBehaviorTheme
   * @return purchasingBehaviorTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public PurchasingBehaviorTheme getPurchasingBehaviorTheme() {
    return purchasingBehaviorTheme;
  }

  public void setPurchasingBehaviorTheme(PurchasingBehaviorTheme purchasingBehaviorTheme) {
    this.purchasingBehaviorTheme = purchasingBehaviorTheme;
  }

  public DemographicsThemes educationalAttainmentTheme(EducationalAttainmentTheme educationalAttainmentTheme) {
    this.educationalAttainmentTheme = educationalAttainmentTheme;
    return this;
  }

   /**
   * Get educationalAttainmentTheme
   * @return educationalAttainmentTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public EducationalAttainmentTheme getEducationalAttainmentTheme() {
    return educationalAttainmentTheme;
  }

  public void setEducationalAttainmentTheme(EducationalAttainmentTheme educationalAttainmentTheme) {
    this.educationalAttainmentTheme = educationalAttainmentTheme;
  }

  public DemographicsThemes financialProductsTheme(FinancialProductsTheme financialProductsTheme) {
    this.financialProductsTheme = financialProductsTheme;
    return this;
  }

   /**
   * Get financialProductsTheme
   * @return financialProductsTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public FinancialProductsTheme getFinancialProductsTheme() {
    return financialProductsTheme;
  }

  public void setFinancialProductsTheme(FinancialProductsTheme financialProductsTheme) {
    this.financialProductsTheme = financialProductsTheme;
  }

  public DemographicsThemes commuterPatternsTheme(CommuterPatternsTheme commuterPatternsTheme) {
    this.commuterPatternsTheme = commuterPatternsTheme;
    return this;
  }

   /**
   * Get commuterPatternsTheme
   * @return commuterPatternsTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public CommuterPatternsTheme getCommuterPatternsTheme() {
    return commuterPatternsTheme;
  }

  public void setCommuterPatternsTheme(CommuterPatternsTheme commuterPatternsTheme) {
    this.commuterPatternsTheme = commuterPatternsTheme;
  }

  public DemographicsThemes attitudesAndMotivationTheme(AttitudesAndMotivationTheme attitudesAndMotivationTheme) {
    this.attitudesAndMotivationTheme = attitudesAndMotivationTheme;
    return this;
  }

   /**
   * Get attitudesAndMotivationTheme
   * @return attitudesAndMotivationTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public AttitudesAndMotivationTheme getAttitudesAndMotivationTheme() {
    return attitudesAndMotivationTheme;
  }

  public void setAttitudesAndMotivationTheme(AttitudesAndMotivationTheme attitudesAndMotivationTheme) {
    this.attitudesAndMotivationTheme = attitudesAndMotivationTheme;
  }

  public DemographicsThemes channelPreferencesTheme(ChannelPreferencesTheme channelPreferencesTheme) {
    this.channelPreferencesTheme = channelPreferencesTheme;
    return this;
  }

   /**
   * Get channelPreferencesTheme
   * @return channelPreferencesTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public ChannelPreferencesTheme getChannelPreferencesTheme() {
    return channelPreferencesTheme;
  }

  public void setChannelPreferencesTheme(ChannelPreferencesTheme channelPreferencesTheme) {
    this.channelPreferencesTheme = channelPreferencesTheme;
  }

  public DemographicsThemes householdSizeTheme(HouseholdSizeTheme householdSizeTheme) {
    this.householdSizeTheme = householdSizeTheme;
    return this;
  }

   /**
   * Get householdSizeTheme
   * @return householdSizeTheme
  **/
  @ApiModelProperty(example = "null", value = "")
  public HouseholdSizeTheme getHouseholdSizeTheme() {
    return householdSizeTheme;
  }

  public void setHouseholdSizeTheme(HouseholdSizeTheme householdSizeTheme) {
    this.householdSizeTheme = householdSizeTheme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemographicsThemes demographicsThemes = (DemographicsThemes) o;
    return Objects.equals(this.ageTheme, demographicsThemes.ageTheme) &&
        Objects.equals(this.genderTheme, demographicsThemes.genderTheme) &&
        Objects.equals(this.incomeTheme, demographicsThemes.incomeTheme) &&
        Objects.equals(this.raceTheme, demographicsThemes.raceTheme) &&
        Objects.equals(this.ethnicityTheme, demographicsThemes.ethnicityTheme) &&
        Objects.equals(this.maritalStatusTheme, demographicsThemes.maritalStatusTheme) &&
        Objects.equals(this.automobileTheme, demographicsThemes.automobileTheme) &&
        Objects.equals(this.purchasingBehaviorTheme, demographicsThemes.purchasingBehaviorTheme) &&
        Objects.equals(this.educationalAttainmentTheme, demographicsThemes.educationalAttainmentTheme) &&
        Objects.equals(this.financialProductsTheme, demographicsThemes.financialProductsTheme) &&
        Objects.equals(this.commuterPatternsTheme, demographicsThemes.commuterPatternsTheme) &&
        Objects.equals(this.attitudesAndMotivationTheme, demographicsThemes.attitudesAndMotivationTheme) &&
        Objects.equals(this.channelPreferencesTheme, demographicsThemes.channelPreferencesTheme) &&
        Objects.equals(this.householdSizeTheme, demographicsThemes.householdSizeTheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageTheme, genderTheme, incomeTheme, raceTheme, ethnicityTheme, maritalStatusTheme, automobileTheme, purchasingBehaviorTheme, educationalAttainmentTheme, financialProductsTheme, commuterPatternsTheme, attitudesAndMotivationTheme, channelPreferencesTheme, householdSizeTheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemographicsThemes {\n");
    
    sb.append("    ageTheme: ").append(toIndentedString(ageTheme)).append("\n");
    sb.append("    genderTheme: ").append(toIndentedString(genderTheme)).append("\n");
    sb.append("    incomeTheme: ").append(toIndentedString(incomeTheme)).append("\n");
    sb.append("    raceTheme: ").append(toIndentedString(raceTheme)).append("\n");
    sb.append("    ethnicityTheme: ").append(toIndentedString(ethnicityTheme)).append("\n");
    sb.append("    maritalStatusTheme: ").append(toIndentedString(maritalStatusTheme)).append("\n");
    sb.append("    automobileTheme: ").append(toIndentedString(automobileTheme)).append("\n");
    sb.append("    purchasingBehaviorTheme: ").append(toIndentedString(purchasingBehaviorTheme)).append("\n");
    sb.append("    educationalAttainmentTheme: ").append(toIndentedString(educationalAttainmentTheme)).append("\n");
    sb.append("    financialProductsTheme: ").append(toIndentedString(financialProductsTheme)).append("\n");
    sb.append("    commuterPatternsTheme: ").append(toIndentedString(commuterPatternsTheme)).append("\n");
    sb.append("    attitudesAndMotivationTheme: ").append(toIndentedString(attitudesAndMotivationTheme)).append("\n");
    sb.append("    channelPreferencesTheme: ").append(toIndentedString(channelPreferencesTheme)).append("\n");
    sb.append("    householdSizeTheme: ").append(toIndentedString(householdSizeTheme)).append("\n");
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


/*
 * Storegate.Web
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.storegate.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import ch.cyberduck.core.storegate.io.swagger.client.model.CampaignPrice;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-16T20:27:33.275+02:00")
public class Product {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private Long value = null;

  @JsonProperty("startFee")
  private Double startFee = null;

  @JsonProperty("monthlyFee")
  private Double monthlyFee = null;

  @JsonProperty("campaignPrice")
  private CampaignPrice campaignPrice = null;

  public Product id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Product name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Product value(Long value) {
    this.value = value;
    return this;
  }

   /**
   * 
   * @return value
  **/
  @ApiModelProperty(value = "")
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  public Product startFee(Double startFee) {
    this.startFee = startFee;
    return this;
  }

   /**
   * 
   * @return startFee
  **/
  @ApiModelProperty(value = "")
  public Double getStartFee() {
    return startFee;
  }

  public void setStartFee(Double startFee) {
    this.startFee = startFee;
  }

  public Product monthlyFee(Double monthlyFee) {
    this.monthlyFee = monthlyFee;
    return this;
  }

   /**
   * 
   * @return monthlyFee
  **/
  @ApiModelProperty(value = "")
  public Double getMonthlyFee() {
    return monthlyFee;
  }

  public void setMonthlyFee(Double monthlyFee) {
    this.monthlyFee = monthlyFee;
  }

  public Product campaignPrice(CampaignPrice campaignPrice) {
    this.campaignPrice = campaignPrice;
    return this;
  }

   /**
   * 
   * @return campaignPrice
  **/
  @ApiModelProperty(value = "")
  public CampaignPrice getCampaignPrice() {
    return campaignPrice;
  }

  public void setCampaignPrice(CampaignPrice campaignPrice) {
    this.campaignPrice = campaignPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.value, product.value) &&
        Objects.equals(this.startFee, product.startFee) &&
        Objects.equals(this.monthlyFee, product.monthlyFee) &&
        Objects.equals(this.campaignPrice, product.campaignPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, value, startFee, monthlyFee, campaignPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    startFee: ").append(toIndentedString(startFee)).append("\n");
    sb.append("    monthlyFee: ").append(toIndentedString(monthlyFee)).append("\n");
    sb.append("    campaignPrice: ").append(toIndentedString(campaignPrice)).append("\n");
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


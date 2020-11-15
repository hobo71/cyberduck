/*
 * DRACOON API
 * REST Web Services for DRACOON<br>built at: 2020-10-14 12:14:23<br><br>This page provides an overview of all available and documented DRACOON APIs, which are grouped by tags.<br>Each tag provides a collection of APIs that are intended for a specific area of the DRACOON.<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a><br><br><a title='Terms of service' href='https://www.dracoon.com/terms/general-terms-and-conditions/'>Terms of service</a>
 *
 * OpenAPI spec version: 4.24.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * OpenID Connect provider information
 */
@Schema(description = "OpenID Connect provider information")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-10-15T15:35:23.522373+02:00[Europe/Zurich]")
public class OpenIdProvider {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("issuer")
  private String issuer = null;

  @JsonProperty("mappingClaim")
  private String mappingClaim = null;

  @JsonProperty("isGlobalAvailable")
  private Boolean isGlobalAvailable = null;

  @JsonProperty("userManagementUrl")
  private String userManagementUrl = null;

  public OpenIdProvider id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID
   * @return id
  **/
  @Schema(required = true, description = "ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public OpenIdProvider name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the IDP
   * @return name
  **/
  @Schema(required = true, description = "Name of the IDP")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OpenIdProvider issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Issuer identifier of the IDP  The value is a case sensitive URL.
   * @return issuer
  **/
  @Schema(required = true, description = "Issuer identifier of the IDP  The value is a case sensitive URL.")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public OpenIdProvider mappingClaim(String mappingClaim) {
    this.mappingClaim = mappingClaim;
    return this;
  }

   /**
   * Name of the claim which is used for the user mapping.
   * @return mappingClaim
  **/
  @Schema(required = true, description = "Name of the claim which is used for the user mapping.")
  public String getMappingClaim() {
    return mappingClaim;
  }

  public void setMappingClaim(String mappingClaim) {
    this.mappingClaim = mappingClaim;
  }

  public OpenIdProvider isGlobalAvailable(Boolean isGlobalAvailable) {
    this.isGlobalAvailable = isGlobalAvailable;
    return this;
  }

   /**
   * Is available for all customers
   * @return isGlobalAvailable
  **/
  @Schema(required = true, description = "Is available for all customers")
  public Boolean isIsGlobalAvailable() {
    return isGlobalAvailable;
  }

  public void setIsGlobalAvailable(Boolean isGlobalAvailable) {
    this.isGlobalAvailable = isGlobalAvailable;
  }

  public OpenIdProvider userManagementUrl(String userManagementUrl) {
    this.userManagementUrl = userManagementUrl;
    return this;
  }

   /**
   * URL of the user management UI.  Use empty string to remove.
   * @return userManagementUrl
  **/
  @Schema(description = "URL of the user management UI.  Use empty string to remove.")
  public String getUserManagementUrl() {
    return userManagementUrl;
  }

  public void setUserManagementUrl(String userManagementUrl) {
    this.userManagementUrl = userManagementUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenIdProvider openIdProvider = (OpenIdProvider) o;
    return Objects.equals(this.id, openIdProvider.id) &&
        Objects.equals(this.name, openIdProvider.name) &&
        Objects.equals(this.issuer, openIdProvider.issuer) &&
        Objects.equals(this.mappingClaim, openIdProvider.mappingClaim) &&
        Objects.equals(this.isGlobalAvailable, openIdProvider.isGlobalAvailable) &&
        Objects.equals(this.userManagementUrl, openIdProvider.userManagementUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, issuer, mappingClaim, isGlobalAvailable, userManagementUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenIdProvider {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    mappingClaim: ").append(toIndentedString(mappingClaim)).append("\n");
    sb.append("    isGlobalAvailable: ").append(toIndentedString(isGlobalAvailable)).append("\n");
    sb.append("    userManagementUrl: ").append(toIndentedString(userManagementUrl)).append("\n");
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

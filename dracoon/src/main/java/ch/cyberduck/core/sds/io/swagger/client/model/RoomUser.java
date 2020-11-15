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
import ch.cyberduck.core.sds.io.swagger.client.model.NodePermissions;
import ch.cyberduck.core.sds.io.swagger.client.model.PublicKeyContainer;
import ch.cyberduck.core.sds.io.swagger.client.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * User information
 */
@Schema(description = "User information")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-10-15T15:35:23.522373+02:00[Europe/Zurich]")
public class RoomUser {
  @JsonProperty("userInfo")
  private UserInfo userInfo = null;

  @JsonProperty("isGranted")
  private Boolean isGranted = null;

  @JsonProperty("permissions")
  private NodePermissions permissions = null;

  @JsonProperty("publicKeyContainer")
  private PublicKeyContainer publicKeyContainer = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("login")
  private String login = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("email")
  private String email = null;

  public RoomUser userInfo(UserInfo userInfo) {
    this.userInfo = userInfo;
    return this;
  }

   /**
   * Get userInfo
   * @return userInfo
  **/
  @Schema(required = true, description = "")
  public UserInfo getUserInfo() {
    return userInfo;
  }

  public void setUserInfo(UserInfo userInfo) {
    this.userInfo = userInfo;
  }

  public RoomUser isGranted(Boolean isGranted) {
    this.isGranted = isGranted;
    return this;
  }

   /**
   * Is user granted room permissions
   * @return isGranted
  **/
  @Schema(required = true, description = "Is user granted room permissions")
  public Boolean isIsGranted() {
    return isGranted;
  }

  public void setIsGranted(Boolean isGranted) {
    this.isGranted = isGranted;
  }

  public RoomUser permissions(NodePermissions permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @Schema(description = "")
  public NodePermissions getPermissions() {
    return permissions;
  }

  public void setPermissions(NodePermissions permissions) {
    this.permissions = permissions;
  }

  public RoomUser publicKeyContainer(PublicKeyContainer publicKeyContainer) {
    this.publicKeyContainer = publicKeyContainer;
    return this;
  }

   /**
   * Get publicKeyContainer
   * @return publicKeyContainer
  **/
  @Schema(description = "")
  public PublicKeyContainer getPublicKeyContainer() {
    return publicKeyContainer;
  }

  public void setPublicKeyContainer(PublicKeyContainer publicKeyContainer) {
    this.publicKeyContainer = publicKeyContainer;
  }

  public RoomUser id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * &amp;#128679; Deprecated since v4.11.0  Unique identifier for the user  use &#x60;id&#x60; from &#x60;UserInfo&#x60; instead
   * @return id
  **/
  @Schema(required = true, description = "&#128679; Deprecated since v4.11.0  Unique identifier for the user  use `id` from `UserInfo` instead")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RoomUser login(String login) {
    this.login = login;
    return this;
  }

   /**
   * &amp;#128679; Deprecated since v4.11.0  User login name
   * @return login
  **/
  @Schema(required = true, description = "&#128679; Deprecated since v4.11.0  User login name")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public RoomUser displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * &amp;#128679; Deprecated since v4.11.0  Display name  use information from &#x60;UserInfo&#x60; instead to combine a display name
   * @return displayName
  **/
  @Schema(required = true, description = "&#128679; Deprecated since v4.11.0  Display name  use information from `UserInfo` instead to combine a display name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public RoomUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * &amp;#128679; Deprecated since v4.11.0  Email   use &#x60;email&#x60; from &#x60;UserInfo&#x60; instead
   * @return email
  **/
  @Schema(required = true, description = "&#128679; Deprecated since v4.11.0  Email   use `email` from `UserInfo` instead")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomUser roomUser = (RoomUser) o;
    return Objects.equals(this.userInfo, roomUser.userInfo) &&
        Objects.equals(this.isGranted, roomUser.isGranted) &&
        Objects.equals(this.permissions, roomUser.permissions) &&
        Objects.equals(this.publicKeyContainer, roomUser.publicKeyContainer) &&
        Objects.equals(this.id, roomUser.id) &&
        Objects.equals(this.login, roomUser.login) &&
        Objects.equals(this.displayName, roomUser.displayName) &&
        Objects.equals(this.email, roomUser.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userInfo, isGranted, permissions, publicKeyContainer, id, login, displayName, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomUser {\n");
    
    sb.append("    userInfo: ").append(toIndentedString(userInfo)).append("\n");
    sb.append("    isGranted: ").append(toIndentedString(isGranted)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    publicKeyContainer: ").append(toIndentedString(publicKeyContainer)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

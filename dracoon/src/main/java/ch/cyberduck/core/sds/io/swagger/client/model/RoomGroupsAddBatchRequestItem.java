/*
 * DRACOON
 * REST Web Services for DRACOON<br>Version: 4.10.7-LTS  - built at: 2019-03-19 14:24:35<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a>
 *
 * OpenAPI spec version: 4.10.7-LTS
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

/**
 * RoomGroupsAddBatchRequestItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-13T14:25:40.305+02:00")
public class RoomGroupsAddBatchRequestItem {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("permissions")
  private NodePermissions permissions = null;

  /**
   * Behaviour when new users are added to the group: * &#x60;autoallow&#x60; * &#x60;pending&#x60;  Only relevant if &#x60;adminGroupIds&#x60; has items. (default: &#x60;autoallow&#x60;)
   */
  public enum NewGroupMemberAcceptanceEnum {
    AUTOALLOW("autoallow"),
    
    PENDING("pending");

    private String value;

    NewGroupMemberAcceptanceEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NewGroupMemberAcceptanceEnum fromValue(String text) {
      for (NewGroupMemberAcceptanceEnum b : NewGroupMemberAcceptanceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("newGroupMemberAcceptance")
  private NewGroupMemberAcceptanceEnum newGroupMemberAcceptance = null;

  public RoomGroupsAddBatchRequestItem id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the group
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier for the group")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RoomGroupsAddBatchRequestItem permissions(NodePermissions permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Available permissions for this node
   * @return permissions
  **/
  @ApiModelProperty(required = true, value = "Available permissions for this node")
  public NodePermissions getPermissions() {
    return permissions;
  }

  public void setPermissions(NodePermissions permissions) {
    this.permissions = permissions;
  }

  public RoomGroupsAddBatchRequestItem newGroupMemberAcceptance(NewGroupMemberAcceptanceEnum newGroupMemberAcceptance) {
    this.newGroupMemberAcceptance = newGroupMemberAcceptance;
    return this;
  }

   /**
   * Behaviour when new users are added to the group: * &#x60;autoallow&#x60; * &#x60;pending&#x60;  Only relevant if &#x60;adminGroupIds&#x60; has items. (default: &#x60;autoallow&#x60;)
   * @return newGroupMemberAcceptance
  **/
  @ApiModelProperty(example = "autoallow", value = "Behaviour when new users are added to the group: * `autoallow` * `pending`  Only relevant if `adminGroupIds` has items. (default: `autoallow`)")
  public NewGroupMemberAcceptanceEnum getNewGroupMemberAcceptance() {
    return newGroupMemberAcceptance;
  }

  public void setNewGroupMemberAcceptance(NewGroupMemberAcceptanceEnum newGroupMemberAcceptance) {
    this.newGroupMemberAcceptance = newGroupMemberAcceptance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomGroupsAddBatchRequestItem roomGroupsAddBatchRequestItem = (RoomGroupsAddBatchRequestItem) o;
    return Objects.equals(this.id, roomGroupsAddBatchRequestItem.id) &&
        Objects.equals(this.permissions, roomGroupsAddBatchRequestItem.permissions) &&
        Objects.equals(this.newGroupMemberAcceptance, roomGroupsAddBatchRequestItem.newGroupMemberAcceptance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, permissions, newGroupMemberAcceptance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomGroupsAddBatchRequestItem {\n");

      sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    newGroupMemberAcceptance: ").append(toIndentedString(newGroupMemberAcceptance)).append("\n");
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


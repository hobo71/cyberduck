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
import ch.cyberduck.core.storegate.io.swagger.client.model.BackupClientSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * Contains information about a backup client
 */
@ApiModel(description = "Contains information about a backup client")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-16T20:27:33.275+02:00")
public class BackupClient {
  @JsonProperty("removed")
  private DateTime removed = null;

  @JsonProperty("folderId")
  private String folderId = null;

  @JsonProperty("settings")
  private BackupClientSettings settings = null;

  @JsonProperty("created")
  private DateTime created = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("lastConnect")
  private DateTime lastConnect = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  public BackupClient removed(DateTime removed) {
    this.removed = removed;
    return this;
  }

   /**
   * Get removed
   * @return removed
  **/
  @ApiModelProperty(value = "")
  public DateTime getRemoved() {
    return removed;
  }

  public void setRemoved(DateTime removed) {
    this.removed = removed;
  }

  public BackupClient folderId(String folderId) {
    this.folderId = folderId;
    return this;
  }

   /**
   * Get folderId
   * @return folderId
  **/
  @ApiModelProperty(value = "")
  public String getFolderId() {
    return folderId;
  }

  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }

  public BackupClient settings(BackupClientSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @ApiModelProperty(value = "")
  public BackupClientSettings getSettings() {
    return settings;
  }

  public void setSettings(BackupClientSettings settings) {
    this.settings = settings;
  }

  public BackupClient created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public BackupClient userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public BackupClient lastConnect(DateTime lastConnect) {
    this.lastConnect = lastConnect;
    return this;
  }

   /**
   * Get lastConnect
   * @return lastConnect
  **/
  @ApiModelProperty(value = "")
  public DateTime getLastConnect() {
    return lastConnect;
  }

  public void setLastConnect(DateTime lastConnect) {
    this.lastConnect = lastConnect;
  }

  public BackupClient version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public BackupClient id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BackupClient name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupClient backupClient = (BackupClient) o;
    return Objects.equals(this.removed, backupClient.removed) &&
        Objects.equals(this.folderId, backupClient.folderId) &&
        Objects.equals(this.settings, backupClient.settings) &&
        Objects.equals(this.created, backupClient.created) &&
        Objects.equals(this.userId, backupClient.userId) &&
        Objects.equals(this.lastConnect, backupClient.lastConnect) &&
        Objects.equals(this.version, backupClient.version) &&
        Objects.equals(this.id, backupClient.id) &&
        Objects.equals(this.name, backupClient.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(removed, folderId, settings, created, userId, lastConnect, version, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupClient {\n");
    
    sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    lastConnect: ").append(toIndentedString(lastConnect)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


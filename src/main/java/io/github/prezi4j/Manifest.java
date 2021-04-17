package io.github.prezi4j;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonString;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Manifest {
    JsonString id;
    JsonString type;
    Label label;
    JsonArray metadata;
    JsonObject summary;
    JsonArray thumbnail;
    JsonString viewingDirection;
    JsonArray behavior;
    JsonString navDate;
    JsonString rights;
    JsonObject requiredStatement;
    JsonArray logo;
    JsonArray homepage;
    JsonArray service;
    JsonArray seeAlso;
    JsonArray rendering;
    JsonArray partOf;
    JsonObject start;
    JsonArray items;
    JsonArray structures;
    JsonArray annotations;

    public JsonString getId() {
        return id;
    }

    public void setId(String id) {
        this.id = Json.createValue(id);
    }

    public JsonString getType() {
        return type;
    }

    public void setType(String type) {
        this.type = Json.createValue(type);
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public JsonArray getMetadata() {
        return metadata;
    }

    public void setMetadata(JsonArray metadata) {
        this.metadata = metadata;
    }

    public JsonObject getSummary() {
        return summary;
    }

    public void setSummary(JsonObject summary) {
        this.summary = summary;
    }

    public JsonArray getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(JsonArray thumbnail) {
        this.thumbnail = thumbnail;
    }

    public ViewingDirection getViewingDirection() {
        return ViewingDirection.valueOf(viewingDirection.getString());
    }

    public void setViewingDirection(ViewingDirection viewingDirection) {
        this.viewingDirection = Json.createValue(viewingDirection.value);
    }

    public JsonArray getBehavior() {
        return behavior;
    }

    public void setBehavior(JsonArray behavior) {
        this.behavior = behavior;
    }

    public ZonedDateTime getNavDate() {
        return ZonedDateTime.parse(navDate.getString(), DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }

    public void setNavDate(ZonedDateTime navDate) {
        this.navDate = Json.createValue(navDate.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
    }

    public JsonString getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = Json.createValue(rights);
    }

    public JsonObject getRequiredStatement() {
        return requiredStatement;
    }

    public void setRequiredStatement(JsonObject requiredStatement) {
        this.requiredStatement = requiredStatement;
    }

    public JsonArray getLogo() {
        return logo;
    }

    public void setLogo(JsonArray logo) {
        this.logo = logo;
    }

    public JsonArray getHomepage() {
        return homepage;
    }

    public void setHomepage(JsonArray homepage) {
        this.homepage = homepage;
    }

    public JsonArray getService() {
        return service;
    }

    public void setService(JsonArray service) {
        this.service = service;
    }

    public JsonArray getSeeAlso() {
        return seeAlso;
    }

    public void setSeeAlso(JsonArray seeAlso) {
        this.seeAlso = seeAlso;
    }

    public JsonArray getRendering() {
        return rendering;
    }

    public void setRendering(JsonArray rendering) {
        this.rendering = rendering;
    }

    public JsonArray getPartOf() {
        return partOf;
    }

    public void setPartOf(JsonArray partOf) {
        this.partOf = partOf;
    }

    public JsonObject getStart() {
        return start;
    }

    public void setStart(JsonObject start) {
        this.start = start;
    }

    public JsonArray getItems() {
        return items;
    }

    public void setItems(JsonArray items) {
        this.items = items;
    }

    public JsonArray getStructures() {
        return structures;
    }

    public void setStructures(JsonArray structures) {
        this.structures = structures;
    }

    public JsonArray getAnnotations() {
        return annotations;
    }

    public void setAnnotations(JsonArray annotations) {
        this.annotations = annotations;
    }
}

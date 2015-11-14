package com.wasteofplastic.beaconz;

import java.awt.geom.Line2D;

/**
 * Created by geoff on 11/14/15.
 */
public class LinkResult {

    final int fieldsMade;
    final boolean success;
    final int fieldsFailedToMake;
    final Line2D link;

    public LinkResult(int fieldsMade, boolean success, int fieldsFailedToMake, Line2D link) {
        this.success = success;
        this.link = link;
        this.fieldsMade = fieldsMade;
        this.fieldsFailedToMake = fieldsFailedToMake;
    }

    public LinkResult(int fieldsMade, boolean success, int fieldsFailedToMake) {
        this(fieldsMade, success, fieldsFailedToMake, null);
    }

    public boolean isSuccess() {
        return success;
    }

    public Line2D getLink() {
        return link;
    }

    public int getFieldsMade() {
        return fieldsMade;
    }

    public int getFieldsFailedToMake() {
        return fieldsFailedToMake;
    }
}

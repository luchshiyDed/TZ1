package org.example.model;

import java.util.ArrayList;
import java.util.List;

public interface DeviceEntity extends NamedEntity {
    public DeviceAttributes getDeviceAttributes();
    public void setDeviceAttributes(DeviceAttributes deviceAttributes);
    public List getModels();
}

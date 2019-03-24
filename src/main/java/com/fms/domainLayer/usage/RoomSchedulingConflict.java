package com.fms.domainLayer.usage;

import com.google.common.collect.Range;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.time.LocalDateTime;

public class RoomSchedulingConflict {
  public RoomSchedulingConflict(
      Range<LocalDateTime> requestedRange, Range<LocalDateTime> scheduledRange) {
    this.requestedRange = requestedRange;
    this.scheduledRange = scheduledRange;
  }

  public Range<LocalDateTime> getRequestedRange() {
    return requestedRange;
  }

  public Range<LocalDateTime> getScheduledRange() {
    return scheduledRange;
  }

  public String toString() {
    GsonBuilder builder = new GsonBuilder().serializeNulls().setPrettyPrinting();
    Gson gson = builder.create();
    return gson.toJson(this);
  }

  private Range<LocalDateTime> requestedRange;
  private Range<LocalDateTime> scheduledRange;
}

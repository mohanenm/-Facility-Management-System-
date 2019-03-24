package com.fms.domainLayer.facility;

public interface IRoom {
  int getId();

  int getBuildingId();

  int getRoomNumber();

  int getCapacity();

  void setId(int id);

  void setBuildingId(int buildingId);

  void setRoomNumber(int roomNumber);

  void setCapacity(int capacity);
}

package base_layer;

public class Room{
    private static int roomNum;
    private boolean isInUse;
    private boolean downForMaintenance;

    public Room(){
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }
/*
    public boolean setMaintenance(boolean isInUse, boolean downForMaintenance){
        if(isInUse == true)
    }
*/
}
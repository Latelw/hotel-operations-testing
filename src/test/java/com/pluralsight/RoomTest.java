package com.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RoomTest {
    @Test
    void checkIn_Should_Occupy_And_DirtyRoom(){
        //Arrange
        Room room = new Room(150, 139.00 );
        //Act
        room.checkIn();
        //Assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());


    }
}

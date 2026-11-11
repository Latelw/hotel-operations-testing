package com.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RoomTest {
    @Test
   public void checkIn_Should_Occupy_And_DirtyRoom(){
        //Arrange
        Room room = new Room(150, 139.00 );
        //Act
        room.checkIn();
        //Assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());


    }
    @Test
    public void checkOut_ShouldNot_Occupy_And_DirtyRoom(){
        Room room = new Room(2,139);

        room.checkOut();

        assertTrue(room.isDirty());
        assertFalse(room.isOccupied());
    }

}

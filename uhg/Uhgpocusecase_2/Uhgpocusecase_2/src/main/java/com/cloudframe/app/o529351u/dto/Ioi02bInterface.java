package com.cloudframe.app.o529351u.dto;

/**
*  The class Ioi02bInterface is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ioi02bInterface extends Ioi02bInterfaceSerialized {
   

								@Getter @Setter private int ioi02bPassedRecAddr;

								@Getter @Setter private int ioi02bPassedRecPtr;
				@Getter @Setter private Ioi02bCurRecAddrArea ioi02bCurRecAddrArea = new Ioi02bCurRecAddrArea();

						@Getter @Setter private char[] ioi02bError = Field.fillLowValue(1);
				@Getter @Setter private Ioi02bReserveArea ioi02bReserveArea = new Ioi02bReserveArea();
	
	/**
	* Constructor for Ioi02bInterface
	**/
    public Ioi02bInterface() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIoi02bCurRecAddrArea().setParent(this,getStartOffset() + 24);
					getIoi02bReserveArea().setParent(this,getStartOffset() + 350);
	   	/*  end of offset */
    }





}
  

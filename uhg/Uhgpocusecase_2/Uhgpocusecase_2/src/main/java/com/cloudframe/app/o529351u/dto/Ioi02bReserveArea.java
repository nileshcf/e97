package com.cloudframe.app.o529351u.dto;

/**
*  The class Ioi02bReserveArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ioi02bReserveArea extends Ioi02bReserveAreaSerialized { 
   

								@Getter @Setter private int ioi02bWorkAreaAddr;

								@Getter @Setter private int ioi02bWorkAreaPtr;

								@Getter @Setter private int ioi02bInterfaceAddr;

								@Getter @Setter private int ioi02bInterfacePtr;

								@Getter @Setter private int ioi02bJournalAddr;

								@Getter @Setter private int ioi02bJournalPtr;
	
	/**
	* Constructor for Ioi02bReserveArea
	**/
    public Ioi02bReserveArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ioi02bReserveArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ioi02bReserveArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  

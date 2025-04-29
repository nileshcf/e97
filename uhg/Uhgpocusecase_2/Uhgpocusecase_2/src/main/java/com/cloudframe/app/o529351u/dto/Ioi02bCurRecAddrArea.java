package com.cloudframe.app.o529351u.dto;

/**
*  The class Ioi02bCurRecAddrArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ioi02bCurRecAddrArea extends Ioi02bCurRecAddrAreaSerialized { 
   

								@Getter @Setter private int ioi02bRelRecNum;

								@Getter @Setter private int ioi02bRelBlkNum;
	
	/**
	* Constructor for Ioi02bCurRecAddrArea
	**/
    public Ioi02bCurRecAddrArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ioi02bCurRecAddrArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ioi02bCurRecAddrArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  

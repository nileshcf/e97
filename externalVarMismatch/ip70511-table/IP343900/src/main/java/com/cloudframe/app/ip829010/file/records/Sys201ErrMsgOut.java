package com.cloudframe.app.ip829010.file.records;

/**
*  The class Sys201ErrMsgOut is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys201ErrMsgOut extends Sys201ErrMsgOutSerialized {
   

						@Getter @Setter private char[] sys201ErrMsgOutString = Field.fillLowValue(280);
	
	/**
	* Constructor for Sys201ErrMsgOut
	**/
    public Sys201ErrMsgOut() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

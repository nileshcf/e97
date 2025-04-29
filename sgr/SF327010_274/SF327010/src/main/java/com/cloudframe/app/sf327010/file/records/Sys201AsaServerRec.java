package com.cloudframe.app.sf327010.file.records;

/**
*  The class Sys201AsaServerRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys201AsaServerRec extends Sys201AsaServerRecSerialized {
   

						@Getter @Setter private char[] sys201AsaServerRecString = Field.fillLowValue(132);
	
	/**
	* Constructor for Sys201AsaServerRec
	**/
    public Sys201AsaServerRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

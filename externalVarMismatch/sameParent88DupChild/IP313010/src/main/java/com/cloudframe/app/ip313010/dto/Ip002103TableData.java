package com.cloudframe.app.ip313010.dto;

/**
*  The class Ip002103TableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip002103TableData extends Ip002103TableDataSerialized {
   

								@Getter @Setter private int ip002103OldElementType;

								@Getter @Setter private int ip002103OldElementNo;

								@Getter @Setter private int ip002103OldSubfldNo;

								@Getter @Setter private int ip002103NewElementType;

								@Getter @Setter private int ip002103NewElementNo;

								@Getter @Setter private int ip002103NewSubfldNo;

						@Getter @Setter private char[] ip002103Justified = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip002103TableData
	**/
    public Ip002103TableData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

package com.cloudframe.app.crntof.dto;

/**
*  The class CrntofTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CrntofTable extends CrntofTableSerialized {
   

						@Getter @Setter private char[] crntofId = Field.fillLowValue(4);

						@Getter @Setter private char[] crntofName01 = Field.fillLowValue(6);

								@Getter @Setter private short crntofNameN;
	
	/**
	* Constructor for CrntofTable
	**/
    public CrntofTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCrntofNameN((short)0);
    }





}
  

package com.cloudframe.app.init2.dto;

/**
*  The class L6560ParmInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:27. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class L6560ParmInfo extends L6560ParmInfoSerialized {
   
				@Getter @Setter private L6560InputParmInfo l6560InputParmInfo = new L6560InputParmInfo();

						@Getter @Setter private char[] l6560IoParmInfo = Field.fillLowValue(25);
				@Getter @Setter private L6560OutputParmInfo l6560OutputParmInfo = new L6560OutputParmInfo();
	
	/**
	* Constructor for L6560ParmInfo
	**/
    public L6560ParmInfo() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getL6560InputParmInfo().setParent(this,getStartOffset() + 0);
					getL6560OutputParmInfo().setParent(this,getStartOffset() + 157);
	   	/*  end of offset */
    }





}
  

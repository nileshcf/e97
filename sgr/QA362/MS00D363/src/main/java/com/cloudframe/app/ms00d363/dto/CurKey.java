package com.cloudframe.app.ms00d363.dto;

/**
*  The class CurKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CurKey extends CurKeySerialized {
   

								@Getter @Setter private long curProcId;

						@Getter @Setter private char[] curInterType = Field.fillLowValue(1);

						@Getter @Setter private char[] curInstId = Field.fillLowValue(10);

						@Getter @Setter private char[] curBinId = Field.fillLowValue(11);

						@Getter @Setter private char[] curCntry = Field.fillLowValue(3);

						@Getter @Setter private char[] curCurrency = Field.fillLowValue(3);

						@Getter @Setter private char[] curExponent = Field.fillLowValue(1);

						@Getter @Setter private char[] curSettServId = Field.fillLowValue(3);

								@Getter @Setter private long curIca;

						@Getter @Setter private char[] curIsisAgreeNum = Field.fillLowValue(4);
	
	/**
	* Constructor for CurKey
	**/
    public CurKey() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

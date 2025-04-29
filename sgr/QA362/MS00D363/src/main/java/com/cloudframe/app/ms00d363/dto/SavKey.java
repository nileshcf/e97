package com.cloudframe.app.ms00d363.dto;

/**
*  The class SavKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SavKey extends SavKeySerialized {
   

								@Getter @Setter private long savProcId;

						@Getter @Setter private char[] savInterType = Field.fillLowValue(1);

						@Getter @Setter private char[] savInstId = Field.fillLowValue(10);

						@Getter @Setter private char[] savBinId = Field.fillLowValue(11);

						@Getter @Setter private char[] savCntry = Field.fillLowValue(3);

						@Getter @Setter private char[] savCurrency = Field.fillLowValue(3);

						@Getter @Setter private char[] savExponent = Field.fillLowValue(1);

						@Getter @Setter private char[] savSettServId = Field.fillLowValue(3);

								@Getter @Setter private long savIca;

						@Getter @Setter private char[] savIsisAgreeNum = Field.fillLowValue(4);
	
	/**
	* Constructor for SavKey
	**/
    public SavKey() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

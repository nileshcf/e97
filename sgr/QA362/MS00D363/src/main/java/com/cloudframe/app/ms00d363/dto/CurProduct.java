package com.cloudframe.app.ms00d363.dto;

/**
*  The class CurProduct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CurProduct extends CurProductSerialized {
   

								@Getter @Setter private long currProcId;

						@Getter @Setter private char[] currInterType = Field.fillLowValue(1);

						@Getter @Setter private char[] currInstId = Field.fillLowValue(10);

						@Getter @Setter private char[] currBinId = Field.fillLowValue(11);

						@Getter @Setter private char[] currCntry = Field.fillLowValue(3);

						@Getter @Setter private char[] currCurrency = Field.fillLowValue(3);

						@Getter @Setter private char[] currExponent = Field.fillLowValue(1);

						@Getter @Setter private char[] currSettServId = Field.fillLowValue(3);

								@Getter @Setter private long currIca;

						@Getter @Setter private char[] currIsisAgreeNum = Field.fillLowValue(4);

								@Getter @Setter private int currProd;
	
	/**
	* Constructor for CurProduct
	**/
    public CurProduct() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

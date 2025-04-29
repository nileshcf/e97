package com.cloudframe.app.ms00d363.dto;

/**
*  The class SavProduct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SavProduct extends SavProductSerialized {
   

								@Getter @Setter private long saveProcId;

						@Getter @Setter private char[] saveInterType = Field.fillLowValue(1);

						@Getter @Setter private char[] saveInstId = Field.fillLowValue(10);

						@Getter @Setter private char[] saveBinId = Field.fillLowValue(11);

						@Getter @Setter private char[] saveCntry = Field.fillLowValue(3);

						@Getter @Setter private char[] saveCurrency = Field.fillLowValue(3);

						@Getter @Setter private char[] saveExponent = Field.fillLowValue(1);

						@Getter @Setter private char[] saveSettServId = Field.fillLowValue(3);

								@Getter @Setter private long saveIca;

						@Getter @Setter private char[] saveIsisAgreeNum = Field.fillLowValue(4);

								@Getter @Setter private int saveProd;
	
	/**
	* Constructor for SavProduct
	**/
    public SavProduct() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

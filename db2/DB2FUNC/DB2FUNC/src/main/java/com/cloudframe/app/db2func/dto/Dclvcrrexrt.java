package com.cloudframe.app.db2func.dto;

/**
*  The class Dclvcrrexrt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


@Data
public class Dclvcrrexrt extends DclvcrrexrtSerialized {
   

						@Getter @Setter private char[] currencyCd = Field.fillLowValue(2);

								@Getter @Setter private BigDecimal exchangeRateAmt;
	
	/**
	* Constructor for Dclvcrrexrt
	**/
    public Dclvcrrexrt() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

package com.cloudframe.app.cobpgmor.dto;

/**
*  The class HvErec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


@Data
public class HvErec extends HvErecSerialized {
   

								@Getter @Setter private short hvEno;

						@Getter @Setter private char[] hvEname = Field.fillLowValue(15);

						@Getter @Setter private char[] hvEadd = Field.fillLowValue(20);

								@Getter @Setter private BigDecimal hvEsal = BigDecimal.ZERO;

						@Getter @Setter private char[] hvEdoj = Field.fillLowValue(10);
	
	/**
	* Constructor for HvErec
	**/
    public HvErec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

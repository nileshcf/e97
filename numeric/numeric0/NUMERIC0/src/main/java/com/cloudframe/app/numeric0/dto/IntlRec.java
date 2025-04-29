package com.cloudframe.app.numeric0.dto;

/**
*  The class IntlRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;


@Data
public class IntlRec extends IntlRecSerialized {
   

								@Getter @Setter private BigDecimal intlRateAmount = BigDecimal.ZERO;
	
	/**
	* Constructor for IntlRec
	**/
    public IntlRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

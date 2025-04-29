package com.cloudframe.app.numeric0.dto;

/**
*  The class C584HbEqupSurchageOcc06 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;


@Data
public class C584HbEqupSurchageOcc06 extends C584HbEqupSurchageOcc06Serialized {
   

								@Getter @Setter private BigDecimal c584HbTotVzwSurchgAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal c584HbFusfRate = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal c584HbRegulatoryCharg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal c584HbVzwAdminChgAmt = BigDecimal.ZERO;
	
	/**
	* Constructor for C584HbEqupSurchageOcc06
	**/
    public C584HbEqupSurchageOcc06() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

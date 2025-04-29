package com.cloudframe.app.numeric0.dto;

/**
*  The class C586HbEqupSurchageOcc06 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;


@Data
public class C586HbEqupSurchageOcc06 extends C586HbEqupSurchageOcc06Serialized {
   

								@Getter @Setter private BigDecimal c586HbTotVzwSurchgAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal c586HbFusfRate = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal c586HbRegulatoryCharg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal c586HbVzwAdminChgAmt = BigDecimal.ZERO;
	
	/**
	* Constructor for C586HbEqupSurchageOcc06
	**/
    public C586HbEqupSurchageOcc06() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

package com.cloudframe.app.numeric0.dto;

/**
*  The class C588HbEqupSurchageOcc06 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;


@Data
public class C588HbEqupSurchageOcc06 extends C588HbEqupSurchageOcc06Serialized {
   

								@Getter @Setter private BigDecimal c588HbTotVzwSurchgAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal c588HbFusfRate = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal c588HbRegulatoryCharg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal c588HbVzwAdminChgAmt = BigDecimal.ZERO;
	
	/**
	* Constructor for C588HbEqupSurchageOcc06
	**/
    public C588HbEqupSurchageOcc06() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

package com.cloudframe.app.numeric0.dto;

/**
*  The class MainHbEqupSurchageOcc06 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;


@Data
public class MainHbEqupSurchageOcc06 extends MainHbEqupSurchageOcc06Serialized {
   

								@Getter @Setter private BigDecimal mainHbTotVzwSurchgAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal mainHbFusfRate = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal mainHbRegulatoryCharg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal mainHbVzwAdminChgAmt = BigDecimal.ZERO;
	
	/**
	* Constructor for MainHbEqupSurchageOcc06
	**/
    public MainHbEqupSurchageOcc06() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

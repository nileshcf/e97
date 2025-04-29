package com.cloudframe.app.comput5.dto;

/**
*  The class WtExposureDetails is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class WtExposureDetails extends WtExposureDetailsSerialized { 
   

								@Getter @Setter private BigDecimal wtExposure = BigDecimal.ZERO;
	
	/**
	* Constructor for WtExposureDetails
	**/
    public WtExposureDetails() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WtExposureDetails. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WtExposureDetails(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  

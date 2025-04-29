package com.cloudframe.app.ms00d363.file.records;

/**
*  The class SwchAccumFields300010 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class SwchAccumFields300010 extends SwchAccumFields300010Serialized { 
   

								@Getter @Setter private BigDecimal swchPaymentPartyAmt300010 = BigDecimal.ZERO;
	
	/**
	* Constructor for SwchAccumFields300010
	**/
    public SwchAccumFields300010() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SwchAccumFields300010. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SwchAccumFields300010(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  

package com.cloudframe.app.comput5.dto;

/**
*  The class WlilhMrTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


@Data
public class WlilhMrTbl extends WlilhMrTblSerialized { 
   

						@Getter @Setter private char[] wlilhMrTblPayInd = Field.fillLowValue(1);

								@Getter @Setter private BigDecimal wlilhMrTblLoanAmt = BigDecimal.ZERO;
	
	/**
	* Constructor for WlilhMrTbl
	**/
    public WlilhMrTbl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WlilhMrTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WlilhMrTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  

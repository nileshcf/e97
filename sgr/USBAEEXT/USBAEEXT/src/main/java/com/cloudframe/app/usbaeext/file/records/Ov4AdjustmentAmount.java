package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Ov4AdjustmentAmount is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


@Data
public class Ov4AdjustmentAmount extends Ov4AdjustmentAmountSerialized { 
   

						@Getter @Setter private char[] ov4AdjSign = Field.fillLowValue(1);

								@Getter @Setter private BigDecimal ov4AdjAmnt = BigDecimal.ZERO;
	
	/**
	* Constructor for Ov4AdjustmentAmount
	**/
    public Ov4AdjustmentAmount() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ov4AdjustmentAmount. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4AdjustmentAmount(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  

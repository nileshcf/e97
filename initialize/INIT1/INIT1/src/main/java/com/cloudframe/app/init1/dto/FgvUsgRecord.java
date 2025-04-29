package com.cloudframe.app.init1.dto;

/**
*  The class FgvUsgRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class FgvUsgRecord extends FgvUsgRecordSerialized { 
   

								@Getter @Setter private int fgvTotalAlwUsg;

								@Getter @Setter private int fgvEdpAcctThrshold;

								@Getter @Setter private BigDecimal fgvAcctUsgThrshold = BigDecimal.ZERO;
	
	/**
	* Constructor for FgvUsgRecord
	**/
    public FgvUsgRecord() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FgvUsgRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FgvUsgRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes FgvUsgRecord
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setFgvTotalAlwUsg(0);
                     setFgvEdpAcctThrshold(0);
			setFgvAcctUsgThrshold(BigDecimal.ZERO);
   }


}
  

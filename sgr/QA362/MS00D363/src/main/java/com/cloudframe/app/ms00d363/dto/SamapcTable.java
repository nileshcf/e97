package com.cloudframe.app.ms00d363.dto;

/**
*  The class SamapcTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class SamapcTable extends SamapcTableSerialized { 
   

						@Getter @Setter private char[] apcIca = Field.fillLowValue(6);

								@Getter @Setter private BigDecimal apcAmt = BigDecimal.ZERO;

						@Getter @Setter private char[] dbCrInd = Field.fillLowValue(1);
	
	/**
	* Constructor for SamapcTable
	**/
    public SamapcTable() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SamapcTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SamapcTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes SamapcTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setApcIca(CONSTANTS.SPACE_6);
			setApcAmt(BigDecimal.ZERO);
         setDbCrInd(CONSTANTS.SPACE);
   }


}
  

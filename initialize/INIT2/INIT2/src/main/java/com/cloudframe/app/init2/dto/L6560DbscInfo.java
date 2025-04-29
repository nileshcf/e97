package com.cloudframe.app.init2.dto;

/**
*  The class L6560DbscInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:27. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class L6560DbscInfo extends L6560DbscInfoSerialized { 
   

						@Getter @Setter private char[] l6560DbscApplicableInd = Field.fillLowValue(1);

								@Getter @Setter private BigDecimal l6560DbscTotSurrAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal l6560DbscTotChrgAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal l6560DbscTotFreeAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal l6560DbscAssSurrAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal l6560DbscAssChrgAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal l6560DbscAssFreeAmt = BigDecimal.ZERO;

						@Getter @Setter private char[] l6560PlanFndTypCd = Field.fillLowValue(1);
	
	/**
	* Constructor for L6560DbscInfo
	**/
    public L6560DbscInfo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for L6560DbscInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public L6560DbscInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes L6560DbscInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setL6560DbscApplicableInd(CONSTANTS.SPACE);
			setL6560DbscTotSurrAmt(BigDecimal.ZERO);
			setL6560DbscTotChrgAmt(BigDecimal.ZERO);
			setL6560DbscTotFreeAmt(BigDecimal.ZERO);
			setL6560DbscAssSurrAmt(BigDecimal.ZERO);
			setL6560DbscAssChrgAmt(BigDecimal.ZERO);
			setL6560DbscAssFreeAmt(BigDecimal.ZERO);
         setL6560PlanFndTypCd(CONSTANTS.SPACE);
   }


}
  

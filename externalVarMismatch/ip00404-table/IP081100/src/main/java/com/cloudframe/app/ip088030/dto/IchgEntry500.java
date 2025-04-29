package com.cloudframe.app.ip088030.dto;

/**
*  The class IchgEntry500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


@Data
public class IchgEntry500 extends IchgEntry500Serialized { 
   

						@Getter @Setter private char[] recType500 = Field.fillLowValue(1);

								@Getter @Setter private BigDecimal txnLowAmt500 = BigDecimal.ZERO;

								@Getter @Setter private long txnLowAmtU500;

								@Getter @Setter private BigDecimal txnHighAmt500 = BigDecimal.ZERO;

								@Getter @Setter private long txnHighAmtU500;

						@Getter @Setter private char[] mcc500 = Field.fillLowValue(4);

						@Getter @Setter private char[] maid500 = Field.fillLowValue(6);

						@Getter @Setter private char[] prodId500 = Field.fillLowValue(3);

								@Getter @Setter private BigDecimal viaRate500 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal fiaAmt500 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal minAmt500 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal maxAmt500 = BigDecimal.ZERO;
	
	/**
	* Constructor for IchgEntry500
	**/
    public IchgEntry500() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for IchgEntry500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IchgEntry500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  

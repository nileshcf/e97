package com.cloudframe.app.ip088030.file.records;

/**
*  The class Sys002CntlIchgRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


@Data
public class Sys002CntlIchgRec extends Sys002CntlIchgRecSerialized {
   

						@Getter @Setter private char[] ip98153RecType = Field.fillLowValue(1);

								@Getter @Setter private BigDecimal ip98153TxnLowAmt = BigDecimal.ZERO;

								@Getter @Setter private long ip98153TxnLowAmtU;

								@Getter @Setter private BigDecimal ip98153TxnHighAmt = BigDecimal.ZERO;

								@Getter @Setter private long ip98153TxnHighAmtU;
	
	/**
	* Constructor for Sys002CntlIchgRec
	**/
    public Sys002CntlIchgRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

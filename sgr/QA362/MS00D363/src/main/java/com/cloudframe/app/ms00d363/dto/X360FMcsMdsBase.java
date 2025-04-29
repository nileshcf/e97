package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FMcsMdsBase is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class X360FMcsMdsBase extends X360FMcsMdsBaseSerialized { 
   

								@Getter @Setter private long x360FMcsMdsReqAmt;

								@Getter @Setter private long x360FMcsMdsCmpAmt;

								@Getter @Setter private long x360FMcsMdsCnvRteBse;

								@Getter @Setter private long x360FMcsMdsMccrAmt;

								@Getter @Setter private long x360FMcsMdsCnvMccr;

								@Getter @Setter private long x360FMcsMdsIccrAmt;

								@Getter @Setter private long x360FMcsMdsCnvIccr;

								@Getter @Setter private long x360FBaseIfeeAmtIssCr;

								@Getter @Setter private long x360FBaseIfeeAmtIssDb;

								@Getter @Setter private BigDecimal x360FBseToLocRate = BigDecimal.ZERO;

								@Getter @Setter private long x360FBaseIfeeAmtAcqCr;

								@Getter @Setter private long x360FBaseIfeeAmtAcqDb;

								@Getter @Setter private long x360FAcqIssDeniedAmt;

	
	/**
	* Constructor for X360FMcsMdsBase
	**/
    public X360FMcsMdsBase() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360FMcsMdsBase. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FMcsMdsBase(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  

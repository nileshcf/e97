package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360AMcsMdsBase is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class X360AMcsMdsBase extends X360AMcsMdsBaseSerialized { 
   

								@Getter @Setter private long x360AMcsMdsOrgReq;

								@Getter @Setter private long x360AMcsMdsOrgAmt;

								@Getter @Setter private long x360AMcsMdsNewAmt;

								@Getter @Setter private long x360AMcsMdsAdjAdjAmtCr;

								@Getter @Setter private long x360AMcsMdsAdjAdjAmtDb;

								@Getter @Setter private long x360AMcsMdsCnvRte;

								@Getter @Setter private long x360AMcsMdsMccrAmt;

								@Getter @Setter private long x360AMcsMdsCnvMccr;

								@Getter @Setter private long x360AMcsMdsIccrAmt;

								@Getter @Setter private long x360AMcsMdsCnvIccr;

								@Getter @Setter private long x360ABaseIfeeAmtIssCr;

								@Getter @Setter private long x360ABaseIfeeAmtIssDb;

								@Getter @Setter private BigDecimal x360ABseToLocRate = BigDecimal.ZERO;

								@Getter @Setter private long x360ABaseIfeeAmtAcqCr;

								@Getter @Setter private long x360ABaseIfeeAmtAcqDb;

								@Getter @Setter private long x360AAcqA09IfeeAmtCr;

								@Getter @Setter private long x360AAcqA09IfeeAmtDb;
	
	/**
	* Constructor for X360AMcsMdsBase
	**/
    public X360AMcsMdsBase() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360AMcsMdsBase. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360AMcsMdsBase(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  

package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FMcsIssSetl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class X360FMcsIssSetl extends X360FMcsIssSetlSerialized { 
   

								@Getter @Setter private int x360FMcsIssApprovedCntCr;

								@Getter @Setter private int x360FMcsIssApprovedCntDb;

								@Getter @Setter private int x360FMcsIssDeniedCntCr;

								@Getter @Setter private int x360FMcsIssDeniedCntDb;

								@Getter @Setter private long x360FMcsIssAmtCr;

								@Getter @Setter private long x360FMcsIssAmtDb;

								@Getter @Setter private long x360FMcsIssCnvRteBse;

								@Getter @Setter private int x360FMcsIssCurrCde;

								@Getter @Setter private long x360FMcsIssCnvRteLoc;


								@Getter @Setter private long x360FMcsIssSetlIca;

								@Getter @Setter private int x360FIssFinIfeeCnt;

								@Getter @Setter private int x360FIssNfIfeeCnt;

								@Getter @Setter private int x360FIssPctIfeeCnt;

								@Getter @Setter private int x360FIssNobillIfeeCnt;

								@Getter @Setter private long x360FIssIfeeAmtCr;

								@Getter @Setter private long x360FIssIfeeAmtDb;

								@Getter @Setter private long x360FIssCmpAmtCr;

								@Getter @Setter private long x360FIssCmpAmtDb;

								@Getter @Setter private long x360FIssbMccrAmtCr;

								@Getter @Setter private long x360FIssbMccrAmtDb;

								@Getter @Setter private long x360FIssbIccrAmtCr;

								@Getter @Setter private long x360FIssbIccrAmtDb;

								@Getter @Setter private int x360FIssSurchrgCntCr;

								@Getter @Setter private int x360FIssSurchrgCntDb;

								@Getter @Setter private BigDecimal x360FIssSurchrgAmtCr = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal x360FIssSurchrgAmtDb = BigDecimal.ZERO;

								@Getter @Setter private long x360FBseIssStlAmtCr;

								@Getter @Setter private long x360FBseIssStlAmtDb;
				@Getter @Setter private X360FWorkOfDate x360FWorkOfDate = new X360FWorkOfDate();
				@Getter @Setter private X360FCurrentDate x360FCurrentDate = new X360FCurrentDate();

								@Getter @Setter private int x360FEccfCntDb;

								@Getter @Setter private long x360FEccfAmtDb;

								@Getter @Setter private int x360FEccfCntCr;

								@Getter @Setter private long x360FEccfAmtCr;

								@Getter @Setter private int x360FaVatIssFinCnt;

	
	/**
	* Constructor for X360FMcsIssSetl
	**/
    public X360FMcsIssSetl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360FMcsIssSetl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FMcsIssSetl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getX360FWorkOfDate().setParent(this,getStartOffset() + 188);
					getX360FCurrentDate().setParent(this,getStartOffset() + 194);
    } 



}
  

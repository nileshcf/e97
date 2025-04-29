package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FMcsAcqSetl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class X360FMcsAcqSetl extends X360FMcsAcqSetlSerialized { 
   

								@Getter @Setter private int x360FMcsAcqApprovedCntCr;

								@Getter @Setter private int x360FMcsAcqApprovedCntDb;

								@Getter @Setter private int x360FMcsAcqDeniedCntCr;

								@Getter @Setter private int x360FMcsAcqDeniedCntDb;

								@Getter @Setter private long x360FMcsAcqAmtCr;

								@Getter @Setter private long x360FMcsAcqAmtDb;

								@Getter @Setter private long x360FMcsAcqCnvRteBse;

								@Getter @Setter private int x360FMcsAcqCurrCde;

								@Getter @Setter private long x360FMcsAcqCnvRteLoc;


								@Getter @Setter private long x360FMcsAcqSetlIca;

								@Getter @Setter private int x360FAcqFinIfeeCnt;

								@Getter @Setter private int x360FAcqNfIfeeCnt;

								@Getter @Setter private int x360FAcqPctIfeeCnt;

								@Getter @Setter private int x360FAcqNobillIfeeCnt;

								@Getter @Setter private long x360FAcqIfeeAmtCr;

								@Getter @Setter private long x360FAcqIfeeAmtDb;

								@Getter @Setter private long x360FAcqCmpAmtCr;

								@Getter @Setter private long x360FAcqCmpAmtDb;

								@Getter @Setter private long x360FAcqMccrAmtCrNotused;

								@Getter @Setter private long x360FAcqMccrAmtDbNotused;

								@Getter @Setter private long x360FAcqIccrAmtCrNotused;

								@Getter @Setter private long x360FAcqIccrAmtDbNotused;

								@Getter @Setter private int x360FAcqSurchrgCntCr;

								@Getter @Setter private int x360FAcqSurchrgCntDb;

								@Getter @Setter private BigDecimal x360FAcqSurchrgAmtCr = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal x360FAcqSurchrgAmtDb = BigDecimal.ZERO;

								@Getter @Setter private long x360FBseAcqStlAmtCr;

								@Getter @Setter private long x360FBseAcqStlAmtDb;
				@Getter @Setter private X360FWorkOfDateFil x360FWorkOfDateFil = new X360FWorkOfDateFil();
				@Getter @Setter private X360FCurrentDateFil x360FCurrentDateFil = new X360FCurrentDateFil();

								@Getter @Setter private int x360FEccfCntDbFil;

								@Getter @Setter private long x360FEccfAmtDbFil;

								@Getter @Setter private int x360FEccfCntCrFil;

								@Getter @Setter private long x360FEccfAmtCrFil;

								@Getter @Setter private int x360FaVatAcqFinCnt;

	
	/**
	* Constructor for X360FMcsAcqSetl
	**/
    public X360FMcsAcqSetl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360FMcsAcqSetl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FMcsAcqSetl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getX360FWorkOfDateFil().setParent(this,getStartOffset() + 188);
					getX360FCurrentDateFil().setParent(this,getStartOffset() + 194);
    } 



}
  

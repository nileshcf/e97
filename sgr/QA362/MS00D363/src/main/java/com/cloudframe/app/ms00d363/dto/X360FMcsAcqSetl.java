package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FMcsAcqSetl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class X360FMcsAcqSetl extends X360FMcsAcqSetlSerialized { 
   

								private int x360FMcsAcqApprovedCntCr;

								private int x360FMcsAcqApprovedCntDb;

								private int x360FMcsAcqDeniedCntCr;

								private int x360FMcsAcqDeniedCntDb;

								private long x360FMcsAcqAmtCr;

								private long x360FMcsAcqAmtDb;

								private long x360FMcsAcqCnvRteBse;

								private int x360FMcsAcqCurrCde;

								private long x360FMcsAcqCnvRteLoc;


								private long x360FMcsAcqSetlIca;

								private int x360FAcqFinIfeeCnt;

								private int x360FAcqNfIfeeCnt;

								private int x360FAcqPctIfeeCnt;

								private int x360FAcqNobillIfeeCnt;

								private long x360FAcqIfeeAmtCr;

								private long x360FAcqIfeeAmtDb;

								private long x360FAcqCmpAmtCr;

								private long x360FAcqCmpAmtDb;

								private long x360FAcqMccrAmtCrNotused;

								private long x360FAcqMccrAmtDbNotused;

								private long x360FAcqIccrAmtCrNotused;

								private long x360FAcqIccrAmtDbNotused;

								private int x360FAcqSurchrgCntCr;

								private int x360FAcqSurchrgCntDb;

								private BigDecimal x360FAcqSurchrgAmtCr = BigDecimal.ZERO;

								private BigDecimal x360FAcqSurchrgAmtDb = BigDecimal.ZERO;

								private long x360FBseAcqStlAmtCr;

								private long x360FBseAcqStlAmtDb;
				private X360FWorkOfDateFil x360FWorkOfDateFil = new X360FWorkOfDateFil();
				private X360FCurrentDateFil x360FCurrentDateFil = new X360FCurrentDateFil();

								private int x360FEccfCntDbFil;

								private long x360FEccfAmtDbFil;

								private int x360FEccfCntCrFil;

								private long x360FEccfAmtCrFil;

								private int x360FaVatAcqFinCnt;

	
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
	       			x360FWorkOfDateFil.setParent(this,getStartOffset() + 188);
	       			x360FCurrentDateFil.setParent(this,getStartOffset() + 194);
    } 

	public int getX360FMcsAcqApprovedCntCr() throws CFException {
        if (isX360FMcsAcqApprovedCntCrModified()) { 
           x360FMcsAcqApprovedCntCr = refreshX360FMcsAcqApprovedCntCr();
        }
   		return x360FMcsAcqApprovedCntCr;
	}
	
	/**
	 * 	Update X360FMcsAcqApprovedCntCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-ACQ-APPROVED-CNT-CR
	 *	@param number
	 */
	public void setX360FMcsAcqApprovedCntCr(int number) {
			x360FMcsAcqApprovedCntCr = checkX360FMcsAcqApprovedCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FMcsAcqApprovedCntCr(x360FMcsAcqApprovedCntCr);
	}


	public void setX360FMcsAcqApprovedCntCr(long number) {
	    number = checkX360FMcsAcqApprovedCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FMcsAcqApprovedCntCr((int)number);
	}
	
	public int getX360FMcsAcqApprovedCntDb() throws CFException {
        if (isX360FMcsAcqApprovedCntDbModified()) { 
           x360FMcsAcqApprovedCntDb = refreshX360FMcsAcqApprovedCntDb();
        }
   		return x360FMcsAcqApprovedCntDb;
	}
	
	/**
	 * 	Update X360FMcsAcqApprovedCntDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-ACQ-APPROVED-CNT-DB
	 *	@param number
	 */
	public void setX360FMcsAcqApprovedCntDb(int number) {
			x360FMcsAcqApprovedCntDb = checkX360FMcsAcqApprovedCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FMcsAcqApprovedCntDb(x360FMcsAcqApprovedCntDb);
	}


	public void setX360FMcsAcqApprovedCntDb(long number) {
	    number = checkX360FMcsAcqApprovedCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FMcsAcqApprovedCntDb((int)number);
	}
	
	public int getX360FMcsAcqDeniedCntCr() throws CFException {
        if (isX360FMcsAcqDeniedCntCrModified()) { 
           x360FMcsAcqDeniedCntCr = refreshX360FMcsAcqDeniedCntCr();
        }
   		return x360FMcsAcqDeniedCntCr;
	}
	
	/**
	 * 	Update X360FMcsAcqDeniedCntCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-ACQ-DENIED-CNT-CR
	 *	@param number
	 */
	public void setX360FMcsAcqDeniedCntCr(int number) {
			x360FMcsAcqDeniedCntCr = checkX360FMcsAcqDeniedCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FMcsAcqDeniedCntCr(x360FMcsAcqDeniedCntCr);
	}


	public void setX360FMcsAcqDeniedCntCr(long number) {
	    number = checkX360FMcsAcqDeniedCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FMcsAcqDeniedCntCr((int)number);
	}
	
	public int getX360FMcsAcqDeniedCntDb() throws CFException {
        if (isX360FMcsAcqDeniedCntDbModified()) { 
           x360FMcsAcqDeniedCntDb = refreshX360FMcsAcqDeniedCntDb();
        }
   		return x360FMcsAcqDeniedCntDb;
	}
	
	/**
	 * 	Update X360FMcsAcqDeniedCntDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-ACQ-DENIED-CNT-DB
	 *	@param number
	 */
	public void setX360FMcsAcqDeniedCntDb(int number) {
			x360FMcsAcqDeniedCntDb = checkX360FMcsAcqDeniedCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FMcsAcqDeniedCntDb(x360FMcsAcqDeniedCntDb);
	}


	public void setX360FMcsAcqDeniedCntDb(long number) {
	    number = checkX360FMcsAcqDeniedCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FMcsAcqDeniedCntDb((int)number);
	}
	
	public long getX360FMcsAcqAmtCr() throws CFException {
        if (isX360FMcsAcqAmtCrModified()) { 
           x360FMcsAcqAmtCr = refreshX360FMcsAcqAmtCr();
        }
   		return x360FMcsAcqAmtCr;
	}
	
	/**
	 * 	Update X360FMcsAcqAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-ACQ-AMT-CR
	 *	@param number
	 */
	public void setX360FMcsAcqAmtCr(long number) {
			x360FMcsAcqAmtCr = checkX360FMcsAcqAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FMcsAcqAmtCr(x360FMcsAcqAmtCr);
	}


	public long getX360FMcsAcqAmtDb() throws CFException {
        if (isX360FMcsAcqAmtDbModified()) { 
           x360FMcsAcqAmtDb = refreshX360FMcsAcqAmtDb();
        }
   		return x360FMcsAcqAmtDb;
	}
	
	/**
	 * 	Update X360FMcsAcqAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-ACQ-AMT-DB
	 *	@param number
	 */
	public void setX360FMcsAcqAmtDb(long number) {
			x360FMcsAcqAmtDb = checkX360FMcsAcqAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FMcsAcqAmtDb(x360FMcsAcqAmtDb);
	}


	/**
	 *	Returns the value of x360FMcsAcqCnvRteBse
	 *	@return x360FMcsAcqCnvRteBse
	 */
	public long getX360FMcsAcqCnvRteBse() throws CFException {
       if (isX360FMcsAcqCnvRteBseModified()) { 
           x360FMcsAcqCnvRteBse = refreshX360FMcsAcqCnvRteBse();
        }
   		return x360FMcsAcqCnvRteBse;
	}
	

	
	   
	/**
	 * 	Update X360FMcsAcqCnvRteBse with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-ACQ-CNV-RTE-BSE
	 *	@param number
	 */
	public void setX360FMcsAcqCnvRteBse(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FMcsAcqCnvRteBse = checkX360FMcsAcqCnvRteBseMaxLimit(number); 
		serializeX360FMcsAcqCnvRteBse(x360FMcsAcqCnvRteBse);
	}
	

	/**
	 * 	Update X360FMcsAcqCnvRteBse with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FMcsAcqCnvRteBse(char[] value) throws CFException {
		 x360FMcsAcqCnvRteBse = serializeX360FMcsAcqCnvRteBse(value);
	}
	/**
	 * 	Update X360FMcsAcqCnvRteBse with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FMcsAcqCnvRteBseString(char[] value) throws CFException {
		 setX360FMcsAcqCnvRteBse(value);
	}
	/**
	 *	Returns the value of x360FMcsAcqCurrCde
	 *	@return x360FMcsAcqCurrCde
	 */
	public int getX360FMcsAcqCurrCde() throws CFException {
       if (isX360FMcsAcqCurrCdeModified()) { 
           x360FMcsAcqCurrCde = refreshX360FMcsAcqCurrCde();
        }
   		return x360FMcsAcqCurrCde;
	}
	

	
	   
	/**
	 * 	Update X360FMcsAcqCurrCde with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-ACQ-CURR-CDE
	 *	@param number
	 */
	public void setX360FMcsAcqCurrCde(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FMcsAcqCurrCde = checkX360FMcsAcqCurrCdeMaxLimit(number); 
		serializeX360FMcsAcqCurrCde(x360FMcsAcqCurrCde);
	}
	

	public void setX360FMcsAcqCurrCde(long number) {
	    number = checkX360FMcsAcqCurrCdeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FMcsAcqCurrCde((int)number);
	}
	
	/**
	 * 	Update X360FMcsAcqCurrCde with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FMcsAcqCurrCde(char[] value) throws CFException {
		 x360FMcsAcqCurrCde = serializeX360FMcsAcqCurrCde(value);
	}
	/**
	 * 	Update X360FMcsAcqCurrCde with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FMcsAcqCurrCdeString(char[] value) throws CFException {
		 setX360FMcsAcqCurrCde(value);
	}
	/**
	 *	Returns the value of x360FMcsAcqCnvRteLoc
	 *	@return x360FMcsAcqCnvRteLoc
	 */
	public long getX360FMcsAcqCnvRteLoc() throws CFException {
       if (isX360FMcsAcqCnvRteLocModified()) { 
           x360FMcsAcqCnvRteLoc = refreshX360FMcsAcqCnvRteLoc();
        }
   		return x360FMcsAcqCnvRteLoc;
	}
	

	
	   
	/**
	 * 	Update X360FMcsAcqCnvRteLoc with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-ACQ-CNV-RTE-LOC
	 *	@param number
	 */
	public void setX360FMcsAcqCnvRteLoc(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FMcsAcqCnvRteLoc = checkX360FMcsAcqCnvRteLocMaxLimit(number); 
		serializeX360FMcsAcqCnvRteLoc(x360FMcsAcqCnvRteLoc);
	}
	

	/**
	 * 	Update X360FMcsAcqCnvRteLoc with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FMcsAcqCnvRteLoc(char[] value) throws CFException {
		 x360FMcsAcqCnvRteLoc = serializeX360FMcsAcqCnvRteLoc(value);
	}
	/**
	 * 	Update X360FMcsAcqCnvRteLoc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FMcsAcqCnvRteLocString(char[] value) throws CFException {
		 setX360FMcsAcqCnvRteLoc(value);
	}
	/**
	 *	Returns the value of x360FMcsAcqSetlIca
	 *	@return x360FMcsAcqSetlIca
	 */
	public long getX360FMcsAcqSetlIca() throws CFException {
       if (isX360FMcsAcqSetlIcaModified()) { 
           x360FMcsAcqSetlIca = refreshX360FMcsAcqSetlIca();
        }
   		return x360FMcsAcqSetlIca;
	}
	

	
	   
	/**
	 * 	Update X360FMcsAcqSetlIca with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-ACQ-SETL-ICA
	 *	@param number
	 */
	public void setX360FMcsAcqSetlIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FMcsAcqSetlIca = checkX360FMcsAcqSetlIcaMaxLimit(number); 
		serializeX360FMcsAcqSetlIca(x360FMcsAcqSetlIca);
	}
	

	/**
	 * 	Update X360FMcsAcqSetlIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FMcsAcqSetlIca(char[] value) throws CFException {
		 x360FMcsAcqSetlIca = serializeX360FMcsAcqSetlIca(value);
	}
	/**
	 * 	Update X360FMcsAcqSetlIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FMcsAcqSetlIcaString(char[] value) throws CFException {
		 setX360FMcsAcqSetlIca(value);
	}
	public int getX360FAcqFinIfeeCnt() throws CFException {
        if (isX360FAcqFinIfeeCntModified()) { 
           x360FAcqFinIfeeCnt = refreshX360FAcqFinIfeeCnt();
        }
   		return x360FAcqFinIfeeCnt;
	}
	
	/**
	 * 	Update X360FAcqFinIfeeCnt with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-FIN-IFEE-CNT
	 *	@param number
	 */
	public void setX360FAcqFinIfeeCnt(int number) {
			x360FAcqFinIfeeCnt = checkX360FAcqFinIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqFinIfeeCnt(x360FAcqFinIfeeCnt);
	}


	public void setX360FAcqFinIfeeCnt(long number) {
	    number = checkX360FAcqFinIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FAcqFinIfeeCnt((int)number);
	}
	
	public int getX360FAcqNfIfeeCnt() throws CFException {
        if (isX360FAcqNfIfeeCntModified()) { 
           x360FAcqNfIfeeCnt = refreshX360FAcqNfIfeeCnt();
        }
   		return x360FAcqNfIfeeCnt;
	}
	
	/**
	 * 	Update X360FAcqNfIfeeCnt with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-NF-IFEE-CNT
	 *	@param number
	 */
	public void setX360FAcqNfIfeeCnt(int number) {
			x360FAcqNfIfeeCnt = checkX360FAcqNfIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqNfIfeeCnt(x360FAcqNfIfeeCnt);
	}


	public void setX360FAcqNfIfeeCnt(long number) {
	    number = checkX360FAcqNfIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FAcqNfIfeeCnt((int)number);
	}
	
	public int getX360FAcqPctIfeeCnt() throws CFException {
        if (isX360FAcqPctIfeeCntModified()) { 
           x360FAcqPctIfeeCnt = refreshX360FAcqPctIfeeCnt();
        }
   		return x360FAcqPctIfeeCnt;
	}
	
	/**
	 * 	Update X360FAcqPctIfeeCnt with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-PCT-IFEE-CNT
	 *	@param number
	 */
	public void setX360FAcqPctIfeeCnt(int number) {
			x360FAcqPctIfeeCnt = checkX360FAcqPctIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqPctIfeeCnt(x360FAcqPctIfeeCnt);
	}


	public void setX360FAcqPctIfeeCnt(long number) {
	    number = checkX360FAcqPctIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FAcqPctIfeeCnt((int)number);
	}
	
	public int getX360FAcqNobillIfeeCnt() throws CFException {
        if (isX360FAcqNobillIfeeCntModified()) { 
           x360FAcqNobillIfeeCnt = refreshX360FAcqNobillIfeeCnt();
        }
   		return x360FAcqNobillIfeeCnt;
	}
	
	/**
	 * 	Update X360FAcqNobillIfeeCnt with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-NOBILL-IFEE-CNT
	 *	@param number
	 */
	public void setX360FAcqNobillIfeeCnt(int number) {
			x360FAcqNobillIfeeCnt = checkX360FAcqNobillIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqNobillIfeeCnt(x360FAcqNobillIfeeCnt);
	}


	public void setX360FAcqNobillIfeeCnt(long number) {
	    number = checkX360FAcqNobillIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FAcqNobillIfeeCnt((int)number);
	}
	
	public long getX360FAcqIfeeAmtCr() throws CFException {
        if (isX360FAcqIfeeAmtCrModified()) { 
           x360FAcqIfeeAmtCr = refreshX360FAcqIfeeAmtCr();
        }
   		return x360FAcqIfeeAmtCr;
	}
	
	/**
	 * 	Update X360FAcqIfeeAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-IFEE-AMT-CR
	 *	@param number
	 */
	public void setX360FAcqIfeeAmtCr(long number) {
			x360FAcqIfeeAmtCr = checkX360FAcqIfeeAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqIfeeAmtCr(x360FAcqIfeeAmtCr);
	}


	public long getX360FAcqIfeeAmtDb() throws CFException {
        if (isX360FAcqIfeeAmtDbModified()) { 
           x360FAcqIfeeAmtDb = refreshX360FAcqIfeeAmtDb();
        }
   		return x360FAcqIfeeAmtDb;
	}
	
	/**
	 * 	Update X360FAcqIfeeAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-IFEE-AMT-DB
	 *	@param number
	 */
	public void setX360FAcqIfeeAmtDb(long number) {
			x360FAcqIfeeAmtDb = checkX360FAcqIfeeAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqIfeeAmtDb(x360FAcqIfeeAmtDb);
	}


	public long getX360FAcqCmpAmtCr() throws CFException {
        if (isX360FAcqCmpAmtCrModified()) { 
           x360FAcqCmpAmtCr = refreshX360FAcqCmpAmtCr();
        }
   		return x360FAcqCmpAmtCr;
	}
	
	/**
	 * 	Update X360FAcqCmpAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-CMP-AMT-CR
	 *	@param number
	 */
	public void setX360FAcqCmpAmtCr(long number) {
			x360FAcqCmpAmtCr = checkX360FAcqCmpAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqCmpAmtCr(x360FAcqCmpAmtCr);
	}


	public long getX360FAcqCmpAmtDb() throws CFException {
        if (isX360FAcqCmpAmtDbModified()) { 
           x360FAcqCmpAmtDb = refreshX360FAcqCmpAmtDb();
        }
   		return x360FAcqCmpAmtDb;
	}
	
	/**
	 * 	Update X360FAcqCmpAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-CMP-AMT-DB
	 *	@param number
	 */
	public void setX360FAcqCmpAmtDb(long number) {
			x360FAcqCmpAmtDb = checkX360FAcqCmpAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqCmpAmtDb(x360FAcqCmpAmtDb);
	}


	public long getX360FAcqMccrAmtCrNotused() throws CFException {
        if (isX360FAcqMccrAmtCrNotusedModified()) { 
           x360FAcqMccrAmtCrNotused = refreshX360FAcqMccrAmtCrNotused();
        }
   		return x360FAcqMccrAmtCrNotused;
	}
	
	/**
	 * 	Update X360FAcqMccrAmtCrNotused with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-MCCR-AMT-CR-NOTUSED
	 *	@param number
	 */
	public void setX360FAcqMccrAmtCrNotused(long number) {
			x360FAcqMccrAmtCrNotused = checkX360FAcqMccrAmtCrNotusedMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqMccrAmtCrNotused(x360FAcqMccrAmtCrNotused);
	}


	public long getX360FAcqMccrAmtDbNotused() throws CFException {
        if (isX360FAcqMccrAmtDbNotusedModified()) { 
           x360FAcqMccrAmtDbNotused = refreshX360FAcqMccrAmtDbNotused();
        }
   		return x360FAcqMccrAmtDbNotused;
	}
	
	/**
	 * 	Update X360FAcqMccrAmtDbNotused with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-MCCR-AMT-DB-NOTUSED
	 *	@param number
	 */
	public void setX360FAcqMccrAmtDbNotused(long number) {
			x360FAcqMccrAmtDbNotused = checkX360FAcqMccrAmtDbNotusedMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqMccrAmtDbNotused(x360FAcqMccrAmtDbNotused);
	}


	public long getX360FAcqIccrAmtCrNotused() throws CFException {
        if (isX360FAcqIccrAmtCrNotusedModified()) { 
           x360FAcqIccrAmtCrNotused = refreshX360FAcqIccrAmtCrNotused();
        }
   		return x360FAcqIccrAmtCrNotused;
	}
	
	/**
	 * 	Update X360FAcqIccrAmtCrNotused with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-ICCR-AMT-CR-NOTUSED
	 *	@param number
	 */
	public void setX360FAcqIccrAmtCrNotused(long number) {
			x360FAcqIccrAmtCrNotused = checkX360FAcqIccrAmtCrNotusedMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqIccrAmtCrNotused(x360FAcqIccrAmtCrNotused);
	}


	public long getX360FAcqIccrAmtDbNotused() throws CFException {
        if (isX360FAcqIccrAmtDbNotusedModified()) { 
           x360FAcqIccrAmtDbNotused = refreshX360FAcqIccrAmtDbNotused();
        }
   		return x360FAcqIccrAmtDbNotused;
	}
	
	/**
	 * 	Update X360FAcqIccrAmtDbNotused with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-ICCR-AMT-DB-NOTUSED
	 *	@param number
	 */
	public void setX360FAcqIccrAmtDbNotused(long number) {
			x360FAcqIccrAmtDbNotused = checkX360FAcqIccrAmtDbNotusedMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqIccrAmtDbNotused(x360FAcqIccrAmtDbNotused);
	}


	public int getX360FAcqSurchrgCntCr() throws CFException {
        if (isX360FAcqSurchrgCntCrModified()) { 
           x360FAcqSurchrgCntCr = refreshX360FAcqSurchrgCntCr();
        }
   		return x360FAcqSurchrgCntCr;
	}
	
	/**
	 * 	Update X360FAcqSurchrgCntCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-SURCHRG-CNT-CR
	 *	@param number
	 */
	public void setX360FAcqSurchrgCntCr(int number) {
			x360FAcqSurchrgCntCr = checkX360FAcqSurchrgCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqSurchrgCntCr(x360FAcqSurchrgCntCr);
	}


	public void setX360FAcqSurchrgCntCr(long number) {
	    number = checkX360FAcqSurchrgCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FAcqSurchrgCntCr((int)number);
	}
	
	public int getX360FAcqSurchrgCntDb() throws CFException {
        if (isX360FAcqSurchrgCntDbModified()) { 
           x360FAcqSurchrgCntDb = refreshX360FAcqSurchrgCntDb();
        }
   		return x360FAcqSurchrgCntDb;
	}
	
	/**
	 * 	Update X360FAcqSurchrgCntDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-SURCHRG-CNT-DB
	 *	@param number
	 */
	public void setX360FAcqSurchrgCntDb(int number) {
			x360FAcqSurchrgCntDb = checkX360FAcqSurchrgCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqSurchrgCntDb(x360FAcqSurchrgCntDb);
	}


	public void setX360FAcqSurchrgCntDb(long number) {
	    number = checkX360FAcqSurchrgCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FAcqSurchrgCntDb((int)number);
	}
	
	public BigDecimal getX360FAcqSurchrgAmtCr() throws CFException {
        if (isX360FAcqSurchrgAmtCrModified()) { 
           x360FAcqSurchrgAmtCr = refreshX360FAcqSurchrgAmtCr();
        }
   		return x360FAcqSurchrgAmtCr;
	}

    public char[] getX360FAcqSurchrgAmtCrString() {
          return  x360FAcqSurchrgAmtCrString();
    }
	
	/**
	 * 	Update X360FAcqSurchrgAmtCr with the passed number
	 *  Corresponding COBOL Variable is X360-F-ACQ-SURCHRG-AMT-CR
	 *	@param number
	 */
	public void setX360FAcqSurchrgAmtCr(BigDecimal number) {	
     x360FAcqSurchrgAmtCr = checkX360FAcqSurchrgAmtCrMaxLimit(number);
	    serializeX360FAcqSurchrgAmtCr(x360FAcqSurchrgAmtCr);
   }
	public BigDecimal getX360FAcqSurchrgAmtDb() throws CFException {
        if (isX360FAcqSurchrgAmtDbModified()) { 
           x360FAcqSurchrgAmtDb = refreshX360FAcqSurchrgAmtDb();
        }
   		return x360FAcqSurchrgAmtDb;
	}

    public char[] getX360FAcqSurchrgAmtDbString() {
          return  x360FAcqSurchrgAmtDbString();
    }
	
	/**
	 * 	Update X360FAcqSurchrgAmtDb with the passed number
	 *  Corresponding COBOL Variable is X360-F-ACQ-SURCHRG-AMT-DB
	 *	@param number
	 */
	public void setX360FAcqSurchrgAmtDb(BigDecimal number) {	
     x360FAcqSurchrgAmtDb = checkX360FAcqSurchrgAmtDbMaxLimit(number);
	    serializeX360FAcqSurchrgAmtDb(x360FAcqSurchrgAmtDb);
   }
	public long getX360FBseAcqStlAmtCr() throws CFException {
        if (isX360FBseAcqStlAmtCrModified()) { 
           x360FBseAcqStlAmtCr = refreshX360FBseAcqStlAmtCr();
        }
   		return x360FBseAcqStlAmtCr;
	}
	
	/**
	 * 	Update X360FBseAcqStlAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-BSE-ACQ-STL-AMT-CR
	 *	@param number
	 */
	public void setX360FBseAcqStlAmtCr(long number) {
			x360FBseAcqStlAmtCr = checkX360FBseAcqStlAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FBseAcqStlAmtCr(x360FBseAcqStlAmtCr);
	}


	public long getX360FBseAcqStlAmtDb() throws CFException {
        if (isX360FBseAcqStlAmtDbModified()) { 
           x360FBseAcqStlAmtDb = refreshX360FBseAcqStlAmtDb();
        }
   		return x360FBseAcqStlAmtDb;
	}
	
	/**
	 * 	Update X360FBseAcqStlAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-BSE-ACQ-STL-AMT-DB
	 *	@param number
	 */
	public void setX360FBseAcqStlAmtDb(long number) {
			x360FBseAcqStlAmtDb = checkX360FBseAcqStlAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FBseAcqStlAmtDb(x360FBseAcqStlAmtDb);
	}


	/**
	 *	Returns the value of x360FWorkOfDateFil
	 *	@return x360FWorkOfDateFil
	 */   
	 public X360FWorkOfDateFil getX360FWorkOfDateFil() {
   	return x360FWorkOfDateFil;
   }
   /**
	* 	Update X360FWorkOfDateFil with the passed value
	*   Corresponding COBOL Variable is X360-F-WORK-OF-DATE-FIL
	*	@param value
	*/
   public void setX360FWorkOfDateFil(char[] value) {
      x360FWorkOfDateFil.setString(value); 
   }   
    
     /**
	 * 	Update X360FWorkOfDateFil 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360FWorkOfDateFil(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FWorkOfDateFil.begin,x360FWorkOfDateFil.length());
   }
   
     /**
	 * 	Update X360FWorkOfDateFil 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360FWorkOfDateFil(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FWorkOfDateFil.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360FWorkOfDateFil with another Field
	 *	@param value
	 */
   public void setX360FWorkOfDateFil(Field source) {
   	replace(source,0,source.length(),x360FWorkOfDateFil.begin,x360FWorkOfDateFil.length());
   }  
   
     /**
	 * 	Update X360FWorkOfDateFil 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360FWorkOfDateFil(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FWorkOfDateFil.begin,x360FWorkOfDateFil.length());
   }
   
     /**
	 * 	Update X360FWorkOfDateFil 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360FWorkOfDateFil(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FWorkOfDateFil.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360FCurrentDateFil
	 *	@return x360FCurrentDateFil
	 */   
	 public X360FCurrentDateFil getX360FCurrentDateFil() {
   	return x360FCurrentDateFil;
   }
   /**
	* 	Update X360FCurrentDateFil with the passed value
	*   Corresponding COBOL Variable is X360-F-CURRENT-DATE-FIL
	*	@param value
	*/
   public void setX360FCurrentDateFil(char[] value) {
      x360FCurrentDateFil.setString(value); 
   }   
    
     /**
	 * 	Update X360FCurrentDateFil 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360FCurrentDateFil(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FCurrentDateFil.begin,x360FCurrentDateFil.length());
   }
   
     /**
	 * 	Update X360FCurrentDateFil 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360FCurrentDateFil(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FCurrentDateFil.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360FCurrentDateFil with another Field
	 *	@param value
	 */
   public void setX360FCurrentDateFil(Field source) {
   	replace(source,0,source.length(),x360FCurrentDateFil.begin,x360FCurrentDateFil.length());
   }  
   
     /**
	 * 	Update X360FCurrentDateFil 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360FCurrentDateFil(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FCurrentDateFil.begin,x360FCurrentDateFil.length());
   }
   
     /**
	 * 	Update X360FCurrentDateFil 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360FCurrentDateFil(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FCurrentDateFil.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360FEccfCntDbFil
	 *	@return x360FEccfCntDbFil
	 */
	public int getX360FEccfCntDbFil() throws CFException {
       if (isX360FEccfCntDbFilModified()) { 
           x360FEccfCntDbFil = refreshX360FEccfCntDbFil();
        }
   		return x360FEccfCntDbFil;
	}
	

    /**
	 *	Returns the String value of x360FEccfCntDbFil
	 *	@return x360FEccfCntDbFil
	 */
	public char[]  getX360FEccfCntDbFilActualString() {
	    String value = String.valueOf(x360FEccfCntDbFil).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update X360FEccfCntDbFil with the passed value
	 *  Corresponding COBOL Variable is X360-F-ECCF-CNT-DB-FIL
	 *	@param number
	 */
	public void setX360FEccfCntDbFil(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FEccfCntDbFil = checkX360FEccfCntDbFilMaxLimit(number); 
		serializeX360FEccfCntDbFil(x360FEccfCntDbFil);
	}
	

	public void setX360FEccfCntDbFil(long number) {
	    number = checkX360FEccfCntDbFilMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FEccfCntDbFil((int)number);
	}
	
	/**
	 * 	Update X360FEccfCntDbFil with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FEccfCntDbFil(char[] value) throws CFException {
		 x360FEccfCntDbFil = serializeX360FEccfCntDbFil(value);
	}
	/**
	 * 	Update X360FEccfCntDbFil with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FEccfCntDbFilString(char[] value) throws CFException {
		 setX360FEccfCntDbFil(value);
	}
	/**
	 *	Returns the value of x360FEccfAmtDbFil
	 *	@return x360FEccfAmtDbFil
	 */
	public long getX360FEccfAmtDbFil() throws CFException {
       if (isX360FEccfAmtDbFilModified()) { 
           x360FEccfAmtDbFil = refreshX360FEccfAmtDbFil();
        }
   		return x360FEccfAmtDbFil;
	}
	

    /**
	 *	Returns the String value of x360FEccfAmtDbFil
	 *	@return x360FEccfAmtDbFil
	 */
	public char[]  getX360FEccfAmtDbFilActualString() {
	    String value = String.valueOf(x360FEccfAmtDbFil).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update X360FEccfAmtDbFil with the passed value
	 *  Corresponding COBOL Variable is X360-F-ECCF-AMT-DB-FIL
	 *	@param number
	 */
	public void setX360FEccfAmtDbFil(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FEccfAmtDbFil = checkX360FEccfAmtDbFilMaxLimit(number); 
		serializeX360FEccfAmtDbFil(x360FEccfAmtDbFil);
	}
	

	/**
	 * 	Update X360FEccfAmtDbFil with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FEccfAmtDbFil(char[] value) throws CFException {
		 x360FEccfAmtDbFil = serializeX360FEccfAmtDbFil(value);
	}
	/**
	 * 	Update X360FEccfAmtDbFil with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FEccfAmtDbFilString(char[] value) throws CFException {
		 setX360FEccfAmtDbFil(value);
	}
	/**
	 *	Returns the value of x360FEccfCntCrFil
	 *	@return x360FEccfCntCrFil
	 */
	public int getX360FEccfCntCrFil() throws CFException {
       if (isX360FEccfCntCrFilModified()) { 
           x360FEccfCntCrFil = refreshX360FEccfCntCrFil();
        }
   		return x360FEccfCntCrFil;
	}
	

    /**
	 *	Returns the String value of x360FEccfCntCrFil
	 *	@return x360FEccfCntCrFil
	 */
	public char[]  getX360FEccfCntCrFilActualString() {
	    String value = String.valueOf(x360FEccfCntCrFil).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update X360FEccfCntCrFil with the passed value
	 *  Corresponding COBOL Variable is X360-F-ECCF-CNT-CR-FIL
	 *	@param number
	 */
	public void setX360FEccfCntCrFil(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FEccfCntCrFil = checkX360FEccfCntCrFilMaxLimit(number); 
		serializeX360FEccfCntCrFil(x360FEccfCntCrFil);
	}
	

	public void setX360FEccfCntCrFil(long number) {
	    number = checkX360FEccfCntCrFilMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FEccfCntCrFil((int)number);
	}
	
	/**
	 * 	Update X360FEccfCntCrFil with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FEccfCntCrFil(char[] value) throws CFException {
		 x360FEccfCntCrFil = serializeX360FEccfCntCrFil(value);
	}
	/**
	 * 	Update X360FEccfCntCrFil with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FEccfCntCrFilString(char[] value) throws CFException {
		 setX360FEccfCntCrFil(value);
	}
	/**
	 *	Returns the value of x360FEccfAmtCrFil
	 *	@return x360FEccfAmtCrFil
	 */
	public long getX360FEccfAmtCrFil() throws CFException {
       if (isX360FEccfAmtCrFilModified()) { 
           x360FEccfAmtCrFil = refreshX360FEccfAmtCrFil();
        }
   		return x360FEccfAmtCrFil;
	}
	

    /**
	 *	Returns the String value of x360FEccfAmtCrFil
	 *	@return x360FEccfAmtCrFil
	 */
	public char[]  getX360FEccfAmtCrFilActualString() {
	    String value = String.valueOf(x360FEccfAmtCrFil).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update X360FEccfAmtCrFil with the passed value
	 *  Corresponding COBOL Variable is X360-F-ECCF-AMT-CR-FIL
	 *	@param number
	 */
	public void setX360FEccfAmtCrFil(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FEccfAmtCrFil = checkX360FEccfAmtCrFilMaxLimit(number); 
		serializeX360FEccfAmtCrFil(x360FEccfAmtCrFil);
	}
	

	/**
	 * 	Update X360FEccfAmtCrFil with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FEccfAmtCrFil(char[] value) throws CFException {
		 x360FEccfAmtCrFil = serializeX360FEccfAmtCrFil(value);
	}
	/**
	 * 	Update X360FEccfAmtCrFil with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FEccfAmtCrFilString(char[] value) throws CFException {
		 setX360FEccfAmtCrFil(value);
	}
	public int getX360FaVatAcqFinCnt() throws CFException {
        if (isX360FaVatAcqFinCntModified()) { 
           x360FaVatAcqFinCnt = refreshX360FaVatAcqFinCnt();
        }
   		return x360FaVatAcqFinCnt;
	}
	
	/**
	 * 	Update X360FaVatAcqFinCnt with the passed value
	 *  Corresponding COBOL Variable is X360-FA-VAT-ACQ-FIN-CNT
	 *	@param number
	 */
	public void setX360FaVatAcqFinCnt(int number) {
			x360FaVatAcqFinCnt = checkX360FaVatAcqFinCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FaVatAcqFinCnt(x360FaVatAcqFinCnt);
	}


	public void setX360FaVatAcqFinCnt(long number) {
	    number = checkX360FaVatAcqFinCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FaVatAcqFinCnt((int)number);
	}
	

	
	
	

		public static int getX360FMcsAcqSetlFieldLength() {
			return X_360_FMCS_ACQ_SETL_LENGTH;
		}

}
  

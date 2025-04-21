package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FMcsIssSetl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class X360FMcsIssSetl extends X360FMcsIssSetlSerialized { 
   

								private int x360FMcsIssApprovedCntCr;

								private int x360FMcsIssApprovedCntDb;

								private int x360FMcsIssDeniedCntCr;

								private int x360FMcsIssDeniedCntDb;

								private long x360FMcsIssAmtCr;

								private long x360FMcsIssAmtDb;

								private long x360FMcsIssCnvRteBse;

								private int x360FMcsIssCurrCde;

								private long x360FMcsIssCnvRteLoc;


								private long x360FMcsIssSetlIca;

								private int x360FIssFinIfeeCnt;

								private int x360FIssNfIfeeCnt;

								private int x360FIssPctIfeeCnt;

								private int x360FIssNobillIfeeCnt;

								private long x360FIssIfeeAmtCr;

								private long x360FIssIfeeAmtDb;

								private long x360FIssCmpAmtCr;

								private long x360FIssCmpAmtDb;

								private long x360FIssbMccrAmtCr;

								private long x360FIssbMccrAmtDb;

								private long x360FIssbIccrAmtCr;

								private long x360FIssbIccrAmtDb;

								private int x360FIssSurchrgCntCr;

								private int x360FIssSurchrgCntDb;

								private BigDecimal x360FIssSurchrgAmtCr = BigDecimal.ZERO;

								private BigDecimal x360FIssSurchrgAmtDb = BigDecimal.ZERO;

								private long x360FBseIssStlAmtCr;

								private long x360FBseIssStlAmtDb;
				private X360FWorkOfDate x360FWorkOfDate = new X360FWorkOfDate();
				private X360FCurrentDate x360FCurrentDate = new X360FCurrentDate();

								private int x360FEccfCntDb;

								private long x360FEccfAmtDb;

								private int x360FEccfCntCr;

								private long x360FEccfAmtCr;

								private int x360FaVatIssFinCnt;

	
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
	       			x360FWorkOfDate.setParent(this,getStartOffset() + 188);
	       			x360FCurrentDate.setParent(this,getStartOffset() + 194);
    } 

	public int getX360FMcsIssApprovedCntCr() throws CFException {
        if (isX360FMcsIssApprovedCntCrModified()) { 
           x360FMcsIssApprovedCntCr = refreshX360FMcsIssApprovedCntCr();
        }
   		return x360FMcsIssApprovedCntCr;
	}
	
	/**
	 * 	Update X360FMcsIssApprovedCntCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-ISS-APPROVED-CNT-CR
	 *	@param number
	 */
	public void setX360FMcsIssApprovedCntCr(int number) {
			x360FMcsIssApprovedCntCr = checkX360FMcsIssApprovedCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FMcsIssApprovedCntCr(x360FMcsIssApprovedCntCr);
	}


	public void setX360FMcsIssApprovedCntCr(long number) {
	    number = checkX360FMcsIssApprovedCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FMcsIssApprovedCntCr((int)number);
	}
	
	public int getX360FMcsIssApprovedCntDb() throws CFException {
        if (isX360FMcsIssApprovedCntDbModified()) { 
           x360FMcsIssApprovedCntDb = refreshX360FMcsIssApprovedCntDb();
        }
   		return x360FMcsIssApprovedCntDb;
	}
	
	/**
	 * 	Update X360FMcsIssApprovedCntDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-ISS-APPROVED-CNT-DB
	 *	@param number
	 */
	public void setX360FMcsIssApprovedCntDb(int number) {
			x360FMcsIssApprovedCntDb = checkX360FMcsIssApprovedCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FMcsIssApprovedCntDb(x360FMcsIssApprovedCntDb);
	}


	public void setX360FMcsIssApprovedCntDb(long number) {
	    number = checkX360FMcsIssApprovedCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FMcsIssApprovedCntDb((int)number);
	}
	
	public int getX360FMcsIssDeniedCntCr() throws CFException {
        if (isX360FMcsIssDeniedCntCrModified()) { 
           x360FMcsIssDeniedCntCr = refreshX360FMcsIssDeniedCntCr();
        }
   		return x360FMcsIssDeniedCntCr;
	}
	
	/**
	 * 	Update X360FMcsIssDeniedCntCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-ISS-DENIED-CNT-CR
	 *	@param number
	 */
	public void setX360FMcsIssDeniedCntCr(int number) {
			x360FMcsIssDeniedCntCr = checkX360FMcsIssDeniedCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FMcsIssDeniedCntCr(x360FMcsIssDeniedCntCr);
	}


	public void setX360FMcsIssDeniedCntCr(long number) {
	    number = checkX360FMcsIssDeniedCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FMcsIssDeniedCntCr((int)number);
	}
	
	public int getX360FMcsIssDeniedCntDb() throws CFException {
        if (isX360FMcsIssDeniedCntDbModified()) { 
           x360FMcsIssDeniedCntDb = refreshX360FMcsIssDeniedCntDb();
        }
   		return x360FMcsIssDeniedCntDb;
	}
	
	/**
	 * 	Update X360FMcsIssDeniedCntDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-ISS-DENIED-CNT-DB
	 *	@param number
	 */
	public void setX360FMcsIssDeniedCntDb(int number) {
			x360FMcsIssDeniedCntDb = checkX360FMcsIssDeniedCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FMcsIssDeniedCntDb(x360FMcsIssDeniedCntDb);
	}


	public void setX360FMcsIssDeniedCntDb(long number) {
	    number = checkX360FMcsIssDeniedCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FMcsIssDeniedCntDb((int)number);
	}
	
	public long getX360FMcsIssAmtCr() throws CFException {
        if (isX360FMcsIssAmtCrModified()) { 
           x360FMcsIssAmtCr = refreshX360FMcsIssAmtCr();
        }
   		return x360FMcsIssAmtCr;
	}
	
	/**
	 * 	Update X360FMcsIssAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-ISS-AMT-CR
	 *	@param number
	 */
	public void setX360FMcsIssAmtCr(long number) {
			x360FMcsIssAmtCr = checkX360FMcsIssAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FMcsIssAmtCr(x360FMcsIssAmtCr);
	}


	public long getX360FMcsIssAmtDb() throws CFException {
        if (isX360FMcsIssAmtDbModified()) { 
           x360FMcsIssAmtDb = refreshX360FMcsIssAmtDb();
        }
   		return x360FMcsIssAmtDb;
	}
	
	/**
	 * 	Update X360FMcsIssAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-ISS-AMT-DB
	 *	@param number
	 */
	public void setX360FMcsIssAmtDb(long number) {
			x360FMcsIssAmtDb = checkX360FMcsIssAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FMcsIssAmtDb(x360FMcsIssAmtDb);
	}


	/**
	 *	Returns the value of x360FMcsIssCnvRteBse
	 *	@return x360FMcsIssCnvRteBse
	 */
	public long getX360FMcsIssCnvRteBse() throws CFException {
       if (isX360FMcsIssCnvRteBseModified()) { 
           x360FMcsIssCnvRteBse = refreshX360FMcsIssCnvRteBse();
        }
   		return x360FMcsIssCnvRteBse;
	}
	

	
	   
	/**
	 * 	Update X360FMcsIssCnvRteBse with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-ISS-CNV-RTE-BSE
	 *	@param number
	 */
	public void setX360FMcsIssCnvRteBse(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FMcsIssCnvRteBse = checkX360FMcsIssCnvRteBseMaxLimit(number); 
		serializeX360FMcsIssCnvRteBse(x360FMcsIssCnvRteBse);
	}
	

	/**
	 * 	Update X360FMcsIssCnvRteBse with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FMcsIssCnvRteBse(char[] value) throws CFException {
		 x360FMcsIssCnvRteBse = serializeX360FMcsIssCnvRteBse(value);
	}
	/**
	 * 	Update X360FMcsIssCnvRteBse with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FMcsIssCnvRteBseString(char[] value) throws CFException {
		 setX360FMcsIssCnvRteBse(value);
	}
	/**
	 *	Returns the value of x360FMcsIssCurrCde
	 *	@return x360FMcsIssCurrCde
	 */
	public int getX360FMcsIssCurrCde() throws CFException {
       if (isX360FMcsIssCurrCdeModified()) { 
           x360FMcsIssCurrCde = refreshX360FMcsIssCurrCde();
        }
   		return x360FMcsIssCurrCde;
	}
	

	
	   
	/**
	 * 	Update X360FMcsIssCurrCde with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-ISS-CURR-CDE
	 *	@param number
	 */
	public void setX360FMcsIssCurrCde(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FMcsIssCurrCde = checkX360FMcsIssCurrCdeMaxLimit(number); 
		serializeX360FMcsIssCurrCde(x360FMcsIssCurrCde);
	}
	

	public void setX360FMcsIssCurrCde(long number) {
	    number = checkX360FMcsIssCurrCdeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FMcsIssCurrCde((int)number);
	}
	
	/**
	 * 	Update X360FMcsIssCurrCde with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FMcsIssCurrCde(char[] value) throws CFException {
		 x360FMcsIssCurrCde = serializeX360FMcsIssCurrCde(value);
	}
	/**
	 * 	Update X360FMcsIssCurrCde with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FMcsIssCurrCdeString(char[] value) throws CFException {
		 setX360FMcsIssCurrCde(value);
	}
	/**
	 *	Returns the value of x360FMcsIssCnvRteLoc
	 *	@return x360FMcsIssCnvRteLoc
	 */
	public long getX360FMcsIssCnvRteLoc() throws CFException {
       if (isX360FMcsIssCnvRteLocModified()) { 
           x360FMcsIssCnvRteLoc = refreshX360FMcsIssCnvRteLoc();
        }
   		return x360FMcsIssCnvRteLoc;
	}
	

	
	   
	/**
	 * 	Update X360FMcsIssCnvRteLoc with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-ISS-CNV-RTE-LOC
	 *	@param number
	 */
	public void setX360FMcsIssCnvRteLoc(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FMcsIssCnvRteLoc = checkX360FMcsIssCnvRteLocMaxLimit(number); 
		serializeX360FMcsIssCnvRteLoc(x360FMcsIssCnvRteLoc);
	}
	

	/**
	 * 	Update X360FMcsIssCnvRteLoc with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FMcsIssCnvRteLoc(char[] value) throws CFException {
		 x360FMcsIssCnvRteLoc = serializeX360FMcsIssCnvRteLoc(value);
	}
	/**
	 * 	Update X360FMcsIssCnvRteLoc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FMcsIssCnvRteLocString(char[] value) throws CFException {
		 setX360FMcsIssCnvRteLoc(value);
	}
	/**
	 *	Returns the value of x360FMcsIssSetlIca
	 *	@return x360FMcsIssSetlIca
	 */
	public long getX360FMcsIssSetlIca() throws CFException {
       if (isX360FMcsIssSetlIcaModified()) { 
           x360FMcsIssSetlIca = refreshX360FMcsIssSetlIca();
        }
   		return x360FMcsIssSetlIca;
	}
	

	
	   
	/**
	 * 	Update X360FMcsIssSetlIca with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-ISS-SETL-ICA
	 *	@param number
	 */
	public void setX360FMcsIssSetlIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FMcsIssSetlIca = checkX360FMcsIssSetlIcaMaxLimit(number); 
		serializeX360FMcsIssSetlIca(x360FMcsIssSetlIca);
	}
	

	/**
	 * 	Update X360FMcsIssSetlIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FMcsIssSetlIca(char[] value) throws CFException {
		 x360FMcsIssSetlIca = serializeX360FMcsIssSetlIca(value);
	}
	/**
	 * 	Update X360FMcsIssSetlIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FMcsIssSetlIcaString(char[] value) throws CFException {
		 setX360FMcsIssSetlIca(value);
	}
	public int getX360FIssFinIfeeCnt() throws CFException {
        if (isX360FIssFinIfeeCntModified()) { 
           x360FIssFinIfeeCnt = refreshX360FIssFinIfeeCnt();
        }
   		return x360FIssFinIfeeCnt;
	}
	
	/**
	 * 	Update X360FIssFinIfeeCnt with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISS-FIN-IFEE-CNT
	 *	@param number
	 */
	public void setX360FIssFinIfeeCnt(int number) {
			x360FIssFinIfeeCnt = checkX360FIssFinIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssFinIfeeCnt(x360FIssFinIfeeCnt);
	}


	public void setX360FIssFinIfeeCnt(long number) {
	    number = checkX360FIssFinIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FIssFinIfeeCnt((int)number);
	}
	
	public int getX360FIssNfIfeeCnt() throws CFException {
        if (isX360FIssNfIfeeCntModified()) { 
           x360FIssNfIfeeCnt = refreshX360FIssNfIfeeCnt();
        }
   		return x360FIssNfIfeeCnt;
	}
	
	/**
	 * 	Update X360FIssNfIfeeCnt with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISS-NF-IFEE-CNT
	 *	@param number
	 */
	public void setX360FIssNfIfeeCnt(int number) {
			x360FIssNfIfeeCnt = checkX360FIssNfIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssNfIfeeCnt(x360FIssNfIfeeCnt);
	}


	public void setX360FIssNfIfeeCnt(long number) {
	    number = checkX360FIssNfIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FIssNfIfeeCnt((int)number);
	}
	
	public int getX360FIssPctIfeeCnt() throws CFException {
        if (isX360FIssPctIfeeCntModified()) { 
           x360FIssPctIfeeCnt = refreshX360FIssPctIfeeCnt();
        }
   		return x360FIssPctIfeeCnt;
	}
	
	/**
	 * 	Update X360FIssPctIfeeCnt with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISS-PCT-IFEE-CNT
	 *	@param number
	 */
	public void setX360FIssPctIfeeCnt(int number) {
			x360FIssPctIfeeCnt = checkX360FIssPctIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssPctIfeeCnt(x360FIssPctIfeeCnt);
	}


	public void setX360FIssPctIfeeCnt(long number) {
	    number = checkX360FIssPctIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FIssPctIfeeCnt((int)number);
	}
	
	public int getX360FIssNobillIfeeCnt() throws CFException {
        if (isX360FIssNobillIfeeCntModified()) { 
           x360FIssNobillIfeeCnt = refreshX360FIssNobillIfeeCnt();
        }
   		return x360FIssNobillIfeeCnt;
	}
	
	/**
	 * 	Update X360FIssNobillIfeeCnt with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISS-NOBILL-IFEE-CNT
	 *	@param number
	 */
	public void setX360FIssNobillIfeeCnt(int number) {
			x360FIssNobillIfeeCnt = checkX360FIssNobillIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssNobillIfeeCnt(x360FIssNobillIfeeCnt);
	}


	public void setX360FIssNobillIfeeCnt(long number) {
	    number = checkX360FIssNobillIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FIssNobillIfeeCnt((int)number);
	}
	
	public long getX360FIssIfeeAmtCr() throws CFException {
        if (isX360FIssIfeeAmtCrModified()) { 
           x360FIssIfeeAmtCr = refreshX360FIssIfeeAmtCr();
        }
   		return x360FIssIfeeAmtCr;
	}
	
	/**
	 * 	Update X360FIssIfeeAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISS-IFEE-AMT-CR
	 *	@param number
	 */
	public void setX360FIssIfeeAmtCr(long number) {
			x360FIssIfeeAmtCr = checkX360FIssIfeeAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssIfeeAmtCr(x360FIssIfeeAmtCr);
	}


	public long getX360FIssIfeeAmtDb() throws CFException {
        if (isX360FIssIfeeAmtDbModified()) { 
           x360FIssIfeeAmtDb = refreshX360FIssIfeeAmtDb();
        }
   		return x360FIssIfeeAmtDb;
	}
	
	/**
	 * 	Update X360FIssIfeeAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISS-IFEE-AMT-DB
	 *	@param number
	 */
	public void setX360FIssIfeeAmtDb(long number) {
			x360FIssIfeeAmtDb = checkX360FIssIfeeAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssIfeeAmtDb(x360FIssIfeeAmtDb);
	}


	public long getX360FIssCmpAmtCr() throws CFException {
        if (isX360FIssCmpAmtCrModified()) { 
           x360FIssCmpAmtCr = refreshX360FIssCmpAmtCr();
        }
   		return x360FIssCmpAmtCr;
	}
	
	/**
	 * 	Update X360FIssCmpAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISS-CMP-AMT-CR
	 *	@param number
	 */
	public void setX360FIssCmpAmtCr(long number) {
			x360FIssCmpAmtCr = checkX360FIssCmpAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssCmpAmtCr(x360FIssCmpAmtCr);
	}


	public long getX360FIssCmpAmtDb() throws CFException {
        if (isX360FIssCmpAmtDbModified()) { 
           x360FIssCmpAmtDb = refreshX360FIssCmpAmtDb();
        }
   		return x360FIssCmpAmtDb;
	}
	
	/**
	 * 	Update X360FIssCmpAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISS-CMP-AMT-DB
	 *	@param number
	 */
	public void setX360FIssCmpAmtDb(long number) {
			x360FIssCmpAmtDb = checkX360FIssCmpAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssCmpAmtDb(x360FIssCmpAmtDb);
	}


	public long getX360FIssbMccrAmtCr() throws CFException {
        if (isX360FIssbMccrAmtCrModified()) { 
           x360FIssbMccrAmtCr = refreshX360FIssbMccrAmtCr();
        }
   		return x360FIssbMccrAmtCr;
	}
	
	/**
	 * 	Update X360FIssbMccrAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISSB-MCCR-AMT-CR
	 *	@param number
	 */
	public void setX360FIssbMccrAmtCr(long number) {
			x360FIssbMccrAmtCr = checkX360FIssbMccrAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssbMccrAmtCr(x360FIssbMccrAmtCr);
	}


	public long getX360FIssbMccrAmtDb() throws CFException {
        if (isX360FIssbMccrAmtDbModified()) { 
           x360FIssbMccrAmtDb = refreshX360FIssbMccrAmtDb();
        }
   		return x360FIssbMccrAmtDb;
	}
	
	/**
	 * 	Update X360FIssbMccrAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISSB-MCCR-AMT-DB
	 *	@param number
	 */
	public void setX360FIssbMccrAmtDb(long number) {
			x360FIssbMccrAmtDb = checkX360FIssbMccrAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssbMccrAmtDb(x360FIssbMccrAmtDb);
	}


	public long getX360FIssbIccrAmtCr() throws CFException {
        if (isX360FIssbIccrAmtCrModified()) { 
           x360FIssbIccrAmtCr = refreshX360FIssbIccrAmtCr();
        }
   		return x360FIssbIccrAmtCr;
	}
	
	/**
	 * 	Update X360FIssbIccrAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISSB-ICCR-AMT-CR
	 *	@param number
	 */
	public void setX360FIssbIccrAmtCr(long number) {
			x360FIssbIccrAmtCr = checkX360FIssbIccrAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssbIccrAmtCr(x360FIssbIccrAmtCr);
	}


	public long getX360FIssbIccrAmtDb() throws CFException {
        if (isX360FIssbIccrAmtDbModified()) { 
           x360FIssbIccrAmtDb = refreshX360FIssbIccrAmtDb();
        }
   		return x360FIssbIccrAmtDb;
	}
	
	/**
	 * 	Update X360FIssbIccrAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISSB-ICCR-AMT-DB
	 *	@param number
	 */
	public void setX360FIssbIccrAmtDb(long number) {
			x360FIssbIccrAmtDb = checkX360FIssbIccrAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssbIccrAmtDb(x360FIssbIccrAmtDb);
	}


	public int getX360FIssSurchrgCntCr() throws CFException {
        if (isX360FIssSurchrgCntCrModified()) { 
           x360FIssSurchrgCntCr = refreshX360FIssSurchrgCntCr();
        }
   		return x360FIssSurchrgCntCr;
	}
	
	/**
	 * 	Update X360FIssSurchrgCntCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISS-SURCHRG-CNT-CR
	 *	@param number
	 */
	public void setX360FIssSurchrgCntCr(int number) {
			x360FIssSurchrgCntCr = checkX360FIssSurchrgCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssSurchrgCntCr(x360FIssSurchrgCntCr);
	}


	public void setX360FIssSurchrgCntCr(long number) {
	    number = checkX360FIssSurchrgCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FIssSurchrgCntCr((int)number);
	}
	
	public int getX360FIssSurchrgCntDb() throws CFException {
        if (isX360FIssSurchrgCntDbModified()) { 
           x360FIssSurchrgCntDb = refreshX360FIssSurchrgCntDb();
        }
   		return x360FIssSurchrgCntDb;
	}
	
	/**
	 * 	Update X360FIssSurchrgCntDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISS-SURCHRG-CNT-DB
	 *	@param number
	 */
	public void setX360FIssSurchrgCntDb(int number) {
			x360FIssSurchrgCntDb = checkX360FIssSurchrgCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssSurchrgCntDb(x360FIssSurchrgCntDb);
	}


	public void setX360FIssSurchrgCntDb(long number) {
	    number = checkX360FIssSurchrgCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FIssSurchrgCntDb((int)number);
	}
	
	public BigDecimal getX360FIssSurchrgAmtCr() throws CFException {
        if (isX360FIssSurchrgAmtCrModified()) { 
           x360FIssSurchrgAmtCr = refreshX360FIssSurchrgAmtCr();
        }
   		return x360FIssSurchrgAmtCr;
	}

    public char[] getX360FIssSurchrgAmtCrString() {
          return  x360FIssSurchrgAmtCrString();
    }
	
	/**
	 * 	Update X360FIssSurchrgAmtCr with the passed number
	 *  Corresponding COBOL Variable is X360-F-ISS-SURCHRG-AMT-CR
	 *	@param number
	 */
	public void setX360FIssSurchrgAmtCr(BigDecimal number) {	
     x360FIssSurchrgAmtCr = checkX360FIssSurchrgAmtCrMaxLimit(number);
	    serializeX360FIssSurchrgAmtCr(x360FIssSurchrgAmtCr);
   }
	public BigDecimal getX360FIssSurchrgAmtDb() throws CFException {
        if (isX360FIssSurchrgAmtDbModified()) { 
           x360FIssSurchrgAmtDb = refreshX360FIssSurchrgAmtDb();
        }
   		return x360FIssSurchrgAmtDb;
	}

    public char[] getX360FIssSurchrgAmtDbString() {
          return  x360FIssSurchrgAmtDbString();
    }
	
	/**
	 * 	Update X360FIssSurchrgAmtDb with the passed number
	 *  Corresponding COBOL Variable is X360-F-ISS-SURCHRG-AMT-DB
	 *	@param number
	 */
	public void setX360FIssSurchrgAmtDb(BigDecimal number) {	
     x360FIssSurchrgAmtDb = checkX360FIssSurchrgAmtDbMaxLimit(number);
	    serializeX360FIssSurchrgAmtDb(x360FIssSurchrgAmtDb);
   }
	public long getX360FBseIssStlAmtCr() throws CFException {
        if (isX360FBseIssStlAmtCrModified()) { 
           x360FBseIssStlAmtCr = refreshX360FBseIssStlAmtCr();
        }
   		return x360FBseIssStlAmtCr;
	}
	
	/**
	 * 	Update X360FBseIssStlAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-BSE-ISS-STL-AMT-CR
	 *	@param number
	 */
	public void setX360FBseIssStlAmtCr(long number) {
			x360FBseIssStlAmtCr = checkX360FBseIssStlAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FBseIssStlAmtCr(x360FBseIssStlAmtCr);
	}


	public long getX360FBseIssStlAmtDb() throws CFException {
        if (isX360FBseIssStlAmtDbModified()) { 
           x360FBseIssStlAmtDb = refreshX360FBseIssStlAmtDb();
        }
   		return x360FBseIssStlAmtDb;
	}
	
	/**
	 * 	Update X360FBseIssStlAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-BSE-ISS-STL-AMT-DB
	 *	@param number
	 */
	public void setX360FBseIssStlAmtDb(long number) {
			x360FBseIssStlAmtDb = checkX360FBseIssStlAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FBseIssStlAmtDb(x360FBseIssStlAmtDb);
	}


	/**
	 *	Returns the value of x360FWorkOfDate
	 *	@return x360FWorkOfDate
	 */   
	 public X360FWorkOfDate getX360FWorkOfDate() {
   	return x360FWorkOfDate;
   }
   /**
	* 	Update X360FWorkOfDate with the passed value
	*   Corresponding COBOL Variable is X360-F-WORK-OF-DATE
	*	@param value
	*/
   public void setX360FWorkOfDate(char[] value) {
      x360FWorkOfDate.setString(value); 
   }   
    
     /**
	 * 	Update X360FWorkOfDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360FWorkOfDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FWorkOfDate.begin,x360FWorkOfDate.length());
   }
   
     /**
	 * 	Update X360FWorkOfDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360FWorkOfDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FWorkOfDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360FWorkOfDate with another Field
	 *	@param value
	 */
   public void setX360FWorkOfDate(Field source) {
   	replace(source,0,source.length(),x360FWorkOfDate.begin,x360FWorkOfDate.length());
   }  
   
     /**
	 * 	Update X360FWorkOfDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360FWorkOfDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FWorkOfDate.begin,x360FWorkOfDate.length());
   }
   
     /**
	 * 	Update X360FWorkOfDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360FWorkOfDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FWorkOfDate.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360FCurrentDate
	 *	@return x360FCurrentDate
	 */   
	 public X360FCurrentDate getX360FCurrentDate() {
   	return x360FCurrentDate;
   }
   /**
	* 	Update X360FCurrentDate with the passed value
	*   Corresponding COBOL Variable is X360-F-CURRENT-DATE
	*	@param value
	*/
   public void setX360FCurrentDate(char[] value) {
      x360FCurrentDate.setString(value); 
   }   
    
     /**
	 * 	Update X360FCurrentDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360FCurrentDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FCurrentDate.begin,x360FCurrentDate.length());
   }
   
     /**
	 * 	Update X360FCurrentDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360FCurrentDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FCurrentDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360FCurrentDate with another Field
	 *	@param value
	 */
   public void setX360FCurrentDate(Field source) {
   	replace(source,0,source.length(),x360FCurrentDate.begin,x360FCurrentDate.length());
   }  
   
     /**
	 * 	Update X360FCurrentDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360FCurrentDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FCurrentDate.begin,x360FCurrentDate.length());
   }
   
     /**
	 * 	Update X360FCurrentDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360FCurrentDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FCurrentDate.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360FEccfCntDb
	 *	@return x360FEccfCntDb
	 */
	public int getX360FEccfCntDb() throws CFException {
       if (isX360FEccfCntDbModified()) { 
           x360FEccfCntDb = refreshX360FEccfCntDb();
        }
   		return x360FEccfCntDb;
	}
	

    /**
	 *	Returns the String value of x360FEccfCntDb
	 *	@return x360FEccfCntDb
	 */
	public char[]  getX360FEccfCntDbActualString() {
	    String value = String.valueOf(x360FEccfCntDb).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update X360FEccfCntDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-ECCF-CNT-DB
	 *	@param number
	 */
	public void setX360FEccfCntDb(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FEccfCntDb = checkX360FEccfCntDbMaxLimit(number); 
		serializeX360FEccfCntDb(x360FEccfCntDb);
	}
	

	public void setX360FEccfCntDb(long number) {
	    number = checkX360FEccfCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FEccfCntDb((int)number);
	}
	
	/**
	 * 	Update X360FEccfCntDb with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FEccfCntDb(char[] value) throws CFException {
		 x360FEccfCntDb = serializeX360FEccfCntDb(value);
	}
	/**
	 * 	Update X360FEccfCntDb with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FEccfCntDbString(char[] value) throws CFException {
		 setX360FEccfCntDb(value);
	}
	/**
	 *	Returns the value of x360FEccfAmtDb
	 *	@return x360FEccfAmtDb
	 */
	public long getX360FEccfAmtDb() throws CFException {
       if (isX360FEccfAmtDbModified()) { 
           x360FEccfAmtDb = refreshX360FEccfAmtDb();
        }
   		return x360FEccfAmtDb;
	}
	

    /**
	 *	Returns the String value of x360FEccfAmtDb
	 *	@return x360FEccfAmtDb
	 */
	public char[]  getX360FEccfAmtDbActualString() {
	    String value = String.valueOf(x360FEccfAmtDb).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update X360FEccfAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-ECCF-AMT-DB
	 *	@param number
	 */
	public void setX360FEccfAmtDb(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FEccfAmtDb = checkX360FEccfAmtDbMaxLimit(number); 
		serializeX360FEccfAmtDb(x360FEccfAmtDb);
	}
	

	/**
	 * 	Update X360FEccfAmtDb with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FEccfAmtDb(char[] value) throws CFException {
		 x360FEccfAmtDb = serializeX360FEccfAmtDb(value);
	}
	/**
	 * 	Update X360FEccfAmtDb with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FEccfAmtDbString(char[] value) throws CFException {
		 setX360FEccfAmtDb(value);
	}
	/**
	 *	Returns the value of x360FEccfCntCr
	 *	@return x360FEccfCntCr
	 */
	public int getX360FEccfCntCr() throws CFException {
       if (isX360FEccfCntCrModified()) { 
           x360FEccfCntCr = refreshX360FEccfCntCr();
        }
   		return x360FEccfCntCr;
	}
	

    /**
	 *	Returns the String value of x360FEccfCntCr
	 *	@return x360FEccfCntCr
	 */
	public char[]  getX360FEccfCntCrActualString() {
	    String value = String.valueOf(x360FEccfCntCr).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update X360FEccfCntCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-ECCF-CNT-CR
	 *	@param number
	 */
	public void setX360FEccfCntCr(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FEccfCntCr = checkX360FEccfCntCrMaxLimit(number); 
		serializeX360FEccfCntCr(x360FEccfCntCr);
	}
	

	public void setX360FEccfCntCr(long number) {
	    number = checkX360FEccfCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FEccfCntCr((int)number);
	}
	
	/**
	 * 	Update X360FEccfCntCr with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FEccfCntCr(char[] value) throws CFException {
		 x360FEccfCntCr = serializeX360FEccfCntCr(value);
	}
	/**
	 * 	Update X360FEccfCntCr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FEccfCntCrString(char[] value) throws CFException {
		 setX360FEccfCntCr(value);
	}
	/**
	 *	Returns the value of x360FEccfAmtCr
	 *	@return x360FEccfAmtCr
	 */
	public long getX360FEccfAmtCr() throws CFException {
       if (isX360FEccfAmtCrModified()) { 
           x360FEccfAmtCr = refreshX360FEccfAmtCr();
        }
   		return x360FEccfAmtCr;
	}
	

    /**
	 *	Returns the String value of x360FEccfAmtCr
	 *	@return x360FEccfAmtCr
	 */
	public char[]  getX360FEccfAmtCrActualString() {
	    String value = String.valueOf(x360FEccfAmtCr).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update X360FEccfAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-ECCF-AMT-CR
	 *	@param number
	 */
	public void setX360FEccfAmtCr(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FEccfAmtCr = checkX360FEccfAmtCrMaxLimit(number); 
		serializeX360FEccfAmtCr(x360FEccfAmtCr);
	}
	

	/**
	 * 	Update X360FEccfAmtCr with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FEccfAmtCr(char[] value) throws CFException {
		 x360FEccfAmtCr = serializeX360FEccfAmtCr(value);
	}
	/**
	 * 	Update X360FEccfAmtCr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FEccfAmtCrString(char[] value) throws CFException {
		 setX360FEccfAmtCr(value);
	}
	public int getX360FaVatIssFinCnt() throws CFException {
        if (isX360FaVatIssFinCntModified()) { 
           x360FaVatIssFinCnt = refreshX360FaVatIssFinCnt();
        }
   		return x360FaVatIssFinCnt;
	}
	
	/**
	 * 	Update X360FaVatIssFinCnt with the passed value
	 *  Corresponding COBOL Variable is X360-FA-VAT-ISS-FIN-CNT
	 *	@param number
	 */
	public void setX360FaVatIssFinCnt(int number) {
			x360FaVatIssFinCnt = checkX360FaVatIssFinCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FaVatIssFinCnt(x360FaVatIssFinCnt);
	}


	public void setX360FaVatIssFinCnt(long number) {
	    number = checkX360FaVatIssFinCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FaVatIssFinCnt((int)number);
	}
	

	
	
	

		public static int getX360FMcsIssSetlFieldLength() {
			return X_360_FMCS_ISS_SETL_LENGTH;
		}

}
  

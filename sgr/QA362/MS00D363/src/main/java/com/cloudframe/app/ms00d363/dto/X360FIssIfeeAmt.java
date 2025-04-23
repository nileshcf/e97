package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FIssIfeeAmt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360FIssIfeeAmt extends X360FIssIfeeAmtSerialized { 
   

								private long x360FIssFinIfeeDb;

								private long x360FIssFinIfeeCr;

								private long x360FIssNfIfeeDb;

								private long x360FIssNfIfeeCr;

								private long x360FIssPctIfeeDb;

								private long x360FIssPctIfeeCr;

								private long x360FIssNobillIfeeDb;

								private long x360FIssNobillIfeeCr;
	
	/**
	* Constructor for X360FIssIfeeAmt
	**/
    public X360FIssIfeeAmt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360FIssIfeeAmt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FIssIfeeAmt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public long getX360FIssFinIfeeDb() throws CFException {
        if (isX360FIssFinIfeeDbModified()) { 
           x360FIssFinIfeeDb = refreshX360FIssFinIfeeDb();
        }
   		return x360FIssFinIfeeDb;
	}
	
	/**
	 * 	Update X360FIssFinIfeeDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISS-FIN-IFEE-DB
	 *	@param number
	 */
	public void setX360FIssFinIfeeDb(long number) {
			x360FIssFinIfeeDb = checkX360FIssFinIfeeDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssFinIfeeDb(x360FIssFinIfeeDb);
	}


	public long getX360FIssFinIfeeCr() throws CFException {
        if (isX360FIssFinIfeeCrModified()) { 
           x360FIssFinIfeeCr = refreshX360FIssFinIfeeCr();
        }
   		return x360FIssFinIfeeCr;
	}
	
	/**
	 * 	Update X360FIssFinIfeeCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISS-FIN-IFEE-CR
	 *	@param number
	 */
	public void setX360FIssFinIfeeCr(long number) {
			x360FIssFinIfeeCr = checkX360FIssFinIfeeCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssFinIfeeCr(x360FIssFinIfeeCr);
	}


	public long getX360FIssNfIfeeDb() throws CFException {
        if (isX360FIssNfIfeeDbModified()) { 
           x360FIssNfIfeeDb = refreshX360FIssNfIfeeDb();
        }
   		return x360FIssNfIfeeDb;
	}
	
	/**
	 * 	Update X360FIssNfIfeeDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISS-NF-IFEE-DB
	 *	@param number
	 */
	public void setX360FIssNfIfeeDb(long number) {
			x360FIssNfIfeeDb = checkX360FIssNfIfeeDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssNfIfeeDb(x360FIssNfIfeeDb);
	}


	public long getX360FIssNfIfeeCr() throws CFException {
        if (isX360FIssNfIfeeCrModified()) { 
           x360FIssNfIfeeCr = refreshX360FIssNfIfeeCr();
        }
   		return x360FIssNfIfeeCr;
	}
	
	/**
	 * 	Update X360FIssNfIfeeCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISS-NF-IFEE-CR
	 *	@param number
	 */
	public void setX360FIssNfIfeeCr(long number) {
			x360FIssNfIfeeCr = checkX360FIssNfIfeeCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssNfIfeeCr(x360FIssNfIfeeCr);
	}


	public long getX360FIssPctIfeeDb() throws CFException {
        if (isX360FIssPctIfeeDbModified()) { 
           x360FIssPctIfeeDb = refreshX360FIssPctIfeeDb();
        }
   		return x360FIssPctIfeeDb;
	}
	
	/**
	 * 	Update X360FIssPctIfeeDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISS-PCT-IFEE-DB
	 *	@param number
	 */
	public void setX360FIssPctIfeeDb(long number) {
			x360FIssPctIfeeDb = checkX360FIssPctIfeeDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssPctIfeeDb(x360FIssPctIfeeDb);
	}


	public long getX360FIssPctIfeeCr() throws CFException {
        if (isX360FIssPctIfeeCrModified()) { 
           x360FIssPctIfeeCr = refreshX360FIssPctIfeeCr();
        }
   		return x360FIssPctIfeeCr;
	}
	
	/**
	 * 	Update X360FIssPctIfeeCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISS-PCT-IFEE-CR
	 *	@param number
	 */
	public void setX360FIssPctIfeeCr(long number) {
			x360FIssPctIfeeCr = checkX360FIssPctIfeeCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssPctIfeeCr(x360FIssPctIfeeCr);
	}


	public long getX360FIssNobillIfeeDb() throws CFException {
        if (isX360FIssNobillIfeeDbModified()) { 
           x360FIssNobillIfeeDb = refreshX360FIssNobillIfeeDb();
        }
   		return x360FIssNobillIfeeDb;
	}
	
	/**
	 * 	Update X360FIssNobillIfeeDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISS-NOBILL-IFEE-DB
	 *	@param number
	 */
	public void setX360FIssNobillIfeeDb(long number) {
			x360FIssNobillIfeeDb = checkX360FIssNobillIfeeDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssNobillIfeeDb(x360FIssNobillIfeeDb);
	}


	public long getX360FIssNobillIfeeCr() throws CFException {
        if (isX360FIssNobillIfeeCrModified()) { 
           x360FIssNobillIfeeCr = refreshX360FIssNobillIfeeCr();
        }
   		return x360FIssNobillIfeeCr;
	}
	
	/**
	 * 	Update X360FIssNobillIfeeCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISS-NOBILL-IFEE-CR
	 *	@param number
	 */
	public void setX360FIssNobillIfeeCr(long number) {
			x360FIssNobillIfeeCr = checkX360FIssNobillIfeeCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssNobillIfeeCr(x360FIssNobillIfeeCr);
	}



	
	
	

		public static int getX360FIssIfeeAmtFieldLength() {
			return X_360_FISS_IFEE_AMT_LENGTH;
		}

}
  

package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FAcqIfeeAmt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360FAcqIfeeAmt extends X360FAcqIfeeAmtSerialized { 
   

								private long x360FAcqFinIfeeDb;

								private long x360FAcqFinIfeeCr;

								private long x360FAcqNfIfeeDb;

								private long x360FAcqNfIfeeCr;

								private long x360FAcqPctIfeeDb;

								private long x360FAcqPctIfeeCr;

								private long x360FAcqNobillIfeeDb;

								private long x360FAcqNobillIfeeCr;
	
	/**
	* Constructor for X360FAcqIfeeAmt
	**/
    public X360FAcqIfeeAmt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360FAcqIfeeAmt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FAcqIfeeAmt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public long getX360FAcqFinIfeeDb() throws CFException {
        if (isX360FAcqFinIfeeDbModified()) { 
           x360FAcqFinIfeeDb = refreshX360FAcqFinIfeeDb();
        }
   		return x360FAcqFinIfeeDb;
	}
	
	/**
	 * 	Update X360FAcqFinIfeeDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-FIN-IFEE-DB
	 *	@param number
	 */
	public void setX360FAcqFinIfeeDb(long number) {
			x360FAcqFinIfeeDb = checkX360FAcqFinIfeeDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqFinIfeeDb(x360FAcqFinIfeeDb);
	}


	public long getX360FAcqFinIfeeCr() throws CFException {
        if (isX360FAcqFinIfeeCrModified()) { 
           x360FAcqFinIfeeCr = refreshX360FAcqFinIfeeCr();
        }
   		return x360FAcqFinIfeeCr;
	}
	
	/**
	 * 	Update X360FAcqFinIfeeCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-FIN-IFEE-CR
	 *	@param number
	 */
	public void setX360FAcqFinIfeeCr(long number) {
			x360FAcqFinIfeeCr = checkX360FAcqFinIfeeCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqFinIfeeCr(x360FAcqFinIfeeCr);
	}


	public long getX360FAcqNfIfeeDb() throws CFException {
        if (isX360FAcqNfIfeeDbModified()) { 
           x360FAcqNfIfeeDb = refreshX360FAcqNfIfeeDb();
        }
   		return x360FAcqNfIfeeDb;
	}
	
	/**
	 * 	Update X360FAcqNfIfeeDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-NF-IFEE-DB
	 *	@param number
	 */
	public void setX360FAcqNfIfeeDb(long number) {
			x360FAcqNfIfeeDb = checkX360FAcqNfIfeeDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqNfIfeeDb(x360FAcqNfIfeeDb);
	}


	public long getX360FAcqNfIfeeCr() throws CFException {
        if (isX360FAcqNfIfeeCrModified()) { 
           x360FAcqNfIfeeCr = refreshX360FAcqNfIfeeCr();
        }
   		return x360FAcqNfIfeeCr;
	}
	
	/**
	 * 	Update X360FAcqNfIfeeCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-NF-IFEE-CR
	 *	@param number
	 */
	public void setX360FAcqNfIfeeCr(long number) {
			x360FAcqNfIfeeCr = checkX360FAcqNfIfeeCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqNfIfeeCr(x360FAcqNfIfeeCr);
	}


	public long getX360FAcqPctIfeeDb() throws CFException {
        if (isX360FAcqPctIfeeDbModified()) { 
           x360FAcqPctIfeeDb = refreshX360FAcqPctIfeeDb();
        }
   		return x360FAcqPctIfeeDb;
	}
	
	/**
	 * 	Update X360FAcqPctIfeeDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-PCT-IFEE-DB
	 *	@param number
	 */
	public void setX360FAcqPctIfeeDb(long number) {
			x360FAcqPctIfeeDb = checkX360FAcqPctIfeeDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqPctIfeeDb(x360FAcqPctIfeeDb);
	}


	public long getX360FAcqPctIfeeCr() throws CFException {
        if (isX360FAcqPctIfeeCrModified()) { 
           x360FAcqPctIfeeCr = refreshX360FAcqPctIfeeCr();
        }
   		return x360FAcqPctIfeeCr;
	}
	
	/**
	 * 	Update X360FAcqPctIfeeCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-PCT-IFEE-CR
	 *	@param number
	 */
	public void setX360FAcqPctIfeeCr(long number) {
			x360FAcqPctIfeeCr = checkX360FAcqPctIfeeCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqPctIfeeCr(x360FAcqPctIfeeCr);
	}


	public long getX360FAcqNobillIfeeDb() throws CFException {
        if (isX360FAcqNobillIfeeDbModified()) { 
           x360FAcqNobillIfeeDb = refreshX360FAcqNobillIfeeDb();
        }
   		return x360FAcqNobillIfeeDb;
	}
	
	/**
	 * 	Update X360FAcqNobillIfeeDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-NOBILL-IFEE-DB
	 *	@param number
	 */
	public void setX360FAcqNobillIfeeDb(long number) {
			x360FAcqNobillIfeeDb = checkX360FAcqNobillIfeeDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqNobillIfeeDb(x360FAcqNobillIfeeDb);
	}


	public long getX360FAcqNobillIfeeCr() throws CFException {
        if (isX360FAcqNobillIfeeCrModified()) { 
           x360FAcqNobillIfeeCr = refreshX360FAcqNobillIfeeCr();
        }
   		return x360FAcqNobillIfeeCr;
	}
	
	/**
	 * 	Update X360FAcqNobillIfeeCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-NOBILL-IFEE-CR
	 *	@param number
	 */
	public void setX360FAcqNobillIfeeCr(long number) {
			x360FAcqNobillIfeeCr = checkX360FAcqNobillIfeeCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqNobillIfeeCr(x360FAcqNobillIfeeCr);
	}



	
	
	

		public static int getX360FAcqIfeeAmtFieldLength() {
			return X_360_FACQ_IFEE_AMT_LENGTH;
		}

}
  

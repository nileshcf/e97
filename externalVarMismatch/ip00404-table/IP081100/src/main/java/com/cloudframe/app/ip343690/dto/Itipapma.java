package com.cloudframe.app.ip343690.dto;

/**
*  The class Itipapma is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/


import com.cloudframe.app.ip343690.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Itipapma extends ItipapmaSerialized { 
   

								private short tipapmaPrimAcctSeqNumN;
	
	/**
	* Constructor for Itipapma
	**/
    public Itipapma() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of tipapmaPrimAcctSeqNumN
	 *	@return tipapmaPrimAcctSeqNumN
	 */
	public short getTipapmaPrimAcctSeqNumN() throws CFException {
        if (isTipapmaPrimAcctSeqNumNModified()) { 
           tipapmaPrimAcctSeqNumN = refreshTipapmaPrimAcctSeqNumN();
        }
   		return tipapmaPrimAcctSeqNumN;
	}
	
	/**
	 * 	Update TipapmaPrimAcctSeqNumN with the passed value
	 *  Corresponding COBOL Variable is TIPAPMA-PRIM-ACCT-SEQ-NUM-N
	 *	@param number
	 */
	public void setTipapmaPrimAcctSeqNumN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tipapmaPrimAcctSeqNumN = checkTipapmaPrimAcctSeqNumNMaxLimit(number); 
		serializeTipapmaPrimAcctSeqNumN(tipapmaPrimAcctSeqNumN);
	}

	public void setTipapmaPrimAcctSeqNumN(int number) {
	    number = checkTipapmaPrimAcctSeqNumNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTipapmaPrimAcctSeqNumN((short)number);
	}
	public void setTipapmaPrimAcctSeqNumN(long number) {
	    number = checkTipapmaPrimAcctSeqNumNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTipapmaPrimAcctSeqNumN((short)number);
	}
	


	
	
	

		public static int getItipapmaFieldLength() {
			return ITIPAPMA_LENGTH;
		}

}
  

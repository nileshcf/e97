package com.cloudframe.app.search2.dto;

/**
*  The class TblsRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:43. using version 5.0.0.254
**/


import com.cloudframe.app.search2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TblsRedefined extends TblsRedefinedSerialized { 
   

								private long sbid;

						private char[] ecp = Field.fillLowValue(6);
	
	/**
	* Constructor for TblsRedefined
	**/
    public TblsRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TblsRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TblsRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sbid
	 *	@return sbid
	 */
	public long getSbid() throws CFException {
       if (isSbidModified()) { 
           sbid = refreshSbid();
        }
   		return sbid;
	}
	

	
	   
	/**
	 * 	Update Sbid with the passed value
	 *  Corresponding COBOL Variable is WS-SBID
	 *	@param number
	 */
	public void setSbid(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sbid = checkSbidMaxLimit(number); 
		serializeSbid(sbid);
	}
	

	/**
	 * 	Update Sbid with the passed value
	 *	@param value (String or char[])
	 */
	public void setSbid(char[] value) throws CFException {
		 sbid = serializeSbid(value);
	}
	/**
	 * 	Update Sbid with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSbidString(char[] value) throws CFException {
		 setSbid(value);
	}
	/**
	 *	Returns the value of ecp
	 *	@return ecp
	 */
   public char[] getEcp() throws CFException{
     if (isEcpModified()) { 
        ecp = refreshEcp();
     }
   		return ecp;
   }

  
	/**
	*  set variable ecp
	*  Corresponding COBOL Variable is WS-ECP
	*  @param value
	**/
   public void setEcp(char[] value) {
      ecp = checkEcpConstraints(value);
      serializeEcp(ecp);
   } 

     /**
	 * 	Update Ecp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEcp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEcp,ecp.length);
   	
   }
   
   public void setEcp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEcp,ecp.length);
   	
   }
   
     /**
	 * 	Update Ecp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEcp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEcp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ecp with another Field
	 *	@param value
	 */
   public void setEcp(Field source) {
       replace(source,0,source.length(),beginEcp,ECP_LEN);
   	
   }  
   
     /**
	 * 	Update Ecp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEcp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEcp,ECP_LEN);
   	
   }
   
     /**
	 * 	Update Ecp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEcp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEcp+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTblsRedefinedFieldLength() {
			return TBLS_REDEFINED_LENGTH;
		}

}
  

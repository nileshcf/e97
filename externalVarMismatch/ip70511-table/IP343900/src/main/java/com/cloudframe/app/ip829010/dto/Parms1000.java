package com.cloudframe.app.ip829010.dto;

/**
*  The class Parms1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Parms1000 extends Parms1000Serialized {
   


						private char[] lnFacreqJobgrpName1000 = Field.fillLowValue(6);

								private int lnFacreqJobgrpNum1000;


						private char[] lnCloneOwnerId1000 = Field.fillLowValue(3);


								private int lnParm911Retry1000;


						private char[] lnMqDebugSw1000 = Field.fillLowValue(1);

	
	/**
	* Constructor for Parms1000
	**/
    public Parms1000() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of lnFacreqJobgrpName1000
	 *	@return lnFacreqJobgrpName1000
	 */
   public char[] getLnFacreqJobgrpName1000() throws CFException{
     if (isLnFacreqJobgrpName1000Modified()) { 
        lnFacreqJobgrpName1000 = refreshLnFacreqJobgrpName1000();
     }
   		return lnFacreqJobgrpName1000;
   }

  
	/**
	*  set variable lnFacreqJobgrpName1000
	*  Corresponding COBOL Variable is 1000-LN-FACREQ-JOBGRP-NAME
	*  @param value
	**/
   public void setLnFacreqJobgrpName1000(char[] value) {
      lnFacreqJobgrpName1000 = checkLnFacreqJobgrpName1000Constraints(value);
      serializeLnFacreqJobgrpName1000(lnFacreqJobgrpName1000);
   } 

     /**
	 * 	Update LnFacreqJobgrpName1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLnFacreqJobgrpName1000,lnFacreqJobgrpName1000.length);
   	
   }
   
   public void setLnFacreqJobgrpName1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLnFacreqJobgrpName1000,lnFacreqJobgrpName1000.length);
   	
   }
   
     /**
	 * 	Update LnFacreqJobgrpName1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLnFacreqJobgrpName1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LnFacreqJobgrpName1000 with another Field
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(Field source) {
       replace(source,0,source.length(),beginLnFacreqJobgrpName1000,LN_FACREQ_JOBGRP_NAME_1000_LEN);
   	
   }  
   
     /**
	 * 	Update LnFacreqJobgrpName1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLnFacreqJobgrpName1000,LN_FACREQ_JOBGRP_NAME_1000_LEN);
   	
   }
   
     /**
	 * 	Update LnFacreqJobgrpName1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLnFacreqJobgrpName1000+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lnFacreqJobgrpNum1000
	 *	@return lnFacreqJobgrpNum1000
	 */
	public int getLnFacreqJobgrpNum1000() throws CFException {
       if (isLnFacreqJobgrpNum1000Modified()) { 
           lnFacreqJobgrpNum1000 = refreshLnFacreqJobgrpNum1000();
        }
   		return lnFacreqJobgrpNum1000;
	}
	

	
	   
	/**
	 * 	Update LnFacreqJobgrpNum1000 with the passed value
	 *  Corresponding COBOL Variable is 1000-LN-FACREQ-JOBGRP-NUM
	 *	@param number
	 */
	public void setLnFacreqJobgrpNum1000(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    lnFacreqJobgrpNum1000 = checkLnFacreqJobgrpNum1000MaxLimit(number); 
		serializeLnFacreqJobgrpNum1000(lnFacreqJobgrpNum1000);
	}
	

	public void setLnFacreqJobgrpNum1000(long number) {
	    number = checkLnFacreqJobgrpNum1000MaxLimit(number); // Truncate if value is beyond +/- Max range
		setLnFacreqJobgrpNum1000((int)number);
	}
	
	/**
	 * 	Update LnFacreqJobgrpNum1000 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLnFacreqJobgrpNum1000(char[] value) throws CFException {
		 lnFacreqJobgrpNum1000 = serializeLnFacreqJobgrpNum1000(value);
	}
	/**
	 * 	Update LnFacreqJobgrpNum1000 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLnFacreqJobgrpNum1000String(char[] value) throws CFException {
		 setLnFacreqJobgrpNum1000(value);
	}
	/**
	 *	Returns the value of lnCloneOwnerId1000
	 *	@return lnCloneOwnerId1000
	 */
   public char[] getLnCloneOwnerId1000() throws CFException{
     if (isLnCloneOwnerId1000Modified()) { 
        lnCloneOwnerId1000 = refreshLnCloneOwnerId1000();
     }
   		return lnCloneOwnerId1000;
   }

  
	/**
	*  set variable lnCloneOwnerId1000
	*  Corresponding COBOL Variable is 1000-LN-CLONE-OWNER-ID
	*  @param value
	**/
   public void setLnCloneOwnerId1000(char[] value) {
      lnCloneOwnerId1000 = checkLnCloneOwnerId1000Constraints(value);
      serializeLnCloneOwnerId1000(lnCloneOwnerId1000);
   } 

     /**
	 * 	Update LnCloneOwnerId1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLnCloneOwnerId1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLnCloneOwnerId1000,lnCloneOwnerId1000.length);
   	
   }
   
   public void setLnCloneOwnerId1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLnCloneOwnerId1000,lnCloneOwnerId1000.length);
   	
   }
   
     /**
	 * 	Update LnCloneOwnerId1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLnCloneOwnerId1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLnCloneOwnerId1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LnCloneOwnerId1000 with another Field
	 *	@param value
	 */
   public void setLnCloneOwnerId1000(Field source) {
       replace(source,0,source.length(),beginLnCloneOwnerId1000,LN_CLONE_OWNER_ID_1000_LEN);
   	
   }  
   
     /**
	 * 	Update LnCloneOwnerId1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLnCloneOwnerId1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLnCloneOwnerId1000,LN_CLONE_OWNER_ID_1000_LEN);
   	
   }
   
     /**
	 * 	Update LnCloneOwnerId1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLnCloneOwnerId1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLnCloneOwnerId1000+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lnParm911Retry1000
	 *	@return lnParm911Retry1000
	 */
	public int getLnParm911Retry1000() throws CFException {
       if (isLnParm911Retry1000Modified()) { 
           lnParm911Retry1000 = refreshLnParm911Retry1000();
        }
   		return lnParm911Retry1000;
	}
	

	
	   
	/**
	 * 	Update LnParm911Retry1000 with the passed value
	 *  Corresponding COBOL Variable is 1000-LN-PARM-911-RETRY
	 *	@param number
	 */
	public void setLnParm911Retry1000(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    lnParm911Retry1000 = checkLnParm911Retry1000MaxLimit(number); 
		serializeLnParm911Retry1000(lnParm911Retry1000);
	}
	

	public void setLnParm911Retry1000(long number) {
	    number = checkLnParm911Retry1000MaxLimit(number); // Truncate if value is beyond +/- Max range
		setLnParm911Retry1000((int)number);
	}
	
	/**
	 * 	Update LnParm911Retry1000 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLnParm911Retry1000(char[] value) throws CFException {
		 lnParm911Retry1000 = serializeLnParm911Retry1000(value);
	}
	/**
	 * 	Update LnParm911Retry1000 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLnParm911Retry1000String(char[] value) throws CFException {
		 setLnParm911Retry1000(value);
	}
	/**
	 *	Returns the value of lnMqDebugSw1000
	 *	@return lnMqDebugSw1000
	 */
   public char[] getLnMqDebugSw1000() throws CFException{
     if (isLnMqDebugSw1000Modified()) { 
        lnMqDebugSw1000 = refreshLnMqDebugSw1000();
     }
   		return lnMqDebugSw1000;
   }

  
	/**
	*  set variable lnMqDebugSw1000
	*  Corresponding COBOL Variable is 1000-LN-MQ-DEBUG-SW
	*  @param value
	**/
   public void setLnMqDebugSw1000(char[] value) {
      lnMqDebugSw1000 = checkLnMqDebugSw1000Constraints(value);
      serializeLnMqDebugSw1000(lnMqDebugSw1000);
   } 

     /**
	 * 	Update LnMqDebugSw1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLnMqDebugSw1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLnMqDebugSw1000,lnMqDebugSw1000.length);
   	
   }
   
   public void setLnMqDebugSw1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLnMqDebugSw1000,lnMqDebugSw1000.length);
   	
   }
   
     /**
	 * 	Update LnMqDebugSw1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLnMqDebugSw1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLnMqDebugSw1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LnMqDebugSw1000 with another Field
	 *	@param value
	 */
   public void setLnMqDebugSw1000(Field source) {
       replace(source,0,source.length(),beginLnMqDebugSw1000,LN_MQ_DEBUG_SW_1000_LEN);
   	
   }  
   
     /**
	 * 	Update LnMqDebugSw1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLnMqDebugSw1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLnMqDebugSw1000,LN_MQ_DEBUG_SW_1000_LEN);
   	
   }
   
     /**
	 * 	Update LnMqDebugSw1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLnMqDebugSw1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLnMqDebugSw1000+targetIndex,targetLen);
    
   }

	
	
	

		public static int getParms1000FieldLength() {
			return PARMS_1000_LENGTH;
		}

}
  

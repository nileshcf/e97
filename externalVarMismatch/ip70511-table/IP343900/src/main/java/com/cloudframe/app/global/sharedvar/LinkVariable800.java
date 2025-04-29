package com.cloudframe.app.global.sharedvar;

/**
*  The class LinkVariable800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_linkVariable800")

public class LinkVariable800 extends LinkVariable800Serialized  implements InitializingBean {
   

						private char[] lnFacreqJobgrpName800 = Field.fillLowValue(6);

						private char[] lnFacreqJobgrpNum800 = Field.fillLowValue(2);

						private char[] lnCloneOwnerId800 = Field.fillLowValue(3);

								private int lnParm911Retry800;
	
	/**
	* Constructor for LinkVariable800
	**/
    public LinkVariable800() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of lnFacreqJobgrpName800
	 *	@return lnFacreqJobgrpName800
	 */
   public char[] getLnFacreqJobgrpName800() throws CFException{
     if (isLnFacreqJobgrpName800Modified()) { 
        lnFacreqJobgrpName800 = refreshLnFacreqJobgrpName800();
     }
   		return lnFacreqJobgrpName800;
   }

  
	/**
	*  set variable lnFacreqJobgrpName800
	*  Corresponding COBOL Variable is 800-LN-FACREQ-JOBGRP-NAME
	*  @param value
	**/
   public void setLnFacreqJobgrpName800(char[] value) {
      lnFacreqJobgrpName800 = checkLnFacreqJobgrpName800Constraints(value);
      serializeLnFacreqJobgrpName800(lnFacreqJobgrpName800);
   } 

     /**
	 * 	Update LnFacreqJobgrpName800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLnFacreqJobgrpName800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLnFacreqJobgrpName800,lnFacreqJobgrpName800.length);
   	
   }
   
   public void setLnFacreqJobgrpName800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLnFacreqJobgrpName800,lnFacreqJobgrpName800.length);
   	
   }
   
     /**
	 * 	Update LnFacreqJobgrpName800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLnFacreqJobgrpName800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLnFacreqJobgrpName800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LnFacreqJobgrpName800 with another Field
	 *	@param value
	 */
   public void setLnFacreqJobgrpName800(Field source) {
       replace(source,0,source.length(),beginLnFacreqJobgrpName800,LN_FACREQ_JOBGRP_NAME_800_LEN);
   	
   }  
   
     /**
	 * 	Update LnFacreqJobgrpName800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLnFacreqJobgrpName800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLnFacreqJobgrpName800,LN_FACREQ_JOBGRP_NAME_800_LEN);
   	
   }
   
     /**
	 * 	Update LnFacreqJobgrpName800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLnFacreqJobgrpName800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLnFacreqJobgrpName800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lnFacreqJobgrpNum800
	 *	@return lnFacreqJobgrpNum800
	 */
   public char[] getLnFacreqJobgrpNum800() throws CFException{
     if (isLnFacreqJobgrpNum800Modified()) { 
        lnFacreqJobgrpNum800 = refreshLnFacreqJobgrpNum800();
     }
   		return lnFacreqJobgrpNum800;
   }

  
	/**
	*  set variable lnFacreqJobgrpNum800
	*  Corresponding COBOL Variable is 800-LN-FACREQ-JOBGRP-NUM
	*  @param value
	**/
   public void setLnFacreqJobgrpNum800(char[] value) {
      lnFacreqJobgrpNum800 = checkLnFacreqJobgrpNum800Constraints(value);
      serializeLnFacreqJobgrpNum800(lnFacreqJobgrpNum800);
   } 

     /**
	 * 	Update LnFacreqJobgrpNum800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLnFacreqJobgrpNum800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLnFacreqJobgrpNum800,lnFacreqJobgrpNum800.length);
   	
   }
   
   public void setLnFacreqJobgrpNum800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLnFacreqJobgrpNum800,lnFacreqJobgrpNum800.length);
   	
   }
   
     /**
	 * 	Update LnFacreqJobgrpNum800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLnFacreqJobgrpNum800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLnFacreqJobgrpNum800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LnFacreqJobgrpNum800 with another Field
	 *	@param value
	 */
   public void setLnFacreqJobgrpNum800(Field source) {
       replace(source,0,source.length(),beginLnFacreqJobgrpNum800,LN_FACREQ_JOBGRP_NUM_800_LEN);
   	
   }  
   
     /**
	 * 	Update LnFacreqJobgrpNum800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLnFacreqJobgrpNum800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLnFacreqJobgrpNum800,LN_FACREQ_JOBGRP_NUM_800_LEN);
   	
   }
   
     /**
	 * 	Update LnFacreqJobgrpNum800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLnFacreqJobgrpNum800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLnFacreqJobgrpNum800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lnCloneOwnerId800
	 *	@return lnCloneOwnerId800
	 */
   public char[] getLnCloneOwnerId800() throws CFException{
     if (isLnCloneOwnerId800Modified()) { 
        lnCloneOwnerId800 = refreshLnCloneOwnerId800();
     }
   		return lnCloneOwnerId800;
   }

  
	/**
	*  set variable lnCloneOwnerId800
	*  Corresponding COBOL Variable is 800-LN-CLONE-OWNER-ID
	*  @param value
	**/
   public void setLnCloneOwnerId800(char[] value) {
      lnCloneOwnerId800 = checkLnCloneOwnerId800Constraints(value);
      serializeLnCloneOwnerId800(lnCloneOwnerId800);
   } 

     /**
	 * 	Update LnCloneOwnerId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLnCloneOwnerId800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLnCloneOwnerId800,lnCloneOwnerId800.length);
   	
   }
   
   public void setLnCloneOwnerId800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLnCloneOwnerId800,lnCloneOwnerId800.length);
   	
   }
   
     /**
	 * 	Update LnCloneOwnerId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLnCloneOwnerId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLnCloneOwnerId800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LnCloneOwnerId800 with another Field
	 *	@param value
	 */
   public void setLnCloneOwnerId800(Field source) {
       replace(source,0,source.length(),beginLnCloneOwnerId800,LN_CLONE_OWNER_ID_800_LEN);
   	
   }  
   
     /**
	 * 	Update LnCloneOwnerId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLnCloneOwnerId800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLnCloneOwnerId800,LN_CLONE_OWNER_ID_800_LEN);
   	
   }
   
     /**
	 * 	Update LnCloneOwnerId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLnCloneOwnerId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLnCloneOwnerId800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lnParm911Retry800
	 *	@return lnParm911Retry800
	 */
	public int getLnParm911Retry800() throws CFException {
       if (isLnParm911Retry800Modified()) { 
           lnParm911Retry800 = refreshLnParm911Retry800();
        }
   		return lnParm911Retry800;
	}
	

	
	   
	/**
	 * 	Update LnParm911Retry800 with the passed value
	 *  Corresponding COBOL Variable is 800-LN-PARM-911-RETRY
	 *	@param number
	 */
	public void setLnParm911Retry800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    lnParm911Retry800 = checkLnParm911Retry800MaxLimit(number); 
		serializeLnParm911Retry800(lnParm911Retry800);
	}
	

	public void setLnParm911Retry800(long number) {
	    number = checkLnParm911Retry800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setLnParm911Retry800((int)number);
	}
	
	/**
	 * 	Update LnParm911Retry800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLnParm911Retry800(char[] value) throws CFException {
		 lnParm911Retry800 = serializeLnParm911Retry800(value);
	}
	/**
	 * 	Update LnParm911Retry800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLnParm911Retry800String(char[] value) throws CFException {
		 setLnParm911Retry800(value);
	}

	
	
	
	/**
	 * 	initializes LinkVariable800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setLnFacreqJobgrpName800(CONSTANTS.SPACE_6);
         setLnFacreqJobgrpNum800(CONSTANTS.SPACE_2);
         setLnCloneOwnerId800(CONSTANTS.SPACE_3);
                     setLnParm911Retry800(0);
   }

		public static int getLinkVariable800FieldLength() {
			return LINK_VARIABLE_800_LENGTH;
		}

}
  

package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RldusInEocRefBlTlr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RldusInEocRefBlTlr extends RldusInEocRefBlTlrSerialized { 
   

						private char[] rldusFiller = Field.fillLowValue(123);
	
	/**
	* Constructor for RldusInEocRefBlTlr
	**/
    public RldusInEocRefBlTlr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RldusInEocRefBlTlr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RldusInEocRefBlTlr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rldusFiller
	 *	@return rldusFiller
	 */
   public char[] getRldusFiller() throws CFException{
     if (isRldusFillerModified()) { 
        rldusFiller = refreshRldusFiller();
     }
   		return rldusFiller;
   }

  
	/**
	*  set variable rldusFiller
	*  Corresponding COBOL Variable is RLDUS-FILLER
	*  @param value
	**/
   public void setRldusFiller(char[] value) {
      rldusFiller = checkRldusFillerConstraints(value);
      serializeRldusFiller(rldusFiller);
   } 

     /**
	 * 	Update RldusFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRldusFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRldusFiller,rldusFiller.length);
   	
   }
   
   public void setRldusFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRldusFiller,rldusFiller.length);
   	
   }
   
     /**
	 * 	Update RldusFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRldusFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRldusFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RldusFiller with another Field
	 *	@param value
	 */
   public void setRldusFiller(Field source) {
       replace(source,0,source.length(),beginRldusFiller,RLDUS_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update RldusFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRldusFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRldusFiller,RLDUS_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update RldusFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRldusFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRldusFiller+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRldusInEocRefBlTlrFieldLength() {
			return RLDUS_IN_EOC_REF_BL_TLR_LENGTH;
		}

}
  

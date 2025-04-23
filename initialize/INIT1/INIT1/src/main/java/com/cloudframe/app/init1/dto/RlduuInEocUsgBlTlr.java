package com.cloudframe.app.init1.dto;

/**
*  The class RlduuInEocUsgBlTlr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlduuInEocUsgBlTlr extends RlduuInEocUsgBlTlrSerialized { 
   

						private char[] rlduuFiller = Field.fillLowValue(971);
	
	/**
	* Constructor for RlduuInEocUsgBlTlr
	**/
    public RlduuInEocUsgBlTlr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RlduuInEocUsgBlTlr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlduuInEocUsgBlTlr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlduuFiller
	 *	@return rlduuFiller
	 */
   public char[] getRlduuFiller() throws CFException{
     if (isRlduuFillerModified()) { 
        rlduuFiller = refreshRlduuFiller();
     }
   		return rlduuFiller;
   }

  
	/**
	*  set variable rlduuFiller
	*  Corresponding COBOL Variable is RLDUU-FILLER
	*  @param value
	**/
   public void setRlduuFiller(char[] value) {
      rlduuFiller = checkRlduuFillerConstraints(value);
      serializeRlduuFiller(rlduuFiller);
   } 

     /**
	 * 	Update RlduuFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlduuFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlduuFiller,rlduuFiller.length);
   	
   }
   
   public void setRlduuFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlduuFiller,rlduuFiller.length);
   	
   }
   
     /**
	 * 	Update RlduuFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlduuFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlduuFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RlduuFiller with another Field
	 *	@param value
	 */
   public void setRlduuFiller(Field source) {
       replace(source,0,source.length(),beginRlduuFiller,RLDUU_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update RlduuFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlduuFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlduuFiller,RLDUU_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update RlduuFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlduuFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlduuFiller+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRlduuInEocUsgBlTlrFieldLength() {
			return RLDUU_IN_EOC_USG_BL_TLR_LENGTH;
		}

}
  

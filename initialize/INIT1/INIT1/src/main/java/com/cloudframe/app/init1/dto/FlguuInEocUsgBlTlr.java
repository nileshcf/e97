package com.cloudframe.app.init1.dto;

/**
*  The class FlguuInEocUsgBlTlr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FlguuInEocUsgBlTlr extends FlguuInEocUsgBlTlrSerialized { 
   

						private char[] flguuFiller = Field.fillLowValue(971);
	
	/**
	* Constructor for FlguuInEocUsgBlTlr
	**/
    public FlguuInEocUsgBlTlr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FlguuInEocUsgBlTlr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FlguuInEocUsgBlTlr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of flguuFiller
	 *	@return flguuFiller
	 */
   public char[] getFlguuFiller() throws CFException{
     if (isFlguuFillerModified()) { 
        flguuFiller = refreshFlguuFiller();
     }
   		return flguuFiller;
   }

  
	/**
	*  set variable flguuFiller
	*  Corresponding COBOL Variable is FLGUU-FILLER
	*  @param value
	**/
   public void setFlguuFiller(char[] value) {
      flguuFiller = checkFlguuFillerConstraints(value);
      serializeFlguuFiller(flguuFiller);
   } 

     /**
	 * 	Update FlguuFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFlguuFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFlguuFiller,flguuFiller.length);
   	
   }
   
   public void setFlguuFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFlguuFiller,flguuFiller.length);
   	
   }
   
     /**
	 * 	Update FlguuFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFlguuFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFlguuFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FlguuFiller with another Field
	 *	@param value
	 */
   public void setFlguuFiller(Field source) {
       replace(source,0,source.length(),beginFlguuFiller,FLGUU_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update FlguuFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFlguuFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFlguuFiller,FLGUU_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update FlguuFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFlguuFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFlguuFiller+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFlguuInEocUsgBlTlrFieldLength() {
			return FLGUU_IN_EOC_USG_BL_TLR_LENGTH;
		}

}
  

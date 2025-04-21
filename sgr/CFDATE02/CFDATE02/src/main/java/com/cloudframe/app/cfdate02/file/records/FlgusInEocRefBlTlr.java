package com.cloudframe.app.cfdate02.file.records;

/**
*  The class FlgusInEocRefBlTlr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FlgusInEocRefBlTlr extends FlgusInEocRefBlTlrSerialized { 
   

						private char[] flgusFiller = Field.fillLowValue(123);
	
	/**
	* Constructor for FlgusInEocRefBlTlr
	**/
    public FlgusInEocRefBlTlr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FlgusInEocRefBlTlr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FlgusInEocRefBlTlr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of flgusFiller
	 *	@return flgusFiller
	 */
   public char[] getFlgusFiller() throws CFException{
     if (isFlgusFillerModified()) { 
        flgusFiller = refreshFlgusFiller();
     }
   		return flgusFiller;
   }

  
	/**
	*  set variable flgusFiller
	*  Corresponding COBOL Variable is FLGUS-FILLER
	*  @param value
	**/
   public void setFlgusFiller(char[] value) {
      flgusFiller = checkFlgusFillerConstraints(value);
      serializeFlgusFiller(flgusFiller);
   } 

     /**
	 * 	Update FlgusFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFlgusFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFlgusFiller,flgusFiller.length);
   	
   }
   
   public void setFlgusFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFlgusFiller,flgusFiller.length);
   	
   }
   
     /**
	 * 	Update FlgusFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFlgusFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFlgusFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FlgusFiller with another Field
	 *	@param value
	 */
   public void setFlgusFiller(Field source) {
       replace(source,0,source.length(),beginFlgusFiller,FLGUS_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update FlgusFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFlgusFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFlgusFiller,FLGUS_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update FlgusFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFlgusFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFlgusFiller+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFlgusInEocRefBlTlrFieldLength() {
			return FLGUS_IN_EOC_REF_BL_TLR_LENGTH;
		}

}
  

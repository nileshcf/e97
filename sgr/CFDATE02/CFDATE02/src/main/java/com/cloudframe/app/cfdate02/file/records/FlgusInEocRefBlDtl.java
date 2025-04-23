package com.cloudframe.app.cfdate02.file.records;

/**
*  The class FlgusInEocRefBlDtl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FlgusInEocRefBlDtl extends FlgusInEocRefBlDtlSerialized { 
   

						private char[] flgusCpduRec = Field.fillLowValue(161);
	
	/**
	* Constructor for FlgusInEocRefBlDtl
	**/
    public FlgusInEocRefBlDtl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FlgusInEocRefBlDtl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FlgusInEocRefBlDtl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of flgusCpduRec
	 *	@return flgusCpduRec
	 */
   public char[] getFlgusCpduRec() throws CFException{
     if (isFlgusCpduRecModified()) { 
        flgusCpduRec = refreshFlgusCpduRec();
     }
   		return flgusCpduRec;
   }

  
	/**
	*  set variable flgusCpduRec
	*  Corresponding COBOL Variable is FLGUS-CPDU-REC
	*  @param value
	**/
   public void setFlgusCpduRec(char[] value) {
      flgusCpduRec = checkFlgusCpduRecConstraints(value);
      serializeFlgusCpduRec(flgusCpduRec);
   } 

     /**
	 * 	Update FlgusCpduRec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFlgusCpduRec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFlgusCpduRec,flgusCpduRec.length);
   	
   }
   
   public void setFlgusCpduRec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFlgusCpduRec,flgusCpduRec.length);
   	
   }
   
     /**
	 * 	Update FlgusCpduRec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFlgusCpduRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFlgusCpduRec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FlgusCpduRec with another Field
	 *	@param value
	 */
   public void setFlgusCpduRec(Field source) {
       replace(source,0,source.length(),beginFlgusCpduRec,FLGUS_CPDU_REC_LEN);
   	
   }  
   
     /**
	 * 	Update FlgusCpduRec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFlgusCpduRec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFlgusCpduRec,FLGUS_CPDU_REC_LEN);
   	
   }
   
     /**
	 * 	Update FlgusCpduRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFlgusCpduRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFlgusCpduRec+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFlgusInEocRefBlDtlFieldLength() {
			return FLGUS_IN_EOC_REF_BL_DTL_LENGTH;
		}

}
  

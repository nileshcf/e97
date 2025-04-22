package com.cloudframe.app.sup01780.file.records;

/**
*  The class TmPanRecord10 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:18. using version 5.0.0.254
**/


import com.cloudframe.app.sup01780.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TmPanRecord10 extends TmPanRecord10Serialized {
   

						private char[] panKey10 = Field.fillLowValue(19);
	
	/**
	* Constructor for TmPanRecord10
	**/
    public TmPanRecord10() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of panKey10
	 *	@return panKey10
	 */
   public char[] getPanKey10() throws CFException{
     if (isPanKey10Modified()) { 
        panKey10 = refreshPanKey10();
     }
   		return panKey10;
   }

  
	/**
	*  set variable panKey10
	*  Corresponding COBOL Variable is PAN-KEY-10
	*  @param value
	**/
   public void setPanKey10(char[] value) {
      panKey10 = checkPanKey10Constraints(value);
      serializePanKey10(panKey10);
   } 

     /**
	 * 	Update PanKey10 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPanKey10(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPanKey10,panKey10.length);
   	
   }
   
   public void setPanKey10(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPanKey10,panKey10.length);
   	
   }
   
     /**
	 * 	Update PanKey10 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPanKey10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPanKey10+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PanKey10 with another Field
	 *	@param value
	 */
   public void setPanKey10(Field source) {
       replace(source,0,source.length(),beginPanKey10,PAN_KEY_10_LEN);
   	
   }  
   
     /**
	 * 	Update PanKey10 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPanKey10(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPanKey10,PAN_KEY_10_LEN);
   	
   }
   
     /**
	 * 	Update PanKey10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPanKey10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPanKey10+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTmPanRecord10FieldLength() {
			return TM_PAN_RECORD_10_LENGTH;
		}

}
  

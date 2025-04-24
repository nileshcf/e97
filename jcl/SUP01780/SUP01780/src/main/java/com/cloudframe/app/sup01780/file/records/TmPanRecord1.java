package com.cloudframe.app.sup01780.file.records;

/**
*  The class TmPanRecord1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:41. using version 5.0.0.254
**/


import com.cloudframe.app.sup01780.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TmPanRecord1 extends TmPanRecord1Serialized { 
   

						private char[] panKey1 = Field.fillLowValue(19);
	
	/**
	* Constructor for TmPanRecord1
	**/
    public TmPanRecord1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of panKey1
	 *	@return panKey1
	 */
   public char[] getPanKey1() throws CFException{
     if (isPanKey1Modified()) { 
        panKey1 = refreshPanKey1();
     }
   		return panKey1;
   }

  
	/**
	*  set variable panKey1
	*  Corresponding COBOL Variable is PAN-KEY-1
	*  @param value
	**/
   public void setPanKey1(char[] value) {
      panKey1 = checkPanKey1Constraints(value);
      serializePanKey1(panKey1);
   } 

     /**
	 * 	Update PanKey1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPanKey1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPanKey1,panKey1.length);
   	
   }
   
   public void setPanKey1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPanKey1,panKey1.length);
   	
   }
   
     /**
	 * 	Update PanKey1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPanKey1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPanKey1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PanKey1 with another Field
	 *	@param value
	 */
   public void setPanKey1(Field source) {
       replace(source,0,source.length(),beginPanKey1,PAN_KEY_1_LEN);
   	
   }  
   
     /**
	 * 	Update PanKey1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPanKey1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPanKey1,PAN_KEY_1_LEN);
   	
   }
   
     /**
	 * 	Update PanKey1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPanKey1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPanKey1+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTmPanRecord1FieldLength() {
			return TM_PAN_RECORD_1_LENGTH;
		}

}
  

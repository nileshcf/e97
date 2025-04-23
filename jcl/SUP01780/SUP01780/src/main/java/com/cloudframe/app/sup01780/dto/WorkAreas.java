package com.cloudframe.app.sup01780.dto;

/**
*  The class WorkAreas is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:09. using version 5.0.0.254
**/


import com.cloudframe.app.sup01780.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class WorkAreas extends WorkAreasSerialized {
   

						private char[] panStatus1 = new char[2];

						private char[] panStatus10 = new char[2];
	
	/**
	* Constructor for WorkAreas
	**/
    public WorkAreas() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPanStatus1(fillSpace(2));
								setPanStatus10(fillSpace(2));
    }


 

	/**
	 *	Returns the value of panStatus1
	 *	@return panStatus1
	 */
   public char[] getPanStatus1() throws CFException{
     if (isPanStatus1Modified()) { 
        panStatus1 = refreshPanStatus1();
     }
   		return panStatus1;
   }

  
	/**
	*  set variable panStatus1
	*  Corresponding COBOL Variable is WS-PAN-STATUS-1
	*  @param value
	**/
   public void setPanStatus1(char[] value) {
      panStatus1 = checkPanStatus1Constraints(value);
      serializePanStatus1(panStatus1);
   } 

     /**
	 * 	Update PanStatus1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPanStatus1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPanStatus1,panStatus1.length);
   	
   }
   
   public void setPanStatus1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPanStatus1,panStatus1.length);
   	
   }
   
     /**
	 * 	Update PanStatus1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPanStatus1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPanStatus1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PanStatus1 with another Field
	 *	@param value
	 */
   public void setPanStatus1(Field source) {
       replace(source,0,source.length(),beginPanStatus1,PAN_STATUS_1_LEN);
   	
   }  
   
     /**
	 * 	Update PanStatus1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPanStatus1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPanStatus1,PAN_STATUS_1_LEN);
   	
   }
   
     /**
	 * 	Update PanStatus1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPanStatus1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPanStatus1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of panStatus10
	 *	@return panStatus10
	 */
   public char[] getPanStatus10() throws CFException{
     if (isPanStatus10Modified()) { 
        panStatus10 = refreshPanStatus10();
     }
   		return panStatus10;
   }

  
	/**
	*  set variable panStatus10
	*  Corresponding COBOL Variable is WS-PAN-STATUS-10
	*  @param value
	**/
   public void setPanStatus10(char[] value) {
      panStatus10 = checkPanStatus10Constraints(value);
      serializePanStatus10(panStatus10);
   } 

     /**
	 * 	Update PanStatus10 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPanStatus10(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPanStatus10,panStatus10.length);
   	
   }
   
   public void setPanStatus10(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPanStatus10,panStatus10.length);
   	
   }
   
     /**
	 * 	Update PanStatus10 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPanStatus10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPanStatus10+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PanStatus10 with another Field
	 *	@param value
	 */
   public void setPanStatus10(Field source) {
       replace(source,0,source.length(),beginPanStatus10,PAN_STATUS_10_LEN);
   	
   }  
   
     /**
	 * 	Update PanStatus10 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPanStatus10(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPanStatus10,PAN_STATUS_10_LEN);
   	
   }
   
     /**
	 * 	Update PanStatus10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPanStatus10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPanStatus10+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WorkAreas
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setPanStatus1(CONSTANTS.SPACE_2);
         setPanStatus10(CONSTANTS.SPACE_2);
   }

		public static int getWorkAreasFieldLength() {
			return WORK_AREAS_LENGTH;
		}

}
  

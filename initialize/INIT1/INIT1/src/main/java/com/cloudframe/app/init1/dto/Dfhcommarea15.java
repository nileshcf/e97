package com.cloudframe.app.init1.dto;

/**
*  The class Dfhcommarea15 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dfhcommarea15 extends Dfhcommarea15Serialized { 
   
				private CmnTimeCalcInputArea cmnTimeCalcInputArea = new CmnTimeCalcInputArea();
				private CmnTimeCalcOutputArea cmnTimeCalcOutputArea = new CmnTimeCalcOutputArea();

	
	/**
	* Constructor for Dfhcommarea15
	**/
    public Dfhcommarea15() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Dfhcommarea15. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dfhcommarea15(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnTimeCalcInputArea.setParent(this,getStartOffset() + 0);
	       			cmnTimeCalcOutputArea.setParent(this,getStartOffset() + 22);
    } 

	/**
	 *	Returns the value of cmnTimeCalcInputArea
	 *	@return cmnTimeCalcInputArea
	 */   
	 public CmnTimeCalcInputArea getCmnTimeCalcInputArea() {
   	return cmnTimeCalcInputArea;
   }
   /**
	* 	Update CmnTimeCalcInputArea with the passed value
	*   Corresponding COBOL Variable is CMN-TIME-CALC-INPUT-AREA
	*	@param value
	*/
   public void setCmnTimeCalcInputArea(char[] value) {
      cmnTimeCalcInputArea.setString(value); 
   }   
    
     /**
	 * 	Update CmnTimeCalcInputArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeCalcInputArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeCalcInputArea.begin,cmnTimeCalcInputArea.length());
   }
   
     /**
	 * 	Update CmnTimeCalcInputArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeCalcInputArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeCalcInputArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnTimeCalcInputArea with another Field
	 *	@param value
	 */
   public void setCmnTimeCalcInputArea(Field source) {
   	replace(source,0,source.length(),cmnTimeCalcInputArea.begin,cmnTimeCalcInputArea.length());
   }  
   
     /**
	 * 	Update CmnTimeCalcInputArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeCalcInputArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeCalcInputArea.begin,cmnTimeCalcInputArea.length());
   }
   
     /**
	 * 	Update CmnTimeCalcInputArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeCalcInputArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeCalcInputArea.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnTimeCalcOutputArea
	 *	@return cmnTimeCalcOutputArea
	 */   
	 public CmnTimeCalcOutputArea getCmnTimeCalcOutputArea() {
   	return cmnTimeCalcOutputArea;
   }
   /**
	* 	Update CmnTimeCalcOutputArea with the passed value
	*   Corresponding COBOL Variable is CMN-TIME-CALC-OUTPUT-AREA
	*	@param value
	*/
   public void setCmnTimeCalcOutputArea(char[] value) {
      cmnTimeCalcOutputArea.setString(value); 
   }   
    
     /**
	 * 	Update CmnTimeCalcOutputArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeCalcOutputArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeCalcOutputArea.begin,cmnTimeCalcOutputArea.length());
   }
   
     /**
	 * 	Update CmnTimeCalcOutputArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeCalcOutputArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeCalcOutputArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnTimeCalcOutputArea with another Field
	 *	@param value
	 */
   public void setCmnTimeCalcOutputArea(Field source) {
   	replace(source,0,source.length(),cmnTimeCalcOutputArea.begin,cmnTimeCalcOutputArea.length());
   }  
   
     /**
	 * 	Update CmnTimeCalcOutputArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeCalcOutputArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeCalcOutputArea.begin,cmnTimeCalcOutputArea.length());
   }
   
     /**
	 * 	Update CmnTimeCalcOutputArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeCalcOutputArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeCalcOutputArea.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDfhcommarea15FieldLength() {
			return DFHCOMMAREA_15_LENGTH;
		}

}
  

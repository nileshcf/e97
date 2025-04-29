package com.cloudframe.app.cfdate02.dto;

/**
*  The class Dfhcommarea12 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dfhcommarea12 extends Dfhcommarea12Serialized { 
   
				private CmnDateCalcInputArea cmnDateCalcInputArea = new CmnDateCalcInputArea();
				private CmnDateCalcOutputArea cmnDateCalcOutputArea = new CmnDateCalcOutputArea();
	
	/**
	* Constructor for Dfhcommarea12
	**/
    public Dfhcommarea12() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Dfhcommarea12. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dfhcommarea12(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnDateCalcInputArea.setParent(this,getStartOffset() + 0);
	       			cmnDateCalcOutputArea.setParent(this,getStartOffset() + 32);
    } 

	/**
	 *	Returns the value of cmnDateCalcInputArea
	 *	@return cmnDateCalcInputArea
	 */   
	 public CmnDateCalcInputArea getCmnDateCalcInputArea() {
   	return cmnDateCalcInputArea;
   }
   /**
	* 	Update CmnDateCalcInputArea with the passed value
	*   Corresponding COBOL Variable is CMN-DATE-CALC-INPUT-AREA
	*	@param value
	*/
   public void setCmnDateCalcInputArea(char[] value) {
      cmnDateCalcInputArea.setString(value); 
   }   
    
     /**
	 * 	Update CmnDateCalcInputArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcInputArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcInputArea.begin,cmnDateCalcInputArea.length());
   }
   
     /**
	 * 	Update CmnDateCalcInputArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcInputArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcInputArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnDateCalcInputArea with another Field
	 *	@param value
	 */
   public void setCmnDateCalcInputArea(Field source) {
   	replace(source,0,source.length(),cmnDateCalcInputArea.begin,cmnDateCalcInputArea.length());
   }  
   
     /**
	 * 	Update CmnDateCalcInputArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcInputArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcInputArea.begin,cmnDateCalcInputArea.length());
   }
   
     /**
	 * 	Update CmnDateCalcInputArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcInputArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcInputArea.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnDateCalcOutputArea
	 *	@return cmnDateCalcOutputArea
	 */   
	 public CmnDateCalcOutputArea getCmnDateCalcOutputArea() {
   	return cmnDateCalcOutputArea;
   }
   /**
	* 	Update CmnDateCalcOutputArea with the passed value
	*   Corresponding COBOL Variable is CMN-DATE-CALC-OUTPUT-AREA
	*	@param value
	*/
   public void setCmnDateCalcOutputArea(char[] value) {
      cmnDateCalcOutputArea.setString(value); 
   }   
    
     /**
	 * 	Update CmnDateCalcOutputArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcOutputArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcOutputArea.begin,cmnDateCalcOutputArea.length());
   }
   
     /**
	 * 	Update CmnDateCalcOutputArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcOutputArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcOutputArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnDateCalcOutputArea with another Field
	 *	@param value
	 */
   public void setCmnDateCalcOutputArea(Field source) {
   	replace(source,0,source.length(),cmnDateCalcOutputArea.begin,cmnDateCalcOutputArea.length());
   }  
   
     /**
	 * 	Update CmnDateCalcOutputArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcOutputArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcOutputArea.begin,cmnDateCalcOutputArea.length());
   }
   
     /**
	 * 	Update CmnDateCalcOutputArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcOutputArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcOutputArea.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDfhcommarea12FieldLength() {
			return DFHCOMMAREA_12_LENGTH;
		}

}
  

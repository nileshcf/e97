package com.cloudframe.app.init1.dto;

/**
*  The class Dfhcommarea13 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dfhcommarea13 extends Dfhcommarea13Serialized { 
   
				private CmnDateConvInputArea cmnDateConvInputArea = new CmnDateConvInputArea();
				private CmnDateConvOutputArea cmnDateConvOutputArea = new CmnDateConvOutputArea();

	
	/**
	* Constructor for Dfhcommarea13
	**/
    public Dfhcommarea13() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Dfhcommarea13. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dfhcommarea13(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnDateConvInputArea.setParent(this,getStartOffset() + 0);
	       			cmnDateConvOutputArea.setParent(this,getStartOffset() + 18);
    } 

	/**
	 *	Returns the value of cmnDateConvInputArea
	 *	@return cmnDateConvInputArea
	 */   
	 public CmnDateConvInputArea getCmnDateConvInputArea() {
   	return cmnDateConvInputArea;
   }
   /**
	* 	Update CmnDateConvInputArea with the passed value
	*   Corresponding COBOL Variable is CMN-DATE-CONV-INPUT-AREA
	*	@param value
	*/
   public void setCmnDateConvInputArea(char[] value) {
      cmnDateConvInputArea.setString(value); 
   }   
    
     /**
	 * 	Update CmnDateConvInputArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnDateConvInputArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateConvInputArea.begin,cmnDateConvInputArea.length());
   }
   
     /**
	 * 	Update CmnDateConvInputArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateConvInputArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateConvInputArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnDateConvInputArea with another Field
	 *	@param value
	 */
   public void setCmnDateConvInputArea(Field source) {
   	replace(source,0,source.length(),cmnDateConvInputArea.begin,cmnDateConvInputArea.length());
   }  
   
     /**
	 * 	Update CmnDateConvInputArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnDateConvInputArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateConvInputArea.begin,cmnDateConvInputArea.length());
   }
   
     /**
	 * 	Update CmnDateConvInputArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateConvInputArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateConvInputArea.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnDateConvOutputArea
	 *	@return cmnDateConvOutputArea
	 */   
	 public CmnDateConvOutputArea getCmnDateConvOutputArea() {
   	return cmnDateConvOutputArea;
   }
   /**
	* 	Update CmnDateConvOutputArea with the passed value
	*   Corresponding COBOL Variable is CMN-DATE-CONV-OUTPUT-AREA
	*	@param value
	*/
   public void setCmnDateConvOutputArea(char[] value) {
      cmnDateConvOutputArea.setString(value); 
   }   
    
     /**
	 * 	Update CmnDateConvOutputArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnDateConvOutputArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateConvOutputArea.begin,cmnDateConvOutputArea.length());
   }
   
     /**
	 * 	Update CmnDateConvOutputArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateConvOutputArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateConvOutputArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnDateConvOutputArea with another Field
	 *	@param value
	 */
   public void setCmnDateConvOutputArea(Field source) {
   	replace(source,0,source.length(),cmnDateConvOutputArea.begin,cmnDateConvOutputArea.length());
   }  
   
     /**
	 * 	Update CmnDateConvOutputArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnDateConvOutputArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateConvOutputArea.begin,cmnDateConvOutputArea.length());
   }
   
     /**
	 * 	Update CmnDateConvOutputArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateConvOutputArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateConvOutputArea.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDfhcommarea13FieldLength() {
			return DFHCOMMAREA_13_LENGTH;
		}

}
  

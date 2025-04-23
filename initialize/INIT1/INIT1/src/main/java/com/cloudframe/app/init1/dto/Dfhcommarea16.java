package com.cloudframe.app.init1.dto;

/**
*  The class Dfhcommarea16 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dfhcommarea16 extends Dfhcommarea16Serialized { 
   
				private CmnTimeConvInputArea cmnTimeConvInputArea = new CmnTimeConvInputArea();
				private CmnTimeConvOutputArea cmnTimeConvOutputArea = new CmnTimeConvOutputArea();

	
	/**
	* Constructor for Dfhcommarea16
	**/
    public Dfhcommarea16() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Dfhcommarea16. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dfhcommarea16(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnTimeConvInputArea.setParent(this,getStartOffset() + 0);
	       			cmnTimeConvOutputArea.setParent(this,getStartOffset() + 23);
    } 

	/**
	 *	Returns the value of cmnTimeConvInputArea
	 *	@return cmnTimeConvInputArea
	 */   
	 public CmnTimeConvInputArea getCmnTimeConvInputArea() {
   	return cmnTimeConvInputArea;
   }
   /**
	* 	Update CmnTimeConvInputArea with the passed value
	*   Corresponding COBOL Variable is CMN-TIME-CONV-INPUT-AREA
	*	@param value
	*/
   public void setCmnTimeConvInputArea(char[] value) {
      cmnTimeConvInputArea.setString(value); 
   }   
    
     /**
	 * 	Update CmnTimeConvInputArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeConvInputArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeConvInputArea.begin,cmnTimeConvInputArea.length());
   }
   
     /**
	 * 	Update CmnTimeConvInputArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeConvInputArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeConvInputArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnTimeConvInputArea with another Field
	 *	@param value
	 */
   public void setCmnTimeConvInputArea(Field source) {
   	replace(source,0,source.length(),cmnTimeConvInputArea.begin,cmnTimeConvInputArea.length());
   }  
   
     /**
	 * 	Update CmnTimeConvInputArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeConvInputArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeConvInputArea.begin,cmnTimeConvInputArea.length());
   }
   
     /**
	 * 	Update CmnTimeConvInputArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeConvInputArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeConvInputArea.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnTimeConvOutputArea
	 *	@return cmnTimeConvOutputArea
	 */   
	 public CmnTimeConvOutputArea getCmnTimeConvOutputArea() {
   	return cmnTimeConvOutputArea;
   }
   /**
	* 	Update CmnTimeConvOutputArea with the passed value
	*   Corresponding COBOL Variable is CMN-TIME-CONV-OUTPUT-AREA
	*	@param value
	*/
   public void setCmnTimeConvOutputArea(char[] value) {
      cmnTimeConvOutputArea.setString(value); 
   }   
    
     /**
	 * 	Update CmnTimeConvOutputArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeConvOutputArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeConvOutputArea.begin,cmnTimeConvOutputArea.length());
   }
   
     /**
	 * 	Update CmnTimeConvOutputArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeConvOutputArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeConvOutputArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnTimeConvOutputArea with another Field
	 *	@param value
	 */
   public void setCmnTimeConvOutputArea(Field source) {
   	replace(source,0,source.length(),cmnTimeConvOutputArea.begin,cmnTimeConvOutputArea.length());
   }  
   
     /**
	 * 	Update CmnTimeConvOutputArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeConvOutputArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeConvOutputArea.begin,cmnTimeConvOutputArea.length());
   }
   
     /**
	 * 	Update CmnTimeConvOutputArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeConvOutputArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeConvOutputArea.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDfhcommarea16FieldLength() {
			return DFHCOMMAREA_16_LENGTH;
		}

}
  

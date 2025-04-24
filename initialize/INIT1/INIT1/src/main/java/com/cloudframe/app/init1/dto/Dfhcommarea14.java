package com.cloudframe.app.init1.dto;

/**
*  The class Dfhcommarea14 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dfhcommarea14 extends Dfhcommarea14Serialized { 
   
				private CmnTimeValidateInputArea cmnTimeValidateInputArea = new CmnTimeValidateInputArea();
				private CmnTimeValidateOutputArea cmnTimeValidateOutputArea = new CmnTimeValidateOutputArea();

	
	/**
	* Constructor for Dfhcommarea14
	**/
    public Dfhcommarea14() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Dfhcommarea14. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dfhcommarea14(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnTimeValidateInputArea.setParent(this,getStartOffset() + 0);
	       			cmnTimeValidateOutputArea.setParent(this,getStartOffset() + 8);
    } 

	/**
	 *	Returns the value of cmnTimeValidateInputArea
	 *	@return cmnTimeValidateInputArea
	 */   
	 public CmnTimeValidateInputArea getCmnTimeValidateInputArea() {
   	return cmnTimeValidateInputArea;
   }
   /**
	* 	Update CmnTimeValidateInputArea with the passed value
	*   Corresponding COBOL Variable is CMN-TIME-VALIDATE-INPUT-AREA
	*	@param value
	*/
   public void setCmnTimeValidateInputArea(char[] value) {
      cmnTimeValidateInputArea.setString(value); 
   }   
    
     /**
	 * 	Update CmnTimeValidateInputArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeValidateInputArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeValidateInputArea.begin,cmnTimeValidateInputArea.length());
   }
   
     /**
	 * 	Update CmnTimeValidateInputArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeValidateInputArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeValidateInputArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnTimeValidateInputArea with another Field
	 *	@param value
	 */
   public void setCmnTimeValidateInputArea(Field source) {
   	replace(source,0,source.length(),cmnTimeValidateInputArea.begin,cmnTimeValidateInputArea.length());
   }  
   
     /**
	 * 	Update CmnTimeValidateInputArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeValidateInputArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeValidateInputArea.begin,cmnTimeValidateInputArea.length());
   }
   
     /**
	 * 	Update CmnTimeValidateInputArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeValidateInputArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeValidateInputArea.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnTimeValidateOutputArea
	 *	@return cmnTimeValidateOutputArea
	 */   
	 public CmnTimeValidateOutputArea getCmnTimeValidateOutputArea() {
   	return cmnTimeValidateOutputArea;
   }
   /**
	* 	Update CmnTimeValidateOutputArea with the passed value
	*   Corresponding COBOL Variable is CMN-TIME-VALIDATE-OUTPUT-AREA
	*	@param value
	*/
   public void setCmnTimeValidateOutputArea(char[] value) {
      cmnTimeValidateOutputArea.setString(value); 
   }   
    
     /**
	 * 	Update CmnTimeValidateOutputArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeValidateOutputArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeValidateOutputArea.begin,cmnTimeValidateOutputArea.length());
   }
   
     /**
	 * 	Update CmnTimeValidateOutputArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeValidateOutputArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeValidateOutputArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnTimeValidateOutputArea with another Field
	 *	@param value
	 */
   public void setCmnTimeValidateOutputArea(Field source) {
   	replace(source,0,source.length(),cmnTimeValidateOutputArea.begin,cmnTimeValidateOutputArea.length());
   }  
   
     /**
	 * 	Update CmnTimeValidateOutputArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeValidateOutputArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeValidateOutputArea.begin,cmnTimeValidateOutputArea.length());
   }
   
     /**
	 * 	Update CmnTimeValidateOutputArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeValidateOutputArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeValidateOutputArea.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDfhcommarea14FieldLength() {
			return DFHCOMMAREA_14_LENGTH;
		}

}
  

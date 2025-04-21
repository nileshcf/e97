package com.cloudframe.app.init1.dto;

/**
*  The class Dfhcommarea17 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dfhcommarea17 extends Dfhcommarea17Serialized { 
   
				private CmnPeriodInputArea cmnPeriodInputArea = new CmnPeriodInputArea();
				private CmnPeriodOutputArea cmnPeriodOutputArea = new CmnPeriodOutputArea();

	
	/**
	* Constructor for Dfhcommarea17
	**/
    public Dfhcommarea17() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Dfhcommarea17. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dfhcommarea17(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnPeriodInputArea.setParent(this,getStartOffset() + 0);
	       			cmnPeriodOutputArea.setParent(this,getStartOffset() + 4);
    } 

	/**
	 *	Returns the value of cmnPeriodInputArea
	 *	@return cmnPeriodInputArea
	 */   
	 public CmnPeriodInputArea getCmnPeriodInputArea() {
   	return cmnPeriodInputArea;
   }
   /**
	* 	Update CmnPeriodInputArea with the passed value
	*   Corresponding COBOL Variable is CMN-PERIOD-INPUT-AREA
	*	@param value
	*/
   public void setCmnPeriodInputArea(char[] value) {
      cmnPeriodInputArea.setString(value); 
   }   
    
     /**
	 * 	Update CmnPeriodInputArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnPeriodInputArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnPeriodInputArea.begin,cmnPeriodInputArea.length());
   }
   
     /**
	 * 	Update CmnPeriodInputArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnPeriodInputArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnPeriodInputArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnPeriodInputArea with another Field
	 *	@param value
	 */
   public void setCmnPeriodInputArea(Field source) {
   	replace(source,0,source.length(),cmnPeriodInputArea.begin,cmnPeriodInputArea.length());
   }  
   
     /**
	 * 	Update CmnPeriodInputArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnPeriodInputArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnPeriodInputArea.begin,cmnPeriodInputArea.length());
   }
   
     /**
	 * 	Update CmnPeriodInputArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnPeriodInputArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnPeriodInputArea.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnPeriodOutputArea
	 *	@return cmnPeriodOutputArea
	 */   
	 public CmnPeriodOutputArea getCmnPeriodOutputArea() {
   	return cmnPeriodOutputArea;
   }
   /**
	* 	Update CmnPeriodOutputArea with the passed value
	*   Corresponding COBOL Variable is CMN-PERIOD-OUTPUT-AREA
	*	@param value
	*/
   public void setCmnPeriodOutputArea(char[] value) {
      cmnPeriodOutputArea.setString(value); 
   }   
    
     /**
	 * 	Update CmnPeriodOutputArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnPeriodOutputArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnPeriodOutputArea.begin,cmnPeriodOutputArea.length());
   }
   
     /**
	 * 	Update CmnPeriodOutputArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnPeriodOutputArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnPeriodOutputArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnPeriodOutputArea with another Field
	 *	@param value
	 */
   public void setCmnPeriodOutputArea(Field source) {
   	replace(source,0,source.length(),cmnPeriodOutputArea.begin,cmnPeriodOutputArea.length());
   }  
   
     /**
	 * 	Update CmnPeriodOutputArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnPeriodOutputArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnPeriodOutputArea.begin,cmnPeriodOutputArea.length());
   }
   
     /**
	 * 	Update CmnPeriodOutputArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnPeriodOutputArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnPeriodOutputArea.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDfhcommarea17FieldLength() {
			return DFHCOMMAREA_17_LENGTH;
		}

}
  

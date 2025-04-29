package com.cloudframe.app.init1.dto;

/**
*  The class Dfhcommarea10 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dfhcommarea10 extends Dfhcommarea10Serialized { 
   
				private CmnDateTimeOutputArea cmnDateTimeOutputArea = new CmnDateTimeOutputArea();

	
	/**
	* Constructor for Dfhcommarea10
	**/
    public Dfhcommarea10() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Dfhcommarea10. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dfhcommarea10(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnDateTimeOutputArea.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of cmnDateTimeOutputArea
	 *	@return cmnDateTimeOutputArea
	 */   
	 public CmnDateTimeOutputArea getCmnDateTimeOutputArea() {
   	return cmnDateTimeOutputArea;
   }
   /**
	* 	Update CmnDateTimeOutputArea with the passed value
	*   Corresponding COBOL Variable is CMN-DATE-TIME-OUTPUT-AREA
	*	@param value
	*/
   public void setCmnDateTimeOutputArea(char[] value) {
      cmnDateTimeOutputArea.setString(value); 
   }   
    
     /**
	 * 	Update CmnDateTimeOutputArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnDateTimeOutputArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateTimeOutputArea.begin,cmnDateTimeOutputArea.length());
   }
   
     /**
	 * 	Update CmnDateTimeOutputArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateTimeOutputArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateTimeOutputArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnDateTimeOutputArea with another Field
	 *	@param value
	 */
   public void setCmnDateTimeOutputArea(Field source) {
   	replace(source,0,source.length(),cmnDateTimeOutputArea.begin,cmnDateTimeOutputArea.length());
   }  
   
     /**
	 * 	Update CmnDateTimeOutputArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnDateTimeOutputArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateTimeOutputArea.begin,cmnDateTimeOutputArea.length());
   }
   
     /**
	 * 	Update CmnDateTimeOutputArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateTimeOutputArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateTimeOutputArea.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Dfhcommarea10
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          cmnDateTimeOutputArea.initialize();
     
   }

		public static int getDfhcommarea10FieldLength() {
			return DFHCOMMAREA_10_LENGTH;
		}

}
  

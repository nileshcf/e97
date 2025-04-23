package com.cloudframe.app.init1.dto;

/**
*  The class CmnTimeConvInputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnTimeConvInputArea extends CmnTimeConvInputAreaSerialized { 
   

								private int cmnTimeConvType;
				private CmnTimeConvInput cmnTimeConvInput = new CmnTimeConvInput();
	
	/**
	* Constructor for CmnTimeConvInputArea
	**/
    public CmnTimeConvInputArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnTimeConvInputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeConvInputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnTimeConvInput.setParent(this,getStartOffset() + 1);
    } 

	/**
	 *	Returns the value of cmnTimeConvType
	 *	@return cmnTimeConvType
	 */
	public int getCmnTimeConvType() throws CFException {
       if (isCmnTimeConvTypeModified()) { 
           cmnTimeConvType = refreshCmnTimeConvType();
        }
   		return cmnTimeConvType;
	}
	

	
	   
	/**
	 * 	Update CmnTimeConvType with the passed value
	 *  Corresponding COBOL Variable is CMN-TIME-CONV-TYPE
	 *	@param number
	 */
	public void setCmnTimeConvType(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnTimeConvType = checkCmnTimeConvTypeMaxLimit(number); 
		serializeCmnTimeConvType(cmnTimeConvType);
	}
	

	public void setCmnTimeConvType(long number) {
	    number = checkCmnTimeConvTypeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnTimeConvType((int)number);
	}
	
	/**
	 * 	Update CmnTimeConvType with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnTimeConvType(char[] value) throws CFException {
		 cmnTimeConvType = serializeCmnTimeConvType(value);
	}
	/**
	 * 	Update CmnTimeConvType with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnTimeConvTypeString(char[] value) throws CFException {
		 setCmnTimeConvType(value);
	}
	
	/**
	 *	Test condition 1 for isDb2IsoToNumeric16()
	 *	@return  Returns true if isDb2IsoToNumeric16() is 1
	 */
   public boolean isDb2IsoToNumeric16() throws CFException {
      return (  getCmnTimeConvType()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setDb2IsoToNumeric16True() {  			
    	setCmnTimeConvType( 1);
   	}
	
	/**
	 *	Test condition 2 for isDb2IsoToAmPm16()
	 *	@return  Returns true if isDb2IsoToAmPm16() is 2
	 */
   public boolean isDb2IsoToAmPm16() throws CFException {
      return (  getCmnTimeConvType()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setDb2IsoToAmPm16True() {  			
    	setCmnTimeConvType( 2);
   	}
	
	/**
	 *	Test condition 3 for isJisToNumeric16()
	 *	@return  Returns true if isJisToNumeric16() is 3
	 */
   public boolean isJisToNumeric16() throws CFException {
      return (  getCmnTimeConvType()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setJisToNumeric16True() {  			
    	setCmnTimeConvType( 3);
   	}
	
	/**
	 *	Test condition 4 for isJisToAmPm16()
	 *	@return  Returns true if isJisToAmPm16() is 4
	 */
   public boolean isJisToAmPm16() throws CFException {
      return (  getCmnTimeConvType()  ==  4  );
   }


	/**
	*  set values 4
	*/
   	public void setJisToAmPm16True() {  			
    	setCmnTimeConvType( 4);
   	}
	
	/**
	 *	Test condition 5 for isNumericToJis16()
	 *	@return  Returns true if isNumericToJis16() is 5
	 */
   public boolean isNumericToJis16() throws CFException {
      return (  getCmnTimeConvType()  ==  5  );
   }


	/**
	*  set values 5
	*/
   	public void setNumericToJis16True() {  			
    	setCmnTimeConvType( 5);
   	}
	
	/**
	 *	Test condition 6 for isNumericToDb2Iso16()
	 *	@return  Returns true if isNumericToDb2Iso16() is 6
	 */
   public boolean isNumericToDb2Iso16() throws CFException {
      return (  getCmnTimeConvType()  ==  6  );
   }


	/**
	*  set values 6
	*/
   	public void setNumericToDb2Iso16True() {  			
    	setCmnTimeConvType( 6);
   	}
	/**
	 *	Returns the value of cmnTimeConvInput
	 *	@return cmnTimeConvInput
	 */   
	 public CmnTimeConvInput getCmnTimeConvInput() {
   	return cmnTimeConvInput;
   }
   /**
	* 	Update CmnTimeConvInput with the passed value
	*   Corresponding COBOL Variable is CMN-TIME-CONV-INPUT
	*	@param value
	*/
   public void setCmnTimeConvInput(char[] value) {
      cmnTimeConvInput.setString(value); 
   }   
    
     /**
	 * 	Update CmnTimeConvInput 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeConvInput(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeConvInput.begin,cmnTimeConvInput.length());
   }
   
     /**
	 * 	Update CmnTimeConvInput 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeConvInput(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeConvInput.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnTimeConvInput with another Field
	 *	@param value
	 */
   public void setCmnTimeConvInput(Field source) {
   	replace(source,0,source.length(),cmnTimeConvInput.begin,cmnTimeConvInput.length());
   }  
   
     /**
	 * 	Update CmnTimeConvInput 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnTimeConvInput(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeConvInput.begin,cmnTimeConvInput.length());
   }
   
     /**
	 * 	Update CmnTimeConvInput 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnTimeConvInput(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnTimeConvInput.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCmnTimeConvInputAreaFieldLength() {
			return CMN_TIME_CONV_INPUT_AREA_LENGTH;
		}

}
  

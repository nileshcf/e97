package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateConvInputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateConvInputArea extends CmnDateConvInputAreaSerialized { 
   

								private int cmnDateConvType;
				private CmnDateConvInputFormats cmnDateConvInputFormats = new CmnDateConvInputFormats();
	
	/**
	* Constructor for CmnDateConvInputArea
	**/
    public CmnDateConvInputArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateConvInputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateConvInputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnDateConvInputFormats.setParent(this,getStartOffset() + 1);
    } 

	/**
	 *	Returns the value of cmnDateConvType
	 *	@return cmnDateConvType
	 */
	public int getCmnDateConvType() throws CFException {
       if (isCmnDateConvTypeModified()) { 
           cmnDateConvType = refreshCmnDateConvType();
        }
   		return cmnDateConvType;
	}
	

	
	   
	/**
	 * 	Update CmnDateConvType with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-CONV-TYPE
	 *	@param number
	 */
	public void setCmnDateConvType(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateConvType = checkCmnDateConvTypeMaxLimit(number); 
		serializeCmnDateConvType(cmnDateConvType);
	}
	

	public void setCmnDateConvType(long number) {
	    number = checkCmnDateConvTypeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnDateConvType((int)number);
	}
	
	/**
	 * 	Update CmnDateConvType with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateConvType(char[] value) throws CFException {
		 cmnDateConvType = serializeCmnDateConvType(value);
	}
	/**
	 * 	Update CmnDateConvType with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateConvTypeString(char[] value) throws CFException {
		 setCmnDateConvType(value);
	}
	
	/**
	 *	Test condition 1 for isIbmUsaStdToJulian13()
	 *	@return  Returns true if isIbmUsaStdToJulian13() is 1
	 */
   public boolean isIbmUsaStdToJulian13() throws CFException {
      return (  getCmnDateConvType()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setIbmUsaStdToJulian13True() {  			
    	setCmnDateConvType( 1);
   	}
	
	/**
	 *	Test condition 2 for isJulianToIbmUsaStd13()
	 *	@return  Returns true if isJulianToIbmUsaStd13() is 2
	 */
   public boolean isJulianToIbmUsaStd13() throws CFException {
      return (  getCmnDateConvType()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setJulianToIbmUsaStd13True() {  			
    	setCmnDateConvType( 2);
   	}
	
	/**
	 *	Test condition 3 for isIbmUsaStdToShortLit13()
	 *	@return  Returns true if isIbmUsaStdToShortLit13() is 3
	 */
   public boolean isIbmUsaStdToShortLit13() throws CFException {
      return (  getCmnDateConvType()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setIbmUsaStdToShortLit13True() {  			
    	setCmnDateConvType( 3);
   	}
	
	/**
	 *	Test condition 4 for isIbmUsaStdToLongLit13()
	 *	@return  Returns true if isIbmUsaStdToLongLit13() is 4
	 */
   public boolean isIbmUsaStdToLongLit13() throws CFException {
      return (  getCmnDateConvType()  ==  4  );
   }


	/**
	*  set values 4
	*/
   	public void setIbmUsaStdToLongLit13True() {  			
    	setCmnDateConvType( 4);
   	}
	/**
	 *	Returns the value of cmnDateConvInputFormats
	 *	@return cmnDateConvInputFormats
	 */   
	 public CmnDateConvInputFormats getCmnDateConvInputFormats() {
   	return cmnDateConvInputFormats;
   }
   /**
	* 	Update CmnDateConvInputFormats with the passed value
	*   Corresponding COBOL Variable is CMN-DATE-CONV-INPUT-FORMATS
	*	@param value
	*/
   public void setCmnDateConvInputFormats(char[] value) {
      cmnDateConvInputFormats.setString(value); 
   }   
    
     /**
	 * 	Update CmnDateConvInputFormats 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnDateConvInputFormats(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateConvInputFormats.begin,cmnDateConvInputFormats.length());
   }
   
     /**
	 * 	Update CmnDateConvInputFormats 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateConvInputFormats(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateConvInputFormats.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnDateConvInputFormats with another Field
	 *	@param value
	 */
   public void setCmnDateConvInputFormats(Field source) {
   	replace(source,0,source.length(),cmnDateConvInputFormats.begin,cmnDateConvInputFormats.length());
   }  
   
     /**
	 * 	Update CmnDateConvInputFormats 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnDateConvInputFormats(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateConvInputFormats.begin,cmnDateConvInputFormats.length());
   }
   
     /**
	 * 	Update CmnDateConvInputFormats 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateConvInputFormats(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateConvInputFormats.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCmnDateConvInputAreaFieldLength() {
			return CMN_DATE_CONV_INPUT_AREA_LENGTH;
		}

}
  

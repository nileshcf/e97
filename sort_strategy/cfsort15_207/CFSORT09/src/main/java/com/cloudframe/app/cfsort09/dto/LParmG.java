package com.cloudframe.app.cfsort09.dto;

/**
*  The class LParmG is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/


import com.cloudframe.app.cfsort09.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LParmG extends LParmGSerialized {
   

								private short lParmLen;

						private char[] lParmSortKey = Field.fillLowValue(8);
	
	/**
	* Constructor for LParmG
	**/
    public LParmG() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of lParmLen
	 *	@return lParmLen
	 */
	public short getLParmLen() throws CFException {
        if (isLParmLenModified()) { 
           lParmLen = refreshLParmLen();
        }
   		return lParmLen;
	}
	
	/**
	 * 	Update LParmLen with the passed value
	 *  Corresponding COBOL Variable is L-PARM-LEN
	 *	@param number
	 */
	public void setLParmLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    lParmLen = checkLParmLenMaxLimit(number); 
		serializeLParmLen(lParmLen);
	}

	public void setLParmLen(int number) {
	    number = checkLParmLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLParmLen((short)number);
	}
	public void setLParmLen(long number) {
	    number = checkLParmLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLParmLen((short)number);
	}
	

	/**
	 *	Returns the value of lParmSortKey
	 *	@return lParmSortKey
	 */
   public char[] getLParmSortKey() throws CFException{
     if (isLParmSortKeyModified()) { 
        lParmSortKey = refreshLParmSortKey();
     }
   		return lParmSortKey;
   }

  
	/**
	*  set variable lParmSortKey
	*  Corresponding COBOL Variable is L-PARM-SORT-KEY
	*  @param value
	**/
   public void setLParmSortKey(char[] value) {
      lParmSortKey = checkLParmSortKeyConstraints(value);
      serializeLParmSortKey(lParmSortKey);
   } 

     /**
	 * 	Update LParmSortKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLParmSortKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLParmSortKey,lParmSortKey.length);
   	
   }
   
   public void setLParmSortKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLParmSortKey,lParmSortKey.length);
   	
   }
   
     /**
	 * 	Update LParmSortKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLParmSortKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLParmSortKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LParmSortKey with another Field
	 *	@param value
	 */
   public void setLParmSortKey(Field source) {
       replace(source,0,source.length(),beginLParmSortKey,L_PARM_SORT_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update LParmSortKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLParmSortKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLParmSortKey,L_PARM_SORT_KEY_LEN);
   	
   }
   
     /**
	 * 	Update LParmSortKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLParmSortKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLParmSortKey+targetIndex,targetLen);
    
   }
	char[] lParmSortBinary88Value = "BINARY  ".toCharArray();
	/**
	 *	Test condition "BINARY" for isLParmSortBinary()
	 *	@return  Returns true if isLParmSortBinary() is "BINARY"
	 */
   public boolean isLParmSortBinary() throws CFException {
      return (  compareChars( getLParmSortKey() , lParmSortBinary88Value)  == 0  );
   }


	/**
	*  set values "BINARY"
	*/
   	public void setLParmSortBinaryTrue() {  			
    	setLParmSortKey( lParmSortBinary88Value);
   	}
	char[] lParmSortComp88Value = "COMP    ".toCharArray();
	/**
	 *	Test condition "COMP" for isLParmSortComp()
	 *	@return  Returns true if isLParmSortComp() is "COMP"
	 */
   public boolean isLParmSortComp() throws CFException {
      return (  compareChars( getLParmSortKey() , lParmSortComp88Value)  == 0  );
   }


	/**
	*  set values "COMP"
	*/
   	public void setLParmSortCompTrue() {  			
    	setLParmSortKey( lParmSortComp88Value);
   	}
	char[] lParmSortComp188Value = "COMP-1  ".toCharArray();
	/**
	 *	Test condition "COMP-1" for isLParmSortComp1()
	 *	@return  Returns true if isLParmSortComp1() is "COMP-1"
	 */
   public boolean isLParmSortComp1() throws CFException {
      return (  compareChars( getLParmSortKey() , lParmSortComp188Value)  == 0  );
   }


	/**
	*  set values "COMP-1"
	*/
   	public void setLParmSortComp1True() {  			
    	setLParmSortKey( lParmSortComp188Value);
   	}
	char[] lParmSortComp288Value = "COMP-2  ".toCharArray();
	/**
	 *	Test condition "COMP-2" for isLParmSortComp2()
	 *	@return  Returns true if isLParmSortComp2() is "COMP-2"
	 */
   public boolean isLParmSortComp2() throws CFException {
      return (  compareChars( getLParmSortKey() , lParmSortComp288Value)  == 0  );
   }


	/**
	*  set values "COMP-2"
	*/
   	public void setLParmSortComp2True() {  			
    	setLParmSortKey( lParmSortComp288Value);
   	}
	char[] lParmSortComp388Value = "COMP-3  ".toCharArray();
	/**
	 *	Test condition "COMP-3" for isLParmSortComp3()
	 *	@return  Returns true if isLParmSortComp3() is "COMP-3"
	 */
   public boolean isLParmSortComp3() throws CFException {
      return (  compareChars( getLParmSortKey() , lParmSortComp388Value)  == 0  );
   }


	/**
	*  set values "COMP-3"
	*/
   	public void setLParmSortComp3True() {  			
    	setLParmSortKey( lParmSortComp388Value);
   	}
	char[] lParmSortComp488Value = "COMP-4  ".toCharArray();
	/**
	 *	Test condition "COMP-4" for isLParmSortComp4()
	 *	@return  Returns true if isLParmSortComp4() is "COMP-4"
	 */
   public boolean isLParmSortComp4() throws CFException {
      return (  compareChars( getLParmSortKey() , lParmSortComp488Value)  == 0  );
   }


	/**
	*  set values "COMP-4"
	*/
   	public void setLParmSortComp4True() {  			
    	setLParmSortKey( lParmSortComp488Value);
   	}
	char[] lParmSortComp588Value = "COMP-5  ".toCharArray();
	/**
	 *	Test condition "COMP-5" for isLParmSortComp5()
	 *	@return  Returns true if isLParmSortComp5() is "COMP-5"
	 */
   public boolean isLParmSortComp5() throws CFException {
      return (  compareChars( getLParmSortKey() , lParmSortComp588Value)  == 0  );
   }


	/**
	*  set values "COMP-5"
	*/
   	public void setLParmSortComp5True() {  			
    	setLParmSortKey( lParmSortComp588Value);
   	}
	char[] lParmSortZoneDecimal88Value = "ZONE-DEC".toCharArray();
	/**
	 *	Test condition "ZONE-DEC" for isLParmSortZoneDecimal()
	 *	@return  Returns true if isLParmSortZoneDecimal() is "ZONE-DEC"
	 */
   public boolean isLParmSortZoneDecimal() throws CFException {
      return (  compareChars( getLParmSortKey() , lParmSortZoneDecimal88Value)  == 0  );
   }


	/**
	*  set values "ZONE-DEC"
	*/
   	public void setLParmSortZoneDecimalTrue() {  			
    	setLParmSortKey( lParmSortZoneDecimal88Value);
   	}

	
	
	

		public static int getLParmGFieldLength() {
			return L_PARM_G_LENGTH;
		}

}
  

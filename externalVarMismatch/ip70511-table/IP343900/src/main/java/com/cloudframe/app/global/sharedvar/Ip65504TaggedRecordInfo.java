package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504TaggedRecordInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class Ip65504TaggedRecordInfo extends Ip65504TaggedRecordInfoSerialized { 
   

						private char[] ip65504IsFileTagged = Field.fillLowValue(1);

								private int ip65504TagTableOffset;
	
	/**
	* Constructor for Ip65504TaggedRecordInfo
	**/
    public Ip65504TaggedRecordInfo() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip65504IsFileTagged
	 *	@return ip65504IsFileTagged
	 */
   public char[] getIp65504IsFileTagged() throws CFException{
     if (isIp65504IsFileTaggedModified()) { 
        ip65504IsFileTagged = refreshIp65504IsFileTagged();
     }
   		return ip65504IsFileTagged;
   }

  
	/**
	*  set variable ip65504IsFileTagged
	*  Corresponding COBOL Variable is IP65504-IS-FILE-TAGGED
	*  @param value
	**/
   public void setIp65504IsFileTagged(char[] value) {
      ip65504IsFileTagged = checkIp65504IsFileTaggedConstraints(value);
      serializeIp65504IsFileTagged(ip65504IsFileTagged);
   } 

     /**
	 * 	Update Ip65504IsFileTagged 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp65504IsFileTagged(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp65504IsFileTagged,ip65504IsFileTagged.length);
   	
   }
   
   public void setIp65504IsFileTagged(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp65504IsFileTagged,ip65504IsFileTagged.length);
   	
   }
   
     /**
	 * 	Update Ip65504IsFileTagged 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp65504IsFileTagged(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp65504IsFileTagged+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip65504IsFileTagged with another Field
	 *	@param value
	 */
   public void setIp65504IsFileTagged(Field source) {
       replace(source,0,source.length(),beginIp65504IsFileTagged,IP_65504_IS_FILE_TAGGED_LEN);
   	
   }  
   
     /**
	 * 	Update Ip65504IsFileTagged 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp65504IsFileTagged(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp65504IsFileTagged,IP_65504_IS_FILE_TAGGED_LEN);
   	
   }
   
     /**
	 * 	Update Ip65504IsFileTagged 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp65504IsFileTagged(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp65504IsFileTagged+targetIndex,targetLen);
    
   }
	char[] ip65504FileIsTagged88Value = "!".toCharArray();
	/**
	 *	Test condition "!" for isIp65504FileIsTagged()
	 *	@return  Returns true if isIp65504FileIsTagged() is "!"
	 */
   public boolean isIp65504FileIsTagged() throws CFException {
      return (  compareChars( getIp65504IsFileTagged() , ip65504FileIsTagged88Value)  == 0  );
   }


	/**
	*  set values "!"
	*/
   	public void setIp65504FileIsTaggedTrue() {  			
    	setIp65504IsFileTagged( ip65504FileIsTagged88Value);
   	}
	char[] ip65504FileIsUntagged88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp65504FileIsUntagged()
	 *	@return  Returns true if isIp65504FileIsUntagged() is "N"
	 */
   public boolean isIp65504FileIsUntagged() throws CFException {
      return (  compareChars( getIp65504IsFileTagged() , ip65504FileIsUntagged88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp65504FileIsUntaggedTrue() {  			
    	setIp65504IsFileTagged( ip65504FileIsUntagged88Value);
   	}
	/**
	 *	Returns the value of ip65504TagTableOffset
	 *	@return ip65504TagTableOffset
	 */
	public int getIp65504TagTableOffset() throws CFException {
        if (isIp65504TagTableOffsetModified()) { 
           ip65504TagTableOffset = refreshIp65504TagTableOffset();
        }
   		return ip65504TagTableOffset;
	}
	
	/**
	 * 	Update Ip65504TagTableOffset with the passed value
	 *  Corresponding COBOL Variable is IP65504-TAG-TABLE-OFFSET
	 *	@param number
	 */
	public void setIp65504TagTableOffset(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504TagTableOffset = checkIp65504TagTableOffsetMaxLimit(number); 
		serializeIp65504TagTableOffset(ip65504TagTableOffset);
	}


	public void setIp65504TagTableOffset(long number) {
	    number = checkIp65504TagTableOffsetMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp65504TagTableOffset((int)number);
	}
	

	
	
	
	/**
	 * 	initializes Ip65504TaggedRecordInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp65504IsFileTagged(CONSTANTS.SPACE);
                     setIp65504TagTableOffset(0);
   }

		public static int getIp65504TaggedRecordInfoFieldLength() {
			return IP_65504_TAGGED_RECORD_INFO_LENGTH;
		}

}
  

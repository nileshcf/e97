package com.cloudframe.app.comput5.dto;

/**
*  The class WvIntPartGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:30. using version 5.0.0.254
**/


import com.cloudframe.app.comput5.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WvIntPartGroup extends WvIntPartGroupSerialized {
   

						private char[] wvIntPart = Field.fillLowValue(16);

								private long wvIntPartN;
	
	/**
	* Constructor for WvIntPartGroup
	**/
    public WvIntPartGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wvIntPart
	 *	@return wvIntPart
	 */
   public char[] getWvIntPart() throws CFException{
     if (isWvIntPartModified()) { 
        wvIntPart = refreshWvIntPart();
     }
   		return wvIntPart;
   }

  
	/**
	*  set variable wvIntPart
	*  Corresponding COBOL Variable is WV-INT-PART
	*  @param value
	**/
   public void setWvIntPart(char[] value) {
      wvIntPart = checkWvIntPartConstraints(value);
      serializeWvIntPart(wvIntPart);
   } 

     /**
	 * 	Update WvIntPart 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvIntPart(char[] source, int sourceIndex) {
        int targetIndex = (wvIntPart.length - source.length) + beginWvIntPart;
        replace(source,sourceIndex,source.length,targetIndex,wvIntPart.length);
   	
   }
   
   public void setWvIntPart(char[] source, int sourceIndex , int sourceLen) {
        int targetIndex = (wvIntPart.length - sourceLen) + beginWvIntPart;
        replace(source,sourceIndex,sourceLen,targetIndex,wvIntPart.length);
   	
   }
   
     /**
	 * 	Update WvIntPart 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvIntPart(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
        targetIndex = (targetLen - sourceLen) + targetIndex;
        replace(source,sourceIndex,sourceLen,beginWvIntPart+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvIntPart with another Field
	 *	@param value
	 */
   public void setWvIntPart(Field source) {
        int targetIndex = (WV_INT_PART_LEN - source.length()) + beginWvIntPart;
        replace(source,0,source.length(),targetIndex,WV_INT_PART_LEN);
   	
   }  
   
     /**
	 * 	Update WvIntPart 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvIntPart(Field source, int sourceIndex,int sourceLen) {
        int targetIndex = (WV_INT_PART_LEN - sourceLen) + beginWvIntPart;
        replace(source,sourceIndex,sourceLen,targetIndex,WV_INT_PART_LEN);
   	
   }
   
     /**
	 * 	Update WvIntPart 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvIntPart(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
        targetIndex = (WV_INT_PART_LEN - sourceLen) + targetIndex;
        replace(source,sourceIndex,sourceLen,beginWvIntPart+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvIntPartN
	 *	@return wvIntPartN
	 */
	public long getWvIntPartN() throws CFException {
       if (isWvIntPartNModified()) { 
           wvIntPartN = refreshWvIntPartN();
        }
   		return wvIntPartN;
	}
	

	
	   
	/**
	 * 	Update WvIntPartN with the passed value
	 *  Corresponding COBOL Variable is WV-INT-PART-N
	 *	@param number
	 */
	public void setWvIntPartN(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    wvIntPartN = checkWvIntPartNMaxLimit(number); 
		serializeWvIntPartN(wvIntPartN);
	}
	

	/**
	 * 	Update WvIntPartN with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvIntPartN(char[] value) throws CFException {
		 wvIntPartN = serializeWvIntPartN(value);
	}
	/**
	 * 	Update WvIntPartN with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvIntPartNString(char[] value) throws CFException {
		 setWvIntPartN(value);
	}

	
	
	

		public static int getWvIntPartGroupFieldLength() {
			return WV_INT_PART_GROUP_LENGTH;
		}

}
  

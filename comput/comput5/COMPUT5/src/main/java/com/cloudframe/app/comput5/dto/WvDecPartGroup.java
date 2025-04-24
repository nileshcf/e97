package com.cloudframe.app.comput5.dto;

/**
*  The class WvDecPartGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:41. using version 5.0.0.254
**/


import com.cloudframe.app.comput5.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WvDecPartGroup extends WvDecPartGroupSerialized { 
   

						private char[] wvDecPart = Field.fillLowValue(16);

								private long wvDecPartN;
	
	/**
	* Constructor for WvDecPartGroup
	**/
    public WvDecPartGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wvDecPart
	 *	@return wvDecPart
	 */
   public char[] getWvDecPart() throws CFException{
     if (isWvDecPartModified()) { 
        wvDecPart = refreshWvDecPart();
     }
   		return wvDecPart;
   }

  
	/**
	*  set variable wvDecPart
	*  Corresponding COBOL Variable is WV-DEC-PART
	*  @param value
	**/
   public void setWvDecPart(char[] value) {
      wvDecPart = checkWvDecPartConstraints(value);
      serializeWvDecPart(wvDecPart);
   } 

     /**
	 * 	Update WvDecPart 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvDecPart(char[] source, int sourceIndex) {
        int targetIndex = (wvDecPart.length - source.length) + beginWvDecPart;
        replace(source,sourceIndex,source.length,targetIndex,wvDecPart.length);
   	
   }
   
   public void setWvDecPart(char[] source, int sourceIndex , int sourceLen) {
        int targetIndex = (wvDecPart.length - sourceLen) + beginWvDecPart;
        replace(source,sourceIndex,sourceLen,targetIndex,wvDecPart.length);
   	
   }
   
     /**
	 * 	Update WvDecPart 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvDecPart(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
        targetIndex = (targetLen - sourceLen) + targetIndex;
        replace(source,sourceIndex,sourceLen,beginWvDecPart+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvDecPart with another Field
	 *	@param value
	 */
   public void setWvDecPart(Field source) {
        int targetIndex = (WV_DEC_PART_LEN - source.length()) + beginWvDecPart;
        replace(source,0,source.length(),targetIndex,WV_DEC_PART_LEN);
   	
   }  
   
     /**
	 * 	Update WvDecPart 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvDecPart(Field source, int sourceIndex,int sourceLen) {
        int targetIndex = (WV_DEC_PART_LEN - sourceLen) + beginWvDecPart;
        replace(source,sourceIndex,sourceLen,targetIndex,WV_DEC_PART_LEN);
   	
   }
   
     /**
	 * 	Update WvDecPart 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvDecPart(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
        targetIndex = (WV_DEC_PART_LEN - sourceLen) + targetIndex;
        replace(source,sourceIndex,sourceLen,beginWvDecPart+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvDecPartN
	 *	@return wvDecPartN
	 */
	public long getWvDecPartN() throws CFException {
       if (isWvDecPartNModified()) { 
           wvDecPartN = refreshWvDecPartN();
        }
   		return wvDecPartN;
	}
	

	
	   
	/**
	 * 	Update WvDecPartN with the passed value
	 *  Corresponding COBOL Variable is WV-DEC-PART-N
	 *	@param number
	 */
	public void setWvDecPartN(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    wvDecPartN = checkWvDecPartNMaxLimit(number); 
		serializeWvDecPartN(wvDecPartN);
	}
	

	/**
	 * 	Update WvDecPartN with the passed value
	 *	@param value (String or char[])
	 */
	public void setWvDecPartN(char[] value) throws CFException {
		 wvDecPartN = serializeWvDecPartN(value);
	}
	/**
	 * 	Update WvDecPartN with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWvDecPartNString(char[] value) throws CFException {
		 setWvDecPartN(value);
	}

	
	
	

		public static int getWvDecPartGroupFieldLength() {
			return WV_DEC_PART_GROUP_LENGTH;
		}

}
  

package com.cloudframe.app.blkdblk.dto;

/**
*  The class EbcdicIndexGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/


import com.cloudframe.app.blkdblk.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class EbcdicIndexGroup extends EbcdicIndexGroupSerialized {
   

								private short ebcdicIndex;
					private EbcdicBytes ebcdicBytes = new EbcdicBytes();
	
	/**
	* Constructor for EbcdicIndexGroup
	**/
    public EbcdicIndexGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ebcdicBytes.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ebcdicIndex
	 *	@return ebcdicIndex
	 */
	public short getEbcdicIndex() throws CFException {
        if (isEbcdicIndexModified()) { 
           ebcdicIndex = refreshEbcdicIndex();
        }
   		return ebcdicIndex;
	}
	
	/**
	 * 	Update EbcdicIndex with the passed value
	 *  Corresponding COBOL Variable is EBCDIC-INDEX
	 *	@param number
	 */
	public void setEbcdicIndex(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ebcdicIndex = checkEbcdicIndexMaxLimit(number); 
		serializeEbcdicIndex(ebcdicIndex);
	}

	public void setEbcdicIndex(int number) {
	    number = checkEbcdicIndexMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEbcdicIndex((short)number);
	}
	public void setEbcdicIndex(long number) {
	    number = checkEbcdicIndexMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEbcdicIndex((short)number);
	}
	

	/**
	 *	Returns the value of ebcdicBytes
	 *	@return ebcdicBytes
	 */   
	 public EbcdicBytes getEbcdicBytes() {
   	return ebcdicBytes;
   }
   /**
	* 	Update EbcdicBytes with the passed value
	*   Corresponding COBOL Variable is EBCDIC-BYTES
	*	@param value
	*/
   public void setEbcdicBytes(char[] value) {
      ebcdicBytes.setString(value); 
   }   
    
     /**
	 * 	Update EbcdicBytes 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setEbcdicBytes(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ebcdicBytes.begin,ebcdicBytes.length());
   }
   
     /**
	 * 	Update EbcdicBytes 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEbcdicBytes(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ebcdicBytes.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update EbcdicBytes with another Field
	 *	@param value
	 */
   public void setEbcdicBytes(Field source) {
   	replace(source,0,source.length(),ebcdicBytes.begin,ebcdicBytes.length());
   }  
   
     /**
	 * 	Update EbcdicBytes 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setEbcdicBytes(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ebcdicBytes.begin,ebcdicBytes.length());
   }
   
     /**
	 * 	Update EbcdicBytes 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEbcdicBytes(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ebcdicBytes.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getEbcdicIndexGroupFieldLength() {
			return EBCDIC_INDEX_GROUP_LENGTH;
		}

}
  
